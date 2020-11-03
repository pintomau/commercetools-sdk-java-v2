package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SearchKeyword;
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
public final class SearchKeywordsImpl implements SearchKeywords {

    private Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values;

    @JsonCreator
    SearchKeywordsImpl(@JsonProperty("values") final Map<String, java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values) {
        this.values = values;
    }
    public SearchKeywordsImpl() {
       
    }

    
    public Map<String,java.util.List<com.commercetools.importapi.models.products.SearchKeyword>> values() {
        return values;
    }

    public void setValue(String key, java.util.List<com.commercetools.importapi.models.products.SearchKeyword> value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

}
