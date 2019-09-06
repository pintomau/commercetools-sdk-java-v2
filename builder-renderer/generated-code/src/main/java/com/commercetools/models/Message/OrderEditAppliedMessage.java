package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.OrderEdit.OrderEditApplied;
import com.commercetools.models.OrderEdit.OrderEditReference;
import com.commercetools.models.Message.OrderEditAppliedMessageImpl;

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
@JsonDeserialize(as = OrderEditAppliedMessageImpl.class)
public interface OrderEditAppliedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("edit")
   public OrderEditReference getEdit();
   
   @NotNull
   @Valid
   @JsonProperty("result")
   public OrderEditApplied getResult();

   public void setEdit(final OrderEditReference edit);
   
   public void setResult(final OrderEditApplied result);
   
   public static OrderEditAppliedMessageImpl of(){
      return new OrderEditAppliedMessageImpl();
   }
   

   public static OrderEditAppliedMessageImpl of(final OrderEditAppliedMessage template) {
      OrderEditAppliedMessageImpl instance = new OrderEditAppliedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setResult(template.getResult());
      instance.setEdit(template.getEdit());
      return instance;
   }

}