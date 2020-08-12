package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetMetaDescriptionActionImpl;

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
@JsonDeserialize(as = ProductSetMetaDescriptionActionImpl.class)
public interface ProductSetMetaDescriptionAction extends ProductUpdateAction {

   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setStaged(final Boolean staged);
   
   public static ProductSetMetaDescriptionActionImpl of(){
      return new ProductSetMetaDescriptionActionImpl();
   }
   

   public static ProductSetMetaDescriptionActionImpl of(final ProductSetMetaDescriptionAction template) {
      ProductSetMetaDescriptionActionImpl instance = new ProductSetMetaDescriptionActionImpl();
      instance.setMetaDescription(template.getMetaDescription());
      instance.setStaged(template.getStaged());
      return instance;
   }

}