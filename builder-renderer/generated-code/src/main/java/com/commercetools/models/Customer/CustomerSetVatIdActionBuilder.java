package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetVatIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetVatIdActionBuilder {
   
   @Nullable
   private java.lang.String vatId;
   
   public CustomerSetVatIdActionBuilder vatId(@Nullable final java.lang.String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   @Nullable
   public java.lang.String getVatId(){
      return this.vatId;
   }

   public CustomerSetVatIdAction build() {
       return new CustomerSetVatIdActionImpl(vatId);
   }
   
   public static CustomerSetVatIdActionBuilder of() {
      return new CustomerSetVatIdActionBuilder();
   }
   
   public static CustomerSetVatIdActionBuilder of(final CustomerSetVatIdAction template) {
      CustomerSetVatIdActionBuilder builder = new CustomerSetVatIdActionBuilder();
      builder.vatId = template.getVatId();
      return builder;
   }
   
}