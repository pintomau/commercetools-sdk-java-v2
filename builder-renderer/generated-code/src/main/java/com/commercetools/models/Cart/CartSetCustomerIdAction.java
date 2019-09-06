package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomerIdActionImpl;

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
@JsonDeserialize(as = CartSetCustomerIdActionImpl.class)
public interface CartSetCustomerIdAction extends CartUpdateAction {

   
   
   @JsonProperty("customerId")
   public String getCustomerId();

   public void setCustomerId(final String customerId);
   
   public static CartSetCustomerIdActionImpl of(){
      return new CartSetCustomerIdActionImpl();
   }
   

   public static CartSetCustomerIdActionImpl of(final CartSetCustomerIdAction template) {
      CartSetCustomerIdActionImpl instance = new CartSetCustomerIdActionImpl();
      instance.setCustomerId(template.getCustomerId());
      return instance;
   }

}