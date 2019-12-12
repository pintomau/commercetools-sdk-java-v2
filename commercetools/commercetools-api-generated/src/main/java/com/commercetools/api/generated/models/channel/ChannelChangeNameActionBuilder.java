package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.channel.ChannelChangeNameAction;
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
public final class ChannelChangeNameActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   public ChannelChangeNameActionBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }

   public ChannelChangeNameAction build() {
       return new ChannelChangeNameActionImpl(name);
   }
   
   public static ChannelChangeNameActionBuilder of() {
      return new ChannelChangeNameActionBuilder();
   }
   
   public static ChannelChangeNameActionBuilder of(final ChannelChangeNameAction template) {
      ChannelChangeNameActionBuilder builder = new ChannelChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}