
package com.commercetools.api.models.project;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.project.CartClassificationType;
import com.commercetools.api.models.project.CartScoreType;
import com.commercetools.api.models.project.CartValueType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartClassificationTypeImpl.class, name = "CartClassification"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartScoreTypeImpl.class, name = "CartScore"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.project.CartValueTypeImpl.class, name = "CartValue") })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRateInputTypeImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRateInputType {

    @NotNull
    @JsonProperty("type")
    public ShippingRateTierType getType();

    default <T> T withShippingRateInputType(Function<ShippingRateInputType, T> helper) {
        return helper.apply(this);
    }
}
