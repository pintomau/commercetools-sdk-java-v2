package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Order.ShipmentState;
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
public final class OrderShipmentStateChangedMessageImpl implements OrderShipmentStateChangedMessage {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.lang.Long sequenceNumber;
   
   private com.commercetools.models.Common.Reference resource;
   
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.Long resourceVersion;
   
   private java.lang.String type;
   
   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   private com.commercetools.models.Order.ShipmentState oldShipmentState;

   @JsonCreator
   OrderShipmentStateChangedMessageImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("sequenceNumber") final java.lang.Long sequenceNumber, @JsonProperty("resource") final com.commercetools.models.Common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("resourceVersion") final java.lang.Long resourceVersion, @JsonProperty("type") final java.lang.String type, @JsonProperty("shipmentState") final com.commercetools.models.Order.ShipmentState shipmentState, @JsonProperty("oldShipmentState") final com.commercetools.models.Order.ShipmentState oldShipmentState) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.sequenceNumber = sequenceNumber;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.resourceVersion = resourceVersion;
      this.type = type;
      this.shipmentState = shipmentState;
      this.oldShipmentState = oldShipmentState;
   }
   public OrderShipmentStateChangedMessageImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public com.commercetools.models.Order.ShipmentState getOldShipmentState(){
      return this.oldShipmentState;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setSequenceNumber(final java.lang.Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setResource(final com.commercetools.models.Common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setResourceVersion(final java.lang.Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setType(final java.lang.String type){
      this.type = type;
   }
   
   public void setShipmentState(final com.commercetools.models.Order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setOldShipmentState(final com.commercetools.models.Order.ShipmentState oldShipmentState){
      this.oldShipmentState = oldShipmentState;
   }

}