package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryImpl implements Category {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private com.commercetools.api.models.common.LocalizedString slug;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors;
    
    private com.commercetools.api.models.category.CategoryReference parent;
    
    private String orderHint;
    
    private String externalId;
    
    private com.commercetools.api.models.common.LocalizedString metaTitle;
    
    private com.commercetools.api.models.common.LocalizedString metaDescription;
    
    private com.commercetools.api.models.common.LocalizedString metaKeywords;
    
    private com.commercetools.api.models.type.CustomFields custom;
    
    private java.util.List<com.commercetools.api.models.common.Asset> assets;
    
    private String key;

    @JsonCreator
    CategoryImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("ancestors") final java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors, @JsonProperty("parent") final com.commercetools.api.models.category.CategoryReference parent, @JsonProperty("orderHint") final String orderHint, @JsonProperty("externalId") final String externalId, @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle, @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription, @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets, @JsonProperty("key") final String key) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.ancestors = ancestors;
        this.parent = parent;
        this.orderHint = orderHint;
        this.externalId = externalId;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.custom = custom;
        this.assets = assets;
        this.key = key;
    }
    public CategoryImpl() {
       
    }

    /**
    *  <p>The unique ID of the category.</p>
    */
    public String getId(){
        return this.id;
    }
    
    /**
    *  <p>The current version of the category.</p>
    */
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
    *  <p>human-readable identifiers usually used as deep-link URL to the related category.
    *  Each slug is unique across a project, but a category can have the same slug for different languages.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
    *  <p>Contains the parent path towards the root category.</p>
    */
    public java.util.List<com.commercetools.api.models.category.CategoryReference> getAncestors(){
        return this.ancestors;
    }
    
    /**
    *  <p>A category that is the parent of this category in the category tree.</p>
    */
    public com.commercetools.api.models.category.CategoryReference getParent(){
        return this.parent;
    }
    
    /**
    *  <p>An attribute as base for a custom category order in one level.</p>
    */
    public String getOrderHint(){
        return this.orderHint;
    }
    
    
    public String getExternalId(){
        return this.externalId;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getMetaTitle(){
        return this.metaTitle;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getMetaDescription(){
        return this.metaDescription;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords(){
        return this.metaKeywords;
    }
    
    
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }
    
    /**
    *  <p>Can be used to store images, icons or movies related to this category.</p>
    */
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets(){
        return this.assets;
    }
    
    /**
    *  <p>User-specific unique identifier for the category.</p>
    */
    public String getKey(){
        return this.key;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setAncestors(final java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors){
        this.ancestors = ancestors;
    }
    
    public void setParent(final com.commercetools.api.models.category.CategoryReference parent){
        this.parent = parent;
    }
    
    public void setOrderHint(final String orderHint){
        this.orderHint = orderHint;
    }
    
    public void setExternalId(final String externalId){
        this.externalId = externalId;
    }
    
    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle){
        this.metaTitle = metaTitle;
    }
    
    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription){
        this.metaDescription = metaDescription;
    }
    
    public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords){
        this.metaKeywords = metaKeywords;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
        this.custom = custom;
    }
    
    public void setAssets(final java.util.List<com.commercetools.api.models.common.Asset> assets){
        this.assets = assets;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

}