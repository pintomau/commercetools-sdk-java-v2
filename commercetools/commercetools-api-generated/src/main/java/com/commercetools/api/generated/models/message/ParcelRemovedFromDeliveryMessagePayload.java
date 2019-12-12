package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.Parcel;
import com.commercetools.api.generated.models.message.ParcelRemovedFromDeliveryMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessagePayloadImpl.class)
public interface ParcelRemovedFromDeliveryMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();
   
   @NotNull
   @Valid
   @JsonProperty("parcel")
   public Parcel getParcel();

   public void setDeliveryId(final String deliveryId);
   
   public void setParcel(final Parcel parcel);
   
   public static ParcelRemovedFromDeliveryMessagePayloadImpl of(){
      return new ParcelRemovedFromDeliveryMessagePayloadImpl();
   }
   

   public static ParcelRemovedFromDeliveryMessagePayloadImpl of(final ParcelRemovedFromDeliveryMessagePayload template) {
      ParcelRemovedFromDeliveryMessagePayloadImpl instance = new ParcelRemovedFromDeliveryMessagePayloadImpl();
      instance.setParcel(template.getParcel());
      instance.setDeliveryId(template.getDeliveryId());
      return instance;
   }

}