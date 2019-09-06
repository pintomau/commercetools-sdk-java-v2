package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyOrdersRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyOrdersRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyOrdersGet get() {
      return new ByProjectKeyOrdersGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyOrdersPost post(com.commercetools.models.Order.OrderFromCartDraft orderFromCartDraft) {
      return new ByProjectKeyOrdersPost(apiHttpClient, projectKey, orderFromCartDraft);
   }
   
   public ByProjectKeyOrdersImportRequestBuilder importOrder() {
      return new ByProjectKeyOrdersImportRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder withOrderNumber(String orderNumber) {
      return new ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder(apiHttpClient, projectKey, orderNumber);
   }
   public ByProjectKeyOrdersEditsRequestBuilder edits() {
      return new ByProjectKeyOrdersEditsRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyOrdersByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyOrdersByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
