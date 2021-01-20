
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.error.DuplicatePriceScopeError;
import com.commercetools.api.models.error.ErrorObject;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicatePriceScopeErrorBuilder {

    private String message;

    private java.util.List<com.commercetools.api.models.common.Price> conflictingPrices;

    public DuplicatePriceScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicatePriceScopeErrorBuilder conflictingPrices(
            final com.commercetools.api.models.common.Price... conflictingPrices) {
        this.conflictingPrices = new ArrayList<>(Arrays.asList(conflictingPrices));
        return this;
    }

    public DuplicatePriceScopeErrorBuilder conflictingPrices(
            final java.util.List<com.commercetools.api.models.common.Price> conflictingPrices) {
        this.conflictingPrices = conflictingPrices;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public java.util.List<com.commercetools.api.models.common.Price> getConflictingPrices() {
        return this.conflictingPrices;
    }

    public DuplicatePriceScopeError build() {
        return new DuplicatePriceScopeErrorImpl(message, conflictingPrices);
    }

    public static DuplicatePriceScopeErrorBuilder of() {
        return new DuplicatePriceScopeErrorBuilder();
    }

    public static DuplicatePriceScopeErrorBuilder of(final DuplicatePriceScopeError template) {
        DuplicatePriceScopeErrorBuilder builder = new DuplicatePriceScopeErrorBuilder();
        builder.message = template.getMessage();
        builder.conflictingPrices = template.getConflictingPrices();
        return builder;
    }

}