package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.AttributeDateType;
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
public final class AttributeDateTypeBuilder {
   
   
   

   public AttributeDateType build() {
       return new AttributeDateTypeImpl();
   }
   
   public static AttributeDateTypeBuilder of() {
      return new AttributeDateTypeBuilder();
   }
   
   public static AttributeDateTypeBuilder of(final AttributeDateType template) {
      AttributeDateTypeBuilder builder = new AttributeDateTypeBuilder();
      return builder;
   }
   
}