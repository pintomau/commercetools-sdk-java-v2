
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLineItemTotalPriceActionImpl implements CartSetLineItemTotalPriceAction {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    @JsonCreator
    CartSetLineItemTotalPriceActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.lineItemId = lineItemId;
        this.externalTotalPrice = externalTotalPrice;
        this.action = "setLineItemTotalPrice";
    }

    public CartSetLineItemTotalPriceActionImpl() {
        this.action = "setLineItemTotalPrice";
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setExternalTotalPrice(
            final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetLineItemTotalPriceActionImpl that = (CartSetLineItemTotalPriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(lineItemId, that.lineItemId).append(
            externalTotalPrice, that.externalTotalPrice).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(externalTotalPrice).toHashCode();
    }

}