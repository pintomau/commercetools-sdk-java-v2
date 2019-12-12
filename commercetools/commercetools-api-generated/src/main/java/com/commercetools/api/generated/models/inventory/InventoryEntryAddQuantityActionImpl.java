package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
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
public final class InventoryEntryAddQuantityActionImpl implements InventoryEntryAddQuantityAction {

   private String action;
   
   private Long quantity;

   @JsonCreator
   InventoryEntryAddQuantityActionImpl(@JsonProperty("quantity") final Long quantity) {
      this.quantity = quantity;
      this.action = "addQuantity";
   }
   public InventoryEntryAddQuantityActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }

   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }

}