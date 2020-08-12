package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.models.shopping_list.ShoppingList obj;
   
   public ShoppingListReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ShoppingListReferenceBuilder obj(@Nullable final com.commercetools.api.models.shopping_list.ShoppingList obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.models.shopping_list.ShoppingList getObj(){
      return this.obj;
   }

   public ShoppingListReference build() {
       return new ShoppingListReferenceImpl(id, obj);
   }
   
   public static ShoppingListReferenceBuilder of() {
      return new ShoppingListReferenceBuilder();
   }
   
   public static ShoppingListReferenceBuilder of(final ShoppingListReference template) {
      ShoppingListReferenceBuilder builder = new ShoppingListReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}