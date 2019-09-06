package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemTotalPriceActionImpl;

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
@JsonDeserialize(as = CartSetLineItemTotalPriceActionImpl.class)
public interface CartSetLineItemTotalPriceAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();

   public void setLineItemId(final String lineItemId);
   
   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);
   
   public static CartSetLineItemTotalPriceActionImpl of(){
      return new CartSetLineItemTotalPriceActionImpl();
   }
   

   public static CartSetLineItemTotalPriceActionImpl of(final CartSetLineItemTotalPriceAction template) {
      CartSetLineItemTotalPriceActionImpl instance = new CartSetLineItemTotalPriceActionImpl();
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}