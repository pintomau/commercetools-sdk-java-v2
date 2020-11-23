package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartAddDiscountCodeActionImpl;

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
@JsonDeserialize(as = MyCartAddDiscountCodeActionImpl.class)
public interface MyCartAddDiscountCodeAction extends MyCartUpdateAction {

    
    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static MyCartAddDiscountCodeActionImpl of(){
        return new MyCartAddDiscountCodeActionImpl();
    }
    

    public static MyCartAddDiscountCodeActionImpl of(final MyCartAddDiscountCodeAction template) {
        MyCartAddDiscountCodeActionImpl instance = new MyCartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    default <T> T withMyCartAddDiscountCodeAction(Function<MyCartAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }
}