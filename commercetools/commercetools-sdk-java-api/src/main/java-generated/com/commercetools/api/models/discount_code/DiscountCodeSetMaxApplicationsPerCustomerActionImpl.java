
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
public final class DiscountCodeSetMaxApplicationsPerCustomerActionImpl
        implements DiscountCodeSetMaxApplicationsPerCustomerAction {

    private String action;

    private Long maxApplicationsPerCustomer;

    @JsonCreator
    DiscountCodeSetMaxApplicationsPerCustomerActionImpl(
            @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        this.action = "setMaxApplicationsPerCustomer";
    }

    public DiscountCodeSetMaxApplicationsPerCustomerActionImpl() {
        this.action = "setMaxApplicationsPerCustomer";
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If the <code>maxApplicationsPerCustomer</code> parameter is not included, the field will be emptied.</p>
    */
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetMaxApplicationsPerCustomerActionImpl that = (DiscountCodeSetMaxApplicationsPerCustomerActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(maxApplicationsPerCustomer,
            that.maxApplicationsPerCustomer).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(maxApplicationsPerCustomer).toHashCode();
    }

}
