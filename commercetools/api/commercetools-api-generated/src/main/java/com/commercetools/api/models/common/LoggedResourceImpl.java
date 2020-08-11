package com.commercetools.api.models.common;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.me.MyCart;
import com.commercetools.api.models.me.MyCustomer;
import com.commercetools.api.models.me.MyOrder;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shopping_list.MyShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.subscription.Subscription;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.zone.Zone;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LoggedResourceImpl implements LoggedResource {

   private java.time.ZonedDateTime createdAt;

   private java.time.ZonedDateTime lastModifiedAt;

   private String id;

   private Long version;

   private com.commercetools.api.models.common.CreatedBy createdBy;

   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

   @JsonCreator
   LoggedResourceImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
   }
   public LoggedResourceImpl() {

   }


   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }


   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }


   public String getId(){
      return this.id;
   }


   public Long getVersion(){
      return this.version;
   }


   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }


   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }

   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }

   public void setId(final String id){
      this.id = id;
   }

   public void setVersion(final Long version){
      this.version = version;
   }

   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }

   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }

}
