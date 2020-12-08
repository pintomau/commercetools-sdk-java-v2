package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
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
public final class DiscountCodeSetValidFromAndUntilActionImpl implements DiscountCodeSetValidFromAndUntilAction {

    private String action;
    
    private java.time.ZonedDateTime validFrom;
    
    private java.time.ZonedDateTime validUntil;

    @JsonCreator
    DiscountCodeSetValidFromAndUntilActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.action = "setValidFromAndUntil";
    }
    public DiscountCodeSetValidFromAndUntilActionImpl() {
        this.action = "setValidFromAndUntil";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DiscountCodeSetValidFromAndUntilActionImpl that = (DiscountCodeSetValidFromAndUntilActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(validFrom)
            .append(validUntil)
            .toHashCode();
    }

}
