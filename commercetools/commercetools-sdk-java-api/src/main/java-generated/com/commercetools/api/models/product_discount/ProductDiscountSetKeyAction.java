package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionImpl;

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
@JsonDeserialize(as = ProductDiscountSetKeyActionImpl.class)
public interface ProductDiscountSetKeyAction extends ProductDiscountUpdateAction {

    /**
    *  <p>The key to set.
    *  If you provide a <code>null</code> value or do not set this field at all, the existing <code>key</code> field is removed.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductDiscountSetKeyActionImpl of(){
        return new ProductDiscountSetKeyActionImpl();
    }
    

    public static ProductDiscountSetKeyActionImpl of(final ProductDiscountSetKeyAction template) {
        ProductDiscountSetKeyActionImpl instance = new ProductDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withProductDiscountSetKeyAction(Function<ProductDiscountSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}