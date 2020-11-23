package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order_edit.OrderEditResult;
import com.commercetools.api.models.order_edit.StagedOrder;
import com.commercetools.api.models.order_edit.OrderEditPreviewSuccessImpl;

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
@JsonDeserialize(as = OrderEditPreviewSuccessImpl.class)
public interface OrderEditPreviewSuccess extends OrderEditResult {

    
    @NotNull
    @Valid
    @JsonProperty("preview")
    public StagedOrder getPreview();
    
    @NotNull
    @Valid
    @JsonProperty("messagePayloads")
    public List<MessagePayload> getMessagePayloads();

    public void setPreview(final StagedOrder preview);
    
    @JsonIgnore
    public void setMessagePayloads(final MessagePayload ...messagePayloads);
    public void setMessagePayloads(final List<MessagePayload> messagePayloads);

    public static OrderEditPreviewSuccessImpl of(){
        return new OrderEditPreviewSuccessImpl();
    }
    

    public static OrderEditPreviewSuccessImpl of(final OrderEditPreviewSuccess template) {
        OrderEditPreviewSuccessImpl instance = new OrderEditPreviewSuccessImpl();
        instance.setPreview(template.getPreview());
        instance.setMessagePayloads(template.getMessagePayloads());
        return instance;
    }

    default <T> T withOrderEditPreviewSuccess(Function<OrderEditPreviewSuccess, T> helper) {
        return helper.apply(this);
    }
}