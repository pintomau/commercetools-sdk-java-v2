package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetCompanyNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetCompanyNameActionBuilder {
   
   @Nullable
   private java.lang.String companyName;
   
   public CustomerSetCompanyNameActionBuilder companyName(@Nullable final java.lang.String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   @Nullable
   public java.lang.String getCompanyName(){
      return this.companyName;
   }

   public CustomerSetCompanyNameAction build() {
       return new CustomerSetCompanyNameActionImpl(companyName);
   }
   
   public static CustomerSetCompanyNameActionBuilder of() {
      return new CustomerSetCompanyNameActionBuilder();
   }
   
   public static CustomerSetCompanyNameActionBuilder of(final CustomerSetCompanyNameAction template) {
      CustomerSetCompanyNameActionBuilder builder = new CustomerSetCompanyNameActionBuilder();
      builder.companyName = template.getCompanyName();
      return builder;
   }
   
}