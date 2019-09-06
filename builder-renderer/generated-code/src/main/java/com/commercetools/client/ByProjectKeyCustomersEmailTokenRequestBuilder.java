package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersEmailTokenRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersEmailTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersEmailTokenPost post(com.commercetools.models.Customer.CustomerCreateEmailToken customerCreateEmailToken) {
      return new ByProjectKeyCustomersEmailTokenPost(apiHttpClient, projectKey, customerCreateEmailToken);
   }
   
}
