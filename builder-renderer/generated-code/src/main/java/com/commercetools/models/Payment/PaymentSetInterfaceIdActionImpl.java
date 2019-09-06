package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
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
public final class PaymentSetInterfaceIdActionImpl implements PaymentSetInterfaceIdAction {

   private java.lang.String action;
   
   private java.lang.String interfaceId;

   @JsonCreator
   PaymentSetInterfaceIdActionImpl(@JsonProperty("interfaceId") final java.lang.String interfaceId) {
      this.interfaceId = interfaceId;
      this.action = "setInterfaceId";
   }
   public PaymentSetInterfaceIdActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getInterfaceId(){
      return this.interfaceId;
   }

   public void setInterfaceId(final java.lang.String interfaceId){
      this.interfaceId = interfaceId;
   }

}