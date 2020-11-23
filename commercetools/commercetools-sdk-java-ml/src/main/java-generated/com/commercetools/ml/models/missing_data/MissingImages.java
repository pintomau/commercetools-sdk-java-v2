package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.missing_data.MissingImagesImpl;

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
@JsonDeserialize(as = MissingImagesImpl.class)
public interface MissingImages  {

    
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();
    /**
    *  <p>ID of the variant</p>
    */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
    *  <p>Number of images the variant contains.</p>
    */
    @NotNull
    @JsonProperty("imageCount")
    public Long getImageCount();

    public void setProduct(final ProductReference product);
    
    public void setVariantId(final Long variantId);
    
    public void setImageCount(final Long imageCount);

    public static MissingImagesImpl of(){
        return new MissingImagesImpl();
    }
    

    public static MissingImagesImpl of(final MissingImages template) {
        MissingImagesImpl instance = new MissingImagesImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setImageCount(template.getImageCount());
        return instance;
    }

    default <T> T withMissingImages(Function<MissingImages, T> helper) {
        return helper.apply(this);
    }
}