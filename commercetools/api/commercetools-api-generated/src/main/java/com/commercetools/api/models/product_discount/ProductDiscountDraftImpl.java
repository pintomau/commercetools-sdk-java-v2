package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
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
public final class ProductDiscountDraftImpl implements ProductDiscountDraft {

   private com.commercetools.api.models.common.LocalizedString name;
   
   private String key;
   
   private com.commercetools.api.models.common.LocalizedString description;
   
   private com.commercetools.api.models.product_discount.ProductDiscountValueDraft value;
   
   private String predicate;
   
   private String sortOrder;
   
   private Boolean isActive;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.time.ZonedDateTime validUntil;

   @JsonCreator
   ProductDiscountDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("key") final String key, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("value") final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value, @JsonProperty("predicate") final String predicate, @JsonProperty("sortOrder") final String sortOrder, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
      this.name = name;
      this.key = key;
      this.description = description;
      this.value = value;
      this.predicate = predicate;
      this.sortOrder = sortOrder;
      this.isActive = isActive;
      this.validFrom = validFrom;
      this.validUntil = validUntil;
   }
   public ProductDiscountDraftImpl() {
      
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>User-specific unique identifier for a product discount.
   *  Must be unique across a project.
   *  The field can be reset using the Set Key UpdateAction</p>
   */
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue(){
      return this.value;
   }
   
   /**
   *  <p>A valid ProductDiscount Predicate.</p>
   */
   public String getPredicate(){
      return this.predicate;
   }
   
   /**
   *  <p>The string must contain a decimal number between 0 and 1.
   *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.</p>
   */
   public String getSortOrder(){
      return this.sortOrder;
   }
   
   /**
   *  <p>If set to <code>true</code> the discount will be applied to product prices.</p>
   */
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   /**
   *  <p>The time from which the discount should be effective.
   *  Please take Eventual Consistency into account for calculated product discount values.</p>
   */
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   /**
   *  <p>The time from which the discount should be effective.
   *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }

   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setValue(final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value){
      this.value = value;
   }
   
   public void setPredicate(final String predicate){
      this.predicate = predicate;
   }
   
   public void setSortOrder(final String sortOrder){
      this.sortOrder = sortOrder;
   }
   
   public void setIsActive(final Boolean isActive){
      this.isActive = isActive;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }

}