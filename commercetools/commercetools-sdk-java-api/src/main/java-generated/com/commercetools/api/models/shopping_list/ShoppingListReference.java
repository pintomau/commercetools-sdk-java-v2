package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListReferenceImpl;

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
@JsonDeserialize(as = ShoppingListReferenceImpl.class)
public interface ShoppingListReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public ShoppingList getObj();

    public void setObj(final ShoppingList obj);

    public static ShoppingListReferenceImpl of(){
        return new ShoppingListReferenceImpl();
    }
    

    public static ShoppingListReferenceImpl of(final ShoppingListReference template) {
        ShoppingListReferenceImpl instance = new ShoppingListReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withShoppingListReference(Function<ShoppingListReference, T> helper) {
        return helper.apply(this);
    }
}