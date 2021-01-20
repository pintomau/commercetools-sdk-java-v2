
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionImpl;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerAddBillingAddressIdActionImpl.class)
public interface MyCustomerAddBillingAddressIdAction extends MyCustomerUpdateAction {

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyCustomerAddBillingAddressIdAction of() {
        return new MyCustomerAddBillingAddressIdActionImpl();
    }

    public static MyCustomerAddBillingAddressIdAction of(final MyCustomerAddBillingAddressIdAction template) {
        MyCustomerAddBillingAddressIdActionImpl instance = new MyCustomerAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerAddBillingAddressIdActionBuilder builder() {
        return MyCustomerAddBillingAddressIdActionBuilder.of();
    }

    public static MyCustomerAddBillingAddressIdActionBuilder builder(
            final MyCustomerAddBillingAddressIdAction template) {
        return MyCustomerAddBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withMyCustomerAddBillingAddressIdAction(Function<MyCustomerAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
}
