package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.FeatureRemovedErrorImpl;

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
@JsonDeserialize(as = FeatureRemovedErrorImpl.class)
public interface FeatureRemovedError extends ErrorObject {



    public static FeatureRemovedErrorImpl of(){
        return new FeatureRemovedErrorImpl();
    }
    

    public static FeatureRemovedErrorImpl of(final FeatureRemovedError template) {
        FeatureRemovedErrorImpl instance = new FeatureRemovedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T> T withFeatureRemovedError(Function<FeatureRemovedError, T> helper) {
        return helper.apply(this);
    }
}