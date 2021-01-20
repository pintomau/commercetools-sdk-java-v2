
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerChangeEmailActionImpl implements MyCustomerChangeEmailAction {

    private String action;

    private String email;

    @JsonCreator
    MyCustomerChangeEmailActionImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.action = "changeEmail";
    }

    public MyCustomerChangeEmailActionImpl() {
        this.action = "changeEmail";
    }

    public String getAction() {
        return this.action;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerChangeEmailActionImpl that = (MyCustomerChangeEmailActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(email, that.email).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(email).toHashCode();
    }

}