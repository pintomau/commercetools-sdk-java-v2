package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountValueGiftLineItemDraftBuilder {

    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    private Long variantId;
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    public CartDiscountValueGiftLineItemDraftBuilder product( final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }
    
    public CartDiscountValueGiftLineItemDraftBuilder variantId( final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    public CartDiscountValueGiftLineItemDraftBuilder supplyChannel(@Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }
    
    public CartDiscountValueGiftLineItemDraftBuilder distributionChannel(@Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel(){
        return this.supplyChannel;
    }
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel(){
        return this.distributionChannel;
    }

    public CartDiscountValueGiftLineItemDraft build() {
        return new CartDiscountValueGiftLineItemDraftImpl(product, variantId, supplyChannel, distributionChannel);
    }

    public static CartDiscountValueGiftLineItemDraftBuilder of() {
        return new CartDiscountValueGiftLineItemDraftBuilder();
    }

    public static CartDiscountValueGiftLineItemDraftBuilder of(final CartDiscountValueGiftLineItemDraft template) {
        CartDiscountValueGiftLineItemDraftBuilder builder = new CartDiscountValueGiftLineItemDraftBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}