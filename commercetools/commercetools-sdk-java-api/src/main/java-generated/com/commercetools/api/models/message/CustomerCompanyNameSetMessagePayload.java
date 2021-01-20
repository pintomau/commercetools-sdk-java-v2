
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadImpl;
import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerCompanyNameSetMessagePayloadImpl.class)
public interface CustomerCompanyNameSetMessagePayload extends MessagePayload {

    @NotNull
    @JsonProperty("companyName")
    public String getCompanyName();

    public void setCompanyName(final String companyName);

    public static CustomerCompanyNameSetMessagePayload of() {
        return new CustomerCompanyNameSetMessagePayloadImpl();
    }

    public static CustomerCompanyNameSetMessagePayload of(final CustomerCompanyNameSetMessagePayload template) {
        CustomerCompanyNameSetMessagePayloadImpl instance = new CustomerCompanyNameSetMessagePayloadImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder builder() {
        return CustomerCompanyNameSetMessagePayloadBuilder.of();
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder builder(
            final CustomerCompanyNameSetMessagePayload template) {
        return CustomerCompanyNameSetMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerCompanyNameSetMessagePayload(Function<CustomerCompanyNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
