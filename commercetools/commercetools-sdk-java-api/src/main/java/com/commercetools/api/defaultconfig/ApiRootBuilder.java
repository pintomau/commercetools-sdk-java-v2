
package com.commercetools.api.defaultconfig;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import javax.annotation.Nullable;

import com.commercetools.api.client.ApiInternalLoggerFactory;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.client.ProjectApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenStorage;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

/**
 * Builder to create a {@link ApiRoot} or a project scoped {@link ProjectApiRoot}
 */
public class ApiRootBuilder {
    private static final String PROJECT_KEY_MUST_BE_SET = "projectKey must be set";
    private final ClientBuilder builder;
    private String projectKey;

    private ApiRootBuilder(ClientBuilder builder) {
        this.builder = builder;
    }

    public static ApiRootBuilder of() {
        return new ApiRootBuilder(ClientBuilder.of());
    }

    public static ApiRootBuilder of(final ApiHttpClient httpClient) {
        return new ApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static ApiRootBuilder of(final VrapHttpClient httpClient) {
        return new ApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static ApiRootBuilder of(final HandlerStack stack) {
        return new ApiRootBuilder(ClientBuilder.of(stack));
    }

    public ApiRootBuilder withProjectKey(final String projectKey) {
        this.projectKey = projectKey;

        return this;
    }

    public ApiRootBuilder withAuthCircuitBreaker() {
        return with(ClientBuilder::withAuthCircuitBreaker);
    }

    public ApiRootBuilder withoutAuthCircuitBreaker() {
        return with(ClientBuilder::withoutAuthCircuitBreaker);
    }

    public ApiRootBuilder withAuthRetries(final int authRetries) {
        return with(clientBuilder -> clientBuilder.withAuthRetries(authRetries));
    }

    public ApiRootBuilder withHandlerStack(final HandlerStack stack) {
        return with(clientBuilder -> clientBuilder.withHandlerStack(stack));
    }

    public ApiRootBuilder withHttpClient(final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withHttpClient(httpClient));
    }

    public ApiRootBuilder withSerializer(final ResponseSerializer serializer) {
        return with(clientBuilder -> clientBuilder.withSerializer(serializer));
    }

    public ApiRootBuilder withSerializer(final Supplier<ResponseSerializer> serializer) {
        return with(clientBuilder -> clientBuilder.withSerializer(serializer));
    }

    public ApiRootBuilder withHttpExceptionFactory(final HttpExceptionFactory factory) {
        return with(clientBuilder -> clientBuilder.withHttpExceptionFactory(factory));
    }

    public ApiRootBuilder withHttpExceptionFactory(final Function<ResponseSerializer, HttpExceptionFactory> factory) {
        return with(clientBuilder -> clientBuilder.withHttpExceptionFactory(factory));
    }

    public ApiRootBuilder withHttpExceptionFactory(final Supplier<HttpExceptionFactory> factory) {
        return with(clientBuilder -> clientBuilder.withHttpExceptionFactory(factory));
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials) {
        return defaultClient(credentials, ServiceRegion.GCP_EUROPE_WEST1);
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials, ServiceRegionConfig serviceRegion) {
        return defaultClient(URI.create(serviceRegion.getApiUrl())).withClientCredentialsFlow(credentials,
            serviceRegion.getOAuthTokenUrl());
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ApiRootBuilder defaultClient(final String apiEndpoint, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ApiRootBuilder defaultClient(final String apiEndpoint) {
        return defaultClient(URI.create(apiEndpoint));
    }

    public ApiRootBuilder defaultClient(final URI apiEndpoint) {
        return with(clientBuilder -> clientBuilder.defaultClient(apiEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withStaticTokenFlow(final AuthenticationToken token) {
        return with(clientBuilder -> clientBuilder.withStaticTokenFlow(token));
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return with(clientBuilder -> clientBuilder.withAnonymousSessionFlow(credentials, tokenEndpoint));
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials,
            final ServiceRegion serviceRegion, final TokenStorage storage) {
        withApiBaseUrl(serviceRegion.getApiUrl());
        Objects.requireNonNull(projectKey, PROJECT_KEY_MUST_BE_SET);
        return withAnonymousRefreshFlow(credentials, serviceRegion.getAnonymousFlowTokenURL(projectKey),
            serviceRegion.getOAuthTokenUrl(), storage);
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials,
            final ServiceRegion serviceRegion, final String projectKey, final TokenStorage storage) {
        withApiBaseUrl(serviceRegion.getApiUrl());
        withProjectKey(projectKey);
        return withAnonymousRefreshFlow(credentials, serviceRegion.getAnonymousFlowTokenURL(projectKey),
            serviceRegion.getOAuthTokenUrl(), storage);
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage) {
        return with(clientBuilder -> clientBuilder.withAnonymousRefreshFlow(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage));
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousRefreshFlow(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClient));
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousRefreshFlow(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClient));
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint) {
        return with(
            clientBuilder -> clientBuilder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint));
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withGlobalCustomerPasswordFlow(credentials, email, password,
            tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withGlobalCustomerPasswordFlow(credentials, email, password,
            tokenEndpoint, httpClient));
    }

    public ApiRootBuilder addAcceptGZipMiddleware() {
        return with(ClientBuilder::addAcceptGZipMiddleware);
    }

    public ApiRootBuilder withErrorMiddleware() {
        return with(ClientBuilder::withErrorMiddleware);
    }

    public ApiRootBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        return with(clientBuilder -> clientBuilder.withErrorMiddleware(errorMiddleware));
    }

    public ApiRootBuilder withRetryMiddleware(Supplier<RetryMiddleware> retryMiddleware) {
        return with(clientBuilder -> clientBuilder.withRetryMiddleware(retryMiddleware));
    }

    public ApiRootBuilder withRetryMiddleware(RetryMiddleware retryMiddleware) {
        return with(clientBuilder -> clientBuilder.withRetryMiddleware(retryMiddleware));
    }

    public ApiRootBuilder withRetryMiddleware(final int maxRetries) {
        return with(clientBuilder -> clientBuilder.withRetryMiddleware(maxRetries));
    }

    public ApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        return with(clientBuilder -> clientBuilder.withRetryMiddleware(maxRetries, statusCodes));
    }

    public ApiRootBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        return with(clientBuilder -> clientBuilder.withOAuthMiddleware(oAuthMiddleware));
    }

    public ApiRootBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        return with(clientBuilder -> clientBuilder.withOAuthMiddleware(oAuthMiddleware));
    }

    public ApiRootBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        return with(clientBuilder -> clientBuilder.withTokenSupplier(tokenSupplier));
    }

    public ApiRootBuilder withTokenSupplier(final Supplier<TokenSupplier> tokenSupplier) {
        return with(clientBuilder -> clientBuilder.withTokenSupplier(tokenSupplier));
    }

    public ApiRootBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerMiddleware(internalLoggerMiddleware));
    }

    public ApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerFactory(internalLoggerFactory));
    }

    public ApiRootBuilder withApiBaseUrl(String apiBaseUrl) {
        return with(clientBuilder -> clientBuilder.withApiBaseUrl(apiBaseUrl));
    }

    public ApiRootBuilder withApiBaseUrl(final URI apiBaseUrl) {
        return with(clientBuilder -> clientBuilder.withApiBaseUrl(apiBaseUrl));
    }

    public ApiRootBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        return with(clientBuilder -> clientBuilder.withUserAgentSupplier(userAgentSupplier));
    }

    public ApiRootBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider) {
        return with(clientBuilder -> clientBuilder.addCorrelationIdProvider(correlationIdProvider));
    }

    public ApiRootBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        return with(clientBuilder -> clientBuilder.withMiddleware(middleware, middlewares));
    }

    public ApiRootBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        return with(clientBuilder -> clientBuilder.addMiddleware(middleware, middlewares));
    }

    public ApiRootBuilder withMiddlewares(final List<Middleware> middlewares) {
        return with(clientBuilder -> clientBuilder.withMiddlewares(middlewares));
    }

    public ApiRootBuilder addMiddlewares(final List<Middleware> middlewares) {
        return with(clientBuilder -> clientBuilder.addMiddlewares(middlewares));
    }

    public ApiRootBuilder with(UnaryOperator<ClientBuilder> builderUnaryOperator) {
        builderUnaryOperator.apply(builder);

        return this;
    }

    public ApiRoot build() {
        return ApiRoot.fromClient(clientSupplier().get());
    }

    public ApiHttpClient buildClient() {
        return clientSupplier().get();
    }

    public Supplier<ApiHttpClient> clientSupplier() {
        return builder::build;
    }

    /**
     * @deprecated use {@link #build(String)}  instead
     */
    @Deprecated
    public ByProjectKeyRequestBuilder buildForProject(final String projectKey) {
        return ApiRoot.fromClient(builder.build()).withProjectKey(projectKey);
    }

    public ProjectApiRoot buildProjectRoot() {
        Objects.requireNonNull(projectKey, PROJECT_KEY_MUST_BE_SET);
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    /**
     * @deprecated use {@link #build(String)}  instead
     */
    @Deprecated
    public ProjectApiRoot buildProjectRoot(final String projectKey) {
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    public ProjectApiRoot build(final String projectKey) {
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final ApiHttpClient clientSupplier) {
        return ApiRoot.fromClient(clientSupplier).withProjectKey(projectKey);
    }
}
