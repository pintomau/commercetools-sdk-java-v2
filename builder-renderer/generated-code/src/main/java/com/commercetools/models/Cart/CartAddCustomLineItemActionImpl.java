package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.Money;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartAddCustomLineItemActionImpl implements CartAddCustomLineItemAction {

   private java.lang.String action;
   
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.Common.Money money;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.lang.String slug;
   
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   CartAddCustomLineItemActionImpl(@JsonProperty("externalTaxRate") final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("money") final com.commercetools.models.Common.Money money, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("slug") final java.lang.String slug, @JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.externalTaxRate = externalTaxRate;
      this.quantity = quantity;
      this.money = money;
      this.custom = custom;
      this.name = name;
      this.slug = slug;
      this.taxCategory = taxCategory;
      this.action = "addCustomLineItem";
   }
   public CartAddCustomLineItemActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Common.Money getMoney(){
      return this.money;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setExternalTaxRate(final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setMoney(final com.commercetools.models.Common.Money money){
      this.money = money;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setSlug(final java.lang.String slug){
      this.slug = slug;
   }
   
   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}