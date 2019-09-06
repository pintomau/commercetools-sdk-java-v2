package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetVatIdActionImpl;

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
@JsonDeserialize(as = CustomerSetVatIdActionImpl.class)
public interface CustomerSetVatIdAction extends CustomerUpdateAction {

   
   
   @JsonProperty("vatId")
   public String getVatId();

   public void setVatId(final String vatId);
   
   public static CustomerSetVatIdActionImpl of(){
      return new CustomerSetVatIdActionImpl();
   }
   

   public static CustomerSetVatIdActionImpl of(final CustomerSetVatIdAction template) {
      CustomerSetVatIdActionImpl instance = new CustomerSetVatIdActionImpl();
      instance.setVatId(template.getVatId());
      return instance;
   }

}