package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedPriceDraftImpl implements TaxedPriceDraft {

    private com.commercetools.api.models.common.Money totalNet;
    
    private com.commercetools.api.models.common.Money totalGross;
    
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions;

    @JsonCreator
    TaxedPriceDraftImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.Money totalNet, @JsonProperty("totalGross") final com.commercetools.api.models.common.Money totalGross, @JsonProperty("taxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.taxPortions = taxPortions;
    }
    public TaxedPriceDraftImpl() {
    }

    
    public com.commercetools.api.models.common.Money getTotalNet(){
        return this.totalNet;
    }
    
    
    public com.commercetools.api.models.common.Money getTotalGross(){
        return this.totalGross;
    }
    
    
    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getTaxPortions(){
        return this.taxPortions;
    }

    public void setTotalNet(final com.commercetools.api.models.common.Money totalNet){
        this.totalNet = totalNet;
    }
    
    public void setTotalGross(final com.commercetools.api.models.common.Money totalGross){
        this.totalGross = totalGross;
    }
    
    public void setTaxPortions(final com.commercetools.api.models.cart.TaxPortionDraft ...taxPortions){
       this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
    }
    
    public void setTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions){
       this.taxPortions = taxPortions;
    }

}
