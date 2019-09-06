package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartAddPaymentActionImpl;

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
@JsonDeserialize(as = CartAddPaymentActionImpl.class)
public interface CartAddPaymentAction extends CartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("payment")
   public PaymentResourceIdentifier getPayment();

   public void setPayment(final PaymentResourceIdentifier payment);
   
   public static CartAddPaymentActionImpl of(){
      return new CartAddPaymentActionImpl();
   }
   

   public static CartAddPaymentActionImpl of(final CartAddPaymentAction template) {
      CartAddPaymentActionImpl instance = new CartAddPaymentActionImpl();
      instance.setPayment(template.getPayment());
      return instance;
   }

}