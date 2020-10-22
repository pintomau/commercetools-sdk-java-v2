package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.StagedOrderTransitionLineItemStateActionImpl;

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
@JsonDeserialize(as = StagedOrderTransitionLineItemStateActionImpl.class)
public interface StagedOrderTransitionLineItemStateAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();
    
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();
    
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();
    
    
    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    public void setLineItemId(final String lineItemId);
    
    public void setQuantity(final Long quantity);
    
    public void setFromState(final StateResourceIdentifier fromState);
    
    public void setToState(final StateResourceIdentifier toState);
    
    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    public static StagedOrderTransitionLineItemStateActionImpl of(){
        return new StagedOrderTransitionLineItemStateActionImpl();
    }
    

    public static StagedOrderTransitionLineItemStateActionImpl of(final StagedOrderTransitionLineItemStateAction template) {
        StagedOrderTransitionLineItemStateActionImpl instance = new StagedOrderTransitionLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    default <T extends Accessor<StagedOrderTransitionLineItemStateAction>> T withStagedOrderTransitionLineItemStateAction(Function<StagedOrderTransitionLineItemStateAction, T> helper) {
        return helper.apply(this);
    }
}
