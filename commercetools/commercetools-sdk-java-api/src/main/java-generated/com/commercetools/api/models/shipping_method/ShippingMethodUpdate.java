package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateImpl;

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
@JsonDeserialize(as = ShippingMethodUpdateImpl.class)
public interface ShippingMethodUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ShippingMethodUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final ShippingMethodUpdateAction ...actions);
    public void setActions(final List<ShippingMethodUpdateAction> actions);

    public static ShippingMethodUpdateImpl of(){
        return new ShippingMethodUpdateImpl();
    }
    

    public static ShippingMethodUpdateImpl of(final ShippingMethodUpdate template) {
        ShippingMethodUpdateImpl instance = new ShippingMethodUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withShippingMethodUpdate(Function<ShippingMethodUpdate, T> helper) {
        return helper.apply(this);
    }
}