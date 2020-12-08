package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPricesProductLevel;
import com.commercetools.ml.models.missing_data.MissingPricesVariantLevel;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingPricesProductCountImpl implements MissingPricesProductCount {

    private Long total;
    
    private Long missingPrices;

    @JsonCreator
    MissingPricesProductCountImpl(@JsonProperty("total") final Long total, @JsonProperty("missingPrices") final Long missingPrices) {
        this.total = total;
        this.missingPrices = missingPrices;
    }
    public MissingPricesProductCountImpl() {
    }

    
    public Long getTotal(){
        return this.total;
    }
    
    
    public Long getMissingPrices(){
        return this.missingPrices;
    }

    public void setTotal(final Long total){
        this.total = total;
    }
    
    public void setMissingPrices(final Long missingPrices){
        this.missingPrices = missingPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MissingPricesProductCountImpl that = (MissingPricesProductCountImpl) o;
    
        return new EqualsBuilder()
                .append(total, that.total)
                .append(missingPrices, that.missingPrices)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(total)
            .append(missingPrices)
            .toHashCode();
    }

}
