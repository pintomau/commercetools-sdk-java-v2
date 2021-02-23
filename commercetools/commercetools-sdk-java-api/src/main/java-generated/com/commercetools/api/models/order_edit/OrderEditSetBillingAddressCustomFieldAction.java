
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditSetBillingAddressCustomFieldActionImpl.class)
public interface OrderEditSetBillingAddressCustomFieldAction extends OrderEditUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderEditSetBillingAddressCustomFieldAction of() {
        return new OrderEditSetBillingAddressCustomFieldActionImpl();
    }

    public static OrderEditSetBillingAddressCustomFieldAction of(
            final OrderEditSetBillingAddressCustomFieldAction template) {
        OrderEditSetBillingAddressCustomFieldActionImpl instance = new OrderEditSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderEditSetBillingAddressCustomFieldActionBuilder builder() {
        return OrderEditSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static OrderEditSetBillingAddressCustomFieldActionBuilder builder(
            final OrderEditSetBillingAddressCustomFieldAction template) {
        return OrderEditSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderEditSetBillingAddressCustomFieldAction(
            Function<OrderEditSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}