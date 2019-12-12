package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangePaymentStateActionImpl;

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
@JsonDeserialize(as = StagedOrderChangePaymentStateActionImpl.class)
public interface StagedOrderChangePaymentStateAction extends StagedOrderUpdateAction {

   
   
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();

   public void setPaymentState(final PaymentState paymentState);
   
   public static StagedOrderChangePaymentStateActionImpl of(){
      return new StagedOrderChangePaymentStateActionImpl();
   }
   

   public static StagedOrderChangePaymentStateActionImpl of(final StagedOrderChangePaymentStateAction template) {
      StagedOrderChangePaymentStateActionImpl instance = new StagedOrderChangePaymentStateActionImpl();
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}