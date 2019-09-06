package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ItemShippingTarget;
import java.lang.String;
import com.commercetools.models.Cart.CartApplyDeltaToLineItemShippingDetailsTargetsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta;
   
   public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder targetsDelta( final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta) {
      this.targetsDelta = targetsDelta;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public CartApplyDeltaToLineItemShippingDetailsTargetsAction build() {
       return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(lineItemId, targetsDelta);
   }
   
   public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of() {
      return new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
   }
   
   public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder of(final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
      CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.targetsDelta = template.getTargetsDelta();
      return builder;
   }
   
}