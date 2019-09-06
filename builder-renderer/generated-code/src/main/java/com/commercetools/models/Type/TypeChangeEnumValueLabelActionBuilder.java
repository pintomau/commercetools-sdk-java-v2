package com.commercetools.models.Type;

import com.commercetools.models.Type.CustomFieldEnumValue;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeEnumValueLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeEnumValueLabelActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.Type.CustomFieldEnumValue value;
   
   public TypeChangeEnumValueLabelActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeEnumValueLabelActionBuilder value( final com.commercetools.models.Type.CustomFieldEnumValue value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Type.CustomFieldEnumValue getValue(){
      return this.value;
   }

   public TypeChangeEnumValueLabelAction build() {
       return new TypeChangeEnumValueLabelActionImpl(fieldName, value);
   }
   
   public static TypeChangeEnumValueLabelActionBuilder of() {
      return new TypeChangeEnumValueLabelActionBuilder();
   }
   
   public static TypeChangeEnumValueLabelActionBuilder of(final TypeChangeEnumValueLabelAction template) {
      TypeChangeEnumValueLabelActionBuilder builder = new TypeChangeEnumValueLabelActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.value = template.getValue();
      return builder;
   }
   
}