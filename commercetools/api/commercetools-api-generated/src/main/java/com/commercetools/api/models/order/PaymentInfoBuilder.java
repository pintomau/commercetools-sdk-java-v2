package com.commercetools.api.models.order;

import com.commercetools.api.models.payment.PaymentReference;
import com.commercetools.api.models.order.PaymentInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentInfoBuilder {
   
   
   private java.util.List<com.commercetools.api.models.payment.PaymentReference> payments;
   
   public PaymentInfoBuilder payments( final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments) {
      this.payments = payments;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.models.payment.PaymentReference> getPayments(){
      return this.payments;
   }

   public PaymentInfo build() {
       return new PaymentInfoImpl(payments);
   }
   
   public static PaymentInfoBuilder of() {
      return new PaymentInfoBuilder();
   }
   
   public static PaymentInfoBuilder of(final PaymentInfo template) {
      PaymentInfoBuilder builder = new PaymentInfoBuilder();
      builder.payments = template.getPayments();
      return builder;
   }
   
}