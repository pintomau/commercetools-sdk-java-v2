
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.AssetSource;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetAssetSourcesActionImpl implements CategorySetAssetSourcesAction {

    private String action;

    private String assetId;

    private String assetKey;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    @JsonCreator
    CategorySetAssetSourcesActionImpl(@JsonProperty("assetId") final String assetId,
            @JsonProperty("assetKey") final String assetKey,
            @JsonProperty("sources") final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.sources = sources;
        this.action = SET_ASSET_SOURCES;
    }

    public CategorySetAssetSourcesActionImpl() {
        this.action = SET_ASSET_SOURCES;
    }

    public String getAction() {
        return this.action;
    }

    public String getAssetId() {
        return this.assetId;
    }

    public String getAssetKey() {
        return this.assetKey;
    }

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setAssetKey(final String assetKey) {
        this.assetKey = assetKey;
    }

    public void setSources(final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
    }

    public void setSources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetAssetSourcesActionImpl that = (CategorySetAssetSourcesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(assetId, that.assetId).append(assetKey,
            that.assetKey).append(sources, that.sources).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(assetId).append(assetKey).append(sources).toHashCode();
    }

}
