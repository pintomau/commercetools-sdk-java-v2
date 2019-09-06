package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Boolean;
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
public final class PriceChangedErrorImpl implements PriceChangedError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.util.List<java.lang.String> lineItems;
   
   private java.lang.Boolean shipping;

   @JsonCreator
   PriceChangedErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("lineItems") final java.util.List<java.lang.String> lineItems, @JsonProperty("shipping") final java.lang.Boolean shipping) {
      this.message = message;
      this.lineItems = lineItems;
      this.shipping = shipping;
      this.code = "PriceChanged";
   }
   public PriceChangedErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<java.lang.String> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.lang.Boolean getShipping(){
      return this.shipping;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setLineItems(final java.util.List<java.lang.String> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setShipping(final java.lang.Boolean shipping){
      this.shipping = shipping;
   }

}