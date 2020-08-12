package com.commercetools.api.models.cart;


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
public final class ItemShippingTargetImpl implements ItemShippingTarget {

   private String addressKey;
   
   private Double quantity;

   @JsonCreator
   ItemShippingTargetImpl(@JsonProperty("addressKey") final String addressKey, @JsonProperty("quantity") final Double quantity) {
      this.addressKey = addressKey;
      this.quantity = quantity;
   }
   public ItemShippingTargetImpl() {
      
   }
   
   /**
   *  <p>The key of the address in the cart's <code>itemShippingAddresses</code></p>
   */
   public String getAddressKey(){
      return this.addressKey;
   }
   
   /**
   *  <p>The quantity of items that should go to the address with the specified <code>addressKey</code>.
   *  Only positive values are allowed.
   *  Using <code>0</code> as quantity is also possible in a draft object, but the element will not be present in the resulting ItemShippingDetails.</p>
   */
   public Double getQuantity(){
      return this.quantity;
   }

   public void setAddressKey(final String addressKey){
      this.addressKey = addressKey;
   }
   
   public void setQuantity(final Double quantity){
      this.quantity = quantity;
   }

}