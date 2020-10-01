package com.commercetools.importapi.defaultconfig;

import com.commercetools.importapi.client.ApiRoot;
import com.commercetools.importapi.client.ByProjectKeyRequestBuilder;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ClientFactory;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.okhttp.VrapOkHttpClient;

public class ImportApiFactory {

    private static final VrapHttpClient vrapHttpClient = new VrapOkHttpClient();

    public static ByProjectKeyRequestBuilder createForProject(
            final String projectKey,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(credentials, tokenEndpoint, apiEndpoint).withProjectKeyValue(projectKey);
    }

    public static ApiRoot create(
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return create(vrapHttpClient, credentials, tokenEndpoint, apiEndpoint);
    }

    public static ApiRoot create(
            final VrapHttpClient httpClient,
            final ClientCredentials credentials,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        final ApiHttpClient client = ClientFactory.create(
                apiEndpoint,
                httpClient,
                new ClientCredentialsTokenSupplier(
                        credentials.getClientId(),
                        credentials.getClientSecret(),
                        credentials.getScopes(),
                        tokenEndpoint,
                        httpClient
                )
        );
        return ApiRoot.fromClient(client);
    }
}
