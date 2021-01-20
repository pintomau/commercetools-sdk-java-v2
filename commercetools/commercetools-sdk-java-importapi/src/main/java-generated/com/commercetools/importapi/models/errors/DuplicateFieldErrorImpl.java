
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>A value for a field conflicts with an existing duplicate value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateFieldErrorImpl implements DuplicateFieldError {

    private String code;

    private String message;

    private String field;

    private com.fasterxml.jackson.databind.JsonNode duplicateValue;

    @JsonCreator
    DuplicateFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field,
            @JsonProperty("duplicateValue") final com.fasterxml.jackson.databind.JsonNode duplicateValue) {
        this.message = message;
        this.field = field;
        this.duplicateValue = duplicateValue;
        this.code = "DuplicateField";
    }

    public DuplicateFieldErrorImpl() {
        this.code = "DuplicateField";
    }

    public String getCode() {
        return this.code;
    }

    /**
    *  <p>The error's description.</p>
    */
    public String getMessage() {
        return this.message;
    }

    /**
    *  <p>The name of the field.</p>
    */
    public String getField() {
        return this.field;
    }

    /**
    *  <p>The offending duplicate value.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getDuplicateValue() {
        return this.duplicateValue;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setDuplicateValue(final com.fasterxml.jackson.databind.JsonNode duplicateValue) {
        this.duplicateValue = duplicateValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateFieldErrorImpl that = (DuplicateFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(field,
            that.field).append(duplicateValue, that.duplicateValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(field).append(
            duplicateValue).toHashCode();
    }

}