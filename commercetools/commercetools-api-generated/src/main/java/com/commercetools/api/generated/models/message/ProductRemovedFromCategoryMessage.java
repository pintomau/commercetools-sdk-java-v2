package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.ProductRemovedFromCategoryMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = ProductRemovedFromCategoryMessageImpl.class)
public interface ProductRemovedFromCategoryMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("category")
   public CategoryReference getCategory();
   
   @NotNull
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setCategory(final CategoryReference category);
   
   public void setStaged(final Boolean staged);
   
   public static ProductRemovedFromCategoryMessageImpl of(){
      return new ProductRemovedFromCategoryMessageImpl();
   }
   

   public static ProductRemovedFromCategoryMessageImpl of(final ProductRemovedFromCategoryMessage template) {
      ProductRemovedFromCategoryMessageImpl instance = new ProductRemovedFromCategoryMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setStaged(template.getStaged());
      instance.setCategory(template.getCategory());
      return instance;
   }

}