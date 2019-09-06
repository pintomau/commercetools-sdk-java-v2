package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.OrderEdit.OrderEditApplied;
import com.commercetools.models.OrderEdit.OrderEditReference;
import java.lang.String;
import com.commercetools.models.Message.OrderEditAppliedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderEditAppliedMessagePayloadImpl.class)
public interface OrderEditAppliedMessagePayload extends MessagePayload {

   
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
   
   public static OrderEditAppliedMessagePayloadImpl of(){
      return new OrderEditAppliedMessagePayloadImpl();
   }
   

   public static OrderEditAppliedMessagePayloadImpl of(final OrderEditAppliedMessagePayload template) {
      OrderEditAppliedMessagePayloadImpl instance = new OrderEditAppliedMessagePayloadImpl();
      instance.setResult(template.getResult());
      instance.setEdit(template.getEdit());
      return instance;
   }

}