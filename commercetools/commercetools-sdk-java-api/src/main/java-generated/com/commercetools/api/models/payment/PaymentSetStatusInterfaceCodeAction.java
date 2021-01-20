
package com.commercetools.api.models.payment;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionImpl;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetStatusInterfaceCodeActionImpl.class)
public interface PaymentSetStatusInterfaceCodeAction extends PaymentUpdateAction {

    @JsonProperty("interfaceCode")
    public String getInterfaceCode();

    public void setInterfaceCode(final String interfaceCode);

    public static PaymentSetStatusInterfaceCodeAction of() {
        return new PaymentSetStatusInterfaceCodeActionImpl();
    }

    public static PaymentSetStatusInterfaceCodeAction of(final PaymentSetStatusInterfaceCodeAction template) {
        PaymentSetStatusInterfaceCodeActionImpl instance = new PaymentSetStatusInterfaceCodeActionImpl();
        instance.setInterfaceCode(template.getInterfaceCode());
        return instance;
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder builder() {
        return PaymentSetStatusInterfaceCodeActionBuilder.of();
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder builder(
            final PaymentSetStatusInterfaceCodeAction template) {
        return PaymentSetStatusInterfaceCodeActionBuilder.of(template);
    }

    default <T> T withPaymentSetStatusInterfaceCodeAction(Function<PaymentSetStatusInterfaceCodeAction, T> helper) {
        return helper.apply(this);
    }
}
