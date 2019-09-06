package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeTextInputHint;
import com.commercetools.models.Type.TypeUpdateAction;
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
public final class TypeChangeInputHintActionImpl implements TypeChangeInputHintAction {

   private java.lang.String action;
   
   private java.lang.String fieldName;
   
   private com.commercetools.models.Type.TypeTextInputHint inputHint;

   @JsonCreator
   TypeChangeInputHintActionImpl(@JsonProperty("fieldName") final java.lang.String fieldName, @JsonProperty("inputHint") final com.commercetools.models.Type.TypeTextInputHint inputHint) {
      this.fieldName = fieldName;
      this.inputHint = inputHint;
      this.action = "changeInputHint";
   }
   public TypeChangeInputHintActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }

   public void setFieldName(final java.lang.String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setInputHint(final com.commercetools.models.Type.TypeTextInputHint inputHint){
      this.inputHint = inputHint;
   }

}