package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Channel.ChannelSetGeoLocationActionImpl;

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
@JsonDeserialize(as = ChannelSetGeoLocationActionImpl.class)
public interface ChannelSetGeoLocationAction extends ChannelUpdateAction {

   
   
   @JsonProperty("geoLocation")
   public Object getGeoLocation();

   public void setGeoLocation(final Object geoLocation);
   
   public static ChannelSetGeoLocationActionImpl of(){
      return new ChannelSetGeoLocationActionImpl();
   }
   

   public static ChannelSetGeoLocationActionImpl of(final ChannelSetGeoLocationAction template) {
      ChannelSetGeoLocationActionImpl instance = new ChannelSetGeoLocationActionImpl();
      instance.setGeoLocation(template.getGeoLocation());
      return instance;
   }

}