package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.Long;
import com.commercetools.models.DiscountCode.DiscountCodeUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.DiscountCode.DiscountCodeUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public DiscountCodeUpdateBuilder actions( final java.util.List<com.commercetools.models.DiscountCode.DiscountCodeUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public DiscountCodeUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.DiscountCode.DiscountCodeUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public DiscountCodeUpdate build() {
       return new DiscountCodeUpdateImpl(actions, version);
   }
   
   public static DiscountCodeUpdateBuilder of() {
      return new DiscountCodeUpdateBuilder();
   }
   
   public static DiscountCodeUpdateBuilder of(final DiscountCodeUpdate template) {
      DiscountCodeUpdateBuilder builder = new DiscountCodeUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}