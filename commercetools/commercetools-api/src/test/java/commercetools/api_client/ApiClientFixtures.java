package commercetools.api_client;


import com.commercetools.models.api_client.ApiClient;
import com.commercetools.models.api_client.ApiClientDraft;
import com.commercetools.models.api_client.ApiClientDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;

public class ApiClientFixtures {
    
    public static void withApiClient(final Consumer<ApiClient> consumer) {
        ApiClient apiClient = createApiClient();
        consumer.accept(apiClient);
        deleteApiClient(apiClient.getId());
    }
    
    public static ApiClient createApiClient() {
        ApiClientDraft apiClientDraft = ApiClientDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .scope("manage_project:" + CommercetoolsTestUtils.getProjectKey())
                .build();
        
        ApiClient apiClient = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .apiClients()
                .post(apiClientDraft)
                .executeBlocking().getBody();
        
        Assert.assertNotNull(apiClient);
        
        return apiClient;
    }
    
    public static ApiClient deleteApiClient(final String id) {
        ApiClient apiClient = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .apiClients()
                .withId(id)
                .delete()
                .executeBlocking().getBody();

        Assert.assertNotNull(apiClient);
        Assert.assertNotNull(apiClient.getId(), id);
        
        return apiClient;
    }
    
}
