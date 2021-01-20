
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.CategoryReference;
import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.common.ProductTypeReference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceImpl implements Reference {

    private com.commercetools.ml.models.common.ReferenceTypeId typeId;

    private String id;

    @JsonCreator
    ReferenceImpl(@JsonProperty("typeId") final com.commercetools.ml.models.common.ReferenceTypeId typeId,
            @JsonProperty("id") final String id) {
        this.typeId = typeId;
        this.id = id;
    }

    public ReferenceImpl() {
    }

    public com.commercetools.ml.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReferenceImpl that = (ReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).toHashCode();
    }

}