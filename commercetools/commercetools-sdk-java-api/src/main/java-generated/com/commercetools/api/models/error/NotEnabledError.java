
package com.commercetools.api.models.error;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.NotEnabledErrorImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = NotEnabledErrorImpl.class)
public interface NotEnabledError extends ErrorObject {

    public static NotEnabledError of() {
        return new NotEnabledErrorImpl();
    }

    public static NotEnabledError of(final NotEnabledError template) {
        NotEnabledErrorImpl instance = new NotEnabledErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static NotEnabledErrorBuilder builder() {
        return NotEnabledErrorBuilder.of();
    }

    public static NotEnabledErrorBuilder builder(final NotEnabledError template) {
        return NotEnabledErrorBuilder.of(template);
    }

    default <T> T withNotEnabledError(Function<NotEnabledError, T> helper) {
        return helper.apply(this);
    }
}
