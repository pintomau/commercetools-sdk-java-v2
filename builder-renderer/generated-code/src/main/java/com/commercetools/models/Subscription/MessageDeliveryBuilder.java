package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.PayloadNotIncluded;
import com.commercetools.models.Subscription.SubscriptionDelivery;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Subscription.MessageDelivery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MessageDeliveryBuilder {
   
   
   private java.lang.String projectKey;
   
   
   private com.commercetools.models.Common.Reference resource;
   
   @Nullable
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.lang.Long sequenceNumber;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.Long resourceVersion;
   
   
   private com.commercetools.models.Subscription.PayloadNotIncluded payloadNotIncluded;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   public MessageDeliveryBuilder projectKey( final java.lang.String projectKey) {
      this.projectKey = projectKey;
      return this;
   }
   
   public MessageDeliveryBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public MessageDeliveryBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public MessageDeliveryBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public MessageDeliveryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MessageDeliveryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MessageDeliveryBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public MessageDeliveryBuilder payloadNotIncluded( final com.commercetools.models.Subscription.PayloadNotIncluded payloadNotIncluded) {
      this.payloadNotIncluded = payloadNotIncluded;
      return this;
   }
   
   public MessageDeliveryBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public MessageDeliveryBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.lang.String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public com.commercetools.models.Subscription.PayloadNotIncluded getPayloadNotIncluded(){
      return this.payloadNotIncluded;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public MessageDelivery build() {
       return new MessageDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, sequenceNumber, createdAt, lastModifiedAt, resourceVersion, payloadNotIncluded, id, version);
   }
   
   public static MessageDeliveryBuilder of() {
      return new MessageDeliveryBuilder();
   }
   
   public static MessageDeliveryBuilder of(final MessageDelivery template) {
      MessageDeliveryBuilder builder = new MessageDeliveryBuilder();
      builder.projectKey = template.getProjectKey();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.resourceVersion = template.getResourceVersion();
      builder.payloadNotIncluded = template.getPayloadNotIncluded();
      builder.id = template.getId();
      builder.version = template.getVersion();
      return builder;
   }
   
}