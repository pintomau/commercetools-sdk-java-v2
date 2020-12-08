package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCustomerIdActionImpl implements CartSetCustomerIdAction {

    private String action;
    
    private String customerId;

    @JsonCreator
    CartSetCustomerIdActionImpl(@JsonProperty("customerId") final String customerId) {
        this.customerId = customerId;
        this.action = "setCustomerId";
    }
    public CartSetCustomerIdActionImpl() {
        this.action = "setCustomerId";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If set, a customer with the given ID must exist in the project.</p>
    */
    public String getCustomerId(){
        return this.customerId;
    }

    public void setCustomerId(final String customerId){
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartSetCustomerIdActionImpl that = (CartSetCustomerIdActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(customerId, that.customerId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(customerId)
            .toHashCode();
    }

}
