package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.type.CustomFields;
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
public final class ShoppingListLineItemImpl implements ShoppingListLineItem {

   private java.time.ZonedDateTime addedAt;
   
   private com.commercetools.api.models.type.CustomFields custom;
   
   private java.time.ZonedDateTime deactivatedAt;
   
   private String id;
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   private String productId;
   
   private com.commercetools.api.models.common.LocalizedString productSlug;
   
   private com.commercetools.api.models.product_type.ProductTypeReference productType;
   
   private Integer quantity;
   
   private com.commercetools.api.models.product.ProductVariant variant;
   
   private Long variantId;

   @JsonCreator
   ShoppingListLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("deactivatedAt") final java.time.ZonedDateTime deactivatedAt, @JsonProperty("id") final String id, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("productId") final String productId, @JsonProperty("productSlug") final com.commercetools.api.models.common.LocalizedString productSlug, @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType, @JsonProperty("quantity") final Integer quantity, @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant, @JsonProperty("variantId") final Long variantId) {
      this.addedAt = addedAt;
      this.custom = custom;
      this.deactivatedAt = deactivatedAt;
      this.id = id;
      this.name = name;
      this.productId = productId;
      this.productSlug = productSlug;
      this.productType = productType;
      this.quantity = quantity;
      this.variant = variant;
      this.variantId = variantId;
   }
   public ShoppingListLineItemImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.time.ZonedDateTime getDeactivatedAt(){
      return this.deactivatedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getProductSlug(){
      return this.productSlug;
   }
   
   
   public com.commercetools.api.models.product_type.ProductTypeReference getProductType(){
      return this.productType;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.models.product.ProductVariant getVariant(){
      return this.variant;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }

   public void setAddedAt(final java.time.ZonedDateTime addedAt){
      this.addedAt = addedAt;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setDeactivatedAt(final java.time.ZonedDateTime deactivatedAt){
      this.deactivatedAt = deactivatedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setProductSlug(final com.commercetools.api.models.common.LocalizedString productSlug){
      this.productSlug = productSlug;
   }
   
   public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType){
      this.productType = productType;
   }
   
   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setVariant(final com.commercetools.api.models.product.ProductVariant variant){
      this.variant = variant;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }

}