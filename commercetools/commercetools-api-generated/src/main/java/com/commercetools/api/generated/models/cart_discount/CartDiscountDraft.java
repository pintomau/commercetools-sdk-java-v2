package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.cart_discount.StackingMode;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.cart_discount.CartDiscountDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountDraftImpl.class)
public interface CartDiscountDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>User-specific unique identifier for a cart discount.
   *  Must be unique across a project.
   *  The field can be reset using the Set Key UpdateAction.</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public CartDiscountValueDraft getValue();
   /**
   *  <p>A valid Cart predicate.</p>
   */
   @NotNull
   @JsonProperty("cartPredicate")
   public String getCartPredicate();
   /**
   *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
   */
   @Valid
   @JsonProperty("target")
   public CartDiscountTarget getTarget();
   /**
   *  <p>The string must contain a number between 0 and 1.
   *  A discount with greater sort order is prioritized higher than a discount with lower sort order.
   *  The sort order must be unambiguous among all cart discounts.</p>
   */
   @NotNull
   @JsonProperty("sortOrder")
   public String getSortOrder();
   /**
   *  <p>Only active discount can be applied to the cart.
   *  Defaults to <code>true</code>.</p>
   */
   
   @JsonProperty("isActive")
   public Boolean getIsActive();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();
   /**
   *  <p>States whether the discount can only be used in a connection with a DiscountCode.
   *  Defaults to <code>false</code>.</p>
   */
   @NotNull
   @JsonProperty("requiresDiscountCode")
   public Boolean getRequiresDiscountCode();
   /**
   *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.
   *  Defaults to Stacking.</p>
   */
   
   @JsonProperty("stackingMode")
   public StackingMode getStackingMode();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setName(final LocalizedString name);
   
   public void setKey(final String key);
   
   public void setDescription(final LocalizedString description);
   
   public void setValue(final CartDiscountValueDraft value);
   
   public void setCartPredicate(final String cartPredicate);
   
   public void setTarget(final CartDiscountTarget target);
   
   public void setSortOrder(final String sortOrder);
   
   public void setIsActive(final Boolean isActive);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public void setRequiresDiscountCode(final Boolean requiresDiscountCode);
   
   public void setStackingMode(final StackingMode stackingMode);
   
   public void setCustom(final CustomFields custom);
   
   public static CartDiscountDraftImpl of(){
      return new CartDiscountDraftImpl();
   }
   

   public static CartDiscountDraftImpl of(final CartDiscountDraft template) {
      CartDiscountDraftImpl instance = new CartDiscountDraftImpl();
      instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
      instance.setCartPredicate(template.getCartPredicate());
      instance.setCustom(template.getCustom());
      instance.setStackingMode(template.getStackingMode());
      instance.setSortOrder(template.getSortOrder());
      instance.setName(template.getName());
      instance.setValidUntil(template.getValidUntil());
      instance.setDescription(template.getDescription());
      instance.setValidFrom(template.getValidFrom());
      instance.setIsActive(template.getIsActive());
      instance.setValue(template.getValue());
      instance.setKey(template.getKey());
      instance.setTarget(template.getTarget());
      return instance;
   }

}