
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
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
public final class ProductDiscountSetKeyActionImpl implements ProductDiscountSetKeyAction {

    private String action;

    private String key;

    @JsonCreator
    ProductDiscountSetKeyActionImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.action = SET_KEY;
    }

    public ProductDiscountSetKeyActionImpl() {
        this.action = SET_KEY;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>The key to set.
    *  If you provide a <code>null</code> value or do not set this field at all, the existing <code>key</code> field is removed.</p>
    */
    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountSetKeyActionImpl that = (ProductDiscountSetKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(key).toHashCode();
    }

}
