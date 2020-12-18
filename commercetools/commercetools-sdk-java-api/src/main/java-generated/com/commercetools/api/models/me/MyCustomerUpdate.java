package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerUpdateImpl;

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
@JsonDeserialize(as = MyCustomerUpdateImpl.class)
public interface MyCustomerUpdate extends com.commercetools.api.models.ResourceUpdate<MyCustomerUpdate, MyCustomerUpdateAction> {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyCustomerUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final MyCustomerUpdateAction ...actions);
    public void setActions(final List<MyCustomerUpdateAction> actions);

    public static MyCustomerUpdateImpl of(){
        return new MyCustomerUpdateImpl();
    }
    

    public static MyCustomerUpdateImpl of(final MyCustomerUpdate template) {
        MyCustomerUpdateImpl instance = new MyCustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withMyCustomerUpdate(Function<MyCustomerUpdate, T> helper) {
        return helper.apply(this);
    }
}