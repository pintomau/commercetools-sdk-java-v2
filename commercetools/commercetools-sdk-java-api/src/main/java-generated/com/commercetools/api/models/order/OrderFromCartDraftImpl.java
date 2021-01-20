
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderFromCartDraftImpl implements OrderFromCartDraft {

    private String id;

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long version;

    private String orderNumber;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @JsonCreator
    OrderFromCartDraftImpl(@JsonProperty("id") final String id,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartResourceIdentifier cart,
            @JsonProperty("version") final Long version, @JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.id = id;
        this.cart = cart;
        this.version = version;
        this.orderNumber = orderNumber;
        this.paymentState = paymentState;
        this.shipmentState = shipmentState;
        this.orderState = orderState;
        this.state = state;
    }

    public OrderFromCartDraftImpl() {
    }

    /**
    *  <p>The unique id of the cart from which an order is created.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>ResourceIdentifier to the Cart from which this order is created.</p>
    */
    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>String that uniquely identifies an order.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the order.
    *  It should be unique across a project.
    *  Once it's set it cannot be changed.
    *  For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
    */
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
    *  <p>Order will be created with <code>Open</code> status by default.</p>
    */
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderFromCartDraftImpl that = (OrderFromCartDraftImpl) o;

        return new EqualsBuilder().append(id, that.id).append(cart, that.cart).append(version, that.version).append(
            orderNumber, that.orderNumber).append(paymentState, that.paymentState).append(shipmentState,
                that.shipmentState).append(orderState, that.orderState).append(state, that.state).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(cart).append(version).append(orderNumber).append(
            paymentState).append(shipmentState).append(orderState).append(state).toHashCode();
    }

}
