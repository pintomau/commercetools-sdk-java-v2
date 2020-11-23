package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl;

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
@JsonDeserialize(as = ShoppingListResourceIdentifierImpl.class)
public interface ShoppingListResourceIdentifier extends ResourceIdentifier {



    public static ShoppingListResourceIdentifierImpl of(){
        return new ShoppingListResourceIdentifierImpl();
    }
    

    public static ShoppingListResourceIdentifierImpl of(final ShoppingListResourceIdentifier template) {
        ShoppingListResourceIdentifierImpl instance = new ShoppingListResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withShoppingListResourceIdentifier(Function<ShoppingListResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}