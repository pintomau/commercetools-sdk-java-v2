package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountCustomLineItemsTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountCustomLineItemsTargetBuilder {
   
   
   private java.lang.String predicate;
   
   public CartDiscountCustomLineItemsTargetBuilder predicate( final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }

   public CartDiscountCustomLineItemsTarget build() {
       return new CartDiscountCustomLineItemsTargetImpl(predicate);
   }
   
   public static CartDiscountCustomLineItemsTargetBuilder of() {
      return new CartDiscountCustomLineItemsTargetBuilder();
   }
   
   public static CartDiscountCustomLineItemsTargetBuilder of(final CartDiscountCustomLineItemsTarget template) {
      CartDiscountCustomLineItemsTargetBuilder builder = new CartDiscountCustomLineItemsTargetBuilder();
      builder.predicate = template.getPredicate();
      return builder;
   }
   
}