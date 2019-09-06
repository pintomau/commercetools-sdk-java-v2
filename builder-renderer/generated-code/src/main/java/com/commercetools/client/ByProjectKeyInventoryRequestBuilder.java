package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyInventoryRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyInventoryRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyInventoryGet get() {
      return new ByProjectKeyInventoryGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyInventoryPost post(com.commercetools.models.Inventory.InventoryEntryDraft inventoryEntryDraft) {
      return new ByProjectKeyInventoryPost(apiHttpClient, projectKey, inventoryEntryDraft);
   }
   
   public ByProjectKeyInventoryByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyInventoryByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
