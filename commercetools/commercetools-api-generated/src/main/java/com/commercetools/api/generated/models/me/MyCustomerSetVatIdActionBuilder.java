package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerSetVatIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetVatIdActionBuilder {
   
   @Nullable
   private String vatId;
   
   public MyCustomerSetVatIdActionBuilder vatId(@Nullable final String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   @Nullable
   public String getVatId(){
      return this.vatId;
   }

   public MyCustomerSetVatIdAction build() {
       return new MyCustomerSetVatIdActionImpl(vatId);
   }
   
   public static MyCustomerSetVatIdActionBuilder of() {
      return new MyCustomerSetVatIdActionBuilder();
   }
   
   public static MyCustomerSetVatIdActionBuilder of(final MyCustomerSetVatIdAction template) {
      MyCustomerSetVatIdActionBuilder builder = new MyCustomerSetVatIdActionBuilder();
      builder.vatId = template.getVatId();
      return builder;
   }
   
}