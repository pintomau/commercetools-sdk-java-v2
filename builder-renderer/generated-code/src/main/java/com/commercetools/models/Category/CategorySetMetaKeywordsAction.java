package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetMetaKeywordsActionImpl;

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
@JsonDeserialize(as = CategorySetMetaKeywordsActionImpl.class)
public interface CategorySetMetaKeywordsAction extends CategoryUpdateAction {

   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();

   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public static CategorySetMetaKeywordsActionImpl of(){
      return new CategorySetMetaKeywordsActionImpl();
   }
   

   public static CategorySetMetaKeywordsActionImpl of(final CategorySetMetaKeywordsAction template) {
      CategorySetMetaKeywordsActionImpl instance = new CategorySetMetaKeywordsActionImpl();
      instance.setMetaKeywords(template.getMetaKeywords());
      return instance;
   }

}