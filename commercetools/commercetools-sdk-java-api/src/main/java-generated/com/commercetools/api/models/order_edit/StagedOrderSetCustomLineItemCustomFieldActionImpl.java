
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetCustomLineItemCustomFieldActionImpl
        implements StagedOrderSetCustomLineItemCustomFieldAction {

    private String action;

    private String customLineItemId;

    private String name;

    private com.fasterxml.jackson.databind.JsonNode value;

    @JsonCreator
    StagedOrderSetCustomLineItemCustomFieldActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("name") final String name,
            @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
        this.customLineItemId = customLineItemId;
        this.name = name;
        this.value = value;
        this.action = "setCustomLineItemCustomField";
    }

    public StagedOrderSetCustomLineItemCustomFieldActionImpl() {
        this.action = "setCustomLineItemCustomField";
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public String getName() {
        return this.name;
    }

    public com.fasterxml.jackson.databind.JsonNode getValue() {
        return this.value;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetCustomLineItemCustomFieldActionImpl that = (StagedOrderSetCustomLineItemCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customLineItemId, that.customLineItemId).append(
            name, that.name).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(name).append(
            value).toHashCode();
    }

}