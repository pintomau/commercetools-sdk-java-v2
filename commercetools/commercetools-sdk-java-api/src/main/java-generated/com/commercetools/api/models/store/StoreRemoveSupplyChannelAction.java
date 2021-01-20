
package com.commercetools.api.models.store;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreRemoveSupplyChannelActionImpl;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreRemoveSupplyChannelActionImpl.class)
public interface StoreRemoveSupplyChannelAction extends StoreUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static StoreRemoveSupplyChannelAction of() {
        return new StoreRemoveSupplyChannelActionImpl();
    }

    public static StoreRemoveSupplyChannelAction of(final StoreRemoveSupplyChannelAction template) {
        StoreRemoveSupplyChannelActionImpl instance = new StoreRemoveSupplyChannelActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static StoreRemoveSupplyChannelActionBuilder builder() {
        return StoreRemoveSupplyChannelActionBuilder.of();
    }

    public static StoreRemoveSupplyChannelActionBuilder builder(final StoreRemoveSupplyChannelAction template) {
        return StoreRemoveSupplyChannelActionBuilder.of(template);
    }

    default <T> T withStoreRemoveSupplyChannelAction(Function<StoreRemoveSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }
}