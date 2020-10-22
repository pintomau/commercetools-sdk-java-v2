package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ItemShippingTarget;
import com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl;

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
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft  {

    /**
    *  <p>Used to capture one or more (custom) line item specific shipping addresses.
    *  By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item.
    *  A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item.
    *  For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    public void setTargets(final List<ItemShippingTarget> targets);

    public static ItemShippingDetailsDraftImpl of(){
        return new ItemShippingDetailsDraftImpl();
    }
    

    public static ItemShippingDetailsDraftImpl of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(template.getTargets());
        return instance;
    }

    default <T extends Accessor<ItemShippingDetailsDraft>> T withItemShippingDetailsDraft(Function<ItemShippingDetailsDraft, T> helper) {
        return helper.apply(this);
    }
}
