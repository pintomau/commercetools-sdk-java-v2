
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartAddCustomLineItemActionImpl.class)
public interface CartAddCustomLineItemAction extends CartUpdateAction {

    String ADD_CUSTOM_LINE_ITEM = "addCustomLineItem";

    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    @NotNull
    @JsonProperty("slug")
    public String getSlug();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:TaxCategory">TaxCategory</a>.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setMoney(final Money money);

    public void setName(final LocalizedString name);

    public void setQuantity(final Long quantity);

    public void setSlug(final String slug);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setCustom(final CustomFieldsDraft custom);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartAddCustomLineItemAction of() {
        return new CartAddCustomLineItemActionImpl();
    }

    public static CartAddCustomLineItemAction of(final CartAddCustomLineItemAction template) {
        CartAddCustomLineItemActionImpl instance = new CartAddCustomLineItemActionImpl();
        instance.setMoney(template.getMoney());
        instance.setName(template.getName());
        instance.setQuantity(template.getQuantity());
        instance.setSlug(template.getSlug());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setCustom(template.getCustom());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static CartAddCustomLineItemActionBuilder builder() {
        return CartAddCustomLineItemActionBuilder.of();
    }

    public static CartAddCustomLineItemActionBuilder builder(final CartAddCustomLineItemAction template) {
        return CartAddCustomLineItemActionBuilder.of(template);
    }

    default <T> T withCartAddCustomLineItemAction(Function<CartAddCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
