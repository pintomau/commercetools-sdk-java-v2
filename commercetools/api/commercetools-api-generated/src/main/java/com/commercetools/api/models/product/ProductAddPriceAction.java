package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddPriceActionImpl;

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
@JsonDeserialize(as = ProductAddPriceActionImpl.class)
public interface ProductAddPriceAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public PriceDraft getPrice();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setPrice(final PriceDraft price);
   
   public void setStaged(final Boolean staged);
   
   public static ProductAddPriceActionImpl of(){
      return new ProductAddPriceActionImpl();
   }
   

   public static ProductAddPriceActionImpl of(final ProductAddPriceAction template) {
      ProductAddPriceActionImpl instance = new ProductAddPriceActionImpl();
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setPrice(template.getPrice());
      instance.setStaged(template.getStaged());
      return instance;
   }

}