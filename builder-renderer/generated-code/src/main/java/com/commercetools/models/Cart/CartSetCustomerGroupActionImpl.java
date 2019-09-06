package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
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
public final class CartSetCustomerGroupActionImpl implements CartSetCustomerGroupAction {

   private java.lang.String action;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;

   @JsonCreator
   CartSetCustomerGroupActionImpl(@JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      this.action = "setCustomerGroup";
   }
   public CartSetCustomerGroupActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }

}