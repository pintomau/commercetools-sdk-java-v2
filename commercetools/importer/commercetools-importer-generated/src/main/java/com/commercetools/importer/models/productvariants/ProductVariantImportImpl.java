package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.Asset;
import com.commercetools.importer.models.common.Image;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.ProductKeyReference;
import com.commercetools.importer.models.productvariants.Attribute;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Import representation for a product variant. Use this type for importing new product variants
*  into a commercetools project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantImportImpl implements ProductVariantImport {

    private String key;
    
    private String sku;
    
    private Boolean isMasterVariant;
    
    private java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes;
    
    private java.util.List<com.commercetools.importer.models.common.Image> images;
    
    private java.util.List<com.commercetools.importer.models.common.Asset> assets;
    
    private Boolean publish;
    
    private com.commercetools.importer.models.common.ProductKeyReference product;

    @JsonCreator
    ProductVariantImportImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku, @JsonProperty("isMasterVariant") final Boolean isMasterVariant, @JsonProperty("attributes") final java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes, @JsonProperty("images") final java.util.List<com.commercetools.importer.models.common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.importer.models.common.Asset> assets, @JsonProperty("publish") final Boolean publish, @JsonProperty("product") final com.commercetools.importer.models.common.ProductKeyReference product) {
        this.key = key;
        this.sku = sku;
        this.isMasterVariant = isMasterVariant;
        this.attributes = attributes;
        this.images = images;
        this.assets = assets;
        this.publish = publish;
        this.product = product;
    }
    public ProductVariantImportImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>Maps to <code>ProductVariant.sku</code>.</p>
    */
    public String getSku(){
        return this.sku;
    }
    
    /**
    *  <p>Maps to <code>ProductVariant.isMasterVariant</code>.</p>
    */
    public Boolean getIsMasterVariant(){
        return this.isMasterVariant;
    }
    
    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
    *  <p>Each attribute referenced must be defined
    *  in an already existing product type in the commercetools project, or the import
    *  operation state is set to <code>Unresolved</code>.</p>
    */
    public java.util.List<com.commercetools.importer.models.productvariants.Attribute> getAttributes(){
        return this.attributes;
    }
    
    /**
    *  <p>Maps to <code>ProductVariant.images</code>.</p>
    */
    public java.util.List<com.commercetools.importer.models.common.Image> getImages(){
        return this.images;
    }
    
    /**
    *  <p>Maps to <code>ProductVariant.assets</code>.</p>
    */
    public java.util.List<com.commercetools.importer.models.common.Asset> getAssets(){
        return this.assets;
    }
    
    /**
    *  <p>Set product Published field to <code>true</code> if there were no updates.
    *  If there were Updates, only the updates will be published to <code>staged</code> and <code>current</code> projection.</p>
    */
    public Boolean getPublish(){
        return this.publish;
    }
    
    /**
    *  <p>The product in which this product variant is contained. Maps to <code>ProductVariant.product</code>.</p>
    *  <p>The product referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public com.commercetools.importer.models.common.ProductKeyReference getProduct(){
        return this.product;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setIsMasterVariant(final Boolean isMasterVariant){
        this.isMasterVariant = isMasterVariant;
    }
    
    public void setAttributes(final java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes){
        this.attributes = attributes;
    }
    
    public void setImages(final java.util.List<com.commercetools.importer.models.common.Image> images){
        this.images = images;
    }
    
    public void setAssets(final java.util.List<com.commercetools.importer.models.common.Asset> assets){
        this.assets = assets;
    }
    
    public void setPublish(final Boolean publish){
        this.publish = publish;
    }
    
    public void setProduct(final com.commercetools.importer.models.common.ProductKeyReference product){
        this.product = product;
    }

}
