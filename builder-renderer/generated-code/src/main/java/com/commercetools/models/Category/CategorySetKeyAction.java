package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategorySetKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategorySetKeyActionImpl.class)
public interface CategorySetKeyAction extends CategoryUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static CategorySetKeyActionImpl of(){
      return new CategorySetKeyActionImpl();
   }
   

   public static CategorySetKeyActionImpl of(final CategorySetKeyAction template) {
      CategorySetKeyActionImpl instance = new CategorySetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}