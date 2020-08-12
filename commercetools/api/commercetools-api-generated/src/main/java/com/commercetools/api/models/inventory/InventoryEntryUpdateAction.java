package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryAddQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntryChangeQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeAction;
import com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction;
import com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction;
import com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionImpl.class, name = "addQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionImpl.class, name = "changeQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionImpl.class, name = "removeQuantity"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionImpl.class, name = "setExpectedDelivery"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionImpl.class, name = "setRestockableInDays"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionImpl.class, name = "setSupplyChannel")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = InventoryEntryUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface InventoryEntryUpdateAction  {


   


}