package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetFirstNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetFirstNameActionImpl.class)
public interface CustomerSetFirstNameAction extends CustomerUpdateAction {

    
    
    @JsonProperty("firstName")
    public String getFirstName();

    public void setFirstName(final String firstName);

    public static CustomerSetFirstNameActionImpl of(){
        return new CustomerSetFirstNameActionImpl();
    }
    

    public static CustomerSetFirstNameActionImpl of(final CustomerSetFirstNameAction template) {
        CustomerSetFirstNameActionImpl instance = new CustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    default <T> T withCustomerSetFirstNameAction(Function<CustomerSetFirstNameAction, T> helper) {
        return helper.apply(this);
    }
}