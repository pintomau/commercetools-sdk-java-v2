package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetCustomerGroupActionImpl;

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
@JsonDeserialize(as = CustomerSetCustomerGroupActionImpl.class)
public interface CustomerSetCustomerGroupAction extends CustomerUpdateAction {

   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();

   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public static CustomerSetCustomerGroupActionImpl of(){
      return new CustomerSetCustomerGroupActionImpl();
   }
   

   public static CustomerSetCustomerGroupActionImpl of(final CustomerSetCustomerGroupAction template) {
      CustomerSetCustomerGroupActionImpl instance = new CustomerSetCustomerGroupActionImpl();
      instance.setCustomerGroup(template.getCustomerGroup());
      return instance;
   }

}