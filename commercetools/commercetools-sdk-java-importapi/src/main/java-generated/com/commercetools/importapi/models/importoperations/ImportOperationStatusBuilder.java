
package com.commercetools.importapi.models.importoperations;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.importoperations.ImportOperationState;
import com.commercetools.importapi.models.importoperations.ImportOperationStatus;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportOperationStatusBuilder {

    @Nullable
    private String operationId;

    private com.commercetools.importapi.models.importoperations.ImportOperationState state;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    public ImportOperationStatusBuilder operationId(@Nullable final String operationId) {
        this.operationId = operationId;
        return this;
    }

    public ImportOperationStatusBuilder state(
            final com.commercetools.importapi.models.importoperations.ImportOperationState state) {
        this.state = state;
        return this;
    }

    public ImportOperationStatusBuilder errors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    public ImportOperationStatusBuilder errors(
            @Nullable final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    @Nullable
    public String getOperationId() {
        return this.operationId;
    }

    public com.commercetools.importapi.models.importoperations.ImportOperationState getState() {
        return this.state;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    public ImportOperationStatus build() {
        return new ImportOperationStatusImpl(operationId, state, errors);
    }

    public static ImportOperationStatusBuilder of() {
        return new ImportOperationStatusBuilder();
    }

    public static ImportOperationStatusBuilder of(final ImportOperationStatus template) {
        ImportOperationStatusBuilder builder = new ImportOperationStatusBuilder();
        builder.operationId = template.getOperationId();
        builder.state = template.getState();
        builder.errors = template.getErrors();
        return builder;
    }

}
