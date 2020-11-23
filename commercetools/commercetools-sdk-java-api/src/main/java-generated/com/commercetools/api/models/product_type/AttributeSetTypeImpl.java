package com.commercetools.api.models.product_type;

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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeSetTypeImpl implements AttributeSetType {

    private String name;
    
    private com.commercetools.api.models.product_type.AttributeType elementType;

    @JsonCreator
    AttributeSetTypeImpl(@JsonProperty("elementType") final com.commercetools.api.models.product_type.AttributeType elementType) {
        this.elementType = elementType;
        this.name = "set";
    }
    public AttributeSetTypeImpl() {
       
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public com.commercetools.api.models.product_type.AttributeType getElementType(){
        return this.elementType;
    }

    public void setElementType(final com.commercetools.api.models.product_type.AttributeType elementType){
        this.elementType = elementType;
    }

}