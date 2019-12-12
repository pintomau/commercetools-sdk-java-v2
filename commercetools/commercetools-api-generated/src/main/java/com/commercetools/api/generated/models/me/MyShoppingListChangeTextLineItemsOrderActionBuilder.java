package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListChangeTextLineItemsOrderAction;
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
public final class MyShoppingListChangeTextLineItemsOrderActionBuilder {
   
   
   private java.util.List<String> textLineItemOrder;
   
   public MyShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder( final java.util.List<String> textLineItemOrder) {
      this.textLineItemOrder = textLineItemOrder;
      return this;
   }
   
   
   public java.util.List<String> getTextLineItemOrder(){
      return this.textLineItemOrder;
   }

   public MyShoppingListChangeTextLineItemsOrderAction build() {
       return new MyShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
   }
   
   public static MyShoppingListChangeTextLineItemsOrderActionBuilder of() {
      return new MyShoppingListChangeTextLineItemsOrderActionBuilder();
   }
   
   public static MyShoppingListChangeTextLineItemsOrderActionBuilder of(final MyShoppingListChangeTextLineItemsOrderAction template) {
      MyShoppingListChangeTextLineItemsOrderActionBuilder builder = new MyShoppingListChangeTextLineItemsOrderActionBuilder();
      builder.textLineItemOrder = template.getTextLineItemOrder();
      return builder;
   }
   
}