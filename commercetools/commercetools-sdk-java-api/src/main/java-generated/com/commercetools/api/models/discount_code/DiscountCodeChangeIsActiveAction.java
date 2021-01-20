
package com.commercetools.api.models.discount_code;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionImpl;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeChangeIsActiveActionImpl.class)
public interface DiscountCodeChangeIsActiveAction extends DiscountCodeUpdateAction {

    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    public void setIsActive(final Boolean isActive);

    public static DiscountCodeChangeIsActiveAction of() {
        return new DiscountCodeChangeIsActiveActionImpl();
    }

    public static DiscountCodeChangeIsActiveAction of(final DiscountCodeChangeIsActiveAction template) {
        DiscountCodeChangeIsActiveActionImpl instance = new DiscountCodeChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    public static DiscountCodeChangeIsActiveActionBuilder builder() {
        return DiscountCodeChangeIsActiveActionBuilder.of();
    }

    public static DiscountCodeChangeIsActiveActionBuilder builder(final DiscountCodeChangeIsActiveAction template) {
        return DiscountCodeChangeIsActiveActionBuilder.of(template);
    }

    default <T> T withDiscountCodeChangeIsActiveAction(Function<DiscountCodeChangeIsActiveAction, T> helper) {
        return helper.apply(this);
    }
}
