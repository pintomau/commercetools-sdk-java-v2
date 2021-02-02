
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.subscription.Destination;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class IronMqDestinationImpl implements IronMqDestination {

    private String type;

    private String uri;

    @JsonCreator
    IronMqDestinationImpl(@JsonProperty("uri") final String uri) {
        this.uri = uri;
        this.type = IRON_MQ;
    }

    public IronMqDestinationImpl() {
        this.type = IRON_MQ;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        IronMqDestinationImpl that = (IronMqDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(uri, that.uri).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(uri).toHashCode();
    }

}
