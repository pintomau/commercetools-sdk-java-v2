package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyProductTypesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductTypesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductTypesGet get() {
      return new ByProjectKeyProductTypesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyProductTypesPost post(com.commercetools.models.ProductType.ProductTypeDraft productTypeDraft) {
      return new ByProjectKeyProductTypesPost(apiHttpClient, projectKey, productTypeDraft);
   }
   
   public ByProjectKeyProductTypesKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyProductTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyProductTypesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyProductTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
