package com.commercetools.api.generated.models.type;


import com.commercetools.api.generated.models.type.FieldContainer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FieldContainerBuilder {
   
   
   private Map<String, JsonNode> values;
   
   public FieldContainerBuilder values( final Map<String, JsonNode> values){
      this.values = values;
      return this;
   }
   
   
   public Map<String, JsonNode> getValues(){
      return this.values;
   }

   public FieldContainer build() {
       return new FieldContainerImpl(values);
   }
   
   public static FieldContainerBuilder of() {
      return new FieldContainerBuilder();
   }
   
   public static FieldContainerBuilder of(final FieldContainer template) {
      FieldContainerBuilder builder = new FieldContainerBuilder();
      builder.values = template.values();
      return builder;
   }
   
}