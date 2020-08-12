package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.ProductSetAttributeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAttributeActionBuilder {
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   
   private String name;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;
   
   @Nullable
   private Boolean staged;
   
   public ProductSetAttributeActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAttributeActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAttributeActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetAttributeActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   public ProductSetAttributeActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }

   public ProductSetAttributeAction build() {
       return new ProductSetAttributeActionImpl(variantId, sku, name, value, staged);
   }
   
   public static ProductSetAttributeActionBuilder of() {
      return new ProductSetAttributeActionBuilder();
   }
   
   public static ProductSetAttributeActionBuilder of(final ProductSetAttributeAction template) {
      ProductSetAttributeActionBuilder builder = new ProductSetAttributeActionBuilder();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.name = template.getName();
      builder.value = template.getValue();
      builder.staged = template.getStaged();
      return builder;
   }
   
}