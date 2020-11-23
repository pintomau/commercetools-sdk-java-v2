package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ResourceNotFoundErrorImpl;

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
@JsonDeserialize(as = ResourceNotFoundErrorImpl.class)
public interface ResourceNotFoundError extends ErrorObject {



    public static ResourceNotFoundErrorImpl of(){
        return new ResourceNotFoundErrorImpl();
    }
    

    public static ResourceNotFoundErrorImpl of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorImpl instance = new ResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T> T withResourceNotFoundError(Function<ResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }
}