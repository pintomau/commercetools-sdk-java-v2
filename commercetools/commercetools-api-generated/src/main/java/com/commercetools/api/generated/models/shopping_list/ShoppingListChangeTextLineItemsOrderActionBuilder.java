package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListChangeTextLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListChangeTextLineItemsOrderActionBuilder {
   
   
   private java.util.List<String> textLineItemOrder;
   
   public ShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder( final java.util.List<String> textLineItemOrder) {
      this.textLineItemOrder = textLineItemOrder;
      return this;
   }
   
   
   public java.util.List<String> getTextLineItemOrder(){
      return this.textLineItemOrder;
   }

   public ShoppingListChangeTextLineItemsOrderAction build() {
       return new ShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
   }
   
   public static ShoppingListChangeTextLineItemsOrderActionBuilder of() {
      return new ShoppingListChangeTextLineItemsOrderActionBuilder();
   }
   
   public static ShoppingListChangeTextLineItemsOrderActionBuilder of(final ShoppingListChangeTextLineItemsOrderAction template) {
      ShoppingListChangeTextLineItemsOrderActionBuilder builder = new ShoppingListChangeTextLineItemsOrderActionBuilder();
      builder.textLineItemOrder = template.getTextLineItemOrder();
      return builder;
   }
   
}