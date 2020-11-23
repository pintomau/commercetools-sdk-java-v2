package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerEmailChangedMessagePayloadImpl.class)
public interface CustomerEmailChangedMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static CustomerEmailChangedMessagePayloadImpl of(){
        return new CustomerEmailChangedMessagePayloadImpl();
    }
    

    public static CustomerEmailChangedMessagePayloadImpl of(final CustomerEmailChangedMessagePayload template) {
        CustomerEmailChangedMessagePayloadImpl instance = new CustomerEmailChangedMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    default <T> T withCustomerEmailChangedMessagePayload(Function<CustomerEmailChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}