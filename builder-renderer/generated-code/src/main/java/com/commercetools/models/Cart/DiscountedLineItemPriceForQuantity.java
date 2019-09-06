package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountedLineItemPrice;
import java.lang.Integer;
import com.commercetools.models.Cart.DiscountedLineItemPriceForQuantityImpl;

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
@JsonDeserialize(as = DiscountedLineItemPriceForQuantityImpl.class)
public interface DiscountedLineItemPriceForQuantity  {

   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("discountedPrice")
   public DiscountedLineItemPrice getDiscountedPrice();

   public void setQuantity(final Integer quantity);
   
   public void setDiscountedPrice(final DiscountedLineItemPrice discountedPrice);
   
   public static DiscountedLineItemPriceForQuantityImpl of(){
      return new DiscountedLineItemPriceForQuantityImpl();
   }
   

   public static DiscountedLineItemPriceForQuantityImpl of(final DiscountedLineItemPriceForQuantity template) {
      DiscountedLineItemPriceForQuantityImpl instance = new DiscountedLineItemPriceForQuantityImpl();
      instance.setQuantity(template.getQuantity());
      instance.setDiscountedPrice(template.getDiscountedPrice());
      return instance;
   }

}