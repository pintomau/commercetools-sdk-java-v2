package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountedLineItemPrice;
import java.lang.Integer;
import com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedLineItemPriceForQuantityBuilder {
   
   
   private java.lang.Integer quantity;
   
   
   private com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice;
   
   public DiscountedLineItemPriceForQuantityBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public DiscountedLineItemPriceForQuantityBuilder discountedPrice( final com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }

   public DiscountedLineItemPriceForQuantity build() {
       return new DiscountedLineItemPriceForQuantityImpl(quantity, discountedPrice);
   }
   
   public static DiscountedLineItemPriceForQuantityBuilder of() {
      return new DiscountedLineItemPriceForQuantityBuilder();
   }
   
   public static DiscountedLineItemPriceForQuantityBuilder of(final DiscountedLineItemPriceForQuantity template) {
      DiscountedLineItemPriceForQuantityBuilder builder = new DiscountedLineItemPriceForQuantityBuilder();
      builder.quantity = template.getQuantity();
      builder.discountedPrice = template.getDiscountedPrice();
      return builder;
   }
   
}