package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
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
public final class UserProvidedIdentifiersImpl implements UserProvidedIdentifiers {

   private String key;
   
   private String externalId;
   
   private String orderNumber;
   
   private String customerNumber;
   
   private String sku;
   
   private com.commercetools.api.models.common.LocalizedString slug;

   @JsonCreator
   UserProvidedIdentifiersImpl(@JsonProperty("key") final String key, @JsonProperty("externalId") final String externalId, @JsonProperty("orderNumber") final String orderNumber, @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("sku") final String sku, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug) {
      this.key = key;
      this.externalId = externalId;
      this.orderNumber = orderNumber;
      this.customerNumber = customerNumber;
      this.sku = sku;
      this.slug = slug;
   }
   public UserProvidedIdentifiersImpl() {
      
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setKey(final String key){
      this.key = key;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setOrderNumber(final String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setCustomerNumber(final String customerNumber){
      this.customerNumber = customerNumber;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
      this.slug = slug;
   }

}