
package com.commercetools.api.models.cart;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ClassificationShippingRateInputDraft;
import com.commercetools.api.models.cart.ScoreShippingRateInputDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ClassificationShippingRateInputDraftImpl.class, name = "Classification"),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart.ScoreShippingRateInputDraftImpl.class, name = "Score") })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ShippingRateInputDraftImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRateInputDraft {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withShippingRateInputDraft(Function<ShippingRateInputDraft, T> helper) {
        return helper.apply(this);
    }
}
