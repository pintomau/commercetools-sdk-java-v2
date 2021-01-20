
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
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
public final class ProductTypeChangeLabelActionImpl implements ProductTypeChangeLabelAction {

    private String action;

    private String attributeName;

    private com.commercetools.api.models.common.LocalizedString label;

    @JsonCreator
    ProductTypeChangeLabelActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label) {
        this.attributeName = attributeName;
        this.label = label;
        this.action = "changeLabel";
    }

    public ProductTypeChangeLabelActionImpl() {
        this.action = "changeLabel";
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeLabelActionImpl that = (ProductTypeChangeLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attributeName, that.attributeName).append(label,
            that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(label).toHashCode();
    }

}