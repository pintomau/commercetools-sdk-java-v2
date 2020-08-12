package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategoryChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategoryChangeNameActionImpl.class)
public interface CategoryChangeNameAction extends CategoryUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static CategoryChangeNameActionImpl of(){
      return new CategoryChangeNameActionImpl();
   }
   

   public static CategoryChangeNameActionImpl of(final CategoryChangeNameAction template) {
      CategoryChangeNameActionImpl instance = new CategoryChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}