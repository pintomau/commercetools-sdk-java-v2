package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.PaymentState;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderPaymentStateChangedMessagePayloadImpl implements OrderPaymentStateChangedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Order.PaymentState oldPaymentState;
   
   private com.commercetools.models.Order.PaymentState paymentState;

   @JsonCreator
   OrderPaymentStateChangedMessagePayloadImpl(@JsonProperty("oldPaymentState") final com.commercetools.models.Order.PaymentState oldPaymentState, @JsonProperty("paymentState") final com.commercetools.models.Order.PaymentState paymentState) {
      this.oldPaymentState = oldPaymentState;
      this.paymentState = paymentState;
      this.type = "OrderPaymentStateChanged";
   }
   public OrderPaymentStateChangedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Order.PaymentState getOldPaymentState(){
      return this.oldPaymentState;
   }
   
   
   public com.commercetools.models.Order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setOldPaymentState(final com.commercetools.models.Order.PaymentState oldPaymentState){
      this.oldPaymentState = oldPaymentState;
   }
   
   public void setPaymentState(final com.commercetools.models.Order.PaymentState paymentState){
      this.paymentState = paymentState;
   }

}