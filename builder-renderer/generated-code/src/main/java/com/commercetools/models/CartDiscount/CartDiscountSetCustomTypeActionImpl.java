package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountUpdateAction;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.Object;
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
public final class CartDiscountSetCustomTypeActionImpl implements CartDiscountSetCustomTypeAction {

   private java.lang.String action;
   
   private java.lang.Object fields;
   
   private com.commercetools.models.Type.TypeResourceIdentifier type;

   @JsonCreator
   CartDiscountSetCustomTypeActionImpl(@JsonProperty("fields") final java.lang.Object fields, @JsonProperty("type") final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.fields = fields;
      this.type = type;
      this.action = "setCustomType";
   }
   public CartDiscountSetCustomTypeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Object getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setFields(final java.lang.Object fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.Type.TypeResourceIdentifier type){
      this.type = type;
   }

}