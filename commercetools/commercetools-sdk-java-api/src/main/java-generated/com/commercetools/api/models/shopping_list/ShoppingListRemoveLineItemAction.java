
package com.commercetools.api.models.shopping_list;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shopping_list.ShoppingListRemoveLineItemActionImpl;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListRemoveLineItemActionImpl.class)
public interface ShoppingListRemoveLineItemAction extends ShoppingListUpdateAction {

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @JsonProperty("quantity")
    public Long getQuantity();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public static ShoppingListRemoveLineItemAction of() {
        return new ShoppingListRemoveLineItemActionImpl();
    }

    public static ShoppingListRemoveLineItemAction of(final ShoppingListRemoveLineItemAction template) {
        ShoppingListRemoveLineItemActionImpl instance = new ShoppingListRemoveLineItemActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static ShoppingListRemoveLineItemActionBuilder builder() {
        return ShoppingListRemoveLineItemActionBuilder.of();
    }

    public static ShoppingListRemoveLineItemActionBuilder builder(final ShoppingListRemoveLineItemAction template) {
        return ShoppingListRemoveLineItemActionBuilder.of(template);
    }

    default <T> T withShoppingListRemoveLineItemAction(Function<ShoppingListRemoveLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
