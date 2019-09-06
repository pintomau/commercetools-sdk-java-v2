package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Order.OrderSetCustomLineItemCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomLineItemCustomTypeActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public OrderSetCustomLineItemCustomTypeActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderSetCustomLineItemCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public OrderSetCustomLineItemCustomTypeActionBuilder type(@Nullable final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public OrderSetCustomLineItemCustomTypeAction build() {
       return new OrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, fields, type);
   }
   
   public static OrderSetCustomLineItemCustomTypeActionBuilder of() {
      return new OrderSetCustomLineItemCustomTypeActionBuilder();
   }
   
   public static OrderSetCustomLineItemCustomTypeActionBuilder of(final OrderSetCustomLineItemCustomTypeAction template) {
      OrderSetCustomLineItemCustomTypeActionBuilder builder = new OrderSetCustomLineItemCustomTypeActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}