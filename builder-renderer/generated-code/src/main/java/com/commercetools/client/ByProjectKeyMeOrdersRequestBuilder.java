package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMeOrdersRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeOrdersRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeOrdersGet get() {
      return new ByProjectKeyMeOrdersGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMeOrdersPost post(com.commercetools.models.Me.MyOrderFromCartDraft myOrderFromCartDraft) {
      return new ByProjectKeyMeOrdersPost(apiHttpClient, projectKey, myOrderFromCartDraft);
   }
   
   public ByProjectKeyMeOrdersByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMeOrdersByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
