package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetTextLineItemCustomTypeActionImpl implements ShoppingListSetTextLineItemCustomTypeAction {

   private String action;
   
   private String textLineItemId;
   
   private com.commercetools.api.models.type.TypeResourceIdentifier type;
   
   private com.commercetools.api.models.type.FieldContainer fields;

   @JsonCreator
   ShoppingListSetTextLineItemCustomTypeActionImpl(@JsonProperty("textLineItemId") final String textLineItemId, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
      this.textLineItemId = textLineItemId;
      this.type = type;
      this.fields = fields;
      this.action = "setTextLineItemCustomType";
   }
   public ShoppingListSetTextLineItemCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getTextLineItemId(){
      return this.textLineItemId;
   }
   
   
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }

   public void setTextLineItemId(final String textLineItemId){
      this.textLineItemId = textLineItemId;
   }
   
   public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
      this.fields = fields;
   }

}