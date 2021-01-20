
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartAddPaymentAction;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddPaymentActionBuilder {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public CartAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public CartAddPaymentAction build() {
        return new CartAddPaymentActionImpl(payment);
    }

    public static CartAddPaymentActionBuilder of() {
        return new CartAddPaymentActionBuilder();
    }

    public static CartAddPaymentActionBuilder of(final CartAddPaymentAction template) {
        CartAddPaymentActionBuilder builder = new CartAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
