package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.cart.ClassificationShippingRateInputDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ClassificationShippingRateInputDraftImpl.class)
public interface ClassificationShippingRateInputDraft extends ShippingRateInputDraft {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ClassificationShippingRateInputDraftImpl of(){
        return new ClassificationShippingRateInputDraftImpl();
    }
    

    public static ClassificationShippingRateInputDraftImpl of(final ClassificationShippingRateInputDraft template) {
        ClassificationShippingRateInputDraftImpl instance = new ClassificationShippingRateInputDraftImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T extends Accessor<ClassificationShippingRateInputDraft>> T withClassificationShippingRateInputDraft(Function<ClassificationShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }
}
