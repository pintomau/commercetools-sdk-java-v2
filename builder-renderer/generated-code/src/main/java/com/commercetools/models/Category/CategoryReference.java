package com.commercetools.models.Category;

import com.commercetools.models.Category.Category;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Category.CategoryReferenceImpl;

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
@JsonDeserialize(as = CategoryReferenceImpl.class)
public interface CategoryReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Category getObj();

   public void setObj(final Category obj);
   
   public static CategoryReferenceImpl of(){
      return new CategoryReferenceImpl();
   }
   

   public static CategoryReferenceImpl of(final CategoryReference template) {
      CategoryReferenceImpl instance = new CategoryReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}