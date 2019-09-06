package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCategoriesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCategoriesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCategoriesGet get() {
      return new ByProjectKeyCategoriesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyCategoriesPost post(com.commercetools.models.Category.CategoryDraft categoryDraft) {
      return new ByProjectKeyCategoriesPost(apiHttpClient, projectKey, categoryDraft);
   }
   
   public ByProjectKeyCategoriesKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyCategoriesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyCategoriesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyCategoriesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
