package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetLastNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetLastNameActionBuilder {
   
   @Nullable
   private java.lang.String lastName;
   
   public CustomerSetLastNameActionBuilder lastName(@Nullable final java.lang.String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   @Nullable
   public java.lang.String getLastName(){
      return this.lastName;
   }

   public CustomerSetLastNameAction build() {
       return new CustomerSetLastNameActionImpl(lastName);
   }
   
   public static CustomerSetLastNameActionBuilder of() {
      return new CustomerSetLastNameActionBuilder();
   }
   
   public static CustomerSetLastNameActionBuilder of(final CustomerSetLastNameAction template) {
      CustomerSetLastNameActionBuilder builder = new CustomerSetLastNameActionBuilder();
      builder.lastName = template.getLastName();
      return builder;
   }
   
}