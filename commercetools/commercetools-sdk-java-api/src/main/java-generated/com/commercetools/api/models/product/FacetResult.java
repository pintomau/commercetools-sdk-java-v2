
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.FacetTypes;
import com.commercetools.api.models.product.FilteredFacetResult;
import com.commercetools.api.models.product.RangeFacetResult;
import com.commercetools.api.models.product.TermFacetResult;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.FilteredFacetResultImpl.class, name = "filter"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.RangeFacetResultImpl.class, name = "range"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.TermFacetResultImpl.class, name = "terms") })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = FacetResultImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface FacetResult {

    @NotNull
    @JsonProperty("type")
    public FacetTypes getType();

    default <T> T withFacetResult(Function<FacetResult, T> helper) {
        return helper.apply(this);
    }
}
