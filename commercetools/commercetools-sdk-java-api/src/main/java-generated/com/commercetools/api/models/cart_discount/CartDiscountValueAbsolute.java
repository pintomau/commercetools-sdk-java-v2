package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteImpl;

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
@JsonDeserialize(as = CartDiscountValueAbsoluteImpl.class)
public interface CartDiscountValueAbsolute extends CartDiscountValue {

    
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<TypedMoney> getMoney();

    @JsonIgnore
    public void setMoney(final TypedMoney ...money);
    public void setMoney(final List<TypedMoney> money);

    public static CartDiscountValueAbsoluteImpl of(){
        return new CartDiscountValueAbsoluteImpl();
    }
    

    public static CartDiscountValueAbsoluteImpl of(final CartDiscountValueAbsolute template) {
        CartDiscountValueAbsoluteImpl instance = new CartDiscountValueAbsoluteImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    default <T> T withCartDiscountValueAbsolute(Function<CartDiscountValueAbsolute, T> helper) {
        return helper.apply(this);
    }
}