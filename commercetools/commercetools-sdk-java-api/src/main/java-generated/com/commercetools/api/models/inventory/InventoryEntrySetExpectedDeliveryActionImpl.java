
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntrySetExpectedDeliveryActionImpl implements InventoryEntrySetExpectedDeliveryAction {

    private String action;

    private java.time.ZonedDateTime expectedDelivery;

    @JsonCreator
    InventoryEntrySetExpectedDeliveryActionImpl(
            @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        this.action = "setExpectedDelivery";
    }

    public InventoryEntrySetExpectedDeliveryActionImpl() {
        this.action = "setExpectedDelivery";
    }

    public String getAction() {
        return this.action;
    }

    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntrySetExpectedDeliveryActionImpl that = (InventoryEntrySetExpectedDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(expectedDelivery,
            that.expectedDelivery).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(expectedDelivery).toHashCode();
    }

}