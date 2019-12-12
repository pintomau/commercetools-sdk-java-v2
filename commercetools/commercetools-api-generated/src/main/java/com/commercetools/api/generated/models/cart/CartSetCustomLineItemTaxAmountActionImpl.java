package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft;
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
public final class CartSetCustomLineItemTaxAmountActionImpl implements CartSetCustomLineItemTaxAmountAction {

   private String action;
   
   private String customLineItemId;
   
   private com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft externalTaxAmount;

   @JsonCreator
   CartSetCustomLineItemTaxAmountActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("externalTaxAmount") final com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
      this.customLineItemId = customLineItemId;
      this.externalTaxAmount = externalTaxAmount;
      this.action = "setCustomLineItemTaxAmount";
   }
   public CartSetCustomLineItemTaxAmountActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
      return this.externalTaxAmount;
   }

   public void setCustomLineItemId(final String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setExternalTaxAmount(final com.commercetools.api.generated.models.cart.ExternalTaxAmountDraft externalTaxAmount){
      this.externalTaxAmount = externalTaxAmount;
   }

}