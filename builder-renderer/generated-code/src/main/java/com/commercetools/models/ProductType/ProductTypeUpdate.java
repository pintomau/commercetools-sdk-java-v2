package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.Long;
import com.commercetools.models.ProductType.ProductTypeUpdateImpl;

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
@JsonDeserialize(as = ProductTypeUpdateImpl.class)
public interface ProductTypeUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ProductTypeUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ProductTypeUpdateAction> actions);
   
   public static ProductTypeUpdateImpl of(){
      return new ProductTypeUpdateImpl();
   }
   

   public static ProductTypeUpdateImpl of(final ProductTypeUpdate template) {
      ProductTypeUpdateImpl instance = new ProductTypeUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}