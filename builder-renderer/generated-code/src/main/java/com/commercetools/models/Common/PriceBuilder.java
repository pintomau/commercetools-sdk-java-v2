package com.commercetools.models.Common;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.PriceTier;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Common.Price;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceBuilder {
   
   @Nullable
   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.PriceTier> tiers;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelReference channel;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private java.lang.String id;
   
   
   private com.commercetools.models.Common.Money value;
   
   public PriceBuilder discounted(@Nullable final com.commercetools.models.Common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public PriceBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public PriceBuilder tiers(@Nullable final java.util.List<com.commercetools.models.Common.PriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   public PriceBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public PriceBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public PriceBuilder channel(@Nullable final com.commercetools.models.Channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public PriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public PriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public PriceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PriceBuilder value( final com.commercetools.models.Common.Money value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.PriceTier> getTiers(){
      return this.tiers;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Common.Money getValue(){
      return this.value;
   }

   public Price build() {
       return new PriceImpl(discounted, country, tiers, customerGroup, custom, channel, validUntil, validFrom, id, value);
   }
   
   public static PriceBuilder of() {
      return new PriceBuilder();
   }
   
   public static PriceBuilder of(final Price template) {
      PriceBuilder builder = new PriceBuilder();
      builder.discounted = template.getDiscounted();
      builder.country = template.getCountry();
      builder.tiers = template.getTiers();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.channel = template.getChannel();
      builder.validUntil = template.getValidUntil();
      builder.validFrom = template.getValidFrom();
      builder.id = template.getId();
      builder.value = template.getValue();
      return builder;
   }
   
}