package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.OrderEdit.OrderExcerpt;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.OrderEdit.OrderEditAppliedImpl;

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
@JsonDeserialize(as = OrderEditAppliedImpl.class)
public interface OrderEditApplied extends OrderEditResult {

   
   @NotNull
   @JsonProperty("appliedAt")
   public ZonedDateTime getAppliedAt();
   
   @NotNull
   @Valid
   @JsonProperty("excerptBeforeEdit")
   public OrderExcerpt getExcerptBeforeEdit();
   
   @NotNull
   @Valid
   @JsonProperty("excerptAfterEdit")
   public OrderExcerpt getExcerptAfterEdit();

   public void setAppliedAt(final ZonedDateTime appliedAt);
   
   public void setExcerptBeforeEdit(final OrderExcerpt excerptBeforeEdit);
   
   public void setExcerptAfterEdit(final OrderExcerpt excerptAfterEdit);
   
   public static OrderEditAppliedImpl of(){
      return new OrderEditAppliedImpl();
   }
   

   public static OrderEditAppliedImpl of(final OrderEditApplied template) {
      OrderEditAppliedImpl instance = new OrderEditAppliedImpl();
      instance.setExcerptAfterEdit(template.getExcerptAfterEdit());
      instance.setExcerptBeforeEdit(template.getExcerptBeforeEdit());
      instance.setAppliedAt(template.getAppliedAt());
      return instance;
   }

}