package com.commercetools.models.Customer;

import com.commercetools.models.Customer.Customer;
import java.lang.Object;
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
public final class CustomerSignInResultImpl implements CustomerSignInResult {

   private java.lang.Object cart;
   
   private com.commercetools.models.Customer.Customer customer;

   @JsonCreator
   CustomerSignInResultImpl(@JsonProperty("cart") final java.lang.Object cart, @JsonProperty("customer") final com.commercetools.models.Customer.Customer customer) {
      this.cart = cart;
      this.customer = customer;
   }
   public CustomerSignInResultImpl() {
      
   }
   
   
   public java.lang.Object getCart(){
      return this.cart;
   }
   
   
   public com.commercetools.models.Customer.Customer getCustomer(){
      return this.customer;
   }

   public void setCart(final java.lang.Object cart){
      this.cart = cart;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.Customer customer){
      this.customer = customer;
   }

}