package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductChangeAssetNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = ProductChangeAssetNameActionImpl.class)
public interface ProductChangeAssetNameAction extends ProductUpdateAction {

   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();
   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setStaged(final Boolean staged);
   
   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setName(final LocalizedString name);
   
   public static ProductChangeAssetNameActionImpl of(){
      return new ProductChangeAssetNameActionImpl();
   }
   

   public static ProductChangeAssetNameActionImpl of(final ProductChangeAssetNameAction template) {
      ProductChangeAssetNameActionImpl instance = new ProductChangeAssetNameActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setName(template.getName());
      instance.setStaged(template.getStaged());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}