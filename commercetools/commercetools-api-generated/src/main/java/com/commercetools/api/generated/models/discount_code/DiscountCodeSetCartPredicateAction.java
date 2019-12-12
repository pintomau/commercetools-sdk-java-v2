package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetCartPredicateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeSetCartPredicateActionImpl.class)
public interface DiscountCodeSetCartPredicateAction extends DiscountCodeUpdateAction {

   /**
   *  <p>If the <code>cartPredicate</code> parameter is not included, the field will be emptied.</p>
   */
   
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