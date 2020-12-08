package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


public class ClientFactory {

    public static final String COMMERCETOOLS = "commercetools";

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, request -> InternalLogger.getLogger(COMMERCETOOLS), new ArrayList<>(), null);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final Supplier<String> userAgentSupplier
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, request -> InternalLogger.getLogger(COMMERCETOOLS), userAgentSupplier, new ArrayList<>(), null);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final List<Middleware> middlewares
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, request -> InternalLogger.getLogger(COMMERCETOOLS), middlewares, null);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final Supplier<String> userAgentSupplier,
            final List<Middleware> middlewares
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, request -> InternalLogger.getLogger(COMMERCETOOLS), userAgentSupplier, middlewares, null);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, request -> InternalLogger.getLogger(COMMERCETOOLS), middlewares, correlationIdProvider);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final Supplier<String> userAgentSupplier,
            final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, request -> InternalLogger.getLogger(COMMERCETOOLS), userAgentSupplier, middlewares, correlationIdProvider);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory,
            List<Middleware> middlewares
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, internalLoggerFactory, middlewares, null);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory,
            final Supplier<String> userAgentSupplier,
            List<Middleware> middlewares
    ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, internalLoggerFactory, userAgentSupplier, middlewares, null);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory,
            List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider
        ) {
        return create(apiBaseUrl, httpClient, tokenSupplier, internalLoggerFactory, MiddlewareFactory::buildUserAgent, middlewares, correlationIdProvider);
    }

    public static ApiHttpClient create(
            final String apiBaseUrl,
            final VrapHttpClient httpClient,
            final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory,
            final Supplier<String> userAgentSupplier,
            List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider
    ) {
        List<Middleware> middlewareStack = new ArrayList<>(MiddlewareFactory.createDefault(tokenSupplier, internalLoggerFactory, userAgentSupplier));
        if (correlationIdProvider != null) {
            middlewares.add((request, next) -> next.apply(request.withHeader(ApiHttpHeaders.X_CORRELATION_ID, correlationIdProvider.getCorrelationId())));
        }
        middlewareStack.addAll(middlewares);
        final HandlerStack stack = HandlerStack.create(HttpHandler.create(httpClient), middlewareStack);

        return new ApiHttpClient(
                apiBaseUrl,
                stack
        );
    }
}
