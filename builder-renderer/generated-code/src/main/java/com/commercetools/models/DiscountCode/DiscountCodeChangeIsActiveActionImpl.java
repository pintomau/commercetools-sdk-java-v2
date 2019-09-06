package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
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
public final class DiscountCodeChangeIsActiveActionImpl implements DiscountCodeChangeIsActiveAction {

   private java.lang.String action;
   
   private java.lang.Boolean isActive;

   @JsonCreator
   DiscountCodeChangeIsActiveActionImpl(@JsonProperty("isActive") final java.lang.Boolean isActive) {
      this.isActive = isActive;
      this.action = "changeIsActive";
   }
   public DiscountCodeChangeIsActiveActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }

   public void setIsActive(final java.lang.Boolean isActive){
      this.isActive = isActive;
   }

}