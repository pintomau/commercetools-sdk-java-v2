
package com.commercetools.importapi.models.orders;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.DiscountedLineItemPortion;
import com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPriceDraftBuilder {

    private com.commercetools.importapi.models.common.Money value;

    private java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> includedDiscounts;

    public DiscountedLineItemPriceDraftBuilder value(final com.commercetools.importapi.models.common.Money value) {
        this.value = value;
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final com.commercetools.importapi.models.orders.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    public com.commercetools.importapi.models.common.Money getValue() {
        return this.value;
    }

    public java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    public DiscountedLineItemPriceDraft build() {
        return new DiscountedLineItemPriceDraftImpl(value, includedDiscounts);
    }

    public static DiscountedLineItemPriceDraftBuilder of() {
        return new DiscountedLineItemPriceDraftBuilder();
    }

    public static DiscountedLineItemPriceDraftBuilder of(final DiscountedLineItemPriceDraft template) {
        DiscountedLineItemPriceDraftBuilder builder = new DiscountedLineItemPriceDraftBuilder();
        builder.value = template.getValue();
        builder.includedDiscounts = template.getIncludedDiscounts();
        return builder;
    }

}