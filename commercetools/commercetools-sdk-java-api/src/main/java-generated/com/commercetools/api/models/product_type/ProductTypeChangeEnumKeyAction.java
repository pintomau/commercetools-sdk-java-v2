
package com.commercetools.api.models.product_type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyActionImpl;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeEnumKeyActionImpl.class)
public interface ProductTypeChangeEnumKeyAction extends ProductTypeUpdateAction {

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("newKey")
    public String getNewKey();

    public void setAttributeName(final String attributeName);

    public void setKey(final String key);

    public void setNewKey(final String newKey);

    public static ProductTypeChangeEnumKeyAction of() {
        return new ProductTypeChangeEnumKeyActionImpl();
    }

    public static ProductTypeChangeEnumKeyAction of(final ProductTypeChangeEnumKeyAction template) {
        ProductTypeChangeEnumKeyActionImpl instance = new ProductTypeChangeEnumKeyActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setKey(template.getKey());
        instance.setNewKey(template.getNewKey());
        return instance;
    }

    public static ProductTypeChangeEnumKeyActionBuilder builder() {
        return ProductTypeChangeEnumKeyActionBuilder.of();
    }

    public static ProductTypeChangeEnumKeyActionBuilder builder(final ProductTypeChangeEnumKeyAction template) {
        return ProductTypeChangeEnumKeyActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeEnumKeyAction(Function<ProductTypeChangeEnumKeyAction, T> helper) {
        return helper.apply(this);
    }
}
