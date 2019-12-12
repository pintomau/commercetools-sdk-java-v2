package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidFieldErrorImpl implements InvalidFieldError {

   private String code;
   
   private String message;
   
   private java.util.List<JsonNode> allowedValues;
   
   private String field;
   
   private JsonNode invalidValue;

   @JsonCreator
   InvalidFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("allowedValues") final java.util.List<JsonNode> allowedValues, @JsonProperty("field") final String field, @JsonProperty("invalidValue") final JsonNode invalidValue) {
      this.message = message;
      this.allowedValues = allowedValues;
      this.field = field;
      this.invalidValue = invalidValue;
      this.code = "InvalidField";
   }
   public InvalidFieldErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<JsonNode> getAllowedValues(){
      return this.allowedValues;
   }
   
   
   public String getField(){
      return this.field;
   }
   
   
   public JsonNode getInvalidValue(){
      return this.invalidValue;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setAllowedValues(final java.util.List<JsonNode> allowedValues){
      this.allowedValues = allowedValues;
   }
   
   public void setField(final String field){
      this.field = field;
   }
   
   public void setInvalidValue(final JsonNode invalidValue){
      this.invalidValue = invalidValue;
   }

}