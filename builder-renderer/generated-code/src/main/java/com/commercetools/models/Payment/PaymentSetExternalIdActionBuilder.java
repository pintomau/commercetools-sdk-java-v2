package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetExternalIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetExternalIdActionBuilder {
   
   @Nullable
   private java.lang.String externalId;
   
   public PaymentSetExternalIdActionBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }

   public PaymentSetExternalIdAction build() {
       return new PaymentSetExternalIdActionImpl(externalId);
   }
   
   public static PaymentSetExternalIdActionBuilder of() {
      return new PaymentSetExternalIdActionBuilder();
   }
   
   public static PaymentSetExternalIdActionBuilder of(final PaymentSetExternalIdAction template) {
      PaymentSetExternalIdActionBuilder builder = new PaymentSetExternalIdActionBuilder();
      builder.externalId = template.getExternalId();
      return builder;
   }
   
}