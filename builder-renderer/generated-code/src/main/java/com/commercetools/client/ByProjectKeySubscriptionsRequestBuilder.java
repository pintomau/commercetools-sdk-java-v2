package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeySubscriptionsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeySubscriptionsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeySubscriptionsGet get() {
      return new ByProjectKeySubscriptionsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeySubscriptionsPost post(com.commercetools.models.Subscription.SubscriptionDraft subscriptionDraft) {
      return new ByProjectKeySubscriptionsPost(apiHttpClient, projectKey, subscriptionDraft);
   }
   
   public ByProjectKeySubscriptionsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeySubscriptionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeySubscriptionsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeySubscriptionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
