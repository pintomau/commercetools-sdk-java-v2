
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LineItemStateTransitionMessageBuilder implements Builder<LineItemStateTransitionMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private String lineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    public LineItemStateTransitionMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public LineItemStateTransitionMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public LineItemStateTransitionMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LineItemStateTransitionMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public LineItemStateTransitionMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public LineItemStateTransitionMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public LineItemStateTransitionMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public LineItemStateTransitionMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public LineItemStateTransitionMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public LineItemStateTransitionMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public LineItemStateTransitionMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public LineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public LineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public LineItemStateTransitionMessageBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public LineItemStateTransitionMessageBuilder transitionDate(final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    public LineItemStateTransitionMessageBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public LineItemStateTransitionMessageBuilder fromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public LineItemStateTransitionMessageBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    public LineItemStateTransitionMessageBuilder toState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public LineItemStateTransitionMessageBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    public LineItemStateTransitionMessage build() {
        Objects.requireNonNull(id, LineItemStateTransitionMessage.class + ": id is missing");
        Objects.requireNonNull(version, LineItemStateTransitionMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, LineItemStateTransitionMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, LineItemStateTransitionMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, LineItemStateTransitionMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, LineItemStateTransitionMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, LineItemStateTransitionMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(lineItemId, LineItemStateTransitionMessage.class + ": lineItemId is missing");
        Objects.requireNonNull(transitionDate, LineItemStateTransitionMessage.class + ": transitionDate is missing");
        Objects.requireNonNull(quantity, LineItemStateTransitionMessage.class + ": quantity is missing");
        Objects.requireNonNull(fromState, LineItemStateTransitionMessage.class + ": fromState is missing");
        Objects.requireNonNull(toState, LineItemStateTransitionMessage.class + ": toState is missing");
        return new LineItemStateTransitionMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, transitionDate,
            quantity, fromState, toState);
    }

    /**
     * builds LineItemStateTransitionMessage without checking for non null required values
     */
    public LineItemStateTransitionMessage buildUnchecked() {
        return new LineItemStateTransitionMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, lineItemId, transitionDate,
            quantity, fromState, toState);
    }

    public static LineItemStateTransitionMessageBuilder of() {
        return new LineItemStateTransitionMessageBuilder();
    }

    public static LineItemStateTransitionMessageBuilder of(final LineItemStateTransitionMessage template) {
        LineItemStateTransitionMessageBuilder builder = new LineItemStateTransitionMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.lineItemId = template.getLineItemId();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
