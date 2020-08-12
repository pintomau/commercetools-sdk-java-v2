package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeUpdateImpl.class)
public interface TypeUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<TypeUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<TypeUpdateAction> actions);
   
   public static TypeUpdateImpl of(){
      return new TypeUpdateImpl();
   }
   

   public static TypeUpdateImpl of(final TypeUpdate template) {
      TypeUpdateImpl instance = new TypeUpdateImpl();
      instance.setVersion(template.getVersion());
      instance.setActions(template.getActions());
      return instance;
   }

}