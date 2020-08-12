package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetLastNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerSetLastNameActionImpl.class)
public interface MyCustomerSetLastNameAction extends MyCustomerUpdateAction {

   
   
   @JsonProperty("lastName")
   public String getLastName();

   public void setLastName(final String lastName);
   
   public static MyCustomerSetLastNameActionImpl of(){
      return new MyCustomerSetLastNameActionImpl();
   }
   

   public static MyCustomerSetLastNameActionImpl of(final MyCustomerSetLastNameAction template) {
      MyCustomerSetLastNameActionImpl instance = new MyCustomerSetLastNameActionImpl();
      instance.setLastName(template.getLastName());
      return instance;
   }

}