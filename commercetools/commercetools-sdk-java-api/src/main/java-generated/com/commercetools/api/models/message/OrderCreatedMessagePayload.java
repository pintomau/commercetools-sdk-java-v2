package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.message.OrderCreatedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderCreatedMessagePayloadImpl.class)
public interface OrderCreatedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderCreatedMessagePayloadImpl of(){
        return new OrderCreatedMessagePayloadImpl();
    }
    

    public static OrderCreatedMessagePayloadImpl of(final OrderCreatedMessagePayload template) {
        OrderCreatedMessagePayloadImpl instance = new OrderCreatedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    default <T> T withOrderCreatedMessagePayload(Function<OrderCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}