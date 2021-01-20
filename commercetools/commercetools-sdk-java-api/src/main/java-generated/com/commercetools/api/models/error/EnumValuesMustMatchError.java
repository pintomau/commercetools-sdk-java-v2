
package com.commercetools.api.models.error;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.error.EnumValuesMustMatchErrorImpl;
import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = EnumValuesMustMatchErrorImpl.class)
public interface EnumValuesMustMatchError extends ErrorObject {

    public static EnumValuesMustMatchError of() {
        return new EnumValuesMustMatchErrorImpl();
    }

    public static EnumValuesMustMatchError of(final EnumValuesMustMatchError template) {
        EnumValuesMustMatchErrorImpl instance = new EnumValuesMustMatchErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static EnumValuesMustMatchErrorBuilder builder() {
        return EnumValuesMustMatchErrorBuilder.of();
    }

    public static EnumValuesMustMatchErrorBuilder builder(final EnumValuesMustMatchError template) {
        return EnumValuesMustMatchErrorBuilder.of(template);
    }

    default <T> T withEnumValuesMustMatchError(Function<EnumValuesMustMatchError, T> helper) {
        return helper.apply(this);
    }
}