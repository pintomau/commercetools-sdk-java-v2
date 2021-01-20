
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.me.MyCustomerSetCompanyNameAction;
import com.commercetools.api.models.me.MyCustomerUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetCompanyNameActionBuilder {

    @Nullable
    private String companyName;

    public MyCustomerSetCompanyNameActionBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    public MyCustomerSetCompanyNameAction build() {
        return new MyCustomerSetCompanyNameActionImpl(companyName);
    }

    public static MyCustomerSetCompanyNameActionBuilder of() {
        return new MyCustomerSetCompanyNameActionBuilder();
    }

    public static MyCustomerSetCompanyNameActionBuilder of(final MyCustomerSetCompanyNameAction template) {
        MyCustomerSetCompanyNameActionBuilder builder = new MyCustomerSetCompanyNameActionBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}