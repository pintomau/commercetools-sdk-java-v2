
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscountUpdate;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> actions;

    public CartDiscountUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CartDiscountUpdateBuilder actions(
            final com.commercetools.api.models.cart_discount.CartDiscountUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public CartDiscountUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> getActions() {
        return this.actions;
    }

    public CartDiscountUpdate build() {
        return new CartDiscountUpdateImpl(version, actions);
    }

    public static CartDiscountUpdateBuilder of() {
        return new CartDiscountUpdateBuilder();
    }

    public static CartDiscountUpdateBuilder of(final CartDiscountUpdate template) {
        CartDiscountUpdateBuilder builder = new CartDiscountUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
