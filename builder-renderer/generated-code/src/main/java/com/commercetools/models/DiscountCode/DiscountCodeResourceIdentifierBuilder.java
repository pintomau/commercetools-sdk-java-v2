package com.commercetools.models.DiscountCode;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.DiscountCode.DiscountCodeResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public DiscountCodeResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public DiscountCodeResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public DiscountCodeResourceIdentifier build() {
       return new DiscountCodeResourceIdentifierImpl(id, key);
   }
   
   public static DiscountCodeResourceIdentifierBuilder of() {
      return new DiscountCodeResourceIdentifierBuilder();
   }
   
   public static DiscountCodeResourceIdentifierBuilder of(final DiscountCodeResourceIdentifier template) {
      DiscountCodeResourceIdentifierBuilder builder = new DiscountCodeResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}