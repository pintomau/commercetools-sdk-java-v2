
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLineItemDiscountSetMessagePayloadImpl implements OrderLineItemDiscountSetMessagePayload {

    private String type;

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.common.Money totalPrice;

    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    @JsonCreator
    OrderLineItemDiscountSetMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.lineItemId = lineItemId;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.type = "OrderLineItemDiscountSet";
    }

    public OrderLineItemDiscountSetMessagePayloadImpl() {
        this.type = "OrderLineItemDiscountSet";
    }

    public String getType() {
        return this.type;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLineItemDiscountSetMessagePayloadImpl that = (OrderLineItemDiscountSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(lineItemId, that.lineItemId).append(
            discountedPricePerQuantity, that.discountedPricePerQuantity).append(totalPrice, that.totalPrice).append(
                taxedPrice, that.taxedPrice).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(lineItemId).append(discountedPricePerQuantity).append(
            totalPrice).append(taxedPrice).toHashCode();
    }

}
