
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.category.CategoryUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryChangeParentActionImpl implements CategoryChangeParentAction {

    private String action;

    private com.commercetools.api.models.category.CategoryResourceIdentifier parent;

    @JsonCreator
    CategoryChangeParentActionImpl(
            @JsonProperty("parent") final com.commercetools.api.models.category.CategoryResourceIdentifier parent) {
        this.parent = parent;
        this.action = "changeParent";
    }

    public CategoryChangeParentActionImpl() {
        this.action = "changeParent";
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.category.CategoryResourceIdentifier getParent() {
        return this.parent;
    }

    public void setParent(final com.commercetools.api.models.category.CategoryResourceIdentifier parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryChangeParentActionImpl that = (CategoryChangeParentActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(parent, that.parent).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parent).toHashCode();
    }

}
