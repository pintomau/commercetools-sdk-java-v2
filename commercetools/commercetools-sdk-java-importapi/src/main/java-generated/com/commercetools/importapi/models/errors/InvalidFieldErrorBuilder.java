
package com.commercetools.importapi.models.errors;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidFieldError;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidFieldErrorBuilder {

    private String message;

    private String field;

    private com.fasterxml.jackson.databind.JsonNode invalidValue;

    @Nullable
    private java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues;

    public InvalidFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public InvalidFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    public InvalidFieldErrorBuilder invalidValue(final com.fasterxml.jackson.databind.JsonNode invalidValue) {
        this.invalidValue = invalidValue;
        return this;
    }

    public InvalidFieldErrorBuilder allowedValues(
            @Nullable final com.fasterxml.jackson.databind.JsonNode... allowedValues) {
        this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
        return this;
    }

    public InvalidFieldErrorBuilder allowedValues(
            @Nullable final java.util.List<com.fasterxml.jackson.databind.JsonNode> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getField() {
        return this.field;
    }

    public com.fasterxml.jackson.databind.JsonNode getInvalidValue() {
        return this.invalidValue;
    }

    @Nullable
    public java.util.List<com.fasterxml.jackson.databind.JsonNode> getAllowedValues() {
        return this.allowedValues;
    }

    public InvalidFieldError build() {
        return new InvalidFieldErrorImpl(message, field, invalidValue, allowedValues);
    }

    public static InvalidFieldErrorBuilder of() {
        return new InvalidFieldErrorBuilder();
    }

    public static InvalidFieldErrorBuilder of(final InvalidFieldError template) {
        InvalidFieldErrorBuilder builder = new InvalidFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        builder.invalidValue = template.getInvalidValue();
        builder.allowedValues = template.getAllowedValues();
        return builder;
    }

}