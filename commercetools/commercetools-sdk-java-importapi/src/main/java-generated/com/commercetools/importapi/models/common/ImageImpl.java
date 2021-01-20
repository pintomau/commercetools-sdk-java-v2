
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.AssetDimensions;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImageImpl implements Image {

    private String url;

    private com.commercetools.importapi.models.common.AssetDimensions dimensions;

    private String label;

    @JsonCreator
    ImageImpl(@JsonProperty("url") final String url,
            @JsonProperty("dimensions") final com.commercetools.importapi.models.common.AssetDimensions dimensions,
            @JsonProperty("label") final String label) {
        this.url = url;
        this.dimensions = dimensions;
        this.label = label;
    }

    public ImageImpl() {
    }

    public String getUrl() {
        return this.url;
    }

    public com.commercetools.importapi.models.common.AssetDimensions getDimensions() {
        return this.dimensions;
    }

    public String getLabel() {
        return this.label;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setDimensions(final com.commercetools.importapi.models.common.AssetDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImageImpl that = (ImageImpl) o;

        return new EqualsBuilder().append(url, that.url).append(dimensions, that.dimensions).append(label,
            that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(url).append(dimensions).append(label).toHashCode();
    }

}