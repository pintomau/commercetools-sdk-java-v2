
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeTaxRoundingModeActionImpl implements StagedOrderChangeTaxRoundingModeAction {

    private String action;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @JsonCreator
    StagedOrderChangeTaxRoundingModeActionImpl(
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        this.action = "changeTaxRoundingMode";
    }

    public StagedOrderChangeTaxRoundingModeActionImpl() {
        this.action = "changeTaxRoundingMode";
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderChangeTaxRoundingModeActionImpl that = (StagedOrderChangeTaxRoundingModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(taxRoundingMode, that.taxRoundingMode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(taxRoundingMode).toHashCode();
    }

}
