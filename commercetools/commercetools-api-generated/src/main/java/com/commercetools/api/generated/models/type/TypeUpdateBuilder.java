package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.TypeUpdateAction;
import com.commercetools.api.generated.models.type.TypeUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.type.TypeUpdateAction> actions;
   
   
   private Long version;
   
   public TypeUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.type.TypeUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public TypeUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.TypeUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public TypeUpdate build() {
       return new TypeUpdateImpl(actions, version);
   }
   
   public static TypeUpdateBuilder of() {
      return new TypeUpdateBuilder();
   }
   
   public static TypeUpdateBuilder of(final TypeUpdate template) {
      TypeUpdateBuilder builder = new TypeUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}