package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyTypesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyTypesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyTypesGet get() {
      return new ByProjectKeyTypesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyTypesPost post(com.commercetools.models.Type.TypeDraft typeDraft) {
      return new ByProjectKeyTypesPost(apiHttpClient, projectKey, typeDraft);
   }
   
   public ByProjectKeyTypesKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyTypesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
