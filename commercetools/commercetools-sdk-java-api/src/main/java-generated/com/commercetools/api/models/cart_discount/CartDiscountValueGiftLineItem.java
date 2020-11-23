package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueGiftLineItemImpl.class)
public interface CartDiscountValueGiftLineItem extends CartDiscountValue {

    
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();
    
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();
    
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    public void setProduct(final ProductReference product);
    
    public void setVariantId(final Long variantId);
    
    public void setSupplyChannel(final ChannelReference supplyChannel);
    
    public void setDistributionChannel(final ChannelReference distributionChannel);

    public static CartDiscountValueGiftLineItemImpl of(){
        return new CartDiscountValueGiftLineItemImpl();
    }
    

    public static CartDiscountValueGiftLineItemImpl of(final CartDiscountValueGiftLineItem template) {
        CartDiscountValueGiftLineItemImpl instance = new CartDiscountValueGiftLineItemImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    default <T> T withCartDiscountValueGiftLineItem(Function<CartDiscountValueGiftLineItem, T> helper) {
        return helper.apply(this);
    }
}