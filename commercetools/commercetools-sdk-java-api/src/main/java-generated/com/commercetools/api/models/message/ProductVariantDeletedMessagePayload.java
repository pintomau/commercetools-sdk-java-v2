package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductVariantDeletedMessagePayloadImpl.class)
public interface ProductVariantDeletedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();
    
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    public void setVariant(final ProductVariant variant);
    
    @JsonIgnore
    public void setRemovedImageUrls(final String ...removedImageUrls);
    public void setRemovedImageUrls(final List<String> removedImageUrls);

    public static ProductVariantDeletedMessagePayloadImpl of(){
        return new ProductVariantDeletedMessagePayloadImpl();
    }
    

    public static ProductVariantDeletedMessagePayloadImpl of(final ProductVariantDeletedMessagePayload template) {
        ProductVariantDeletedMessagePayloadImpl instance = new ProductVariantDeletedMessagePayloadImpl();
        instance.setVariant(template.getVariant());
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    default <T> T withProductVariantDeletedMessagePayload(Function<ProductVariantDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}