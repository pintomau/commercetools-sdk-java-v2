
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetMethodInfoNameActionImpl implements PaymentSetMethodInfoNameAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    PaymentSetMethodInfoNameActionImpl(
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        this.action = "setMethodInfoName";
    }

    public PaymentSetMethodInfoNameActionImpl() {
        this.action = "setMethodInfoName";
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If not provided, the name is unset.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetMethodInfoNameActionImpl that = (PaymentSetMethodInfoNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

}
