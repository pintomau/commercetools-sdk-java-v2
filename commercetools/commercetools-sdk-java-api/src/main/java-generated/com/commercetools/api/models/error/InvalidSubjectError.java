package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidSubjectErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidSubjectErrorImpl.class)
public interface InvalidSubjectError extends ErrorObject {



    public static InvalidSubjectErrorImpl of(){
        return new InvalidSubjectErrorImpl();
    }
    

    public static InvalidSubjectErrorImpl of(final InvalidSubjectError template) {
        InvalidSubjectErrorImpl instance = new InvalidSubjectErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T extends Accessor<InvalidSubjectError>> T withInvalidSubjectError(Function<InvalidSubjectError, T> helper) {
        return helper.apply(this);
    }
}
