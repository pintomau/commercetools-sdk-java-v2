package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetKeyActionImpl;

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
@JsonDeserialize(as = ShippingMethodSetKeyActionImpl.class)
public interface ShippingMethodSetKeyAction extends ShippingMethodUpdateAction {

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, it is removed if it exists.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ShippingMethodSetKeyActionImpl of(){
        return new ShippingMethodSetKeyActionImpl();
    }
    

    public static ShippingMethodSetKeyActionImpl of(final ShippingMethodSetKeyAction template) {
        ShippingMethodSetKeyActionImpl instance = new ShippingMethodSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withShippingMethodSetKeyAction(Function<ShippingMethodSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}