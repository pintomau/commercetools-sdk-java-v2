package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
import com.commercetools.api.generated.models.extension.ExtensionUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = ExtensionUpdateImpl.class)
public interface ExtensionUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ExtensionUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ExtensionUpdateAction> actions);
   
   public static ExtensionUpdateImpl of(){
      return new ExtensionUpdateImpl();
   }
   

   public static ExtensionUpdateImpl of(final ExtensionUpdate template) {
      ExtensionUpdateImpl instance = new ExtensionUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}