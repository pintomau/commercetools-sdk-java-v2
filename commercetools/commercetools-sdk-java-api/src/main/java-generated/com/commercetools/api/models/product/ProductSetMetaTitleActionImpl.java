
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetMetaTitleActionImpl implements ProductSetMetaTitleAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private Boolean staged;

    @JsonCreator
    ProductSetMetaTitleActionImpl(
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("staged") final Boolean staged) {
        this.metaTitle = metaTitle;
        this.staged = staged;
        this.action = "setMetaTitle";
    }

    public ProductSetMetaTitleActionImpl() {
        this.action = "setMetaTitle";
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
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

        ProductSetMetaTitleActionImpl that = (ProductSetMetaTitleActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(metaTitle, that.metaTitle).append(staged,
            that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaTitle).append(staged).toHashCode();
    }

}