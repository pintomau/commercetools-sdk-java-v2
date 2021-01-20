
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductRemovedFromCategoryMessagePayloadImpl implements ProductRemovedFromCategoryMessagePayload {

    private String type;

    private com.commercetools.api.models.category.CategoryReference category;

    private Boolean staged;

    @JsonCreator
    ProductRemovedFromCategoryMessagePayloadImpl(
            @JsonProperty("category") final com.commercetools.api.models.category.CategoryReference category,
            @JsonProperty("staged") final Boolean staged) {
        this.category = category;
        this.staged = staged;
        this.type = "ProductRemovedFromCategory";
    }

    public ProductRemovedFromCategoryMessagePayloadImpl() {
        this.type = "ProductRemovedFromCategory";
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.category.CategoryReference getCategory() {
        return this.category;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setCategory(final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductRemovedFromCategoryMessagePayloadImpl that = (ProductRemovedFromCategoryMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(category, that.category).append(staged,
            that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(category).append(staged).toHashCode();
    }

}
