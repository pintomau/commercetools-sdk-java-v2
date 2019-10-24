package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeChangeFieldDefinitionOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeFieldDefinitionOrderActionBuilder {
   
   
   private java.util.List<String> fieldNames;
   
   public TypeChangeFieldDefinitionOrderActionBuilder fieldNames( final java.util.List<String> fieldNames) {
      this.fieldNames = fieldNames;
      return this;
   }
   
   
   public java.util.List<String> getFieldNames(){
      return this.fieldNames;
   }

   public TypeChangeFieldDefinitionOrderAction build() {
       return new TypeChangeFieldDefinitionOrderActionImpl(fieldNames);
   }
   
   public static TypeChangeFieldDefinitionOrderActionBuilder of() {
      return new TypeChangeFieldDefinitionOrderActionBuilder();
   }
   
   public static TypeChangeFieldDefinitionOrderActionBuilder of(final TypeChangeFieldDefinitionOrderAction template) {
      TypeChangeFieldDefinitionOrderActionBuilder builder = new TypeChangeFieldDefinitionOrderActionBuilder();
      builder.fieldNames = template.getFieldNames();
      return builder;
   }
   
}