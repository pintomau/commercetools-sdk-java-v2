package com.commercetools.models.ProductType;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.ProductType.AttributeConstraintEnum;
import com.commercetools.models.ProductType.AttributeType;
import com.commercetools.models.ProductType.TextInputHint;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeDefinition;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeDefinitionBuilder {
   
   
   private java.lang.Boolean isRequired;
   
   
   private com.commercetools.models.ProductType.AttributeConstraintEnum attributeConstraint;
   
   
   private java.lang.String name;
   
   
   private com.commercetools.models.ProductType.TextInputHint inputHint;
   
   
   private java.lang.Boolean isSearchable;
   
   
   private com.commercetools.models.Common.LocalizedString label;
   
   
   private com.commercetools.models.ProductType.AttributeType type;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString inputTip;
   
   public AttributeDefinitionBuilder isRequired( final java.lang.Boolean isRequired) {
      this.isRequired = isRequired;
      return this;
   }
   
   public AttributeDefinitionBuilder attributeConstraint( final com.commercetools.models.ProductType.AttributeConstraintEnum attributeConstraint) {
      this.attributeConstraint = attributeConstraint;
      return this;
   }
   
   public AttributeDefinitionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public AttributeDefinitionBuilder inputHint( final com.commercetools.models.ProductType.TextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }
   
   public AttributeDefinitionBuilder isSearchable( final java.lang.Boolean isSearchable) {
      this.isSearchable = isSearchable;
      return this;
   }
   
   public AttributeDefinitionBuilder label( final com.commercetools.models.Common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public AttributeDefinitionBuilder type( final com.commercetools.models.ProductType.AttributeType type) {
      this.type = type;
      return this;
   }
   
   public AttributeDefinitionBuilder inputTip(@Nullable final com.commercetools.models.Common.LocalizedString inputTip) {
      this.inputTip = inputTip;
      return this;
   }
   
   
   public java.lang.Boolean getIsRequired(){
      return this.isRequired;
   }
   
   
   public com.commercetools.models.ProductType.AttributeConstraintEnum getAttributeConstraint(){
      return this.attributeConstraint;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.ProductType.TextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public java.lang.Boolean getIsSearchable(){
      return this.isSearchable;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.models.ProductType.AttributeType getType(){
      return this.type;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getInputTip(){
      return this.inputTip;
   }

   public AttributeDefinition build() {
       return new AttributeDefinitionImpl(isRequired, attributeConstraint, name, inputHint, isSearchable, label, type, inputTip);
   }
   
   public static AttributeDefinitionBuilder of() {
      return new AttributeDefinitionBuilder();
   }
   
   public static AttributeDefinitionBuilder of(final AttributeDefinition template) {
      AttributeDefinitionBuilder builder = new AttributeDefinitionBuilder();
      builder.isRequired = template.getIsRequired();
      builder.attributeConstraint = template.getAttributeConstraint();
      builder.name = template.getName();
      builder.inputHint = template.getInputHint();
      builder.isSearchable = template.getIsSearchable();
      builder.label = template.getLabel();
      builder.type = template.getType();
      builder.inputTip = template.getInputTip();
      return builder;
   }
   
}