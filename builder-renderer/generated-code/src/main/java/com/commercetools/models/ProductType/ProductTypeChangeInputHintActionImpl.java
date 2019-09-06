package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import com.commercetools.models.ProductType.TextInputHint;
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
public final class ProductTypeChangeInputHintActionImpl implements ProductTypeChangeInputHintAction {

   private java.lang.String action;
   
   private com.commercetools.models.ProductType.TextInputHint newValue;
   
   private java.lang.String attributeName;

   @JsonCreator
   ProductTypeChangeInputHintActionImpl(@JsonProperty("newValue") final com.commercetools.models.ProductType.TextInputHint newValue, @JsonProperty("attributeName") final java.lang.String attributeName) {
      this.newValue = newValue;
      this.attributeName = attributeName;
      this.action = "changeInputHint";
   }
   public ProductTypeChangeInputHintActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.ProductType.TextInputHint getNewValue(){
      return this.newValue;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public void setNewValue(final com.commercetools.models.ProductType.TextInputHint newValue){
      this.newValue = newValue;
   }
   
   public void setAttributeName(final java.lang.String attributeName){
      this.attributeName = attributeName;
   }

}