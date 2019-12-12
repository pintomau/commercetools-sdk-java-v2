package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Delivery;
import com.commercetools.api.generated.models.message.DeliveryAddedMessagePayload;
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
public final class DeliveryAddedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.Delivery delivery;
   
   public DeliveryAddedMessagePayloadBuilder delivery( final com.commercetools.api.generated.models.order.Delivery delivery) {
      this.delivery = delivery;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.Delivery getDelivery(){
      return this.delivery;
   }

   public DeliveryAddedMessagePayload build() {
       return new DeliveryAddedMessagePayloadImpl(delivery);
   }
   
   public static DeliveryAddedMessagePayloadBuilder of() {
      return new DeliveryAddedMessagePayloadBuilder();
   }
   
   public static DeliveryAddedMessagePayloadBuilder of(final DeliveryAddedMessagePayload template) {
      DeliveryAddedMessagePayloadBuilder builder = new DeliveryAddedMessagePayloadBuilder();
      builder.delivery = template.getDelivery();
      return builder;
   }
   
}