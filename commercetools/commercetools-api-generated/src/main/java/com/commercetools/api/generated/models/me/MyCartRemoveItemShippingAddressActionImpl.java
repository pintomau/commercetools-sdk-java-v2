package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRemoveItemShippingAddressActionImpl implements MyCartRemoveItemShippingAddressAction {

   private String action;
   
   private String addressKey;

   @JsonCreator
   MyCartRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final String addressKey) {
      this.addressKey = addressKey;
      this.action = "removeItemShippingAddress";
   }
   public MyCartRemoveItemShippingAddressActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAddressKey(){
      return this.addressKey;
   }

   public void setAddressKey(final String addressKey){
      this.addressKey = addressKey;
   }

}