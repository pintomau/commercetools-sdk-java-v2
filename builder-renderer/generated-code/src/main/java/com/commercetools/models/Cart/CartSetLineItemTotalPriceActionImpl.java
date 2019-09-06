package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetLineItemTotalPriceActionImpl implements CartSetLineItemTotalPriceAction {

   private java.lang.String action;
   
   private com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private java.lang.String lineItemId;

   @JsonCreator
   CartSetLineItemTotalPriceActionImpl(@JsonProperty("externalTotalPrice") final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("lineItemId") final java.lang.String lineItemId) {
      this.externalTotalPrice = externalTotalPrice;
      this.lineItemId = lineItemId;
      this.action = "setLineItemTotalPrice";
   }
   public CartSetLineItemTotalPriceActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public void setExternalTotalPrice(final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }

}