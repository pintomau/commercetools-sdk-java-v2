package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductVariant;
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
public final class ProductVariantAddedMessagePayloadImpl implements ProductVariantAddedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.product.ProductVariant variant;
    
    private Boolean staged;

    @JsonCreator
    ProductVariantAddedMessagePayloadImpl(@JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant, @JsonProperty("staged") final Boolean staged) {
        this.variant = variant;
        this.staged = staged;
        this.type = "ProductVariantAdded";
    }
    public ProductVariantAddedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.product.ProductVariant getVariant(){
        return this.variant;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setVariant(final com.commercetools.api.models.product.ProductVariant variant){
        this.variant = variant;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}