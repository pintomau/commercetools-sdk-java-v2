package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributePlainEnumValue;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangePlainEnumValueLabelActionImpl;

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
@JsonDeserialize(as = ProductTypeChangePlainEnumValueLabelActionImpl.class)
public interface ProductTypeChangePlainEnumValueLabelAction extends ProductTypeUpdateAction {

   
   @NotNull
   @JsonProperty("attributeName")
   public String getAttributeName();
   
   @NotNull
   @Valid
   @JsonProperty("newValue")
   public AttributePlainEnumValue getNewValue();

   public void setAttributeName(final String attributeName);
   
   public void setNewValue(final AttributePlainEnumValue newValue);
   
   public static ProductTypeChangePlainEnumValueLabelActionImpl of(){
      return new ProductTypeChangePlainEnumValueLabelActionImpl();
   }
   

   public static ProductTypeChangePlainEnumValueLabelActionImpl of(final ProductTypeChangePlainEnumValueLabelAction template) {
      ProductTypeChangePlainEnumValueLabelActionImpl instance = new ProductTypeChangePlainEnumValueLabelActionImpl();
      instance.setNewValue(template.getNewValue());
      instance.setAttributeName(template.getAttributeName());
      return instance;
   }

}