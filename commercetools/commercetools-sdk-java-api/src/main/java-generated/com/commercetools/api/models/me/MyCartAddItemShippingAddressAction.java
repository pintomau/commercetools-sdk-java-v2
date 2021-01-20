
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCartAddItemShippingAddressActionImpl;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartAddItemShippingAddressActionImpl.class)
public interface MyCartAddItemShippingAddressAction extends MyCartUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static MyCartAddItemShippingAddressAction of() {
        return new MyCartAddItemShippingAddressActionImpl();
    }

    public static MyCartAddItemShippingAddressAction of(final MyCartAddItemShippingAddressAction template) {
        MyCartAddItemShippingAddressActionImpl instance = new MyCartAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCartAddItemShippingAddressActionBuilder builder() {
        return MyCartAddItemShippingAddressActionBuilder.of();
    }

    public static MyCartAddItemShippingAddressActionBuilder builder(final MyCartAddItemShippingAddressAction template) {
        return MyCartAddItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartAddItemShippingAddressAction(Function<MyCartAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
