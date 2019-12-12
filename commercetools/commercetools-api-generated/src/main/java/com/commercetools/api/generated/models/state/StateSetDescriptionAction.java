package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.state.StateUpdateAction;
import com.commercetools.api.generated.models.state.StateSetDescriptionActionImpl;

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
@JsonDeserialize(as = StateSetDescriptionActionImpl.class)
public interface StateSetDescriptionAction extends StateUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static StateSetDescriptionActionImpl of(){
      return new StateSetDescriptionActionImpl();
   }
   

   public static StateSetDescriptionActionImpl of(final StateSetDescriptionAction template) {
      StateSetDescriptionActionImpl instance = new StateSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}