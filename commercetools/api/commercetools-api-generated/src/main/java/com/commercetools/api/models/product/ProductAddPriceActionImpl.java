package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductAddPriceActionImpl implements ProductAddPriceAction {

   private String action;

   private com.commercetools.api.models.common.PriceDraft price;

   private Boolean staged;

   private Long variantId;

   private String sku;

   @JsonCreator
   ProductAddPriceActionImpl(@JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku) {
      this.price = price;
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.action = "addPrice";
   }
   public ProductAddPriceActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.common.PriceDraft getPrice(){
      return this.price;
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

   public void setPrice(final com.commercetools.api.models.common.PriceDraft price){
      this.price = price;
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

}
