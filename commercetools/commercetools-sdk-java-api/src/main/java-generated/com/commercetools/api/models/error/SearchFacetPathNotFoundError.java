
package com.commercetools.api.models.error;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SearchFacetPathNotFoundErrorImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchFacetPathNotFoundErrorImpl.class)
public interface SearchFacetPathNotFoundError extends ErrorObject {

    public static SearchFacetPathNotFoundError of() {
        return new SearchFacetPathNotFoundErrorImpl();
    }

    public static SearchFacetPathNotFoundError of(final SearchFacetPathNotFoundError template) {
        SearchFacetPathNotFoundErrorImpl instance = new SearchFacetPathNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static SearchFacetPathNotFoundErrorBuilder builder() {
        return SearchFacetPathNotFoundErrorBuilder.of();
    }

    public static SearchFacetPathNotFoundErrorBuilder builder(final SearchFacetPathNotFoundError template) {
        return SearchFacetPathNotFoundErrorBuilder.of(template);
    }

    default <T> T withSearchFacetPathNotFoundError(Function<SearchFacetPathNotFoundError, T> helper) {
        return helper.apply(this);
    }
}