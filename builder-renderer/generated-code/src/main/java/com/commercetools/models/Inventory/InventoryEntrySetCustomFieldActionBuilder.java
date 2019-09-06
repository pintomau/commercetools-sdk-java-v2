package com.commercetools.models.Inventory;

import com.commercetools.models.Inventory.InventoryEntryUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Inventory.InventoryEntrySetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InventoryEntrySetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public InventoryEntrySetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public InventoryEntrySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public InventoryEntrySetCustomFieldAction build() {
       return new InventoryEntrySetCustomFieldActionImpl(name, value);
   }
   
   public static InventoryEntrySetCustomFieldActionBuilder of() {
      return new InventoryEntrySetCustomFieldActionBuilder();
   }
   
   public static InventoryEntrySetCustomFieldActionBuilder of(final InventoryEntrySetCustomFieldAction template) {
      InventoryEntrySetCustomFieldActionBuilder builder = new InventoryEntrySetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}