package com.commercetools.models.TaxCategory;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.TaxCategory.TaxRate;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategory;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private java.util.List<com.commercetools.models.TaxCategory.TaxRate> rates;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String description;
   
   @Nullable
   private java.lang.String key;
   
   public TaxCategoryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public TaxCategoryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public TaxCategoryBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TaxCategoryBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public TaxCategoryBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public TaxCategoryBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public TaxCategoryBuilder rates( final java.util.List<com.commercetools.models.TaxCategory.TaxRate> rates) {
      this.rates = rates;
      return this;
   }
   
   public TaxCategoryBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public TaxCategoryBuilder description(@Nullable final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   public TaxCategoryBuilder key(@Nullable final java.lang.String key) {
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
   
   
   public java.util.List<com.commercetools.models.TaxCategory.TaxRate> getRates(){
      return this.rates;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public TaxCategory build() {
       return new TaxCategoryImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, rates, name, description, key);
   }
   
   public static TaxCategoryBuilder of() {
      return new TaxCategoryBuilder();
   }
   
   public static TaxCategoryBuilder of(final TaxCategory template) {
      TaxCategoryBuilder builder = new TaxCategoryBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.rates = template.getRates();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      return builder;
   }
   
}