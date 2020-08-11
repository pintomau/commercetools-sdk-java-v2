package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelChangeDescriptionActionImpl implements ChannelChangeDescriptionAction {

   private String action;

   private com.commercetools.api.models.common.LocalizedString description;

   @JsonCreator
   ChannelChangeDescriptionActionImpl(@JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
      this.description = description;
      this.action = "changeDescription";
   }
   public ChannelChangeDescriptionActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }

   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }

}
