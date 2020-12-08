package com.commercetools.api.models.product;

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
public final class SearchKeywordImpl implements SearchKeyword {

    private String text;
    
    private com.fasterxml.jackson.databind.JsonNode suggestTokenizer;

    @JsonCreator
    SearchKeywordImpl(@JsonProperty("text") final String text, @JsonProperty("suggestTokenizer") final com.fasterxml.jackson.databind.JsonNode suggestTokenizer) {
        this.text = text;
        this.suggestTokenizer = suggestTokenizer;
    }
    public SearchKeywordImpl() {
    }

    
    public String getText(){
        return this.text;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getSuggestTokenizer(){
        return this.suggestTokenizer;
    }

    public void setText(final String text){
        this.text = text;
    }
    
    public void setSuggestTokenizer(final com.fasterxml.jackson.databind.JsonNode suggestTokenizer){
        this.suggestTokenizer = suggestTokenizer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SearchKeywordImpl that = (SearchKeywordImpl) o;
    
        return new EqualsBuilder()
                .append(text, that.text)
                .append(suggestTokenizer, that.suggestTokenizer)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(text)
            .append(suggestTokenizer)
            .toHashCode();
    }

}
