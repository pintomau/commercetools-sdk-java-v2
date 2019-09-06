package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
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
public final class StagedOrderSetCustomLineItemShippingDetailsActionImpl implements StagedOrderSetCustomLineItemShippingDetailsAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails;

   @JsonCreator
   StagedOrderSetCustomLineItemShippingDetailsActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("shippingDetails") final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails) {
      this.customLineItemId = customLineItemId;
      this.shippingDetails = shippingDetails;
      this.action = "setCustomLineItemShippingDetails";
   }
   public StagedOrderSetCustomLineItemShippingDetailsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.Cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setShippingDetails(final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }

}