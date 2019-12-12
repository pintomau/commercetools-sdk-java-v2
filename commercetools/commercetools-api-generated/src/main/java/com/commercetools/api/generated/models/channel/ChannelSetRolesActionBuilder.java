package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelRoleEnum;
import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.channel.ChannelSetRolesAction;
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
public final class ChannelSetRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles;
   
   public ChannelSetRolesActionBuilder roles( final java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }

   public ChannelSetRolesAction build() {
       return new ChannelSetRolesActionImpl(roles);
   }
   
   public static ChannelSetRolesActionBuilder of() {
      return new ChannelSetRolesActionBuilder();
   }
   
   public static ChannelSetRolesActionBuilder of(final ChannelSetRolesAction template) {
      ChannelSetRolesActionBuilder builder = new ChannelSetRolesActionBuilder();
      builder.roles = template.getRoles();
      return builder;
   }
   
}