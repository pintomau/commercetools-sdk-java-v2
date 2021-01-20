
package com.commercetools.api.models.product;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductVariantChannelAvailability;
import com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantChannelAvailabilityMapBuilder {

    private Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values;

    public ProductVariantChannelAvailabilityMapBuilder values(
            final Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values) {
        this.values = values;
        return this;
    }

    public ProductVariantChannelAvailabilityMapBuilder addValue(final String key,
            final com.commercetools.api.models.product.ProductVariantChannelAvailability value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> getValues() {
        return this.values;
    }

    public ProductVariantChannelAvailabilityMap build() {
        return new ProductVariantChannelAvailabilityMapImpl(values);
    }

    public static ProductVariantChannelAvailabilityMapBuilder of() {
        return new ProductVariantChannelAvailabilityMapBuilder();
    }

    public static ProductVariantChannelAvailabilityMapBuilder of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapBuilder builder = new ProductVariantChannelAvailabilityMapBuilder();
        builder.values = template.values();
        return builder;
    }

}