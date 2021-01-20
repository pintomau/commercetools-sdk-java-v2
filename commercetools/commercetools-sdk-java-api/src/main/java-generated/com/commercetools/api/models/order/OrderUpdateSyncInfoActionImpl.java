
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderUpdateSyncInfoActionImpl implements OrderUpdateSyncInfoAction {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private String externalId;

    private java.time.ZonedDateTime syncedAt;

    @JsonCreator
    OrderUpdateSyncInfoActionImpl(
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("externalId") final String externalId,
            @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
        this.channel = channel;
        this.externalId = externalId;
        this.syncedAt = syncedAt;
        this.action = "updateSyncInfo";
    }

    public OrderUpdateSyncInfoActionImpl() {
        this.action = "updateSyncInfo";
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setSyncedAt(final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderUpdateSyncInfoActionImpl that = (OrderUpdateSyncInfoActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(channel, that.channel).append(externalId,
            that.externalId).append(syncedAt, that.syncedAt).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(channel).append(externalId).append(
            syncedAt).toHashCode();
    }

}