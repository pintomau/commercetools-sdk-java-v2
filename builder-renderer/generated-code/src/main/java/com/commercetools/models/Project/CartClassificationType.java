package com.commercetools.models.Project;

import com.commercetools.models.Project.ShippingRateInputType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.Project.CartClassificationTypeImpl;

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
@JsonDeserialize(as = CartClassificationTypeImpl.class)
public interface CartClassificationType extends ShippingRateInputType {

   
   @NotNull
   @Valid
   @JsonProperty("values")
   public List<CustomFieldLocalizedEnumValue> getValues();

   public void setValues(final List<CustomFieldLocalizedEnumValue> values);
   
   public static CartClassificationTypeImpl of(){
      return new CartClassificationTypeImpl();
   }
   

   public static CartClassificationTypeImpl of(final CartClassificationType template) {
      CartClassificationTypeImpl instance = new CartClassificationTypeImpl();
      instance.setValues(template.getValues());
      return instance;
   }

}