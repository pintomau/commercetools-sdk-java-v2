package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.Long;
import com.commercetools.models.ProductDiscount.ProductDiscountUpdateImpl;

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
@JsonDeserialize(as = ProductDiscountUpdateImpl.class)
public interface ProductDiscountUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ProductDiscountUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ProductDiscountUpdateAction> actions);
   
   public static ProductDiscountUpdateImpl of(){
      return new ProductDiscountUpdateImpl();
   }
   

   public static ProductDiscountUpdateImpl of(final ProductDiscountUpdate template) {
      ProductDiscountUpdateImpl instance = new ProductDiscountUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}