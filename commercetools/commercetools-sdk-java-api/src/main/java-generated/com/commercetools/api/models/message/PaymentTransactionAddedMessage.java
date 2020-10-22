package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.payment.Transaction;
import com.commercetools.api.models.message.PaymentTransactionAddedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentTransactionAddedMessageImpl.class)
public interface PaymentTransactionAddedMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("transaction")
    public Transaction getTransaction();

    public void setTransaction(final Transaction transaction);

    public static PaymentTransactionAddedMessageImpl of(){
        return new PaymentTransactionAddedMessageImpl();
    }
    

    public static PaymentTransactionAddedMessageImpl of(final PaymentTransactionAddedMessage template) {
        PaymentTransactionAddedMessageImpl instance = new PaymentTransactionAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setTransaction(template.getTransaction());
        return instance;
    }

    default <T extends Accessor<PaymentTransactionAddedMessage>> T withPaymentTransactionAddedMessage(Function<PaymentTransactionAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
