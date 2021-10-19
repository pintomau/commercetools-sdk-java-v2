
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderRemoveParcelFromDeliveryActionImpl implements StagedOrderRemoveParcelFromDeliveryAction {

    private String action;

    private String parcelId;

    @JsonCreator
    StagedOrderRemoveParcelFromDeliveryActionImpl(@JsonProperty("parcelId") final String parcelId) {
        this.parcelId = parcelId;
        this.action = REMOVE_PARCEL_FROM_DELIVERY;
    }

    public StagedOrderRemoveParcelFromDeliveryActionImpl() {
        this.action = REMOVE_PARCEL_FROM_DELIVERY;
    }

    public String getAction() {
        return this.action;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderRemoveParcelFromDeliveryActionImpl that = (StagedOrderRemoveParcelFromDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(parcelId, that.parcelId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parcelId).toHashCode();
    }

}
