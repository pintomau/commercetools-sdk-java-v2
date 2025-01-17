
package io.vrap.rmf.base.client.http;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

import net.jodah.failsafe.util.concurrent.Scheduler;

/**
 * Middleware to add an oauth authentication header to requests
 */
public interface OAuthMiddleware extends Middleware {

    static OAuthMiddleware of(final ScheduledExecutorService executor, final OAuthHandler oAuthHandler) {
        return new OAuthMiddlewareImpl(executor, oAuthHandler, 1, false);
    }

    static OAuthMiddleware of(final Executor executor, final OAuthHandler oAuthHandler) {
        return new OAuthMiddlewareImpl(executor, oAuthHandler, 1, false);
    }

    static OAuthMiddleware of(final Scheduler scheduler, final OAuthHandler oAuthHandler) {
        return new OAuthMiddlewareImpl(scheduler, oAuthHandler, 1, false);
    }

    static OAuthMiddleware of(final OAuthHandler oAuthHandler) {
        return new OAuthMiddlewareImpl(oAuthHandler, 1, false);
    }

    static OAuthMiddleware of(final ScheduledExecutorService executor, final OAuthHandler oauthHandler,
            final int maxRetries) {
        return new OAuthMiddlewareImpl(executor, oauthHandler, maxRetries, false);
    }

    static OAuthMiddleware of(final Executor executor, final OAuthHandler oauthHandler, final int maxRetries) {
        return new OAuthMiddlewareImpl(executor, oauthHandler, maxRetries, false);
    }

    static OAuthMiddleware of(final Scheduler scheduler, final OAuthHandler oauthHandler, final int maxRetries) {
        return new OAuthMiddlewareImpl(scheduler, oauthHandler, maxRetries, false);
    }

    static OAuthMiddleware of(final OAuthHandler oauthHandler, final int maxRetries) {
        return new OAuthMiddlewareImpl(oauthHandler, maxRetries, false);
    }

    static OAuthMiddleware of(final ScheduledExecutorService executor, final OAuthHandler oauthHandler,
            final int maxRetries, final boolean useCircuitBreaker) {
        return new OAuthMiddlewareImpl(executor, oauthHandler, maxRetries, useCircuitBreaker);
    }

    static OAuthMiddleware of(final Executor executor, final OAuthHandler oauthHandler, final int maxRetries,
            final boolean useCircuitBreaker) {
        return new OAuthMiddlewareImpl(executor, oauthHandler, maxRetries, useCircuitBreaker);
    }

    static OAuthMiddleware of(final Scheduler scheduler, final OAuthHandler oauthHandler, final int maxRetries,
            final boolean useCircuitBreaker) {
        return new OAuthMiddlewareImpl(scheduler, oauthHandler, maxRetries, useCircuitBreaker);
    }

    static OAuthMiddleware of(final OAuthHandler oauthHandler, final int maxRetries, final boolean useCircuitBreaker) {
        return new OAuthMiddlewareImpl(oauthHandler, maxRetries, useCircuitBreaker);
    }
}
