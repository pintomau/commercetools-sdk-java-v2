package com.commercetools.api.models.subscription;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import com.commercetools.api.models.subscription.MessageDelivery;
import com.commercetools.api.models.subscription.ResourceCreatedDelivery;
import com.commercetools.api.models.subscription.ResourceDeletedDelivery;
import com.commercetools.api.models.subscription.ResourceUpdatedDelivery;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionDeliveryImpl implements SubscriptionDelivery {

    private String projectKey;
    
    private String notificationType;
    
    private com.commercetools.api.models.common.Reference resource;
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    @JsonCreator
    SubscriptionDeliveryImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("notificationType") final String notificationType, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.projectKey = projectKey;
        this.notificationType = notificationType;
        this.resource = resource;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }
    public SubscriptionDeliveryImpl() {
    }

    
    public String getProjectKey(){
        return this.projectKey;
    }
    
    
    public String getNotificationType(){
        return this.notificationType;
    }
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }

    public void setProjectKey(final String projectKey){
        this.projectKey = projectKey;
    }
    
    public void setResource(final com.commercetools.api.models.common.Reference resource){
        this.resource = resource;
    }
    
    public void setResourceUserProvidedIdentifiers(final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SubscriptionDeliveryImpl that = (SubscriptionDeliveryImpl) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(notificationType, that.notificationType)
                .append(resource, that.resource)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(notificationType)
            .append(resource)
            .append(resourceUserProvidedIdentifiers)
            .toHashCode();
    }

}
