package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.ProductReference;
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


/**
*  <p>The product variant that contains the image.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantImpl implements ProductVariant {

    private com.commercetools.ml.models.common.ProductReference product;
    
    private Boolean staged;
    
    private Integer variantId;

    @JsonCreator
    ProductVariantImpl(@JsonProperty("product") final com.commercetools.ml.models.common.ProductReference product, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Integer variantId) {
        this.product = product;
        this.staged = staged;
        this.variantId = variantId;
    }
    public ProductVariantImpl() {
       
    }

    /**
    *  <p>The product that contains this variant.</p>
    */
    public com.commercetools.ml.models.common.ProductReference getProduct(){
        return this.product;
    }
    
    /**
    *  <p>The state of the product variant.</p>
    */
    public Boolean getStaged(){
        return this.staged;
    }
    
    /**
    *  <p>The id of the product variant.</p>
    */
    public Integer getVariantId(){
        return this.variantId;
    }

    public void setProduct(final com.commercetools.ml.models.common.ProductReference product){
        this.product = product;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }
    
    public void setVariantId(final Integer variantId){
        this.variantId = variantId;
    }

}