package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.channel.ChannelSetAddressAction;
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
public final class ChannelSetAddressActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   public ChannelSetAddressActionBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public ChannelSetAddressAction build() {
       return new ChannelSetAddressActionImpl(address);
   }
   
   public static ChannelSetAddressActionBuilder of() {
      return new ChannelSetAddressActionBuilder();
   }
   
   public static ChannelSetAddressActionBuilder of(final ChannelSetAddressAction template) {
      ChannelSetAddressActionBuilder builder = new ChannelSetAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}