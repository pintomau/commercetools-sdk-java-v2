package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.OrderEdit.OrderEdit;
import com.commercetools.models.OrderEdit.OrderEditReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.OrderEdit.OrderEdit obj;
   
   public OrderEditReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderEditReferenceBuilder obj(@Nullable final com.commercetools.models.OrderEdit.OrderEdit obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.OrderEdit.OrderEdit getObj(){
      return this.obj;
   }

   public OrderEditReference build() {
       return new OrderEditReferenceImpl(id, obj);
   }
   
   public static OrderEditReferenceBuilder of() {
      return new OrderEditReferenceBuilder();
   }
   
   public static OrderEditReferenceBuilder of(final OrderEditReference template) {
      OrderEditReferenceBuilder builder = new OrderEditReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}