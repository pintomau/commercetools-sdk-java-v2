package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountChangePredicateActionImpl implements ProductDiscountChangePredicateAction {

   private java.lang.String action;
   
   private java.lang.String predicate;

   @JsonCreator
   ProductDiscountChangePredicateActionImpl(@JsonProperty("predicate") final java.lang.String predicate) {
      this.predicate = predicate;
      this.action = "changePredicate";
   }
   public ProductDiscountChangePredicateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }

   public void setPredicate(final java.lang.String predicate){
      this.predicate = predicate;
   }

}