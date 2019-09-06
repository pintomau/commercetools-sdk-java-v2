package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.Destination;
import java.lang.String;
import com.commercetools.models.Subscription.GoogleCloudPubSubDestinationImpl;

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
@JsonDeserialize(as = GoogleCloudPubSubDestinationImpl.class)
public interface GoogleCloudPubSubDestination extends Destination {

   
   @NotNull
   @JsonProperty("projectId")
   public String getProjectId();
   
   @NotNull
   @JsonProperty("topic")
   public String getTopic();

   public void setProjectId(final String projectId);
   
   public void setTopic(final String topic);
   
   public static GoogleCloudPubSubDestinationImpl of(){
      return new GoogleCloudPubSubDestinationImpl();
   }
   

   public static GoogleCloudPubSubDestinationImpl of(final GoogleCloudPubSubDestination template) {
      GoogleCloudPubSubDestinationImpl instance = new GoogleCloudPubSubDestinationImpl();
      instance.setTopic(template.getTopic());
      instance.setProjectId(template.getProjectId());
      return instance;
   }

}