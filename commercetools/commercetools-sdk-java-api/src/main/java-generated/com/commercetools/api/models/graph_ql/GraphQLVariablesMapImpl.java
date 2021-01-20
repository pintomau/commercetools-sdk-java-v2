
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GraphQLVariablesMapImpl implements GraphQLVariablesMap {

    private Map<String, com.fasterxml.jackson.databind.JsonNode> values;

    @JsonCreator
    GraphQLVariablesMapImpl(@JsonProperty("values") final Map<String, com.fasterxml.jackson.databind.JsonNode> values) {
        this.values = values;
    }

    public GraphQLVariablesMapImpl() {
    }

    public Map<String, com.fasterxml.jackson.databind.JsonNode> values() {
        return values;
    }

    public void setValue(String key, com.fasterxml.jackson.databind.JsonNode value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLVariablesMapImpl that = (GraphQLVariablesMapImpl) o;

        return new EqualsBuilder().append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

}
