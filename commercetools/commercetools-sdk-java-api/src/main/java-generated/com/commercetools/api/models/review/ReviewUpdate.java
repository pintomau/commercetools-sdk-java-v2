package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewUpdateImpl;

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
@JsonDeserialize(as = ReviewUpdateImpl.class)
public interface ReviewUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ReviewUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<ReviewUpdateAction> actions);

    public static ReviewUpdateImpl of(){
        return new ReviewUpdateImpl();
    }
    

    public static ReviewUpdateImpl of(final ReviewUpdate template) {
        ReviewUpdateImpl instance = new ReviewUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T extends Accessor<ReviewUpdate>> T withReviewUpdate(Function<ReviewUpdate, T> helper) {
        return helper.apply(this);
    }
}
