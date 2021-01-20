
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.zone.Location;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneRemoveLocationActionImpl implements ZoneRemoveLocationAction {

    private String action;

    private com.commercetools.api.models.zone.Location location;

    @JsonCreator
    ZoneRemoveLocationActionImpl(@JsonProperty("location") final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        this.action = "removeLocation";
    }

    public ZoneRemoveLocationActionImpl() {
        this.action = "removeLocation";
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.zone.Location getLocation() {
        return this.location;
    }

    public void setLocation(final com.commercetools.api.models.zone.Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ZoneRemoveLocationActionImpl that = (ZoneRemoveLocationActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(location, that.location).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(location).toHashCode();
    }

}