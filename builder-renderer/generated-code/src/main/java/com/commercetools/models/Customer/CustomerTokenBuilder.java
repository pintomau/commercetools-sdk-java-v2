package com.commercetools.models.Customer;

import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Customer.CustomerToken;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerTokenBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   @Nullable
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String customerId;
   
   
   private java.lang.String id;
   
   
   private java.lang.String value;
   
   
   private java.time.ZonedDateTime expiresAt;
   
   public CustomerTokenBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomerTokenBuilder lastModifiedAt(@Nullable final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomerTokenBuilder customerId( final java.lang.String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public CustomerTokenBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerTokenBuilder value( final java.lang.String value) {
      this.value = value;
      return this;
   }
   
   public CustomerTokenBuilder expiresAt( final java.time.ZonedDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   @Nullable
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.String getValue(){
      return this.value;
   }
   
   
   public java.time.ZonedDateTime getExpiresAt(){
      return this.expiresAt;
   }

   public CustomerToken build() {
       return new CustomerTokenImpl(createdAt, lastModifiedAt, customerId, id, value, expiresAt);
   }
   
   public static CustomerTokenBuilder of() {
      return new CustomerTokenBuilder();
   }
   
   public static CustomerTokenBuilder of(final CustomerToken template) {
      CustomerTokenBuilder builder = new CustomerTokenBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.customerId = template.getCustomerId();
      builder.id = template.getId();
      builder.value = template.getValue();
      builder.expiresAt = template.getExpiresAt();
      return builder;
   }
   
}