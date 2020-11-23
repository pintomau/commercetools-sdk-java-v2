package com.commercetools.api.models.subscription;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.subscription.ChangeSubscription;
import com.commercetools.api.models.subscription.DeliveryFormat;
import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.MessageSubscription;
import com.commercetools.api.models.subscription.SubscriptionHealthStatus;
import java.time.ZonedDateTime;
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
public final class SubscriptionImpl implements Subscription {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;
    
    private com.commercetools.api.models.subscription.Destination destination;
    
    private String key;
    
    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;
    
    private com.commercetools.api.models.subscription.DeliveryFormat format;
    
    private com.commercetools.api.models.subscription.SubscriptionHealthStatus status;

    @JsonCreator
    SubscriptionImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("changes") final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes, @JsonProperty("destination") final com.commercetools.api.models.subscription.Destination destination, @JsonProperty("key") final String key, @JsonProperty("messages") final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages, @JsonProperty("format") final com.commercetools.api.models.subscription.DeliveryFormat format, @JsonProperty("status") final com.commercetools.api.models.subscription.SubscriptionHealthStatus status) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.changes = changes;
        this.destination = destination;
        this.key = key;
        this.messages = messages;
        this.format = format;
        this.status = status;
    }
    public SubscriptionImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges(){
        return this.changes;
    }
    
    
    public com.commercetools.api.models.subscription.Destination getDestination(){
        return this.destination;
    }
    
    
    public String getKey(){
        return this.key;
    }
    
    
    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages(){
        return this.messages;
    }
    
    
    public com.commercetools.api.models.subscription.DeliveryFormat getFormat(){
        return this.format;
    }
    
    
    public com.commercetools.api.models.subscription.SubscriptionHealthStatus getStatus(){
        return this.status;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    public void setChanges(final com.commercetools.api.models.subscription.ChangeSubscription ...changes){
       this.changes = new ArrayList<>(Arrays.asList(changes));
    }
    
    public void setChanges(final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes){
       this.changes = changes;
    }
    
    public void setDestination(final com.commercetools.api.models.subscription.Destination destination){
        this.destination = destination;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setMessages(final com.commercetools.api.models.subscription.MessageSubscription ...messages){
       this.messages = new ArrayList<>(Arrays.asList(messages));
    }
    
    public void setMessages(final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages){
       this.messages = messages;
    }
    
    public void setFormat(final com.commercetools.api.models.subscription.DeliveryFormat format){
        this.format = format;
    }
    
    public void setStatus(final com.commercetools.api.models.subscription.SubscriptionHealthStatus status){
        this.status = status;
    }

}