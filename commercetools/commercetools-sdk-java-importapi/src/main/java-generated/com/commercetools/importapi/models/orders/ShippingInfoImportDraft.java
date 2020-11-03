package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.orders.Delivery;
import com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft;
import com.commercetools.importapi.models.orders.ShippingMethodState;
import com.commercetools.importapi.models.orders.ShippingRateDraft;
import com.commercetools.importapi.models.prices.TaxRate;
import com.commercetools.importapi.models.orders.ShippingInfoImportDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>Maps to an order's <code>shippingInfo</code> property. This field is usually populated by the cart assosciated with
*  the order, but when importing orders you must provide a draft representation as a part of the OrderImport.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingInfoImportDraftImpl.class)
public interface ShippingInfoImportDraft  {

    
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();
    
    @NotNull
    @Valid
    @JsonProperty("price")
    public TypedMoney getPrice();
    
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();
    
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();
    /**
    *  <p>References a tax category by its key.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();
    /**
    *  <p>References a shipping method by its key.</p>
    */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodKeyReference getShippingMethod();
    
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();
    
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPriceDraft getDiscountedPrice();
    
    
    @JsonProperty("shippingMethodState")
    public ShippingMethodState getShippingMethodState();

    public void setShippingMethodName(final String shippingMethodName);
    
    public void setPrice(final TypedMoney price);
    
    public void setShippingRate(final ShippingRateDraft shippingRate);
    
    public void setTaxRate(final TaxRate taxRate);
    
    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);
    
    public void setShippingMethod(final ShippingMethodKeyReference shippingMethod);
    
    @JsonIgnore
    public void setDeliveries(final Delivery ...deliveries);
    public void setDeliveries(final List<Delivery> deliveries);
    
    public void setDiscountedPrice(final DiscountedLineItemPriceDraft discountedPrice);
    
    public void setShippingMethodState(final ShippingMethodState shippingMethodState);

    public static ShippingInfoImportDraftImpl of(){
        return new ShippingInfoImportDraftImpl();
    }
    

    public static ShippingInfoImportDraftImpl of(final ShippingInfoImportDraft template) {
        ShippingInfoImportDraftImpl instance = new ShippingInfoImportDraftImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setPrice(template.getPrice());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxRate(template.getTaxRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setDeliveries(template.getDeliveries());
        instance.setDiscountedPrice(template.getDiscountedPrice());
        instance.setShippingMethodState(template.getShippingMethodState());
        return instance;
    }

    default <T> T withShippingInfoImportDraft(Function<ShippingInfoImportDraft, T> helper) {
        return helper.apply(this);
    }
}
