
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionImpl;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartRemoveItemShippingAddressActionImpl.class)
public interface MyCartRemoveItemShippingAddressAction extends MyCartUpdateAction {

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressKey(final String addressKey);

    public static MyCartRemoveItemShippingAddressAction of() {
        return new MyCartRemoveItemShippingAddressActionImpl();
    }

    public static MyCartRemoveItemShippingAddressAction of(final MyCartRemoveItemShippingAddressAction template) {
        MyCartRemoveItemShippingAddressActionImpl instance = new MyCartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCartRemoveItemShippingAddressActionBuilder builder() {
        return MyCartRemoveItemShippingAddressActionBuilder.of();
    }

    public static MyCartRemoveItemShippingAddressActionBuilder builder(
            final MyCartRemoveItemShippingAddressAction template) {
        return MyCartRemoveItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartRemoveItemShippingAddressAction(Function<MyCartRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
