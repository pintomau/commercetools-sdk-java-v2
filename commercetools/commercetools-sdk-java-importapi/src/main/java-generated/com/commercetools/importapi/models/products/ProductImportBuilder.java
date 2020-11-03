package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.products.SearchKeywords;
import com.commercetools.importapi.models.products.ProductImport;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductImportBuilder {

    
    private String key;
    
    
    private com.commercetools.importapi.models.common.LocalizedString name;
    
    
    private com.commercetools.importapi.models.common.ProductTypeKeyReference productType;
    
    
    private com.commercetools.importapi.models.common.LocalizedString slug;
    
    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;
    
    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories;
    
    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaTitle;
    
    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaDescription;
    
    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;
    
    @Nullable
    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;
    
    @Nullable
    private com.commercetools.importapi.models.products.SearchKeywords searchKeywords;
    
    @Nullable
    private com.commercetools.importapi.models.common.StateKeyReference state;
    
    @Nullable
    private Boolean publish;

    public ProductImportBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    public ProductImportBuilder name( final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    public ProductImportBuilder productType( final com.commercetools.importapi.models.common.ProductTypeKeyReference productType) {
        this.productType = productType;
        return this;
    }
    
    public ProductImportBuilder slug( final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }
    
    public ProductImportBuilder description(@Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    public ProductImportBuilder categories(@Nullable final com.commercetools.importapi.models.common.CategoryKeyReference ...categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }
    
    public ProductImportBuilder categories(@Nullable final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories) {
        this.categories = categories;
        return this;
    }
    
    public ProductImportBuilder metaTitle(@Nullable final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }
    
    public ProductImportBuilder metaDescription(@Nullable final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }
    
    public ProductImportBuilder metaKeywords(@Nullable final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }
    
    public ProductImportBuilder taxCategory(@Nullable final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }
    
    public ProductImportBuilder searchKeywords(@Nullable final com.commercetools.importapi.models.products.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }
    
    public ProductImportBuilder state(@Nullable final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
        return this;
    }
    
    public ProductImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.importapi.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType(){
        return this.productType;
    }
    
    
    public com.commercetools.importapi.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories(){
        return this.categories;
    }
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle(){
        return this.metaTitle;
    }
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription(){
        return this.metaDescription;
    }
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords(){
        return this.metaKeywords;
    }
    
    @Nullable
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory(){
        return this.taxCategory;
    }
    
    @Nullable
    public com.commercetools.importapi.models.products.SearchKeywords getSearchKeywords(){
        return this.searchKeywords;
    }
    
    @Nullable
    public com.commercetools.importapi.models.common.StateKeyReference getState(){
        return this.state;
    }
    
    @Nullable
    public Boolean getPublish(){
        return this.publish;
    }

    public ProductImport build() {
        return new ProductImportImpl(key, name, productType, slug, description, categories, metaTitle, metaDescription, metaKeywords, taxCategory, searchKeywords, state, publish);
    }

    public static ProductImportBuilder of() {
        return new ProductImportBuilder();
    }

    public static ProductImportBuilder of(final ProductImport template) {
        ProductImportBuilder builder = new ProductImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.productType = template.getProductType();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.categories = template.getCategories();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.taxCategory = template.getTaxCategory();
        builder.searchKeywords = template.getSearchKeywords();
        builder.state = template.getState();
        builder.publish = template.getPublish();
        return builder;
    }

}
