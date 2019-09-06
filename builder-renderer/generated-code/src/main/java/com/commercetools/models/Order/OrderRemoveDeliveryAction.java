package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderRemoveDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderRemoveDeliveryActionImpl.class)
public interface OrderRemoveDeliveryAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("deliveryId")
   public String getDeliveryId();

   public void setDeliveryId(final String deliveryId);
   
   public static OrderRemoveDeliveryActionImpl of(){
      return new OrderRemoveDeliveryActionImpl();
   }
   

   public static OrderRemoveDeliveryActionImpl of(final OrderRemoveDeliveryAction template) {
      OrderRemoveDeliveryActionImpl instance = new OrderRemoveDeliveryActionImpl();
      instance.setDeliveryId(template.getDeliveryId());
      return instance;
   }

}