
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.TaskStatusEnum;
import com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesTaskStatusImpl implements MissingPricesTaskStatus {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult result;

    @JsonCreator
    MissingPricesTaskStatusImpl(@JsonProperty("state") final com.commercetools.ml.models.common.TaskStatusEnum state,
            @JsonProperty("expires") final java.time.ZonedDateTime expires,
            @JsonProperty("result") final com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult result) {
        this.state = state;
        this.expires = expires;
        this.result = result;
    }

    public MissingPricesTaskStatusImpl() {
    }

    public com.commercetools.ml.models.common.TaskStatusEnum getState() {
        return this.state;
    }

    /**
    *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
    */
    public java.time.ZonedDateTime getExpires() {
        return this.expires;
    }

    /**
    *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
    */
    public com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult getResult() {
        return this.result;
    }

    public void setState(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
    }

    public void setExpires(final java.time.ZonedDateTime expires) {
        this.expires = expires;
    }

    public void setResult(final com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingPricesTaskStatusImpl that = (MissingPricesTaskStatusImpl) o;

        return new EqualsBuilder().append(state, that.state).append(expires, that.expires).append(result,
            that.result).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(state).append(expires).append(result).toHashCode();
    }

}
