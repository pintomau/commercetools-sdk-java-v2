package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ParcelMeasurements;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetParcelMeasurementsActionImpl implements OrderSetParcelMeasurementsAction {

   private java.lang.String action;
   
   private com.commercetools.models.Order.ParcelMeasurements measurements;
   
   private java.lang.String parcelId;

   @JsonCreator
   OrderSetParcelMeasurementsActionImpl(@JsonProperty("measurements") final com.commercetools.models.Order.ParcelMeasurements measurements, @JsonProperty("parcelId") final java.lang.String parcelId) {
      this.measurements = measurements;
      this.parcelId = parcelId;
      this.action = "setParcelMeasurements";
   }
   public OrderSetParcelMeasurementsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Order.ParcelMeasurements getMeasurements(){
      return this.measurements;
   }
   
   
   public java.lang.String getParcelId(){
      return this.parcelId;
   }

   public void setMeasurements(final com.commercetools.models.Order.ParcelMeasurements measurements){
      this.measurements = measurements;
   }
   
   public void setParcelId(final java.lang.String parcelId){
      this.parcelId = parcelId;
   }

}