package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetBillingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetBillingAddressActionImpl.class)
public interface OrderSetBillingAddressAction extends OrderUpdateAction {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static OrderSetBillingAddressActionImpl of(){
        return new OrderSetBillingAddressActionImpl();
    }
    

    public static OrderSetBillingAddressActionImpl of(final OrderSetBillingAddressAction template) {
        OrderSetBillingAddressActionImpl instance = new OrderSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T> T withOrderSetBillingAddressAction(Function<OrderSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}