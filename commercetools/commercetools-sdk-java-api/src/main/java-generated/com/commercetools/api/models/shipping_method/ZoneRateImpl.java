package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.zone.ZoneReference;
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
public final class ZoneRateImpl implements ZoneRate {

    private com.commercetools.api.models.zone.ZoneReference zone;
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates;

    @JsonCreator
    ZoneRateImpl(@JsonProperty("zone") final com.commercetools.api.models.zone.ZoneReference zone, @JsonProperty("shippingRates") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates) {
        this.zone = zone;
        this.shippingRates = shippingRates;
    }
    public ZoneRateImpl() {
       
    }

    
    public com.commercetools.api.models.zone.ZoneReference getZone(){
        return this.zone;
    }
    
    /**
    *  <p>The array does not contain two shipping rates with the same currency.</p>
    */
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> getShippingRates(){
        return this.shippingRates;
    }

    public void setZone(final com.commercetools.api.models.zone.ZoneReference zone){
        this.zone = zone;
    }
    
    public void setShippingRates(final com.commercetools.api.models.shipping_method.ShippingRate ...shippingRates){
       this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
    }
    
    public void setShippingRates(final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates){
       this.shippingRates = shippingRates;
    }

}