package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
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
public final class ShoppingListAddLineItemActionImpl implements ShoppingListAddLineItemAction {

   private String action;

   private java.time.ZonedDateTime addedAt;

   private Long quantity;

   private String productId;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private Long variantId;

   private String sku;

   @JsonCreator
   ShoppingListAddLineItemActionImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("quantity") final Long quantity, @JsonProperty("productId") final String productId, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku) {
      this.addedAt = addedAt;
      this.quantity = quantity;
      this.productId = productId;
      this.custom = custom;
      this.variantId = variantId;
      this.sku = sku;
      this.action = "addLineItem";
   }
   public ShoppingListAddLineItemActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }


   public Long getQuantity(){
      return this.quantity;
   }


   public String getProductId(){
      return this.productId;
   }


   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public Long getVariantId(){
      return this.variantId;
   }


   public String getSku(){
      return this.sku;
   }

   public void setAddedAt(final java.time.ZonedDateTime addedAt){
      this.addedAt = addedAt;
   }

   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }

   public void setProductId(final String productId){
      this.productId = productId;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }

   public void setSku(final String sku){
      this.sku = sku;
   }

}
