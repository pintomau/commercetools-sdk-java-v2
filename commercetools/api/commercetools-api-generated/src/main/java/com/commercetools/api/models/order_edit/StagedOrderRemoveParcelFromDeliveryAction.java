package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = StagedOrderRemoveParcelFromDeliveryActionImpl.class)
public interface StagedOrderRemoveParcelFromDeliveryAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("parcelId")
   public String getParcelId();

   public void setParcelId(final String parcelId);
   
   public static StagedOrderRemoveParcelFromDeliveryActionImpl of(){
      return new StagedOrderRemoveParcelFromDeliveryActionImpl();
   }
   

   public static StagedOrderRemoveParcelFromDeliveryActionImpl of(final StagedOrderRemoveParcelFromDeliveryAction template) {
      StagedOrderRemoveParcelFromDeliveryActionImpl instance = new StagedOrderRemoveParcelFromDeliveryActionImpl();
      instance.setParcelId(template.getParcelId());
      return instance;
   }

}