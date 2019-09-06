package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.Common.Money;
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
public final class CartDiscountValueAbsoluteImpl implements CartDiscountValueAbsolute {

   private java.lang.String type;
   
   private java.util.List<com.commercetools.models.Common.Money> money;

   @JsonCreator
   CartDiscountValueAbsoluteImpl(@JsonProperty("money") final java.util.List<com.commercetools.models.Common.Money> money) {
      this.money = money;
      this.type = "absolute";
   }
   public CartDiscountValueAbsoluteImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Money> getMoney(){
      return this.money;
   }

   public void setMoney(final java.util.List<com.commercetools.models.Common.Money> money){
      this.money = money;
   }

}