package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AzureEventGridDestinationImpl implements AzureEventGridDestination {

    private String type;
    
    private String uri;
    
    private String accessKey;

    @JsonCreator
    AzureEventGridDestinationImpl(@JsonProperty("uri") final String uri, @JsonProperty("accessKey") final String accessKey) {
        this.uri = uri;
        this.accessKey = accessKey;
        this.type = "EventGrid";
    }
    public AzureEventGridDestinationImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getUri(){
        return this.uri;
    }
    
    
    public String getAccessKey(){
        return this.accessKey;
    }

    public void setUri(final String uri){
        this.uri = uri;
    }
    
    public void setAccessKey(final String accessKey){
        this.accessKey = accessKey;
    }

}