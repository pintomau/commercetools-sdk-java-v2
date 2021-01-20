
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.Transaction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentTransactionAddedMessagePayloadImpl implements PaymentTransactionAddedMessagePayload {

    private String type;

    private com.commercetools.api.models.payment.Transaction transaction;

    @JsonCreator
    PaymentTransactionAddedMessagePayloadImpl(
            @JsonProperty("transaction") final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
        this.type = "PaymentTransactionAdded";
    }

    public PaymentTransactionAddedMessagePayloadImpl() {
        this.type = "PaymentTransactionAdded";
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.payment.Transaction getTransaction() {
        return this.transaction;
    }

    public void setTransaction(final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentTransactionAddedMessagePayloadImpl that = (PaymentTransactionAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(transaction, that.transaction).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(transaction).toHashCode();
    }

}