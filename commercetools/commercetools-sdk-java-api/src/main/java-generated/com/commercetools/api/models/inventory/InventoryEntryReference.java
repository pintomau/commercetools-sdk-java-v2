
package com.commercetools.api.models.inventory;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.inventory.InventoryEntryReferenceImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryReferenceImpl.class)
public interface InventoryEntryReference extends Reference {

    @Valid
    @JsonProperty("obj")
    public InventoryEntry getObj();

    public void setObj(final InventoryEntry obj);

    public static InventoryEntryReference of() {
        return new InventoryEntryReferenceImpl();
    }

    public static InventoryEntryReference of(final InventoryEntryReference template) {
        InventoryEntryReferenceImpl instance = new InventoryEntryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static InventoryEntryReferenceBuilder builder() {
        return InventoryEntryReferenceBuilder.of();
    }

    public static InventoryEntryReferenceBuilder builder(final InventoryEntryReference template) {
        return InventoryEntryReferenceBuilder.of(template);
    }

    default <T> T withInventoryEntryReference(Function<InventoryEntryReference, T> helper) {
        return helper.apply(this);
    }
}
