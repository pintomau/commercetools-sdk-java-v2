package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldEnumValue;
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
public final class TypeAddEnumValueActionImpl implements TypeAddEnumValueAction {

   private java.lang.String action;
   
   private java.lang.String fieldName;
   
   private com.commercetools.models.Type.CustomFieldEnumValue value;

   @JsonCreator
   TypeAddEnumValueActionImpl(@JsonProperty("fieldName") final java.lang.String fieldName, @JsonProperty("value") final com.commercetools.models.Type.CustomFieldEnumValue value) {
      this.fieldName = fieldName;
      this.value = value;
      this.action = "addEnumValue";
   }
   public TypeAddEnumValueActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Type.CustomFieldEnumValue getValue(){
      return this.value;
   }

   public void setFieldName(final java.lang.String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setValue(final com.commercetools.models.Type.CustomFieldEnumValue value){
      this.value = value;
   }

}