package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifierImpl;

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
@JsonDeserialize(as = CustomerResourceIdentifierImpl.class)
public interface CustomerResourceIdentifier extends ResourceIdentifier {



    public static CustomerResourceIdentifierImpl of(){
        return new CustomerResourceIdentifierImpl();
    }
    

    public static CustomerResourceIdentifierImpl of(final CustomerResourceIdentifier template) {
        CustomerResourceIdentifierImpl instance = new CustomerResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withCustomerResourceIdentifier(Function<CustomerResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}