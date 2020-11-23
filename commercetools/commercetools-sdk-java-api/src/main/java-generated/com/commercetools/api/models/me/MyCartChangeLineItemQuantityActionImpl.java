package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.me.MyCartUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartChangeLineItemQuantityActionImpl implements MyCartChangeLineItemQuantityAction {

    private String action;
    
    private String lineItemId;
    
    private Double quantity;
    
    private com.commercetools.api.models.common.Money externalPrice;
    
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    @JsonCreator
    MyCartChangeLineItemQuantityActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("quantity") final Double quantity, @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice, @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.action = "changeLineItemQuantity";
    }
    public MyCartChangeLineItemQuantityActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public Double getQuantity(){
        return this.quantity;
    }
    
    
    public com.commercetools.api.models.common.Money getExternalPrice(){
        return this.externalPrice;
    }
    
    
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
        return this.externalTotalPrice;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice){
        this.externalPrice = externalPrice;
    }
    
    public void setExternalTotalPrice(final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
        this.externalTotalPrice = externalTotalPrice;
    }

}