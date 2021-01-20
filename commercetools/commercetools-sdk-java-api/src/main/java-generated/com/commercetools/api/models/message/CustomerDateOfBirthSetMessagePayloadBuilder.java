
package com.commercetools.api.models.message;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.api.models.message.MessagePayload;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerDateOfBirthSetMessagePayloadBuilder {

    private java.time.LocalDate dateOfBirth;

    public CustomerDateOfBirthSetMessagePayloadBuilder dateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public CustomerDateOfBirthSetMessagePayload build() {
        return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder of() {
        return new CustomerDateOfBirthSetMessagePayloadBuilder();
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder of(final CustomerDateOfBirthSetMessagePayload template) {
        CustomerDateOfBirthSetMessagePayloadBuilder builder = new CustomerDateOfBirthSetMessagePayloadBuilder();
        builder.dateOfBirth = template.getDateOfBirth();
        return builder;
    }

}
