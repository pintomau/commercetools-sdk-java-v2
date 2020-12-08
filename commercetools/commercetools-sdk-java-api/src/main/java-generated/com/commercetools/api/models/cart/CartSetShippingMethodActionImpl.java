package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetShippingMethodActionImpl implements CartSetShippingMethodAction {

    private String action;
    
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    CartSetShippingMethodActionImpl(@JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.shippingMethod = shippingMethod;
        this.externalTaxRate = externalTaxRate;
        this.action = "setShippingMethod";
    }
    public CartSetShippingMethodActionImpl() {
        this.action = "setShippingMethod";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
        return this.shippingMethod;
    }
    
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    public void setShippingMethod(final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
        this.shippingMethod = shippingMethod;
    }
    
    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartSetShippingMethodActionImpl that = (CartSetShippingMethodActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(shippingMethod, that.shippingMethod)
                .append(externalTaxRate, that.externalTaxRate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(shippingMethod)
            .append(externalTaxRate)
            .toHashCode();
    }

}
