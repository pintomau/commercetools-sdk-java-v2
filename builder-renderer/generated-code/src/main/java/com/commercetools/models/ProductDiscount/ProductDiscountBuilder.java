package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.ProductDiscount.ProductDiscountValue;
import java.lang.Boolean;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.ProductDiscount.ProductDiscount;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private java.lang.String predicate;
   
   
   private java.util.List<com.commercetools.models.Common.Reference> references;
   
   
   private java.lang.String sortOrder;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private java.lang.Boolean isActive;
   
   
   private com.commercetools.models.ProductDiscount.ProductDiscountValue value;
   
   @Nullable
   private java.lang.String key;
   
   public ProductDiscountBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductDiscountBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductDiscountBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductDiscountBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductDiscountBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductDiscountBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductDiscountBuilder predicate( final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public ProductDiscountBuilder references( final java.util.List<com.commercetools.models.Common.Reference> references) {
      this.references = references;
      return this;
   }
   
   public ProductDiscountBuilder sortOrder( final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public ProductDiscountBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ProductDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public ProductDiscountBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ProductDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public ProductDiscountBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public ProductDiscountBuilder value( final com.commercetools.models.ProductDiscount.ProductDiscountValue value) {
      this.value = value;
      return this;
   }
   
   public ProductDiscountBuilder key(@Nullable final java.lang.String key) {
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
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Reference> getReferences(){
      return this.references;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.models.ProductDiscount.ProductDiscountValue getValue(){
      return this.value;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductDiscount build() {
       return new ProductDiscountImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, predicate, references, sortOrder, name, validUntil, description, validFrom, isActive, value, key);
   }
   
   public static ProductDiscountBuilder of() {
      return new ProductDiscountBuilder();
   }
   
   public static ProductDiscountBuilder of(final ProductDiscount template) {
      ProductDiscountBuilder builder = new ProductDiscountBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.predicate = template.getPredicate();
      builder.references = template.getReferences();
      builder.sortOrder = template.getSortOrder();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.isActive = template.getIsActive();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}