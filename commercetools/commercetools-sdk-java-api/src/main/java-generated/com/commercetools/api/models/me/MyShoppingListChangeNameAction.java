
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListChangeNameActionImpl;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeNameActionImpl.class)
public interface MyShoppingListChangeNameAction extends MyShoppingListUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static MyShoppingListChangeNameAction of() {
        return new MyShoppingListChangeNameActionImpl();
    }

    public static MyShoppingListChangeNameAction of(final MyShoppingListChangeNameAction template) {
        MyShoppingListChangeNameActionImpl instance = new MyShoppingListChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static MyShoppingListChangeNameActionBuilder builder() {
        return MyShoppingListChangeNameActionBuilder.of();
    }

    public static MyShoppingListChangeNameActionBuilder builder(final MyShoppingListChangeNameAction template) {
        return MyShoppingListChangeNameActionBuilder.of(template);
    }

    default <T> T withMyShoppingListChangeNameAction(Function<MyShoppingListChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
