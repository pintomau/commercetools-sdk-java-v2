
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.OrderAddPaymentAction;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderAddPaymentActionBuilder {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public OrderAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public OrderAddPaymentAction build() {
        return new OrderAddPaymentActionImpl(payment);
    }

    public static OrderAddPaymentActionBuilder of() {
        return new OrderAddPaymentActionBuilder();
    }

    public static OrderAddPaymentActionBuilder of(final OrderAddPaymentAction template) {
        OrderAddPaymentActionBuilder builder = new OrderAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
