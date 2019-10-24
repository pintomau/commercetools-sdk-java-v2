package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.ProductImageAddedMessageImpl;

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
@JsonDeserialize(as = ProductImageAddedMessageImpl.class)
public interface ProductImageAddedMessage extends Message {

   
   @NotNull
   @JsonProperty("variantId")
   public Long getVariantId();
   
   @NotNull
   @Valid
   @JsonProperty("image")
   public Image getImage();
   
   @NotNull
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);
   
   public void setImage(final Image image);
   
   public void setStaged(final Boolean staged);
   
   public static ProductImageAddedMessageImpl of(){
      return new ProductImageAddedMessageImpl();
   }
   

   public static ProductImageAddedMessageImpl of(final ProductImageAddedMessage template) {
      ProductImageAddedMessageImpl instance = new ProductImageAddedMessageImpl();
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
      instance.setImage(template.getImage());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      return instance;
   }

}