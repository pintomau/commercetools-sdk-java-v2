package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.AssetSource;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAssetSourcesActionImpl implements ProductSetAssetSourcesAction {

   private String action;
   
   private java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources;
   
   private String assetId;
   
   private Boolean staged;
   
   private Long variantId;
   
   private String sku;
   
   private String assetKey;

   @JsonCreator
   ProductSetAssetSourcesActionImpl(@JsonProperty("sources") final java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources, @JsonProperty("assetId") final String assetId, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("assetKey") final String assetKey) {
      this.sources = sources;
      this.assetId = assetId;
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.assetKey = assetKey;
      this.action = "setAssetSources";
   }
   public ProductSetAssetSourcesActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.AssetSource> getSources(){
      return this.sources;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }

   public void setSources(final java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources){
      this.sources = sources;
   }
   
   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }

}