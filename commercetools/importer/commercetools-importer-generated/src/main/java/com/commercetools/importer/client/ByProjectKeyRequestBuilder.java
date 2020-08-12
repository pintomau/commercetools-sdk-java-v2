package com.commercetools.importer.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   
   public ByProjectKeyImportSinksRequestBuilder importSinks() {
      return new ByProjectKeyImportSinksRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyImportSummariesRequestBuilder importSummaries() {
      return new ByProjectKeyImportSummariesRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyCategoriesRequestBuilder categories() {
      return new ByProjectKeyCategoriesRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyPricesRequestBuilder prices() {
      return new ByProjectKeyPricesRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductsRequestBuilder products() {
      return new ByProjectKeyProductsRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductDraftsRequestBuilder productDrafts() {
      return new ByProjectKeyProductDraftsRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductTypesRequestBuilder productTypes() {
      return new ByProjectKeyProductTypesRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductVariantsRequestBuilder productVariants() {
      return new ByProjectKeyProductVariantsRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductVariantPatchesRequestBuilder productVariantPatches() {
      return new ByProjectKeyProductVariantPatchesRequestBuilder(apiHttpClient, projectKey);
   }
}