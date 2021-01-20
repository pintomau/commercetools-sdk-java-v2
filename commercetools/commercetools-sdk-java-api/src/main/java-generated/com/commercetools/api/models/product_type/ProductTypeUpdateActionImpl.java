
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction;
import com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction;
import com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeChangeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction;
import com.commercetools.api.models.product_type.ProductTypeSetInputTipAction;
import com.commercetools.api.models.product_type.ProductTypeSetKeyAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeUpdateActionImpl implements ProductTypeUpdateAction {

    private String action;

    @JsonCreator
    ProductTypeUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public ProductTypeUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeUpdateActionImpl that = (ProductTypeUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}