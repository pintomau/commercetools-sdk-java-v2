
package com.commercetools.importapi.models.errors;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DuplicateVariantValuesErrorBuilder implements Builder<DuplicateVariantValuesError> {

    private String message;

    private com.commercetools.importapi.models.errors.VariantValues variantValues;

    public DuplicateVariantValuesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateVariantValuesErrorBuilder variantValues(
            Function<com.commercetools.importapi.models.errors.VariantValuesBuilder, com.commercetools.importapi.models.errors.VariantValuesBuilder> builder) {
        this.variantValues = builder.apply(com.commercetools.importapi.models.errors.VariantValuesBuilder.of()).build();
        return this;
    }

    public DuplicateVariantValuesErrorBuilder variantValues(
            final com.commercetools.importapi.models.errors.VariantValues variantValues) {
        this.variantValues = variantValues;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.importapi.models.errors.VariantValues getVariantValues() {
        return this.variantValues;
    }

    public DuplicateVariantValuesError build() {
        Objects.requireNonNull(message, DuplicateVariantValuesError.class + ": message is missing");
        Objects.requireNonNull(variantValues, DuplicateVariantValuesError.class + ": variantValues is missing");
        return new DuplicateVariantValuesErrorImpl(message, variantValues);
    }

    /**
     * builds DuplicateVariantValuesError without checking for non null required values
     */
    public DuplicateVariantValuesError buildUnchecked() {
        return new DuplicateVariantValuesErrorImpl(message, variantValues);
    }

    public static DuplicateVariantValuesErrorBuilder of() {
        return new DuplicateVariantValuesErrorBuilder();
    }

    public static DuplicateVariantValuesErrorBuilder of(final DuplicateVariantValuesError template) {
        DuplicateVariantValuesErrorBuilder builder = new DuplicateVariantValuesErrorBuilder();
        builder.message = template.getMessage();
        builder.variantValues = template.getVariantValues();
        return builder;
    }

}
