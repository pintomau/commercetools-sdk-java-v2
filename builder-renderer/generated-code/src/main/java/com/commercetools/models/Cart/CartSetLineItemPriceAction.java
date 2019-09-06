package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Money;
import java.lang.String;
import com.commercetools.models.Cart.CartSetLineItemPriceActionImpl;

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
@JsonDeserialize(as = CartSetLineItemPriceActionImpl.class)
public interface CartSetLineItemPriceAction extends CartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();

   public void setLineItemId(final String lineItemId);
   
   public void setExternalPrice(final Money externalPrice);
   
   public static CartSetLineItemPriceActionImpl of(){
      return new CartSetLineItemPriceActionImpl();
   }
   

   public static CartSetLineItemPriceActionImpl of(final CartSetLineItemPriceAction template) {
      CartSetLineItemPriceActionImpl instance = new CartSetLineItemPriceActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}