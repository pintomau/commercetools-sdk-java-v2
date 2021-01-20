
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_type.AttributeConstraintEnumDraft;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeAttributeConstraintActionImpl
        implements ProductTypeChangeAttributeConstraintAction {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue;

    @JsonCreator
    ProductTypeChangeAttributeConstraintActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("newValue") final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action = "changeAttributeConstraint";
    }

    public ProductTypeChangeAttributeConstraintActionImpl() {
        this.action = "changeAttributeConstraint";
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributeConstraintEnumDraft getNewValue() {
        return this.newValue;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNewValue(final com.commercetools.api.models.product_type.AttributeConstraintEnumDraft newValue) {
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeAttributeConstraintActionImpl that = (ProductTypeChangeAttributeConstraintActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attributeName, that.attributeName).append(
            newValue, that.newValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(newValue).toHashCode();
    }

}