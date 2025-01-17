
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>It is used to calculate the <a href="/../api/projects/carts#taxedprice">taxPortions</a> field in a Cart or Order.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SubRateImpl.class)
public interface SubRate {

    /**
    *  <p>Name of the SubRate.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("amount")
    public Double getAmount();

    public void setName(final String name);

    public void setAmount(final Double amount);

    public static SubRate of() {
        return new SubRateImpl();
    }

    public static SubRate of(final SubRate template) {
        SubRateImpl instance = new SubRateImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static SubRateBuilder builder() {
        return SubRateBuilder.of();
    }

    public static SubRateBuilder builder(final SubRate template) {
        return SubRateBuilder.of(template);
    }

    default <T> T withSubRate(Function<SubRate, T> helper) {
        return helper.apply(this);
    }
}
