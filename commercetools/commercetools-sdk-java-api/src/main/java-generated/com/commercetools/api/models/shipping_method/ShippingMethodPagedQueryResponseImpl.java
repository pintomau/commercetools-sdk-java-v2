
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingMethod;
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
public final class ShippingMethodPagedQueryResponseImpl implements ShippingMethodPagedQueryResponse {

    private Long limit;

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> results;

    @JsonCreator
    ShippingMethodPagedQueryResponseImpl(@JsonProperty("limit") final Long limit,
            @JsonProperty("count") final Long count, @JsonProperty("total") final Long total,
            @JsonProperty("offset") final Long offset,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> results) {
        this.limit = limit;
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
    }

    public ShippingMethodPagedQueryResponseImpl() {
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> getResults() {
        return this.results;
    }

    public void setLimit(final Long limit) {
        this.limit = limit;
    }

    public void setCount(final Long count) {
        this.count = count;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setOffset(final Long offset) {
        this.offset = offset;
    }

    public void setResults(final com.commercetools.api.models.shipping_method.ShippingMethod... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodPagedQueryResponseImpl that = (ShippingMethodPagedQueryResponseImpl) o;

        return new EqualsBuilder().append(limit, that.limit).append(count, that.count).append(total, that.total).append(
            offset, that.offset).append(results, that.results).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit).append(count).append(total).append(offset).append(
            results).toHashCode();
    }

}
