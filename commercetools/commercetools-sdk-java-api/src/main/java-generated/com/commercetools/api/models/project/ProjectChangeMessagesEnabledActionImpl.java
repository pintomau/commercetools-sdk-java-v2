
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeMessagesEnabledActionImpl implements ProjectChangeMessagesEnabledAction {

    private String action;

    private Boolean messagesEnabled;

    @JsonCreator
    ProjectChangeMessagesEnabledActionImpl(@JsonProperty("messagesEnabled") final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
        this.action = "changeMessagesEnabled";
    }

    public ProjectChangeMessagesEnabledActionImpl() {
        this.action = "changeMessagesEnabled";
    }

    public String getAction() {
        return this.action;
    }

    public Boolean getMessagesEnabled() {
        return this.messagesEnabled;
    }

    public void setMessagesEnabled(final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeMessagesEnabledActionImpl that = (ProjectChangeMessagesEnabledActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(messagesEnabled, that.messagesEnabled).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(messagesEnabled).toHashCode();
    }

}