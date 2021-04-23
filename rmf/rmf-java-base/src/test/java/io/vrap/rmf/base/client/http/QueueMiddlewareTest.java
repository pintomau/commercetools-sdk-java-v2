package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueMiddlewareTest {
    static final int MAX_PARALLEL_REQUESTS = 100;

    static final String DUMMY_RESULT = "hello";
    static final ApiHttpRequest REQUEST_SUCCESS = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"),
            new ApiHttpHeaders(), "success".getBytes(StandardCharsets.UTF_8));
    static final ApiHttpRequest REQUEST_FINISH_ON_COMMAND = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"),
            new ApiHttpHeaders(), "wait".getBytes(StandardCharsets.UTF_8));

    @Test
    public void worksAtAll() throws Exception {
        final QueueMiddleware queue = new QueueMiddleware(MAX_PARALLEL_REQUESTS);
        final String s = queue.invoke(REQUEST_SUCCESS, (request) -> CompletableFuture.completedFuture(new ApiHttpResponse<>(200, new ApiHttpHeaders(), DUMMY_RESULT.getBytes(
                StandardCharsets.UTF_8)))).get().getBodyAsString().get();
        assertThat(s).isEqualTo("hello");
    }

    @Test
    public void underTheLimitNewRequestsAreProcessed() throws Exception {
        final QueueMiddleware queue = new QueueMiddleware(MAX_PARALLEL_REQUESTS);
        for (int i = 0; i < MAX_PARALLEL_REQUESTS - 1; i++) {
            queue.invoke(REQUEST_FINISH_ON_COMMAND, (request) -> {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return CompletableFuture.completedFuture(new ApiHttpResponse<>(200, new ApiHttpHeaders(), DUMMY_RESULT.getBytes(
                        StandardCharsets.UTF_8)));
            });
        }
        final String s = queue.invoke(REQUEST_SUCCESS, (request) -> {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(200, new ApiHttpHeaders(), DUMMY_RESULT.getBytes(
                    StandardCharsets.UTF_8)));
        }).get().getBodyAsString().get();
        assertThat(s).isEqualTo("hello");
    }

    @Test
    public void requestsOverMaxParallelAreNotProcessed() throws Exception {
        final QueueMiddleware queue = new QueueMiddleware(MAX_PARALLEL_REQUESTS);
        final int numberOfRequests = MAX_PARALLEL_REQUESTS + 20;
        final AtomicInteger count = new AtomicInteger();
        List<CompletableFuture<?>> f = new LinkedList<>();
        for (int i = 0; i < numberOfRequests; i++) {
            f.add(queue.invoke(REQUEST_FINISH_ON_COMMAND, (request) -> {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return CompletableFuture.completedFuture(new ApiHttpResponse<>(200, new ApiHttpHeaders(), DUMMY_RESULT.getBytes(
                        StandardCharsets.UTF_8))).thenApply((response) -> { count.addAndGet(1); return response; });
            }));
        }
        CompletableFuture.allOf(f.toArray(new CompletableFuture[f.size()])).join();
        Assertions.assertThat(count.get()).isEqualTo(120);
    }

    private void waitForRequestCount(AtomicInteger count, final int toWait) {
        final int waitMillis = 50;
        int ttl = 1000;
        while (ttl > 0 && count.get() < toWait) {
            try {
                Thread.sleep(waitMillis);
                ttl -= waitMillis;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (count.get() < toWait) {
            throw new RuntimeException("timeout for request count " + count + ", was only " + count.get());
        }
    }
}
