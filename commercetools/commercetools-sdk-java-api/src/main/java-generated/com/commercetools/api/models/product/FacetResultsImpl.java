package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FacetResultsImpl implements FacetResults {

    private Map<String, com.fasterxml.jackson.databind.JsonNode> values;

    @JsonCreator
    FacetResultsImpl(@JsonProperty("values") final Map<String, com.fasterxml.jackson.databind.JsonNode> values) {
        this.values = values;
    }
    public FacetResultsImpl() {
       
    }

    
    public Map<String,com.fasterxml.jackson.databind.JsonNode> values() {
        return values;
    }

    public void setValue(String key, com.fasterxml.jackson.databind.JsonNode value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

}