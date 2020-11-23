package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
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
public final class TaxCategorySetKeyActionImpl implements TaxCategorySetKeyAction {

    private String action;
    
    private String key;

    @JsonCreator
    TaxCategorySetKeyActionImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.action = "setKey";
    }
    public TaxCategorySetKeyActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, it is removed if it exists.</p>
    */
    public String getKey(){
        return this.key;
    }

    public void setKey(final String key){
        this.key = key;
    }

}