package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.AzureEventGridDestination;
import com.commercetools.api.models.subscription.AzureServiceBusDestination;
import com.commercetools.api.models.subscription.GoogleCloudPubSubDestination;
import com.commercetools.api.models.subscription.IronMqDestination;
import com.commercetools.api.models.subscription.SnsDestination;
import com.commercetools.api.models.subscription.SqsDestination;
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
public final class DestinationImpl implements Destination {

    private String type;

    @JsonCreator
    DestinationImpl() {
        this.type = "null";
    }
    

    
    public String getType(){
        return this.type;
    }


}