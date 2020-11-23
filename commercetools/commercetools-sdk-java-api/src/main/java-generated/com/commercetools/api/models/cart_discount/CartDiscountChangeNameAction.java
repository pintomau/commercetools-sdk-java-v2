package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.cart_discount.CartDiscountChangeNameActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeNameActionImpl.class)
public interface CartDiscountChangeNameAction extends CartDiscountUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static CartDiscountChangeNameActionImpl of(){
        return new CartDiscountChangeNameActionImpl();
    }
    

    public static CartDiscountChangeNameActionImpl of(final CartDiscountChangeNameAction template) {
        CartDiscountChangeNameActionImpl instance = new CartDiscountChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    default <T> T withCartDiscountChangeNameAction(Function<CartDiscountChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}