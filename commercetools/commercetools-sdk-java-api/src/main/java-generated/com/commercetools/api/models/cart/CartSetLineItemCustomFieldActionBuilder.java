
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartSetLineItemCustomFieldAction;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLineItemCustomFieldActionBuilder {

    private String lineItemId;

    private String name;

    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public CartSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public CartSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetLineItemCustomFieldActionBuilder value(
            @Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue() {
        return this.value;
    }

    public CartSetLineItemCustomFieldAction build() {
        return new CartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static CartSetLineItemCustomFieldActionBuilder of() {
        return new CartSetLineItemCustomFieldActionBuilder();
    }

    public static CartSetLineItemCustomFieldActionBuilder of(final CartSetLineItemCustomFieldAction template) {
        CartSetLineItemCustomFieldActionBuilder builder = new CartSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}