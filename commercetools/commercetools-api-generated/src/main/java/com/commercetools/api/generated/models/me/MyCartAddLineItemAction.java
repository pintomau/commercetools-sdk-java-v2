package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.me.MyCartAddLineItemActionImpl;

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
@JsonDeserialize(as = MyCartAddLineItemActionImpl.class)
public interface MyCartAddLineItemAction extends MyCartUpdateAction {

   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelResourceIdentifier getDistributionChannel();
   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();
   
   
   @JsonProperty("productId")
   public String getProductId();
   
   
   @JsonProperty("variantId")
   public Long getVariantId();
   
   
   @JsonProperty("sku")
   public String getSku();
   
   
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();
   
   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setCustom(final CustomFieldsDraft custom);
   
   public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public void setProductId(final String productId);
   
   public void setVariantId(final Long variantId);
   
   public void setSku(final String sku);
   
   public void setQuantity(final Integer quantity);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setExternalPrice(final Money externalPrice);
   
   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static MyCartAddLineItemActionImpl of(){
      return new MyCartAddLineItemActionImpl();
   }
   

   public static MyCartAddLineItemActionImpl of(final MyCartAddLineItemAction template) {
      MyCartAddLineItemActionImpl instance = new MyCartAddLineItemActionImpl();
      instance.setQuantity(template.getQuantity());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setShippingDetails(template.getShippingDetails());
      instance.setProductId(template.getProductId());
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      instance.setCustom(template.getCustom());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setVariantId(template.getVariantId());
      instance.setSku(template.getSku());
      instance.setDistributionChannel(template.getDistributionChannel());
      instance.setExternalPrice(template.getExternalPrice());
      return instance;
   }

}