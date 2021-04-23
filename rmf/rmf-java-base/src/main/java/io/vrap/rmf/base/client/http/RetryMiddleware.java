
package io.vrap.rmf.base.client.http;

import static java.util.Collections.singletonList;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.function.Function;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.event.RetryOnRetryEvent;

import io.github.resilience4j.core.IntervalFunction;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryMiddleware implements Middleware, AutoCloseable {
    @Deprecated
    public static final int DEFAULT_MAX_PARALLEL_REQUESTS = 2;

    static final String loggerName = ClientBuilder.COMMERCETOOLS + ".retry";

    public static final int DEFAULT_MAX_DELAY = 60000;
    public static final int DEFAULT_INITIAL_DELAY = 200;
    public static final List<Integer> DEFAULT_RETRY_STATUS_CODES = singletonList(503);
    private static final InternalLogger logger = InternalLogger.getLogger(loggerName);
    private static final Logger classLogger = LoggerFactory.getLogger(RetryMiddleware.class);

    private final ScheduledExecutorService executor;
    private final Retry retry;

    public RetryMiddleware(final int maxRetries) {
        this(maxRetries, DEFAULT_RETRY_STATUS_CODES);
    }

    public RetryMiddleware(final int maxRetries, final List<Integer> statusCodes) {
        this(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes);
    }

    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES);
    }

    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes) {
        this(maxRetries, delay, maxDelay, statusCodes, null);
    }
    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes, final ScheduledExecutorService executor) {
        RetryConfig config = RetryConfig.<ApiHttpResponse<byte[]>> custom()
                .maxAttempts(maxRetries + 1)
                .intervalFunction(IntervalFunction.ofExponentialRandomBackoff(Duration.ofMillis(delay), 2, 0.25,
                    Duration.ofMillis(maxDelay)))
                .retryOnResult(response -> statusCodes.contains(response.getStatusCode()))
                .retryOnException(throwable -> {
                    if (throwable instanceof ApiHttpException) {
                        return statusCodes.contains(((ApiHttpException) throwable).getStatusCode());
                    }
                    return false;
                })
                .build();
        retry = Retry.of("retry", config);
        retry.getEventPublisher().onRetry(this::logEventFailure);
        this.executor = Optional.ofNullable(executor).orElse(Executors.newScheduledThreadPool(2));
    }

    private void logEventFailure(RetryOnRetryEvent event) {
        final int attempt = event.getNumberOfRetryAttempts();

        logger.info(() -> "Retry #" + attempt);
        logger.trace(() -> {
            final Throwable failure = event.getLastThrowable();
            if (failure instanceof ApiHttpException) {
                final ApiHttpException httpException = (ApiHttpException) failure;
                final ApiHttpRequest request = httpException.getRequest();
                final ApiHttpResponse<byte[]> response = httpException.getResponse();
                if (request != null) {
                    return requestLog(attempt, request, response);
                }
            }
            return event.toString();
        });
    }

    private String requestLog(final int attempt, ApiHttpRequest request, ApiHttpResponse<?> response) {
        String output;
        final String httpMethodAndUrl = request.getMethod().name() + " " + request.getUrl().toString();
        if (request.getBody() != null) {
            final String unformattedBody = request.getSecuredBody();
            final boolean isJsonRequest = request.getHeaders()
                    .getHeaders(ApiHttpHeaders.CONTENT_TYPE)
                    .stream()
                    .findFirst()
                    .map(ct -> ct.getValue().toLowerCase().contains("json"))
                    .orElse(true);
            if (isJsonRequest) {
                String prettyPrint;
                try {
                    prettyPrint = JsonUtils.prettyPrint(unformattedBody);
                }
                catch (final JsonException e) {
                    classLogger.warn("pretty print failed", e);
                    prettyPrint = unformattedBody;
                }
                output = "Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl + "\nformatted: " + prettyPrint;
            }
            else {
                output = "Retry #" + attempt + ": " + request + "\n" + request.getMethod().name() + " "
                        + request.getUrl() + " " + unformattedBody;
            }
        }
        else {
            output = "Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl + " <no body>";
        }
        if (response != null) {
            output += "\nFailure response: " + response.getStatusCode() + "\n" + response + "\n"
                    + Optional.ofNullable(response.getBody())
                            .map(body -> JsonUtils.prettyPrint(response.getBodyAsString().orElse("")))
                            .orElse("<no body>");
        }
        return output;
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries) {
        this(maxRetries, DEFAULT_RETRY_STATUS_CODES);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final List<Integer> statusCodes) {
        this(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes) {
        this(maxRetries, delay, maxDelay, statusCodes);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return retry.executeCompletionStage(executor, () -> next.apply(request)).toCompletableFuture();
    }

    @Override
    public void close() {
    }
}
