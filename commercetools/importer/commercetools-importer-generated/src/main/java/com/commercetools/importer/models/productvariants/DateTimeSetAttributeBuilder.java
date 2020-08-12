package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import java.time.ZonedDateTime;
import com.commercetools.importer.models.productvariants.DateTimeSetAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DateTimeSetAttributeBuilder {
   
   @Nullable
   private String name;
   
   
   private java.util.List<java.time.ZonedDateTime> value;
   
   public DateTimeSetAttributeBuilder name(@Nullable final String name) {
      this.name = name;
      return this;
   }
   
   public DateTimeSetAttributeBuilder value( final java.util.List<java.time.ZonedDateTime> value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public String getName(){
      return this.name;
   }
   
   
   public java.util.List<java.time.ZonedDateTime> getValue(){
      return this.value;
   }

   public DateTimeSetAttribute build() {
       return new DateTimeSetAttributeImpl(name, value);
   }
   
   public static DateTimeSetAttributeBuilder of() {
      return new DateTimeSetAttributeBuilder();
   }
   
   public static DateTimeSetAttributeBuilder of(final DateTimeSetAttribute template) {
      DateTimeSetAttributeBuilder builder = new DateTimeSetAttributeBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}