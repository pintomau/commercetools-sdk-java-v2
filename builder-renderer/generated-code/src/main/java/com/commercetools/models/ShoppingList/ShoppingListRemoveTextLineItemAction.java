package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListRemoveTextLineItemActionImpl;

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
@JsonDeserialize(as = ShoppingListRemoveTextLineItemActionImpl.class)
public interface ShoppingListRemoveTextLineItemAction extends ShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("textLineItemId")
   public String getTextLineItemId();
   
   
   @JsonProperty("quantity")
   public Long getQuantity();

   public void setTextLineItemId(final String textLineItemId);
   
   public void setQuantity(final Long quantity);
   
   public static ShoppingListRemoveTextLineItemActionImpl of(){
      return new ShoppingListRemoveTextLineItemActionImpl();
   }
   

   public static ShoppingListRemoveTextLineItemActionImpl of(final ShoppingListRemoveTextLineItemAction template) {
      ShoppingListRemoveTextLineItemActionImpl instance = new ShoppingListRemoveTextLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setTextLineItemId(template.getTextLineItemId());
      return instance;
   }

}