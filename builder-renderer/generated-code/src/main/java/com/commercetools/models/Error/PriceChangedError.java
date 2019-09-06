package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Error.PriceChangedErrorImpl;

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
@JsonDeserialize(as = PriceChangedErrorImpl.class)
public interface PriceChangedError extends ErrorObject {

   
   @NotNull
   @JsonProperty("lineItems")
   public List<String> getLineItems();
   
   @NotNull
   @JsonProperty("shipping")
   public Boolean getShipping();

   public void setLineItems(final List<String> lineItems);
   
   public void setShipping(final Boolean shipping);
   
   public static PriceChangedErrorImpl of(){
      return new PriceChangedErrorImpl();
   }
   

   public static PriceChangedErrorImpl of(final PriceChangedError template) {
      PriceChangedErrorImpl instance = new PriceChangedErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setLineItems(template.getLineItems());
      instance.setShipping(template.getShipping());
      return instance;
   }

}