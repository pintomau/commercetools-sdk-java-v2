package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftImpl;

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
@JsonDeserialize(as = ProductDiscountValueRelativeDraftImpl.class)
public interface ProductDiscountValueRelativeDraft extends ProductDiscountValueDraft {

    
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static ProductDiscountValueRelativeDraftImpl of(){
        return new ProductDiscountValueRelativeDraftImpl();
    }
    

    public static ProductDiscountValueRelativeDraftImpl of(final ProductDiscountValueRelativeDraft template) {
        ProductDiscountValueRelativeDraftImpl instance = new ProductDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    default <T> T withProductDiscountValueRelativeDraft(Function<ProductDiscountValueRelativeDraft, T> helper) {
        return helper.apply(this);
    }
}