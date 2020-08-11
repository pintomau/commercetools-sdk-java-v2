package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSignInResultImpl implements CustomerSignInResult {

   private com.fasterxml.jackson.databind.JsonNode cart;

   private com.commercetools.api.models.customer.Customer customer;

   @JsonCreator
   CustomerSignInResultImpl(@JsonProperty("cart") final com.fasterxml.jackson.databind.JsonNode cart, @JsonProperty("customer") final com.commercetools.api.models.customer.Customer customer) {
      this.cart = cart;
      this.customer = customer;
   }
   public CustomerSignInResultImpl() {

   }

   /**
   *  <p>A cart that is associated to the customer.
   *  Empty if the customer does not have a cart yet.</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getCart(){
      return this.cart;
   }


   public com.commercetools.api.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public void setCart(final com.fasterxml.jackson.databind.JsonNode cart){
      this.cart = cart;
   }

   public void setCustomer(final com.commercetools.api.models.customer.Customer customer){
      this.customer = customer;
   }

}
