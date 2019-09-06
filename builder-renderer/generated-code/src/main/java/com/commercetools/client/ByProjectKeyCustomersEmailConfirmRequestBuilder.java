package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersEmailConfirmRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersEmailConfirmRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersEmailConfirmPost post(com.commercetools.models.Customer.CustomerEmailVerify customerEmailVerify) {
      return new ByProjectKeyCustomersEmailConfirmPost(apiHttpClient, projectKey, customerEmailVerify);
   }
   
}
