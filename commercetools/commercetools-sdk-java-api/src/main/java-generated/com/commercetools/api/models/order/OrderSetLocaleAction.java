
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderSetLocaleActionImpl;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetLocaleActionImpl.class)
public interface OrderSetLocaleAction extends OrderUpdateAction {

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static OrderSetLocaleAction of() {
        return new OrderSetLocaleActionImpl();
    }

    public static OrderSetLocaleAction of(final OrderSetLocaleAction template) {
        OrderSetLocaleActionImpl instance = new OrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static OrderSetLocaleActionBuilder builder() {
        return OrderSetLocaleActionBuilder.of();
    }

    public static OrderSetLocaleActionBuilder builder(final OrderSetLocaleAction template) {
        return OrderSetLocaleActionBuilder.of(template);
    }

    default <T> T withOrderSetLocaleAction(Function<OrderSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
