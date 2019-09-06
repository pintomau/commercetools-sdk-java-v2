package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public PaymentSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public PaymentSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public PaymentSetCustomFieldAction build() {
       return new PaymentSetCustomFieldActionImpl(name, value);
   }
   
   public static PaymentSetCustomFieldActionBuilder of() {
      return new PaymentSetCustomFieldActionBuilder();
   }
   
   public static PaymentSetCustomFieldActionBuilder of(final PaymentSetCustomFieldAction template) {
      PaymentSetCustomFieldActionBuilder builder = new PaymentSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}