
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartReferenceImpl implements CartReference {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private com.commercetools.api.models.cart.Cart obj;

    @JsonCreator
    CartReferenceImpl(@JsonProperty("id") final String id,
            @JsonProperty("obj") final com.commercetools.api.models.cart.Cart obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("cart");
    }

    public CartReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("cart");
    }

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.cart.Cart getObj() {
        return this.obj;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setObj(final com.commercetools.api.models.cart.Cart obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartReferenceImpl that = (CartReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).append(obj, that.obj).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(obj).toHashCode();
    }

}