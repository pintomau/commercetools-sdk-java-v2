package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionTrigger;
import com.commercetools.models.Extension.ExtensionUpdateAction;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionChangeTriggersActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionChangeTriggersActionImpl.class)
public interface ExtensionChangeTriggersAction extends ExtensionUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("triggers")
   public List<ExtensionTrigger> getTriggers();

   public void setTriggers(final List<ExtensionTrigger> triggers);
   
   public static ExtensionChangeTriggersActionImpl of(){
      return new ExtensionChangeTriggersActionImpl();
   }
   

   public static ExtensionChangeTriggersActionImpl of(final ExtensionChangeTriggersAction template) {
      ExtensionChangeTriggersActionImpl instance = new ExtensionChangeTriggersActionImpl();
      instance.setTriggers(template.getTriggers());
      return instance;
   }

}