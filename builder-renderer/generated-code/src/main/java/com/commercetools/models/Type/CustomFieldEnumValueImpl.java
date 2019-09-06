package com.commercetools.models.Type;

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
public final class CustomFieldEnumValueImpl implements CustomFieldEnumValue {

   private java.lang.String label;
   
   private java.lang.String key;

   @JsonCreator
   CustomFieldEnumValueImpl(@JsonProperty("label") final java.lang.String label, @JsonProperty("key") final java.lang.String key) {
      this.label = label;
      this.key = key;
   }
   public CustomFieldEnumValueImpl() {
      
   }
   
   
   public java.lang.String getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setLabel(final java.lang.String label){
      this.label = label;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}