package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.common.Price;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceBuilder {
   
   
   private String id;
   
   
   private com.commercetools.api.models.common.TypedMoney value;
   
   @Nullable
   private String country;
   
   @Nullable
   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.api.models.channel.ChannelReference channel;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private com.commercetools.api.models.common.DiscountedPrice discounted;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;
   
   public PriceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public PriceBuilder value( final com.commercetools.api.models.common.TypedMoney value) {
      this.value = value;
      return this;
   }
   
   public PriceBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public PriceBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public PriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
      this.channel = channel;
      return this;
   }
   
   public PriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public PriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public PriceBuilder discounted(@Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public PriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public PriceBuilder tiers(@Nullable final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
      this.tiers = tiers;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.models.common.TypedMoney getValue(){
      return this.value;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers(){
      return this.tiers;
   }

   public Price build() {
       return new PriceImpl(id, value, country, customerGroup, channel, validFrom, validUntil, discounted, custom, tiers);
   }
   
   public static PriceBuilder of() {
      return new PriceBuilder();
   }
   
   public static PriceBuilder of(final Price template) {
      PriceBuilder builder = new PriceBuilder();
      builder.id = template.getId();
      builder.value = template.getValue();
      builder.country = template.getCountry();
      builder.customerGroup = template.getCustomerGroup();
      builder.channel = template.getChannel();
      builder.validFrom = template.getValidFrom();
      builder.validUntil = template.getValidUntil();
      builder.discounted = template.getDiscounted();
      builder.custom = template.getCustom();
      builder.tiers = template.getTiers();
      return builder;
   }
   
}