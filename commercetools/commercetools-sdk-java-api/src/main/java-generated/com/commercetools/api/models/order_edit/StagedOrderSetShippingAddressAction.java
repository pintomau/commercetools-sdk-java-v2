
package com.commercetools.api.models.order_edit;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressActionImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressActionImpl.class)
public interface StagedOrderSetShippingAddressAction extends StagedOrderUpdateAction {

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static StagedOrderSetShippingAddressAction of() {
        return new StagedOrderSetShippingAddressActionImpl();
    }

    public static StagedOrderSetShippingAddressAction of(final StagedOrderSetShippingAddressAction template) {
        StagedOrderSetShippingAddressActionImpl instance = new StagedOrderSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static StagedOrderSetShippingAddressActionBuilder builder() {
        return StagedOrderSetShippingAddressActionBuilder.of();
    }

    public static StagedOrderSetShippingAddressActionBuilder builder(
            final StagedOrderSetShippingAddressAction template) {
        return StagedOrderSetShippingAddressActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingAddressAction(Function<StagedOrderSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
