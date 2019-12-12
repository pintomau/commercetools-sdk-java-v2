package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderTransitionStateAction;
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
public final class StagedOrderTransitionStateActionBuilder {
   
   @Nullable
   private Boolean force;
   
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   public StagedOrderTransitionStateActionBuilder force(@Nullable final Boolean force) {
      this.force = force;
      return this;
   }
   
   public StagedOrderTransitionStateActionBuilder state( final com.commercetools.api.generated.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   @Nullable
   public Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
      return this.state;
   }

   public StagedOrderTransitionStateAction build() {
       return new StagedOrderTransitionStateActionImpl(force, state);
   }
   
   public static StagedOrderTransitionStateActionBuilder of() {
      return new StagedOrderTransitionStateActionBuilder();
   }
   
   public static StagedOrderTransitionStateActionBuilder of(final StagedOrderTransitionStateAction template) {
      StagedOrderTransitionStateActionBuilder builder = new StagedOrderTransitionStateActionBuilder();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}