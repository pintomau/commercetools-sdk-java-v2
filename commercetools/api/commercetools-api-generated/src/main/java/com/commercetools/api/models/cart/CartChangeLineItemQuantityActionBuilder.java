package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartChangeLineItemQuantityActionBuilder {
   
   
   private String lineItemId;
   
   
   private Double quantity;
   
   @Nullable
   private com.commercetools.api.models.common.Money externalPrice;
   
   @Nullable
   private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   public CartChangeLineItemQuantityActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder quantity( final Double quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder externalPrice(@Nullable final com.commercetools.api.models.common.Money externalPrice) {
      this.externalPrice = externalPrice;
      return this;
   }
   
   public CartChangeLineItemQuantityActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public Double getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }

   public CartChangeLineItemQuantityAction build() {
       return new CartChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
   }
   
   public static CartChangeLineItemQuantityActionBuilder of() {
      return new CartChangeLineItemQuantityActionBuilder();
   }
   
   public static CartChangeLineItemQuantityActionBuilder of(final CartChangeLineItemQuantityAction template) {
      CartChangeLineItemQuantityActionBuilder builder = new CartChangeLineItemQuantityActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.quantity = template.getQuantity();
      builder.externalPrice = template.getExternalPrice();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      return builder;
   }
   
}