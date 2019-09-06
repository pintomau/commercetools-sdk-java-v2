package com.commercetools.models.Message;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.CategorySlugChangedMessageImpl;

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
@JsonDeserialize(as = CategorySlugChangedMessageImpl.class)
public interface CategorySlugChangedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   public void setSlug(final LocalizedString slug);
   
   public static CategorySlugChangedMessageImpl of(){
      return new CategorySlugChangedMessageImpl();
   }
   

   public static CategorySlugChangedMessageImpl of(final CategorySlugChangedMessage template) {
      CategorySlugChangedMessageImpl instance = new CategorySlugChangedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setSlug(template.getSlug());
      return instance;
   }

}