package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeLocalizedEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeLocalizedEnumValueOrderActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface ProductTypeChangeLocalizedEnumValueOrderAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @Valid
   @JsonProperty("values")
   public List<AttributeLocalizedEnumValue> getValues();

   public void setAttributeName(final String attributeName);
   
   public void setValues(final List<AttributeLocalizedEnumValue> values);
   
   public static ProductTypeChangeLocalizedEnumValueOrderActionImpl of(){
      return new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
   }
   

   public static ProductTypeChangeLocalizedEnumValueOrderActionImpl of(final ProductTypeChangeLocalizedEnumValueOrderAction template) {
      ProductTypeChangeLocalizedEnumValueOrderActionImpl instance = new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
      instance.setValues(template.getValues());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}