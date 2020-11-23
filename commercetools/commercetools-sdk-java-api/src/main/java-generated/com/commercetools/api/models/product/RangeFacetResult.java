package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResultRange;
import com.commercetools.api.models.product.FacetTypes;
import com.commercetools.api.models.product.RangeFacetResultImpl;

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
@JsonDeserialize(as = RangeFacetResultImpl.class)
public interface RangeFacetResult extends FacetResult {

    
    @NotNull
    @Valid
    @JsonProperty("ranges")
    public List<FacetResultRange> getRanges();

    @JsonIgnore
    public void setRanges(final FacetResultRange ...ranges);
    public void setRanges(final List<FacetResultRange> ranges);

    public static RangeFacetResultImpl of(){
        return new RangeFacetResultImpl();
    }
    

    public static RangeFacetResultImpl of(final RangeFacetResult template) {
        RangeFacetResultImpl instance = new RangeFacetResultImpl();
        instance.setRanges(template.getRanges());
        return instance;
    }

    default <T> T withRangeFacetResult(Function<RangeFacetResult, T> helper) {
        return helper.apply(this);
    }
}