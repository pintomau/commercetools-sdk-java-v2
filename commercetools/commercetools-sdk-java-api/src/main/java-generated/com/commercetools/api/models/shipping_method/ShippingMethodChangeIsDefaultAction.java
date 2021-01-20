
package com.commercetools.api.models.shipping_method;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionImpl;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeIsDefaultActionImpl.class)
public interface ShippingMethodChangeIsDefaultAction extends ShippingMethodUpdateAction {

    /**
    *  <p>Only one ShippingMethod in a project can be default.</p>
    */
    @NotNull
    @JsonProperty("isDefault")
    public Boolean getIsDefault();

    public void setIsDefault(final Boolean isDefault);

    public static ShippingMethodChangeIsDefaultAction of() {
        return new ShippingMethodChangeIsDefaultActionImpl();
    }

    public static ShippingMethodChangeIsDefaultAction of(final ShippingMethodChangeIsDefaultAction template) {
        ShippingMethodChangeIsDefaultActionImpl instance = new ShippingMethodChangeIsDefaultActionImpl();
        instance.setIsDefault(template.getIsDefault());
        return instance;
    }

    public static ShippingMethodChangeIsDefaultActionBuilder builder() {
        return ShippingMethodChangeIsDefaultActionBuilder.of();
    }

    public static ShippingMethodChangeIsDefaultActionBuilder builder(
            final ShippingMethodChangeIsDefaultAction template) {
        return ShippingMethodChangeIsDefaultActionBuilder.of(template);
    }

    default <T> T withShippingMethodChangeIsDefaultAction(Function<ShippingMethodChangeIsDefaultAction, T> helper) {
        return helper.apply(this);
    }
}
