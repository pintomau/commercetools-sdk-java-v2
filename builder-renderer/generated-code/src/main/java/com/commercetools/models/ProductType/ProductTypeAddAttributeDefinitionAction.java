package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeDefinitionDraft;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeAddAttributeDefinitionActionImpl;

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
@JsonDeserialize(as = ProductTypeAddAttributeDefinitionActionImpl.class)
public interface ProductTypeAddAttributeDefinitionAction extends ProductTypeUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("attribute")
   public AttributeDefinitionDraft getAttribute();

   public void setAttribute(final AttributeDefinitionDraft attribute);
   
   public static ProductTypeAddAttributeDefinitionActionImpl of(){
      return new ProductTypeAddAttributeDefinitionActionImpl();
   }
   

   public static ProductTypeAddAttributeDefinitionActionImpl of(final ProductTypeAddAttributeDefinitionAction template) {
      ProductTypeAddAttributeDefinitionActionImpl instance = new ProductTypeAddAttributeDefinitionActionImpl();
      instance.setAttribute(template.getAttribute());
      return instance;
   }

}