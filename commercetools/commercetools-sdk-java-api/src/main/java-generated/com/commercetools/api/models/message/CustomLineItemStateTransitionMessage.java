package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.CustomLineItemStateTransitionMessageImpl;

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
@JsonDeserialize(as = CustomLineItemStateTransitionMessageImpl.class)
public interface CustomLineItemStateTransitionMessage extends Message {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @JsonProperty("transitionDate")
    public ZonedDateTime getTransitionDate();
    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();
    
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();
    
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setTransitionDate(final ZonedDateTime transitionDate);
    
    public void setQuantity(final Long quantity);
    
    public void setFromState(final StateReference fromState);
    
    public void setToState(final StateReference toState);

    public static CustomLineItemStateTransitionMessageImpl of(){
        return new CustomLineItemStateTransitionMessageImpl();
    }
    

    public static CustomLineItemStateTransitionMessageImpl of(final CustomLineItemStateTransitionMessage template) {
        CustomLineItemStateTransitionMessageImpl instance = new CustomLineItemStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    default <T extends Accessor<CustomLineItemStateTransitionMessage>> T withCustomLineItemStateTransitionMessage(Function<CustomLineItemStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
}
