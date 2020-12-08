package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
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
public final class SubscriptionUpdateImpl implements SubscriptionUpdate {

    private Long version;
    
    private java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> actions;

    @JsonCreator
    SubscriptionUpdateImpl(@JsonProperty("version") final Long version, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }
    public SubscriptionUpdateImpl() {
    }

    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> getActions(){
        return this.actions;
    }

    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setActions(final com.commercetools.api.models.subscription.SubscriptionUpdateAction ...actions){
       this.actions = new ArrayList<>(Arrays.asList(actions));
    }
    
    public void setActions(final java.util.List<com.commercetools.api.models.subscription.SubscriptionUpdateAction> actions){
       this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SubscriptionUpdateImpl that = (SubscriptionUpdateImpl) o;
    
        return new EqualsBuilder()
                .append(version, that.version)
                .append(actions, that.actions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(version)
            .append(actions)
            .toHashCode();
    }

}
