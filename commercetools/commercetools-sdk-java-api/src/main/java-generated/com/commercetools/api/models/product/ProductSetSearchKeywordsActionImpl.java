
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.SearchKeywords;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetSearchKeywordsActionImpl implements ProductSetSearchKeywordsAction {

    private String action;

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    private Boolean staged;

    @JsonCreator
    ProductSetSearchKeywordsActionImpl(
            @JsonProperty("searchKeywords") final com.commercetools.api.models.product.SearchKeywords searchKeywords,
            @JsonProperty("staged") final Boolean staged) {
        this.searchKeywords = searchKeywords;
        this.staged = staged;
        this.action = "setSearchKeywords";
    }

    public ProductSetSearchKeywordsActionImpl() {
        this.action = "setSearchKeywords";
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setSearchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
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

        ProductSetSearchKeywordsActionImpl that = (ProductSetSearchKeywordsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(searchKeywords, that.searchKeywords).append(
            staged, that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(searchKeywords).append(staged).toHashCode();
    }

}