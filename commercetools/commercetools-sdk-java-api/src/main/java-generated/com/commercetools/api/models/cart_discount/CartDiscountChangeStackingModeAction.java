package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.StackingMode;
import com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeStackingModeActionImpl.class)
public interface CartDiscountChangeStackingModeAction extends CartDiscountUpdateAction {

    
    @NotNull
    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

    public void setStackingMode(final StackingMode stackingMode);

    public static CartDiscountChangeStackingModeActionImpl of(){
        return new CartDiscountChangeStackingModeActionImpl();
    }
    

    public static CartDiscountChangeStackingModeActionImpl of(final CartDiscountChangeStackingModeAction template) {
        CartDiscountChangeStackingModeActionImpl instance = new CartDiscountChangeStackingModeActionImpl();
        instance.setStackingMode(template.getStackingMode());
        return instance;
    }

    default <T> T withCartDiscountChangeStackingModeAction(Function<CartDiscountChangeStackingModeAction, T> helper) {
        return helper.apply(this);
    }
}