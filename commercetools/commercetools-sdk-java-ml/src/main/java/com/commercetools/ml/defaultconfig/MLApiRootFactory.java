package com.commercetools.ml.defaultconfig;

import com.commercetools.ml.client.ApiRoot;
import com.commercetools.ml.client.ByProjectKeyRequestBuilder;
import com.commercetools.ml.client.MLCorrelationIdProvider;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientFactory;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.http.CorrelationIdProvider;
import io.vrap.rmf.base.client.http.Middleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.okhttp.VrapOkHttpClient;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MLApiRootFactory {

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return createForProject(projectKey, () -> defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), new MLCorrelationIdProvider(projectKey)));
    }

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final Supplier<ApiHttpClient> clientSupplier
    ) {
        return create(clientSupplier).withProjectKey(projectKey);
    }


    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(() -> defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null));
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ) {
        return create(() -> defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider));
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ) {
        return create(() -> defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider));
    }

    public static ApiRoot create(final Supplier<ApiHttpClient> clientSupplier) {
        return ApiRoot.fromClient(clientSupplier.get());
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null);
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, middlewares, null);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ){
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), null);
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares,
            final CorrelationIdProvider correlationIdProvider
    ){
        return defaultClient(new VrapOkHttpClient(), credentials, tokenEndpoint, apiEndpoint, middlewares, correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final CorrelationIdProvider correlationIdProvider
    ){
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, new ArrayList<>(), correlationIdProvider);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares
    ) {
        return defaultClient(httpClient, credentials, tokenEndpoint, apiEndpoint, middlewares, null);
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider
            ) {
        return ClientFactory.create(
                apiEndpoint,
                httpClient,
                new ClientCredentialsTokenSupplier(
                        credentials.getClientId(),
                        credentials.getClientSecret(),
                        credentials.getScopes(),
                        tokenEndpoint,
                        httpClient
                ),
                middlewares,
                correlationIdProvider
        );
    }

    public static ApiHttpClient defaultClient(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint,
            final Supplier<String> userAgentSupplier,
            final List<Middleware> middlewares,
            @Nullable final CorrelationIdProvider correlationIdProvider
    ) {
        return ClientFactory.create(
                apiEndpoint,
                httpClient,
                new ClientCredentialsTokenSupplier(
                        credentials.getClientId(),
                        credentials.getClientSecret(),
                        credentials.getScopes(),
                        tokenEndpoint,
                        httpClient
                ),
                userAgentSupplier,
                middlewares,
                correlationIdProvider
        );
    }
}
