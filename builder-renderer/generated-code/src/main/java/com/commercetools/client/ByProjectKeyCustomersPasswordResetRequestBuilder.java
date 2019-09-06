package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersPasswordResetRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersPasswordResetRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersPasswordResetPost post(com.commercetools.models.Customer.CustomerResetPassword customerResetPassword) {
      return new ByProjectKeyCustomersPasswordResetPost(apiHttpClient, projectKey, customerResetPassword);
   }
   
}
