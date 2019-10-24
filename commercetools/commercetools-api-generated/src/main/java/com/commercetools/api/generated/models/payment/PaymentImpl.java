package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.payment.PaymentStatus;
import com.commercetools.api.generated.models.payment.Transaction;
import com.commercetools.api.generated.models.type.CustomFields;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentImpl implements Payment {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.generated.models.common.TypedMoney amountAuthorized;
   
   private String anonymousId;
   
   private com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private String authorizedUntil;
   
   private String externalId;
   
   private java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions;
   
   private com.commercetools.api.generated.models.common.TypedMoney amountPaid;
   
   private com.commercetools.api.generated.models.common.TypedMoney amountRefunded;
   
   private com.commercetools.api.generated.models.common.TypedMoney amountPlanned;
   
   private java.util.List<com.commercetools.api.generated.models.type.CustomFields> interfaceInteractions;
   
   private String interfaceId;
   
   private String key;
   
   private com.commercetools.api.generated.models.payment.PaymentStatus paymentStatus;
   
   private com.commercetools.api.generated.models.customer.CustomerReference customer;

   @JsonCreator
   PaymentImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("amountAuthorized") final com.commercetools.api.generated.models.common.TypedMoney amountAuthorized, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("paymentMethodInfo") final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("authorizedUntil") final String authorizedUntil, @JsonProperty("externalId") final String externalId, @JsonProperty("transactions") final java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions, @JsonProperty("amountPaid") final com.commercetools.api.generated.models.common.TypedMoney amountPaid, @JsonProperty("amountRefunded") final com.commercetools.api.generated.models.common.TypedMoney amountRefunded, @JsonProperty("amountPlanned") final com.commercetools.api.generated.models.common.TypedMoney amountPlanned, @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.api.generated.models.type.CustomFields> interfaceInteractions, @JsonProperty("interfaceId") final String interfaceId, @JsonProperty("key") final String key, @JsonProperty("paymentStatus") final com.commercetools.api.generated.models.payment.PaymentStatus paymentStatus, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.CustomerReference customer) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.amountAuthorized = amountAuthorized;
      this.anonymousId = anonymousId;
      this.paymentMethodInfo = paymentMethodInfo;
      this.custom = custom;
      this.authorizedUntil = authorizedUntil;
      this.externalId = externalId;
      this.transactions = transactions;
      this.amountPaid = amountPaid;
      this.amountRefunded = amountRefunded;
      this.amountPlanned = amountPlanned;
      this.interfaceInteractions = interfaceInteractions;
      this.interfaceId = interfaceId;
      this.key = key;
      this.paymentStatus = paymentStatus;
      this.customer = customer;
   }
   public PaymentImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmountAuthorized(){
      return this.amountAuthorized;
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public String getAuthorizedUntil(){
      return this.authorizedUntil;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmountPaid(){
      return this.amountPaid;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmountRefunded(){
      return this.amountRefunded;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.CustomFields> getInterfaceInteractions(){
      return this.interfaceInteractions;
   }
   
   
   public String getInterfaceId(){
      return this.interfaceId;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentStatus getPaymentStatus(){
      return this.paymentStatus;
   }
   
   
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setAmountAuthorized(final com.commercetools.api.generated.models.common.TypedMoney amountAuthorized){
      this.amountAuthorized = amountAuthorized;
   }
   
   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setPaymentMethodInfo(final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setAuthorizedUntil(final String authorizedUntil){
      this.authorizedUntil = authorizedUntil;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setTransactions(final java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions){
      this.transactions = transactions;
   }
   
   public void setAmountPaid(final com.commercetools.api.generated.models.common.TypedMoney amountPaid){
      this.amountPaid = amountPaid;
   }
   
   public void setAmountRefunded(final com.commercetools.api.generated.models.common.TypedMoney amountRefunded){
      this.amountRefunded = amountRefunded;
   }
   
   public void setAmountPlanned(final com.commercetools.api.generated.models.common.TypedMoney amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setInterfaceInteractions(final java.util.List<com.commercetools.api.generated.models.type.CustomFields> interfaceInteractions){
      this.interfaceInteractions = interfaceInteractions;
   }
   
   public void setInterfaceId(final String interfaceId){
      this.interfaceId = interfaceId;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setPaymentStatus(final com.commercetools.api.generated.models.payment.PaymentStatus paymentStatus){
      this.paymentStatus = paymentStatus;
   }
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}