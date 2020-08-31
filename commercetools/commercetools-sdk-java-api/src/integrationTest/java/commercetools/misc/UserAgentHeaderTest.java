package commercetools.misc;


import com.commercetools.api.client.ByProjectKeyCategoriesGet;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.MiddlewareArg;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;
import org.junit.Test;

import static commercetools.utils.CommercetoolsTestUtils.*;

public class UserAgentHeaderTest {

    @Test
    public void execute() {
        ByProjectKeyCategoriesGet request = CommercetoolsTestUtils.getProjectRoot()
                .categories()
                .get();

        VrapHttpClient vrapHttpClient = new VrapOkhttpClient();

        new HttpMiddleware(
                "https://api.europe-west1.gcp.commercetools.com",
                vrapHttpClient,
                new ClientCredentialsTokenSupplier(
                        getClientId(),
                        getClientSecret(),
                        getScopes(),
                        "https://auth.europe-west1.gcp.commercetools.com/oauth/token"
                        , vrapHttpClient
                )
        )
        .next(MiddlewareArg.from(request.createHttpRequest(), null, null, null))
        .thenApply(middlewareArg -> middlewareArg.getRequest().getHeaders().getHeaders().stream().anyMatch(s -> s.getKey().equalsIgnoreCase("user-agent")));
    }
}