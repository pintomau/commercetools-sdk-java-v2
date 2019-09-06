package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import com.commercetools.models.Payment.TransactionState;
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
public final class PaymentChangeTransactionStateActionImpl implements PaymentChangeTransactionStateAction {

   private java.lang.String action;
   
   private com.commercetools.models.Payment.TransactionState state;
   
   private java.lang.String transactionId;

   @JsonCreator
   PaymentChangeTransactionStateActionImpl(@JsonProperty("state") final com.commercetools.models.Payment.TransactionState state, @JsonProperty("transactionId") final java.lang.String transactionId) {
      this.state = state;
      this.transactionId = transactionId;
      this.action = "changeTransactionState";
   }
   public PaymentChangeTransactionStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Payment.TransactionState getState(){
      return this.state;
   }
   
   
   public java.lang.String getTransactionId(){
      return this.transactionId;
   }

   public void setState(final com.commercetools.models.Payment.TransactionState state){
      this.state = state;
   }
   
   public void setTransactionId(final java.lang.String transactionId){
      this.transactionId = transactionId;
   }

}