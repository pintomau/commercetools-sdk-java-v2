
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.subscription.ChangeSubscription;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubscriptionSetChangesActionImpl implements SubscriptionSetChangesAction {

    private String action;

    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    @JsonCreator
    SubscriptionSetChangesActionImpl(
            @JsonProperty("changes") final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
        this.action = "setChanges";
    }

    public SubscriptionSetChangesActionImpl() {
        this.action = "setChanges";
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    public void setChanges(final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
    }

    public void setChanges(final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubscriptionSetChangesActionImpl that = (SubscriptionSetChangesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(changes, that.changes).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(changes).toHashCode();
    }

}