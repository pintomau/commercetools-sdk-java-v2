
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelAddRolesAction;
import com.commercetools.api.models.channel.ChannelChangeDescriptionAction;
import com.commercetools.api.models.channel.ChannelChangeKeyAction;
import com.commercetools.api.models.channel.ChannelChangeNameAction;
import com.commercetools.api.models.channel.ChannelRemoveRolesAction;
import com.commercetools.api.models.channel.ChannelSetAddressAction;
import com.commercetools.api.models.channel.ChannelSetCustomFieldAction;
import com.commercetools.api.models.channel.ChannelSetCustomTypeAction;
import com.commercetools.api.models.channel.ChannelSetGeoLocationAction;
import com.commercetools.api.models.channel.ChannelSetRolesAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelUpdateActionImpl implements ChannelUpdateAction {

    private String action;

    @JsonCreator
    ChannelUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public ChannelUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChannelUpdateActionImpl that = (ChannelUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}