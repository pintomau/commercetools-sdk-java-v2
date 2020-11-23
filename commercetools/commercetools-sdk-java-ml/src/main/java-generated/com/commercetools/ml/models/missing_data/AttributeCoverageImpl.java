package com.commercetools.ml.models.missing_data;


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
public final class AttributeCoverageImpl implements AttributeCoverage {

    private Double names;
    
    private Double values;

    @JsonCreator
    AttributeCoverageImpl(@JsonProperty("names") final Double names, @JsonProperty("values") final Double values) {
        this.names = names;
        this.values = values;
    }
    public AttributeCoverageImpl() {
       
    }

    /**
    *  <p>The percentage of attributes from the product type defined in the product variant. A value of <code>1.0</code> indicates a product variant contains all attributes defined in the product type.</p>
    */
    public Double getNames(){
        return this.names;
    }
    
    /**
    *  <p>Represents the percentage of attributes in the product variant that contain values.</p>
    */
    public Double getValues(){
        return this.values;
    }

    public void setNames(final Double names){
        this.names = names;
    }
    
    public void setValues(final Double values){
        this.values = values;
    }

}