package com.commercetools.models.OrderEdit;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddShoppingListActionImpl;

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
@JsonDeserialize(as = StagedOrderAddShoppingListActionImpl.class)
public interface StagedOrderAddShoppingListAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("shoppingList")
   public ShoppingListResourceIdentifier getShoppingList();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelResourceIdentifier getDistributionChannel();

   public void setShoppingList(final ShoppingListResourceIdentifier shoppingList);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
   
   public static StagedOrderAddShoppingListActionImpl of(){
      return new StagedOrderAddShoppingListActionImpl();
   }
   

   public static StagedOrderAddShoppingListActionImpl of(final StagedOrderAddShoppingListAction template) {
      StagedOrderAddShoppingListActionImpl instance = new StagedOrderAddShoppingListActionImpl();
      instance.setShoppingList(template.getShoppingList());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setDistributionChannel(template.getDistributionChannel());
      return instance;
   }

}