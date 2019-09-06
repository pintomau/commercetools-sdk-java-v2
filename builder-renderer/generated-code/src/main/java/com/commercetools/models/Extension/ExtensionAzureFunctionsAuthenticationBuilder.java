package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionAzureFunctionsAuthentication;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionAzureFunctionsAuthenticationBuilder {
   
   
   private java.lang.String key;
   
   public ExtensionAzureFunctionsAuthenticationBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public ExtensionAzureFunctionsAuthentication build() {
       return new ExtensionAzureFunctionsAuthenticationImpl(key);
   }
   
   public static ExtensionAzureFunctionsAuthenticationBuilder of() {
      return new ExtensionAzureFunctionsAuthenticationBuilder();
   }
   
   public static ExtensionAzureFunctionsAuthenticationBuilder of(final ExtensionAzureFunctionsAuthentication template) {
      ExtensionAzureFunctionsAuthenticationBuilder builder = new ExtensionAzureFunctionsAuthenticationBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}