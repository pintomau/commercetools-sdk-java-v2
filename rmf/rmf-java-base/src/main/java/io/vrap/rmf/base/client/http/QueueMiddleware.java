
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;

import io.github.resilience4j.bulkhead.Bulkhead;
import io.github.resilience4j.bulkhead.ThreadPoolBulkhead;
import io.github.resilience4j.bulkhead.ThreadPoolBulkheadConfig;
import net.jodah.failsafe.FailsafeExecutor;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class QueueMiddleware implements Middleware {
    private final ThreadPoolBulkhead bulkhead;

    public QueueMiddleware(final int maxConcurrency) {
        ThreadPoolBulkheadConfig config = ThreadPoolBulkheadConfig.custom()
                .maxThreadPoolSize(maxConcurrency)
                .coreThreadPoolSize(2)
                .queueCapacity(100)
                .build();

        bulkhead = ThreadPoolBulkhead.of("queue", config);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return bulkhead.executeCallable(() -> next.apply(request).get()).toCompletableFuture();
    }
}
