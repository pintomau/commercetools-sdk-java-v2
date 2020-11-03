package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.orders.Parcel;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.orders.DeliveryImpl;

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
@JsonDeserialize(as = DeliveryImpl.class)
public interface Delivery  {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();
    
    @NotNull
    @Valid
    @JsonProperty("parcels")
    public List<Parcel> getParcels();
    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setId(final String id);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    public void setItems(final List<DeliveryItem> items);
    
    @JsonIgnore
    public void setParcels(final Parcel ...parcels);
    public void setParcels(final List<Parcel> parcels);
    
    public void setAddress(final Address address);

    public static DeliveryImpl of(){
        return new DeliveryImpl();
    }
    

    public static DeliveryImpl of(final Delivery template) {
        DeliveryImpl instance = new DeliveryImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setItems(template.getItems());
        instance.setParcels(template.getParcels());
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T> T withDelivery(Function<Delivery, T> helper) {
        return helper.apply(this);
    }
}
