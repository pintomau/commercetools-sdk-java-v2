
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetDescriptionActionImpl implements DiscountCodeSetDescriptionAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString description;

    @JsonCreator
    DiscountCodeSetDescriptionActionImpl(
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        this.action = "setDescription";
    }

    public DiscountCodeSetDescriptionActionImpl() {
        this.action = "setDescription";
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If the <code>description</code> parameter is not included, the field will be emptied.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetDescriptionActionImpl that = (DiscountCodeSetDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(description, that.description).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(description).toHashCode();
    }

}