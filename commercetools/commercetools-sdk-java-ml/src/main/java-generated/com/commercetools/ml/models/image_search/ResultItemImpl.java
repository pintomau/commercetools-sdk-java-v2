
package com.commercetools.ml.models.image_search;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.ProductVariant;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>An image URL and the product variants it is contained in. If no matching images are found, ResultItem is not present.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResultItemImpl implements ResultItem {

    private String imageUrl;

    private java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants;

    @JsonCreator
    ResultItemImpl(@JsonProperty("imageUrl") final String imageUrl,
            @JsonProperty("productVariants") final java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants) {
        this.imageUrl = imageUrl;
        this.productVariants = productVariants;
    }

    public ResultItemImpl() {
    }

    /**
    *  <p>The URL of the image.</p>
    */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
    *  <p>An array of product variants containing the image URL.</p>
    */
    public java.util.List<com.commercetools.ml.models.common.ProductVariant> getProductVariants() {
        return this.productVariants;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setProductVariants(final com.commercetools.ml.models.common.ProductVariant... productVariants) {
        this.productVariants = new ArrayList<>(Arrays.asList(productVariants));
    }

    public void setProductVariants(
            final java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants) {
        this.productVariants = productVariants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ResultItemImpl that = (ResultItemImpl) o;

        return new EqualsBuilder().append(imageUrl, that.imageUrl).append(productVariants,
            that.productVariants).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(imageUrl).append(productVariants).toHashCode();
    }

}
