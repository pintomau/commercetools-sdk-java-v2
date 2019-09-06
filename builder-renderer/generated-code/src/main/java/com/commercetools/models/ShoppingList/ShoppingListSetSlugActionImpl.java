package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
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
public final class ShoppingListSetSlugActionImpl implements ShoppingListSetSlugAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.LocalizedString slug;

   @JsonCreator
   ShoppingListSetSlugActionImpl(@JsonProperty("slug") final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      this.action = "setSlug";
   }
   public ShoppingListSetSlugActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setSlug(final com.commercetools.models.Common.LocalizedString slug){
      this.slug = slug;
   }

}