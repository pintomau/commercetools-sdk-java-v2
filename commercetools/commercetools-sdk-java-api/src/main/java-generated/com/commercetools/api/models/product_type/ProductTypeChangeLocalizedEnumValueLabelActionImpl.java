package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeLocalizedEnumValueLabelActionImpl implements ProductTypeChangeLocalizedEnumValueLabelAction {

    private String action;
    
    private String attributeName;
    
    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue;

    @JsonCreator
    ProductTypeChangeLocalizedEnumValueLabelActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("newValue") final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action = "changeLocalizedEnumValueLabel";
    }
    public ProductTypeChangeLocalizedEnumValueLabelActionImpl() {
        this.action = "changeLocalizedEnumValueLabel";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    
    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getNewValue(){
        return this.newValue;
    }

    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    public void setNewValue(final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue){
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeChangeLocalizedEnumValueLabelActionImpl that = (ProductTypeChangeLocalizedEnumValueLabelActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newValue, that.newValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(attributeName)
            .append(newValue)
            .toHashCode();
    }

}
