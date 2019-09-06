package com.commercetools.models.Order;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.ProductVariantImportDraft;
import com.commercetools.models.TaxCategory.TaxRate;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Order.LineItemImportDraftImpl;

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
@JsonDeserialize(as = LineItemImportDraftImpl.class)
public interface LineItemImportDraft  {

   
   
   @JsonProperty("productId")
   public String getProductId();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @NotNull
   @Valid
   @JsonProperty("variant")
   public ProductVariantImportDraft getVariant();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public PriceDraft getPrice();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @Valid
   @JsonProperty("state")
   public List<ItemState> getState();
   
   @Valid
   @JsonProperty("supplyChannel")
   public ChannelResourceIdentifier getSupplyChannel();
   
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelResourceIdentifier getDistributionChannel();
   
   @Valid
   @JsonProperty("taxRate")
   public TaxRate getTaxRate();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setProductId(final String productId);
   
   public void setName(final LocalizedString name);
   
   public void setVariant(final ProductVariantImportDraft variant);
   
   public void setPrice(final PriceDraft price);
   
   public void setQuantity(final Integer quantity);
   
   public void setState(final List<ItemState> state);
   
   public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);
   
   public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
   
   public void setTaxRate(final TaxRate taxRate);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static LineItemImportDraftImpl of(){
      return new LineItemImportDraftImpl();
   }
   

   public static LineItemImportDraftImpl of(final LineItemImportDraft template) {
      LineItemImportDraftImpl instance = new LineItemImportDraftImpl();
      instance.setTaxRate(template.getTaxRate());
      instance.setQuantity(template.getQuantity());
      instance.setShippingDetails(template.getShippingDetails());
      instance.setProductId(template.getProductId());
      instance.setPrice(template.getPrice());
      instance.setCustom(template.getCustom());
      instance.setVariant(template.getVariant());
      instance.setName(template.getName());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setState(template.getState());
      instance.setDistributionChannel(template.getDistributionChannel());
      return instance;
   }

}