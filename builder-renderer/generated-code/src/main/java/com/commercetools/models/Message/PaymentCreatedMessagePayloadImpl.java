package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Payment.Payment;
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
public final class PaymentCreatedMessagePayloadImpl implements PaymentCreatedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Payment.Payment payment;

   @JsonCreator
   PaymentCreatedMessagePayloadImpl(@JsonProperty("payment") final com.commercetools.models.Payment.Payment payment) {
      this.payment = payment;
      this.type = "PaymentCreated";
   }
   public PaymentCreatedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Payment.Payment getPayment(){
      return this.payment;
   }

   public void setPayment(final com.commercetools.models.Payment.Payment payment){
      this.payment = payment;
   }

}