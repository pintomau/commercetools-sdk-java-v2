package commercetools.oauth;

import io.vrap.rmf.base.client.HttpClientSupplier;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class ClientCredentialsTokenSupplierIntegrationTests {

    private static final VrapHttpClient vrapHttpClient = HttpClientSupplier.of().get();

    @Test(expected = ExecutionException.class)
    public void throwExceptionWrongCredentials() throws Exception {
        ClientCredentialsTokenSupplier clientCredentialsTokenSupplier  = new ClientCredentialsTokenSupplier(
                "wrong-client-id",
                "wrong-client-secret",
                "",
                "https://auth.europe-west1.gcp.commercetools.com/oauth/token"
                , vrapHttpClient
        );

        clientCredentialsTokenSupplier.getToken().get();
    }

}
