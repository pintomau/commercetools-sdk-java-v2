package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ItemShippingTarget;
import java.lang.String;
import com.commercetools.models.Cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta;
   
   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder targetsDelta( final java.util.List<com.commercetools.models.Cart.ItemShippingTarget> targetsDelta) {
      this.targetsDelta = targetsDelta;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction build() {
       return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, targetsDelta);
   }
   
   public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of() {
      return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
   }
   
   public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of(final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
      CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.targetsDelta = template.getTargetsDelta();
      return builder;
   }
   
}