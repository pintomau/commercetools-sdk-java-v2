
package com.commercetools.api.models.shopping_list;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shopping_list.ShoppingListChangeTextLineItemQuantityActionImpl;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeTextLineItemQuantityActionImpl.class)
public interface ShoppingListChangeTextLineItemQuantityAction extends ShoppingListUpdateAction {

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setTextLineItemId(final String textLineItemId);

    public void setQuantity(final Long quantity);

    public static ShoppingListChangeTextLineItemQuantityAction of() {
        return new ShoppingListChangeTextLineItemQuantityActionImpl();
    }

    public static ShoppingListChangeTextLineItemQuantityAction of(
            final ShoppingListChangeTextLineItemQuantityAction template) {
        ShoppingListChangeTextLineItemQuantityActionImpl instance = new ShoppingListChangeTextLineItemQuantityActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static ShoppingListChangeTextLineItemQuantityActionBuilder builder() {
        return ShoppingListChangeTextLineItemQuantityActionBuilder.of();
    }

    public static ShoppingListChangeTextLineItemQuantityActionBuilder builder(
            final ShoppingListChangeTextLineItemQuantityAction template) {
        return ShoppingListChangeTextLineItemQuantityActionBuilder.of(template);
    }

    default <T> T withShoppingListChangeTextLineItemQuantityAction(
            Function<ShoppingListChangeTextLineItemQuantityAction, T> helper) {
        return helper.apply(this);
    }
}
