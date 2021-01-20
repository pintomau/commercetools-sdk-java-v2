
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodSetLocalizedDescriptionActionImpl
        implements ShippingMethodSetLocalizedDescriptionAction {

    private String action;

    private String localizedDescription;

    @JsonCreator
    ShippingMethodSetLocalizedDescriptionActionImpl(
            @JsonProperty("localizedDescription") final String localizedDescription) {
        this.localizedDescription = localizedDescription;
        this.action = "setLocalizedDescription";
    }

    public ShippingMethodSetLocalizedDescriptionActionImpl() {
        this.action = "setLocalizedDescription";
    }

    public String getAction() {
        return this.action;
    }

    public String getLocalizedDescription() {
        return this.localizedDescription;
    }

    public void setLocalizedDescription(final String localizedDescription) {
        this.localizedDescription = localizedDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodSetLocalizedDescriptionActionImpl that = (ShippingMethodSetLocalizedDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(localizedDescription,
            that.localizedDescription).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(localizedDescription).toHashCode();
    }

}