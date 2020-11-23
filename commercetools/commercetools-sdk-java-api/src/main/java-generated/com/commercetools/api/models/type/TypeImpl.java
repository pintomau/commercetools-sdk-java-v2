package com.commercetools.api.models.type;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.ResourceTypeId;
import java.time.ZonedDateTime;
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
public final class TypeImpl implements Type {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private String key;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;
    
    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    @JsonCreator
    TypeImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("key") final String key, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds, @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.name = name;
        this.description = description;
        this.resourceTypeIds = resourceTypeIds;
        this.fieldDefinitions = fieldDefinitions;
    }
    public TypeImpl() {
       
    }

    /**
    *  <p>The unique ID of the type.</p>
    */
    public String getId(){
        return this.id;
    }
    
    /**
    *  <p>The current version of the type.</p>
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
    
    /**
    *  <p>Identifier for the type (max.
    *  256 characters).</p>
    */
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
    *  <p>Defines for which resource(s) the type is valid.</p>
    */
    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds(){
        return this.resourceTypeIds;
    }
    
    
    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions(){
        return this.fieldDefinitions;
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
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setResourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId ...resourceTypeIds){
       this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
    }
    
    public void setResourceTypeIds(final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds){
       this.resourceTypeIds = resourceTypeIds;
    }
    
    public void setFieldDefinitions(final com.commercetools.api.models.type.FieldDefinition ...fieldDefinitions){
       this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
    }
    
    public void setFieldDefinitions(final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions){
       this.fieldDefinitions = fieldDefinitions;
    }

}