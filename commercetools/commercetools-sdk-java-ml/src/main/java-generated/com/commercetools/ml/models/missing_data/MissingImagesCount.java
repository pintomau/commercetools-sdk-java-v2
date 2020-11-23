package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImagesProductLevel;
import com.commercetools.ml.models.missing_data.MissingImagesVariantLevel;
import com.commercetools.ml.models.missing_data.MissingImagesCountImpl;

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
@JsonDeserialize(as = MissingImagesCountImpl.class)
public interface MissingImagesCount  {

    
    @NotNull
    @JsonProperty("missingImages")
    public Long getMissingImages();
    /**
    *  <p>Number of products scanned.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    public void setMissingImages(final Long missingImages);
    
    public void setTotal(final Long total);

    public static MissingImagesCountImpl of(){
        return new MissingImagesCountImpl();
    }
    

    public static MissingImagesCountImpl of(final MissingImagesCount template) {
        MissingImagesCountImpl instance = new MissingImagesCountImpl();
        instance.setMissingImages(template.getMissingImages());
        instance.setTotal(template.getTotal());
        return instance;
    }

    default <T> T withMissingImagesCount(Function<MissingImagesCount, T> helper) {
        return helper.apply(this);
    }
}