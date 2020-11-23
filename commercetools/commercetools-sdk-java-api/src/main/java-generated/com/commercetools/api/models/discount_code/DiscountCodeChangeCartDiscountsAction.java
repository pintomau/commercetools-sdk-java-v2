package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsActionImpl;

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
@JsonDeserialize(as = DiscountCodeChangeCartDiscountsActionImpl.class)
public interface DiscountCodeChangeCartDiscountsAction extends DiscountCodeUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountResourceIdentifier> getCartDiscounts();

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountResourceIdentifier ...cartDiscounts);
    public void setCartDiscounts(final List<CartDiscountResourceIdentifier> cartDiscounts);

    public static DiscountCodeChangeCartDiscountsActionImpl of(){
        return new DiscountCodeChangeCartDiscountsActionImpl();
    }
    

    public static DiscountCodeChangeCartDiscountsActionImpl of(final DiscountCodeChangeCartDiscountsAction template) {
        DiscountCodeChangeCartDiscountsActionImpl instance = new DiscountCodeChangeCartDiscountsActionImpl();
        instance.setCartDiscounts(template.getCartDiscounts());
        return instance;
    }

    default <T> T withDiscountCodeChangeCartDiscountsAction(Function<DiscountCodeChangeCartDiscountsAction, T> helper) {
        return helper.apply(this);
    }
}