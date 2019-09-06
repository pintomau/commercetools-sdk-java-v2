package com.commercetools.models.OrderEdit;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier;
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
public final class StagedOrderAddShoppingListActionImpl implements StagedOrderAddShoppingListAction {

   private java.lang.String action;
   
   private com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier shoppingList;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   private com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel;

   @JsonCreator
   StagedOrderAddShoppingListActionImpl(@JsonProperty("shoppingList") final com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier shoppingList, @JsonProperty("supplyChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel) {
      this.shoppingList = shoppingList;
      this.supplyChannel = supplyChannel;
      this.distributionChannel = distributionChannel;
      this.action = "addShoppingList";
   }
   public StagedOrderAddShoppingListActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier getShoppingList(){
      return this.shoppingList;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public com.commercetools.models.Channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public void setShoppingList(final com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier shoppingList){
      this.shoppingList = shoppingList;
   }
   
   public void setSupplyChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setDistributionChannel(final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }

}