package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDeliveryAction;
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
public final class StagedOrderRemoveDeliveryActionBuilder {
   
   
   private String deliveryId;
   
   public StagedOrderRemoveDeliveryActionBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }

   public StagedOrderRemoveDeliveryAction build() {
       return new StagedOrderRemoveDeliveryActionImpl(deliveryId);
   }
   
   public static StagedOrderRemoveDeliveryActionBuilder of() {
      return new StagedOrderRemoveDeliveryActionBuilder();
   }
   
   public static StagedOrderRemoveDeliveryActionBuilder of(final StagedOrderRemoveDeliveryAction template) {
      StagedOrderRemoveDeliveryActionBuilder builder = new StagedOrderRemoveDeliveryActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      return builder;
   }
   
}