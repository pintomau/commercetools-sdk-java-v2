package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionImpl;

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
@JsonDeserialize(as = OrderEditAddStagedActionActionImpl.class)
public interface OrderEditAddStagedActionAction extends OrderEditUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("stagedAction")
    public StagedOrderUpdateAction getStagedAction();

    public void setStagedAction(final StagedOrderUpdateAction stagedAction);

    public static OrderEditAddStagedActionActionImpl of(){
        return new OrderEditAddStagedActionActionImpl();
    }
    

    public static OrderEditAddStagedActionActionImpl of(final OrderEditAddStagedActionAction template) {
        OrderEditAddStagedActionActionImpl instance = new OrderEditAddStagedActionActionImpl();
        instance.setStagedAction(template.getStagedAction());
        return instance;
    }

    default <T> T withOrderEditAddStagedActionAction(Function<OrderEditAddStagedActionAction, T> helper) {
        return helper.apply(this);
    }
}