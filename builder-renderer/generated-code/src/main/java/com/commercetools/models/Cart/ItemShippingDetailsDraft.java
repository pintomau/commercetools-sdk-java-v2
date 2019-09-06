package com.commercetools.models.Cart;

import com.commercetools.models.Cart.ItemShippingTarget;
import com.commercetools.models.Cart.ItemShippingDetailsDraftImpl;

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
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("targets")
   public List<ItemShippingTarget> getTargets();

   public void setTargets(final List<ItemShippingTarget> targets);
   
   public static ItemShippingDetailsDraftImpl of(){
      return new ItemShippingDetailsDraftImpl();
   }
   

   public static ItemShippingDetailsDraftImpl of(final ItemShippingDetailsDraft template) {
      ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
      instance.setTargets(template.getTargets());
      return instance;
   }

}