package com.commercetools.models.ShoppingList;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFields;
import java.lang.Integer;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.ShoppingList.TextLineItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TextLineItemBuilder {
   
   
   private java.time.ZonedDateTime addedAt;
   
   
   private java.lang.Integer quantity;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   
   private java.lang.String id;
   
   public TextLineItemBuilder addedAt( final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public TextLineItemBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public TextLineItemBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public TextLineItemBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public TextLineItemBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public TextLineItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }

   public TextLineItem build() {
       return new TextLineItemImpl(addedAt, quantity, custom, name, description, id);
   }
   
   public static TextLineItemBuilder of() {
      return new TextLineItemBuilder();
   }
   
   public static TextLineItemBuilder of(final TextLineItem template) {
      TextLineItemBuilder builder = new TextLineItemBuilder();
      builder.addedAt = template.getAddedAt();
      builder.quantity = template.getQuantity();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.id = template.getId();
      return builder;
   }
   
}