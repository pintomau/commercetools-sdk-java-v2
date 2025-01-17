
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerUpdateBuilder implements Builder<CustomerUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> actions;

    public CustomerUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomerUpdateBuilder actions(final com.commercetools.api.models.customer.CustomerUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public CustomerUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.customer.CustomerUpdateAction> getActions() {
        return this.actions;
    }

    public CustomerUpdate build() {
        Objects.requireNonNull(version, CustomerUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CustomerUpdate.class + ": actions is missing");
        return new CustomerUpdateImpl(version, actions);
    }

    /**
     * builds CustomerUpdate without checking for non null required values
     */
    public CustomerUpdate buildUnchecked() {
        return new CustomerUpdateImpl(version, actions);
    }

    public static CustomerUpdateBuilder of() {
        return new CustomerUpdateBuilder();
    }

    public static CustomerUpdateBuilder of(final CustomerUpdate template) {
        CustomerUpdateBuilder builder = new CustomerUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
