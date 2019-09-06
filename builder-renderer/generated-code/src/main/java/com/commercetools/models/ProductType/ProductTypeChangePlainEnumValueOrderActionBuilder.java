package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributePlainEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangePlainEnumValueOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangePlainEnumValueOrderActionBuilder {
   
   
   private java.util.List<com.commercetools.models.ProductType.AttributePlainEnumValue> values;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangePlainEnumValueOrderActionBuilder values( final java.util.List<com.commercetools.models.ProductType.AttributePlainEnumValue> values) {
      this.values = values;
      return this;
   }
   
   public ProductTypeChangePlainEnumValueOrderActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ProductType.AttributePlainEnumValue> getValues(){
      return this.values;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangePlainEnumValueOrderAction build() {
       return new ProductTypeChangePlainEnumValueOrderActionImpl(values, attributeName);
   }
   
   public static ProductTypeChangePlainEnumValueOrderActionBuilder of() {
      return new ProductTypeChangePlainEnumValueOrderActionBuilder();
   }
   
   public static ProductTypeChangePlainEnumValueOrderActionBuilder of(final ProductTypeChangePlainEnumValueOrderAction template) {
      ProductTypeChangePlainEnumValueOrderActionBuilder builder = new ProductTypeChangePlainEnumValueOrderActionBuilder();
      builder.values = template.getValues();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}