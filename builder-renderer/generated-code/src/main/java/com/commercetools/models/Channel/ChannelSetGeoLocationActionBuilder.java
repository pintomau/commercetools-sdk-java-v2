package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Channel.ChannelSetGeoLocationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelSetGeoLocationActionBuilder {
   
   @Nullable
   private java.lang.Object geoLocation;
   
   public ChannelSetGeoLocationActionBuilder geoLocation(@Nullable final java.lang.Object geoLocation) {
      this.geoLocation = geoLocation;
      return this;
   }
   
   @Nullable
   public java.lang.Object getGeoLocation(){
      return this.geoLocation;
   }

   public ChannelSetGeoLocationAction build() {
       return new ChannelSetGeoLocationActionImpl(geoLocation);
   }
   
   public static ChannelSetGeoLocationActionBuilder of() {
      return new ChannelSetGeoLocationActionBuilder();
   }
   
   public static ChannelSetGeoLocationActionBuilder of(final ChannelSetGeoLocationAction template) {
      ChannelSetGeoLocationActionBuilder builder = new ChannelSetGeoLocationActionBuilder();
      builder.geoLocation = template.getGeoLocation();
      return builder;
   }
   
}