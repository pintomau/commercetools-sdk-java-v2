package com.commercetools.importapi.models.productdrafts;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.productdrafts.PriceDraftImport;
import com.commercetools.importapi.models.productvariants.Attribute;
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
public final class ProductVariantDraftImportImpl implements ProductVariantDraftImport {

    private String sku;
    
    private String key;
    
    private java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices;
    
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;
    
    private java.util.List<com.commercetools.importapi.models.common.Image> images;
    
    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    @JsonCreator
    ProductVariantDraftImportImpl(@JsonProperty("sku") final String sku, @JsonProperty("key") final String key, @JsonProperty("prices") final java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices, @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes, @JsonProperty("images") final java.util.List<com.commercetools.importapi.models.common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.sku = sku;
        this.key = key;
        this.prices = prices;
        this.attributes = attributes;
        this.images = images;
        this.assets = assets;
    }
    public ProductVariantDraftImportImpl() {
       
    }

    
    public String getSku(){
        return this.sku;
    }
    
    
    public String getKey(){
        return this.key;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> getPrices(){
        return this.prices;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes(){
        return this.attributes;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.common.Image> getImages(){
        return this.images;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets(){
        return this.assets;
    }

    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setPrices(final com.commercetools.importapi.models.productdrafts.PriceDraftImport ...prices){
       this.prices = new ArrayList<>(Arrays.asList(prices));
    }
    
    public void setPrices(final java.util.List<com.commercetools.importapi.models.productdrafts.PriceDraftImport> prices){
       this.prices = prices;
    }
    
    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute ...attributes){
       this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }
    
    public void setAttributes(final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes){
       this.attributes = attributes;
    }
    
    public void setImages(final com.commercetools.importapi.models.common.Image ...images){
       this.images = new ArrayList<>(Arrays.asList(images));
    }
    
    public void setImages(final java.util.List<com.commercetools.importapi.models.common.Image> images){
       this.images = images;
    }
    
    public void setAssets(final com.commercetools.importapi.models.common.Asset ...assets){
       this.assets = new ArrayList<>(Arrays.asList(assets));
    }
    
    public void setAssets(final java.util.List<com.commercetools.importapi.models.common.Asset> assets){
       this.assets = assets;
    }

}
