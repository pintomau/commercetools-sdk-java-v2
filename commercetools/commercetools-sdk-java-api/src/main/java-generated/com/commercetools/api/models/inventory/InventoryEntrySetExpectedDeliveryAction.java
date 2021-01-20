
package com.commercetools.api.models.inventory;

import java.io.IOException;
import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionImpl;
import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetExpectedDeliveryActionImpl.class)
public interface InventoryEntrySetExpectedDeliveryAction extends InventoryEntryUpdateAction {

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    public static InventoryEntrySetExpectedDeliveryAction of() {
        return new InventoryEntrySetExpectedDeliveryActionImpl();
    }

    public static InventoryEntrySetExpectedDeliveryAction of(final InventoryEntrySetExpectedDeliveryAction template) {
        InventoryEntrySetExpectedDeliveryActionImpl instance = new InventoryEntrySetExpectedDeliveryActionImpl();
        instance.setExpectedDelivery(template.getExpectedDelivery());
        return instance;
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder builder() {
        return InventoryEntrySetExpectedDeliveryActionBuilder.of();
    }

    public static InventoryEntrySetExpectedDeliveryActionBuilder builder(
            final InventoryEntrySetExpectedDeliveryAction template) {
        return InventoryEntrySetExpectedDeliveryActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetExpectedDeliveryAction(
            Function<InventoryEntrySetExpectedDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
