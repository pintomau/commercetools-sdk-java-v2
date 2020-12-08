package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.message.MessagePayload;
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
public final class CustomerCreatedMessagePayloadImpl implements CustomerCreatedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.customer.Customer customer;

    @JsonCreator
    CustomerCreatedMessagePayloadImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        this.type = "CustomerCreated";
    }
    public CustomerCreatedMessagePayloadImpl() {
        this.type = "CustomerCreated";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.customer.Customer getCustomer(){
        return this.customer;
    }

    public void setCustomer(final com.commercetools.api.models.customer.Customer customer){
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerCreatedMessagePayloadImpl that = (CustomerCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(customer, that.customer)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(customer)
            .toHashCode();
    }

}
