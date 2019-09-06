package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.SubRate;
import java.lang.Boolean;
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
public final class TaxRateImpl implements TaxRate {

   private java.lang.String country;
   
   private java.lang.Integer amount;
   
   private java.lang.Boolean includedInPrice;
   
   private java.lang.String name;
   
   private java.lang.String state;
   
   private java.lang.String id;
   
   private java.util.List<com.commercetools.models.TaxCategory.SubRate> subRates;

   @JsonCreator
   TaxRateImpl(@JsonProperty("country") final java.lang.String country, @JsonProperty("amount") final java.lang.Integer amount, @JsonProperty("includedInPrice") final java.lang.Boolean includedInPrice, @JsonProperty("name") final java.lang.String name, @JsonProperty("state") final java.lang.String state, @JsonProperty("id") final java.lang.String id, @JsonProperty("subRates") final java.util.List<com.commercetools.models.TaxCategory.SubRate> subRates) {
      this.country = country;
      this.amount = amount;
      this.includedInPrice = includedInPrice;
      this.name = name;
      this.state = state;
      this.id = id;
      this.subRates = subRates;
   }
   public TaxRateImpl() {
      
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.Integer getAmount(){
      return this.amount;
   }
   
   
   public java.lang.Boolean getIncludedInPrice(){
      return this.includedInPrice;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.TaxCategory.SubRate> getSubRates(){
      return this.subRates;
   }

   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setAmount(final java.lang.Integer amount){
      this.amount = amount;
   }
   
   public void setIncludedInPrice(final java.lang.Boolean includedInPrice){
      this.includedInPrice = includedInPrice;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setState(final java.lang.String state){
      this.state = state;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setSubRates(final java.util.List<com.commercetools.models.TaxCategory.SubRate> subRates){
      this.subRates = subRates;
   }

}