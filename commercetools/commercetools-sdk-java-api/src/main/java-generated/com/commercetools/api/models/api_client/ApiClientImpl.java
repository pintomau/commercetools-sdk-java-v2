
package com.commercetools.api.models.api_client;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ApiClientImpl implements ApiClient {

    private String id;

    private String name;

    private String scope;

    private String secret;

    private java.time.LocalDate lastUsedAt;

    private java.time.ZonedDateTime deleteAt;

    private java.time.ZonedDateTime createdAt;

    @JsonCreator
    ApiClientImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name,
            @JsonProperty("scope") final String scope, @JsonProperty("secret") final String secret,
            @JsonProperty("lastUsedAt") final java.time.LocalDate lastUsedAt,
            @JsonProperty("deleteAt") final java.time.ZonedDateTime deleteAt,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.secret = secret;
        this.lastUsedAt = lastUsedAt;
        this.deleteAt = deleteAt;
        this.createdAt = createdAt;
    }

    public ApiClientImpl() {
    }

    /**
    *  <p>Unique ID of the API client.
    *  This is the OAuth2 <code>client_id</code> that can be used to <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtain an access token</a>.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Name of the API Client.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>Whitespace-separated list of <a href="/../api/scopes">OAuth scopes</a> that can be used when <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtaining an access token</a>.</p>
    */
    public String getScope() {
        return this.scope;
    }

    /**
    *  <p>Only shown once in the response of creating the API Client.
    *  This is the OAuth2 <code>client_secret</code> that can be used to <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtain an access token</a>.</p>
    */
    public String getSecret() {
        return this.secret;
    }

    /**
    *  <p>Date of the last day this API Client was used to <a href="/../api/authorization#requesting-an-access-token-using-commercetools-oauth-20-server">obtain an access token</a>.</p>
    */
    public java.time.LocalDate getLastUsedAt() {
        return this.lastUsedAt;
    }

    /**
    *  <p>If set, the client will be deleted on (or shortly after) this point in time.</p>
    */
    public java.time.ZonedDateTime getDeleteAt() {
        return this.deleteAt;
    }

    /**
    *  <p>Date and time (UTC) the API Client was initially created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public void setSecret(final String secret) {
        this.secret = secret;
    }

    public void setLastUsedAt(final java.time.LocalDate lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public void setDeleteAt(final java.time.ZonedDateTime deleteAt) {
        this.deleteAt = deleteAt;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApiClientImpl that = (ApiClientImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(scope, that.scope)
                .append(secret, that.secret)
                .append(lastUsedAt, that.lastUsedAt)
                .append(deleteAt, that.deleteAt)
                .append(createdAt, that.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(scope)
                .append(secret)
                .append(lastUsedAt)
                .append(deleteAt)
                .append(createdAt)
                .toHashCode();
    }

}
