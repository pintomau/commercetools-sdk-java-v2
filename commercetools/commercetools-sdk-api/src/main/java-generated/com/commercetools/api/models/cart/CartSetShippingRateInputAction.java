package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.cart.CartSetShippingRateInputActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetShippingRateInputActionImpl.class)
public interface CartSetShippingRateInputAction extends CartUpdateAction {

    /**
    *  <p>Based on the definition of ShippingRateInputType.
    *  If CartClassification is defined, it must be ClassificationShippingRateInput.
    *  If CartScore is defined, it must be ScoreShippingRateInput.
    *  Otherwise it can not bet set.</p>
    */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public static CartSetShippingRateInputActionImpl of(){
        return new CartSetShippingRateInputActionImpl();
    }
    

    public static CartSetShippingRateInputActionImpl of(final CartSetShippingRateInputAction template) {
        CartSetShippingRateInputActionImpl instance = new CartSetShippingRateInputActionImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        return instance;
    }

}