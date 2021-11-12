
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerFirstNameSetMessageBuilder implements Builder<CustomerFirstNameSetMessage> {

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

    @Nullable
    private String firstName;

    public CustomerFirstNameSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public CustomerFirstNameSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public CustomerFirstNameSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public CustomerFirstNameSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public CustomerFirstNameSetMessageBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
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

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    public CustomerFirstNameSetMessage build() {
        Objects.requireNonNull(id, CustomerFirstNameSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, CustomerFirstNameSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomerFirstNameSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CustomerFirstNameSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, CustomerFirstNameSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, CustomerFirstNameSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, CustomerFirstNameSetMessage.class + ": resourceVersion is missing");
        return new CustomerFirstNameSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, firstName);
    }

    /**
     * builds CustomerFirstNameSetMessage without checking for non null required values
     */
    public CustomerFirstNameSetMessage buildUnchecked() {
        return new CustomerFirstNameSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, firstName);
    }

    public static CustomerFirstNameSetMessageBuilder of() {
        return new CustomerFirstNameSetMessageBuilder();
    }

    public static CustomerFirstNameSetMessageBuilder of(final CustomerFirstNameSetMessage template) {
        CustomerFirstNameSetMessageBuilder builder = new CustomerFirstNameSetMessageBuilder();
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
        builder.firstName = template.getFirstName();
        return builder;
    }

}
