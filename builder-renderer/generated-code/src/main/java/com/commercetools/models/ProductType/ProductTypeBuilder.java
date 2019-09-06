package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.ProductType.AttributeDefinition;
import java.lang.String;
import com.commercetools.models.ProductType.ProductType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private java.lang.String name;
   
   
   private java.lang.String description;
   
   @Nullable
   private java.util.List<com.commercetools.models.ProductType.AttributeDefinition> attributes;
   
   @Nullable
   private java.lang.String key;
   
   public ProductTypeBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductTypeBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductTypeBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductTypeBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductTypeBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductTypeBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductTypeBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public ProductTypeBuilder description( final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   public ProductTypeBuilder attributes(@Nullable final java.util.List<com.commercetools.models.ProductType.AttributeDefinition> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductTypeBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.ProductType.AttributeDefinition> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductType build() {
       return new ProductTypeImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, name, description, attributes, key);
   }
   
   public static ProductTypeBuilder of() {
      return new ProductTypeBuilder();
   }
   
   public static ProductTypeBuilder of(final ProductType template) {
      ProductTypeBuilder builder = new ProductTypeBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.attributes = template.getAttributes();
      builder.key = template.getKey();
      return builder;
   }
   
}