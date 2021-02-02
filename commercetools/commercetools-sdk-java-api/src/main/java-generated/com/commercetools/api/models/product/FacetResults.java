
package com.commercetools.api.models.product;

import java.io.IOException;
import java.lang.Object;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResultsImpl;
import com.commercetools.api.models.product.FilteredFacetResult;
import com.commercetools.api.models.product.RangeFacetResult;
import com.commercetools.api.models.product.TermFacetResult;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FacetResultsImpl.class)
public interface FacetResults {

    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    @JsonAnySetter
    public void setValue(String key, Object value);

    public static FacetResults of() {
        return new FacetResultsImpl();
    }

    public static FacetResults of(final FacetResults template) {
        FacetResultsImpl instance = new FacetResultsImpl();
        return instance;
    }

    public static FacetResultsBuilder builder() {
        return FacetResultsBuilder.of();
    }

    public static FacetResultsBuilder builder(final FacetResults template) {
        return FacetResultsBuilder.of(template);
    }

    default <T> T withFacetResults(Function<FacetResults, T> helper) {
        return helper.apply(this);
    }
}
