
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CategorySlugChangedMessagePayloadImpl implements CategorySlugChangedMessagePayload {

    private String type;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.common.LocalizedString oldSlug;

    @JsonCreator
    CategorySlugChangedMessagePayloadImpl(
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("oldSlug") final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.slug = slug;
        this.oldSlug = oldSlug;
        this.type = CATEGORY_SLUG_CHANGED;
    }

    public CategorySlugChangedMessagePayloadImpl() {
        this.type = CATEGORY_SLUG_CHANGED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public com.commercetools.api.models.common.LocalizedString getOldSlug() {
        return this.oldSlug;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setOldSlug(final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.oldSlug = oldSlug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySlugChangedMessagePayloadImpl that = (CategorySlugChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(slug, that.slug)
                .append(oldSlug, that.oldSlug)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(slug).append(oldSlug).toHashCode();
    }

}
