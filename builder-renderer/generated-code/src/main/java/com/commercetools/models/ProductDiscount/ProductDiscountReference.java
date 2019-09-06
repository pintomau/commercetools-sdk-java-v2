package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ProductDiscount.ProductDiscount;
import com.commercetools.models.ProductDiscount.ProductDiscountReferenceImpl;

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
@JsonDeserialize(as = ProductDiscountReferenceImpl.class)
public interface ProductDiscountReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public ProductDiscount getObj();

   public void setObj(final ProductDiscount obj);
   
   public static ProductDiscountReferenceImpl of(){
      return new ProductDiscountReferenceImpl();
   }
   

   public static ProductDiscountReferenceImpl of(final ProductDiscountReference template) {
      ProductDiscountReferenceImpl instance = new ProductDiscountReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}