package com.commercetools.importapi.models.productdrafts;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport;
import com.commercetools.importapi.models.products.SearchKeywords;
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
public final class ProductDraftImportImpl implements ProductDraftImport {

    private String key;
    
    private com.commercetools.importapi.models.common.ProductTypeKeyReference productType;
    
    private com.commercetools.importapi.models.common.LocalizedString name;
    
    private com.commercetools.importapi.models.common.LocalizedString slug;
    
    private com.commercetools.importapi.models.common.LocalizedString description;
    
    private java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories;
    
    private com.commercetools.importapi.models.common.LocalizedString metaTitle;
    
    private com.commercetools.importapi.models.common.LocalizedString metaDescription;
    
    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;
    
    private com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant;
    
    private java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants;
    
    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;
    
    private com.commercetools.importapi.models.products.SearchKeywords searchKeywords;
    
    private com.commercetools.importapi.models.common.StateKeyReference state;
    
    private Boolean publish;

    @JsonCreator
    ProductDraftImportImpl(@JsonProperty("key") final String key, @JsonProperty("productType") final com.commercetools.importapi.models.common.ProductTypeKeyReference productType, @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name, @JsonProperty("slug") final com.commercetools.importapi.models.common.LocalizedString slug, @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description, @JsonProperty("categories") final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories, @JsonProperty("metaTitle") final com.commercetools.importapi.models.common.LocalizedString metaTitle, @JsonProperty("metaDescription") final com.commercetools.importapi.models.common.LocalizedString metaDescription, @JsonProperty("metaKeywords") final com.commercetools.importapi.models.common.LocalizedString metaKeywords, @JsonProperty("masterVariant") final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant, @JsonProperty("variants") final java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants, @JsonProperty("taxCategory") final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory, @JsonProperty("searchKeywords") final com.commercetools.importapi.models.products.SearchKeywords searchKeywords, @JsonProperty("state") final com.commercetools.importapi.models.common.StateKeyReference state, @JsonProperty("publish") final Boolean publish) {
        this.key = key;
        this.productType = productType;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.categories = categories;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.masterVariant = masterVariant;
        this.variants = variants;
        this.taxCategory = taxCategory;
        this.searchKeywords = searchKeywords;
        this.state = state;
        this.publish = publish;
    }
    public ProductDraftImportImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>The product's product type. Maps to <code>Product.productType</code>.</p>
    *  <p>The product type referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType(){
        return this.productType;
    }
    
    
    public com.commercetools.importapi.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
    *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a project,
    *  but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
    */
    public com.commercetools.importapi.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
    *  <p>Maps to <code>Product.description</code>.</p>
    */
    public com.commercetools.importapi.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
    *  <p>An array of references to categories by their keys. Maps to <code>Product.categories</code>.</p>
    *  <p>The categories referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories(){
        return this.categories;
    }
    
    
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle(){
        return this.metaTitle;
    }
    
    
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription(){
        return this.metaDescription;
    }
    
    
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords(){
        return this.metaKeywords;
    }
    
    /**
    *  <p>The master product variant.
    *  Required if the <code>variants</code> array has product variants.</p>
    */
    public com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport getMasterVariant(){
        return this.masterVariant;
    }
    
    /**
    *  <p>An array of related product variants.</p>
    */
    public java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> getVariants(){
        return this.variants;
    }
    
    /**
    *  <p>References a tax category by its key.</p>
    *  <p>The tax category referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory(){
        return this.taxCategory;
    }
    
    
    public com.commercetools.importapi.models.products.SearchKeywords getSearchKeywords(){
        return this.searchKeywords;
    }
    
    /**
    *  <p>References a state by its key.</p>
    *  <p>The tax category referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public com.commercetools.importapi.models.common.StateKeyReference getState(){
        return this.state;
    }
    
    /**
    *  <p>If there were updates, only the updates will be published to <code>staged</code> and <code>current</code> projection.</p>
    */
    public Boolean getPublish(){
        return this.publish;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setProductType(final com.commercetools.importapi.models.common.ProductTypeKeyReference productType){
        this.productType = productType;
    }
    
    public void setName(final com.commercetools.importapi.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setSlug(final com.commercetools.importapi.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setCategories(final com.commercetools.importapi.models.common.CategoryKeyReference ...categories){
       this.categories = new ArrayList<>(Arrays.asList(categories));
    }
    
    public void setCategories(final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories){
       this.categories = categories;
    }
    
    public void setMetaTitle(final com.commercetools.importapi.models.common.LocalizedString metaTitle){
        this.metaTitle = metaTitle;
    }
    
    public void setMetaDescription(final com.commercetools.importapi.models.common.LocalizedString metaDescription){
        this.metaDescription = metaDescription;
    }
    
    public void setMetaKeywords(final com.commercetools.importapi.models.common.LocalizedString metaKeywords){
        this.metaKeywords = metaKeywords;
    }
    
    public void setMasterVariant(final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport masterVariant){
        this.masterVariant = masterVariant;
    }
    
    public void setVariants(final com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport ...variants){
       this.variants = new ArrayList<>(Arrays.asList(variants));
    }
    
    public void setVariants(final java.util.List<com.commercetools.importapi.models.productdrafts.ProductVariantDraftImport> variants){
       this.variants = variants;
    }
    
    public void setTaxCategory(final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory){
        this.taxCategory = taxCategory;
    }
    
    public void setSearchKeywords(final com.commercetools.importapi.models.products.SearchKeywords searchKeywords){
        this.searchKeywords = searchKeywords;
    }
    
    public void setState(final com.commercetools.importapi.models.common.StateKeyReference state){
        this.state = state;
    }
    
    public void setPublish(final Boolean publish){
        this.publish = publish;
    }

}