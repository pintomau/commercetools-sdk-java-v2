package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.me.MyShoppingListSetLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListSetLineItemCustomTypeActionBuilder {


   private String lineItemId;

   @Nullable
   private com.commercetools.api.models.type.FieldContainer fields;

   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;

   public MyShoppingListSetLineItemCustomTypeActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }

   public MyShoppingListSetLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }

   public MyShoppingListSetLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }


   public String getLineItemId(){
      return this.lineItemId;
   }

   @Nullable
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }

   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public MyShoppingListSetLineItemCustomTypeAction build() {
       return new MyShoppingListSetLineItemCustomTypeActionImpl(lineItemId, fields, type);
   }

   public static MyShoppingListSetLineItemCustomTypeActionBuilder of() {
      return new MyShoppingListSetLineItemCustomTypeActionBuilder();
   }

   public static MyShoppingListSetLineItemCustomTypeActionBuilder of(final MyShoppingListSetLineItemCustomTypeAction template) {
      MyShoppingListSetLineItemCustomTypeActionBuilder builder = new MyShoppingListSetLineItemCustomTypeActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }

}
