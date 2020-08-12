package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxPortion;
import com.commercetools.api.models.common.TypedMoney;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedPriceImpl implements TaxedPrice {

   private com.commercetools.api.models.common.TypedMoney totalNet;
   
   private com.commercetools.api.models.common.TypedMoney totalGross;
   
   private java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions;

   @JsonCreator
   TaxedPriceImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.TypedMoney totalNet, @JsonProperty("totalGross") final com.commercetools.api.models.common.TypedMoney totalGross, @JsonProperty("taxPortions") final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions) {
      this.totalNet = totalNet;
      this.totalGross = totalGross;
      this.taxPortions = taxPortions;
   }
   public TaxedPriceImpl() {
      
   }
   
   
   public com.commercetools.api.models.common.TypedMoney getTotalNet(){
      return this.totalNet;
   }
   
   
   public com.commercetools.api.models.common.TypedMoney getTotalGross(){
      return this.totalGross;
   }
   
   /**
   *  <p>TaxedPrice fields that can be used in query predicates: <code>totalNet</code>, <code>totalGross</code>.</p>
   */
   public java.util.List<com.commercetools.api.models.cart.TaxPortion> getTaxPortions(){
      return this.taxPortions;
   }

   public void setTotalNet(final com.commercetools.api.models.common.TypedMoney totalNet){
      this.totalNet = totalNet;
   }
   
   public void setTotalGross(final com.commercetools.api.models.common.TypedMoney totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTaxPortions(final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions){
      this.taxPortions = taxPortions;
   }

}