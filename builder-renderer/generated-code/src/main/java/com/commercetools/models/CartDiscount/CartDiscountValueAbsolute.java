package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.Common.Money;
import java.lang.String;
import com.commercetools.models.CartDiscount.CartDiscountValueAbsoluteImpl;

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
@JsonDeserialize(as = CartDiscountValueAbsoluteImpl.class)
public interface CartDiscountValueAbsolute extends CartDiscountValue {

   
   @NotNull
   @Valid
   @JsonProperty("money")
   public List<Money> getMoney();

   public void setMoney(final List<Money> money);
   
   public static CartDiscountValueAbsoluteImpl of(){
      return new CartDiscountValueAbsoluteImpl();
   }
   

   public static CartDiscountValueAbsoluteImpl of(final CartDiscountValueAbsolute template) {
      CartDiscountValueAbsoluteImpl instance = new CartDiscountValueAbsoluteImpl();
      instance.setMoney(template.getMoney());
      return instance;
   }

}