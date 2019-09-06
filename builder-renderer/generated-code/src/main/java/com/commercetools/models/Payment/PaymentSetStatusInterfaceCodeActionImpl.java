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
public final class PaymentSetStatusInterfaceCodeActionImpl implements PaymentSetStatusInterfaceCodeAction {

   private java.lang.String action;
   
   private java.lang.String interfaceCode;

   @JsonCreator
   PaymentSetStatusInterfaceCodeActionImpl(@JsonProperty("interfaceCode") final java.lang.String interfaceCode) {
      this.interfaceCode = interfaceCode;
      this.action = "setStatusInterfaceCode";
   }
   public PaymentSetStatusInterfaceCodeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public void setInterfaceCode(final java.lang.String interfaceCode){
      this.interfaceCode = interfaceCode;
   }

}