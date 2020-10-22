package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.commercetools.api.models.message.OrderEditAppliedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditAppliedMessagePayloadImpl.class)
public interface OrderEditAppliedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("edit")
    public OrderEditReference getEdit();
    
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditApplied getResult();

    public void setEdit(final OrderEditReference edit);
    
    public void setResult(final OrderEditApplied result);

    public static OrderEditAppliedMessagePayloadImpl of(){
        return new OrderEditAppliedMessagePayloadImpl();
    }
    

    public static OrderEditAppliedMessagePayloadImpl of(final OrderEditAppliedMessagePayload template) {
        OrderEditAppliedMessagePayloadImpl instance = new OrderEditAppliedMessagePayloadImpl();
        instance.setEdit(template.getEdit());
        instance.setResult(template.getResult());
        return instance;
    }

    default <T extends Accessor<OrderEditAppliedMessagePayload>> T withOrderEditAppliedMessagePayload(Function<OrderEditAppliedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
