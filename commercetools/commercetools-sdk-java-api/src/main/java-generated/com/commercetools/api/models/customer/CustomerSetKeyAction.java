
package com.commercetools.api.models.customer;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerSetKeyActionImpl;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetKeyActionImpl.class)
public interface CustomerSetKeyAction extends CustomerUpdateAction {

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CustomerSetKeyAction of() {
        return new CustomerSetKeyActionImpl();
    }

    public static CustomerSetKeyAction of(final CustomerSetKeyAction template) {
        CustomerSetKeyActionImpl instance = new CustomerSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerSetKeyActionBuilder builder() {
        return CustomerSetKeyActionBuilder.of();
    }

    public static CustomerSetKeyActionBuilder builder(final CustomerSetKeyAction template) {
        return CustomerSetKeyActionBuilder.of(template);
    }

    default <T> T withCustomerSetKeyAction(Function<CustomerSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
