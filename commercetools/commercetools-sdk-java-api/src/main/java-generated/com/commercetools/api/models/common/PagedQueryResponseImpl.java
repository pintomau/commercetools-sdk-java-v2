package com.commercetools.api.models.common;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.product.FacetResults;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class PagedQueryResponseImpl implements PagedQueryResponse {

    private Long limit;
    
    private Long count;
    
    private Long total;
    
    private Long offset;
    
    private java.util.List<com.commercetools.api.models.common.BaseResource> results;
    
    private com.commercetools.api.models.product.FacetResults facets;
    
    private com.fasterxml.jackson.databind.JsonNode meta;

    @JsonCreator
    PagedQueryResponseImpl(@JsonProperty("limit") final Long limit, @JsonProperty("count") final Long count, @JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset, @JsonProperty("results") final java.util.List<com.commercetools.api.models.common.BaseResource> results, @JsonProperty("facets") final com.commercetools.api.models.product.FacetResults facets, @JsonProperty("meta") final com.fasterxml.jackson.databind.JsonNode meta) {
        this.limit = limit;
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
        this.facets = facets;
        this.meta = meta;
    }
    public PagedQueryResponseImpl() {
    }

    
    public Long getLimit(){
        return this.limit;
    }
    
    
    public Long getCount(){
        return this.count;
    }
    
    
    public Long getTotal(){
        return this.total;
    }
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.BaseResource> getResults(){
        return this.results;
    }
    
    
    public com.commercetools.api.models.product.FacetResults getFacets(){
        return this.facets;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getMeta(){
        return this.meta;
    }

    public void setLimit(final Long limit){
        this.limit = limit;
    }
    
    public void setCount(final Long count){
        this.count = count;
    }
    
    public void setTotal(final Long total){
        this.total = total;
    }
    
    public void setOffset(final Long offset){
        this.offset = offset;
    }
    
    public void setResults(final com.commercetools.api.models.common.BaseResource ...results){
       this.results = new ArrayList<>(Arrays.asList(results));
    }
    
    public void setResults(final java.util.List<com.commercetools.api.models.common.BaseResource> results){
       this.results = results;
    }
    
    public void setFacets(final com.commercetools.api.models.product.FacetResults facets){
        this.facets = facets;
    }
    
    public void setMeta(final com.fasterxml.jackson.databind.JsonNode meta){
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PagedQueryResponseImpl that = (PagedQueryResponseImpl) o;
    
        return new EqualsBuilder()
                .append(limit, that.limit)
                .append(count, that.count)
                .append(total, that.total)
                .append(offset, that.offset)
                .append(results, that.results)
                .append(facets, that.facets)
                .append(meta, that.meta)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(limit)
            .append(count)
            .append(total)
            .append(offset)
            .append(results)
            .append(facets)
            .append(meta)
            .toHashCode();
    }

}
