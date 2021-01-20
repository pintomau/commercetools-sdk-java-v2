
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaskTokenImpl implements TaskToken {

    private String taskId;

    private String uriPath;

    @JsonCreator
    TaskTokenImpl(@JsonProperty("taskId") final String taskId, @JsonProperty("uriPath") final String uriPath) {
        this.taskId = taskId;
        this.uriPath = uriPath;
    }

    public TaskTokenImpl() {
    }

    /**
    *  <p>The ID for the task. Used to find the status of the task.</p>
    */
    public String getTaskId() {
        return this.taskId;
    }

    /**
    *  <p>The URI path to poll for the status of the task.</p>
    */
    public String getUriPath() {
        return this.uriPath;
    }

    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    public void setUriPath(final String uriPath) {
        this.uriPath = uriPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaskTokenImpl that = (TaskTokenImpl) o;

        return new EqualsBuilder().append(taskId, that.taskId).append(uriPath, that.uriPath).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(taskId).append(uriPath).toHashCode();
    }

}
