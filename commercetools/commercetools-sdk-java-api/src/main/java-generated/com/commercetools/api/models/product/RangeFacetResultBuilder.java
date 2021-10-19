
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RangeFacetResultBuilder implements Builder<RangeFacetResult> {

    private java.util.List<com.commercetools.api.models.product.FacetResultRange> ranges;

    public RangeFacetResultBuilder ranges(final com.commercetools.api.models.product.FacetResultRange... ranges) {
        this.ranges = new ArrayList<>(Arrays.asList(ranges));
        return this;
    }

    public RangeFacetResultBuilder withRanges(
            Function<com.commercetools.api.models.product.FacetResultRangeBuilder, com.commercetools.api.models.product.FacetResultRangeBuilder> builder) {
        this.ranges = new ArrayList<>();
        this.ranges.add(builder.apply(com.commercetools.api.models.product.FacetResultRangeBuilder.of()).build());
        return this;
    }

    public RangeFacetResultBuilder plusRanges(
            Function<com.commercetools.api.models.product.FacetResultRangeBuilder, com.commercetools.api.models.product.FacetResultRangeBuilder> builder) {
        if (this.ranges == null) {
            this.ranges = new ArrayList<>();
        }
        this.ranges.add(builder.apply(com.commercetools.api.models.product.FacetResultRangeBuilder.of()).build());
        return this;
    }

    public RangeFacetResultBuilder ranges(
            final java.util.List<com.commercetools.api.models.product.FacetResultRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    public java.util.List<com.commercetools.api.models.product.FacetResultRange> getRanges() {
        return this.ranges;
    }

    public RangeFacetResult build() {
        Objects.requireNonNull(ranges, RangeFacetResult.class + ": ranges is missing");
        return new RangeFacetResultImpl(ranges);
    }

    /**
     * builds RangeFacetResult without checking for non null required values
     */
    public RangeFacetResult buildUnchecked() {
        return new RangeFacetResultImpl(ranges);
    }

    public static RangeFacetResultBuilder of() {
        return new RangeFacetResultBuilder();
    }

    public static RangeFacetResultBuilder of(final RangeFacetResult template) {
        RangeFacetResultBuilder builder = new RangeFacetResultBuilder();
        builder.ranges = template.getRanges();
        return builder;
    }

}
