package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyReviewsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyReviewsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyReviewsGet get() {
      return new ByProjectKeyReviewsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyReviewsPost post(com.commercetools.models.Review.ReviewDraft reviewDraft) {
      return new ByProjectKeyReviewsPost(apiHttpClient, projectKey, reviewDraft);
   }
   
   public ByProjectKeyReviewsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyReviewsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyReviewsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyReviewsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
