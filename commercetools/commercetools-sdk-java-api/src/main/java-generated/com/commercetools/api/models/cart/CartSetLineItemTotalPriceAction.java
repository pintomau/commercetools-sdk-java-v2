
package com.commercetools.api.models.cart;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartSetLineItemTotalPriceActionImpl;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemTotalPriceActionImpl.class)
public interface CartSetLineItemTotalPriceAction extends CartUpdateAction {

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    public void setLineItemId(final String lineItemId);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public static CartSetLineItemTotalPriceAction of() {
        return new CartSetLineItemTotalPriceActionImpl();
    }

    public static CartSetLineItemTotalPriceAction of(final CartSetLineItemTotalPriceAction template) {
        CartSetLineItemTotalPriceActionImpl instance = new CartSetLineItemTotalPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        return instance;
    }

    public static CartSetLineItemTotalPriceActionBuilder builder() {
        return CartSetLineItemTotalPriceActionBuilder.of();
    }

    public static CartSetLineItemTotalPriceActionBuilder builder(final CartSetLineItemTotalPriceAction template) {
        return CartSetLineItemTotalPriceActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemTotalPriceAction(Function<CartSetLineItemTotalPriceAction, T> helper) {
        return helper.apply(this);
    }
}
