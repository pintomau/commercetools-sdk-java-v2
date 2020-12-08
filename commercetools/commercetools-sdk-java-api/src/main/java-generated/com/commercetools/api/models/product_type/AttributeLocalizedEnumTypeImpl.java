package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributeType;
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
public final class AttributeLocalizedEnumTypeImpl implements AttributeLocalizedEnumType {

    private String name;
    
    private java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values;

    @JsonCreator
    AttributeLocalizedEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values) {
        this.values = values;
        this.name = "lenum";
    }
    public AttributeLocalizedEnumTypeImpl() {
        this.name = "lenum";
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> getValues(){
        return this.values;
    }

    public void setValues(final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue ...values){
       this.values = new ArrayList<>(Arrays.asList(values));
    }
    
    public void setValues(final java.util.List<com.commercetools.api.models.product_type.AttributeLocalizedEnumValue> values){
       this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributeLocalizedEnumTypeImpl that = (AttributeLocalizedEnumTypeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(values, that.values)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(values)
            .toHashCode();
    }

}
