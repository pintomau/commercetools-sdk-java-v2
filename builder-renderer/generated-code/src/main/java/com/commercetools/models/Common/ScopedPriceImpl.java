package com.commercetools.models.Common;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class ScopedPriceImpl implements ScopedPrice {

   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   private java.lang.String country;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private com.commercetools.models.Channel.ChannelReference channel;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.lang.String id;
   
   private com.commercetools.models.Common.TypedMoney value;
   
   private com.commercetools.models.Common.TypedMoney currentValue;

   @JsonCreator
   ScopedPriceImpl(@JsonProperty("discounted") final com.commercetools.models.Common.DiscountedPrice discounted, @JsonProperty("country") final java.lang.String country, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("channel") final com.commercetools.models.Channel.ChannelReference channel, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("id") final java.lang.String id, @JsonProperty("value") final com.commercetools.models.Common.TypedMoney value, @JsonProperty("currentValue") final com.commercetools.models.Common.TypedMoney currentValue) {
      this.discounted = discounted;
      this.country = country;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.channel = channel;
      this.validUntil = validUntil;
      this.validFrom = validFrom;
      this.id = id;
      this.value = value;
      this.currentValue = currentValue;
   }
   public ScopedPriceImpl() {
      
   }
   
   
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getValue(){
      return this.value;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getCurrentValue(){
      return this.currentValue;
   }

   public void setDiscounted(final com.commercetools.models.Common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setChannel(final com.commercetools.models.Channel.ChannelReference channel){
      this.channel = channel;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setValue(final com.commercetools.models.Common.TypedMoney value){
      this.value = value;
   }
   
   public void setCurrentValue(final com.commercetools.models.Common.TypedMoney currentValue){
      this.currentValue = currentValue;
   }

}