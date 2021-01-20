
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductCreatedMessagePayloadImpl implements ProductCreatedMessagePayload {

    private String type;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    @JsonCreator
    ProductCreatedMessagePayloadImpl(
            @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        this.type = "ProductCreated";
    }

    public ProductCreatedMessagePayloadImpl() {
        this.type = "ProductCreated";
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductCreatedMessagePayloadImpl that = (ProductCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(productProjection, that.productProjection).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(productProjection).toHashCode();
    }

}