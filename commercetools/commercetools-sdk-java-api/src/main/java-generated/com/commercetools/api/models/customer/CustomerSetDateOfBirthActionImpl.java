
package com.commercetools.api.models.customer;

import java.time.*;
import java.time.LocalDate;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetDateOfBirthActionImpl implements CustomerSetDateOfBirthAction {

    private String action;

    private java.time.LocalDate dateOfBirth;

    @JsonCreator
    CustomerSetDateOfBirthActionImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.action = "setDateOfBirth";
    }

    public CustomerSetDateOfBirthActionImpl() {
        this.action = "setDateOfBirth";
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If not defined, the date of birth is unset.</p>
    */
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetDateOfBirthActionImpl that = (CustomerSetDateOfBirthActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(dateOfBirth, that.dateOfBirth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(dateOfBirth).toHashCode();
    }

}