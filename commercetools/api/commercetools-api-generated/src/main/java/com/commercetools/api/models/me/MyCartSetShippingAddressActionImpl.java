package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCartUpdateAction;
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
public final class MyCartSetShippingAddressActionImpl implements MyCartSetShippingAddressAction {

   private String action;

   private com.commercetools.api.models.common.Address address;

   @JsonCreator
   MyCartSetShippingAddressActionImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address) {
      this.address = address;
      this.action = "setShippingAddress";
   }
   public MyCartSetShippingAddressActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   public void setAddress(final com.commercetools.api.models.common.Address address){
      this.address = address;
   }

}
