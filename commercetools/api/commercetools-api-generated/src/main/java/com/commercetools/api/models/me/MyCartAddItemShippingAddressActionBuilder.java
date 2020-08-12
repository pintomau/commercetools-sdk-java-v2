package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.api.models.common.Address address;
   
   public MyCartAddItemShippingAddressActionBuilder address( final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   public MyCartAddItemShippingAddressAction build() {
       return new MyCartAddItemShippingAddressActionImpl(address);
   }
   
   public static MyCartAddItemShippingAddressActionBuilder of() {
      return new MyCartAddItemShippingAddressActionBuilder();
   }
   
   public static MyCartAddItemShippingAddressActionBuilder of(final MyCartAddItemShippingAddressAction template) {
      MyCartAddItemShippingAddressActionBuilder builder = new MyCartAddItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}