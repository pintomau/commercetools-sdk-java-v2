package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetCartPredicateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeSetCartPredicateActionImpl.class)
public interface DiscountCodeSetCartPredicateAction extends DiscountCodeUpdateAction {

   
   
   @JsonProperty("cartPredicate")
   public String getCartPredicate();

   public void setCartPredicate(final String cartPredicate);
   
   public static DiscountCodeSetCartPredicateActionImpl of(){
      return new DiscountCodeSetCartPredicateActionImpl();
   }
   

   public static DiscountCodeSetCartPredicateActionImpl of(final DiscountCodeSetCartPredicateAction template) {
      DiscountCodeSetCartPredicateActionImpl instance = new DiscountCodeSetCartPredicateActionImpl();
      instance.setCartPredicate(template.getCartPredicate());
      return instance;
   }

}