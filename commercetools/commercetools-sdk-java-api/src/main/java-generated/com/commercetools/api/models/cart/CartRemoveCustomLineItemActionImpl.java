
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRemoveCustomLineItemActionImpl implements CartRemoveCustomLineItemAction {

    private String action;

    private String customLineItemId;

    @JsonCreator
    CartRemoveCustomLineItemActionImpl(@JsonProperty("customLineItemId") final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        this.action = "removeCustomLineItem";
    }

    public CartRemoveCustomLineItemActionImpl() {
        this.action = "removeCustomLineItem";
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRemoveCustomLineItemActionImpl that = (CartRemoveCustomLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customLineItemId,
            that.customLineItemId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).toHashCode();
    }

}