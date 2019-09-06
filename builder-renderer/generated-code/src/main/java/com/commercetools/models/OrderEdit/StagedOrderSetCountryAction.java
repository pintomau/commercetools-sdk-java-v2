package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetCountryActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCountryActionImpl.class)
public interface StagedOrderSetCountryAction extends StagedOrderUpdateAction {

   
   
   @JsonProperty("country")
   public String getCountry();

   public void setCountry(final String country);
   
   public static StagedOrderSetCountryActionImpl of(){
      return new StagedOrderSetCountryActionImpl();
   }
   

   public static StagedOrderSetCountryActionImpl of(final StagedOrderSetCountryAction template) {
      StagedOrderSetCountryActionImpl instance = new StagedOrderSetCountryActionImpl();
      instance.setCountry(template.getCountry());
      return instance;
   }

}