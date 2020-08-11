package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentUpdateImpl implements PaymentUpdate {

   private java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions;

   private Long version;

   @JsonCreator
   PaymentUpdateImpl(@JsonProperty("actions") final java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions, @JsonProperty("version") final Long version) {
      this.actions = actions;
      this.version = version;
   }
   public PaymentUpdateImpl() {

   }


   public java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> getActions(){
      return this.actions;
   }


   public Long getVersion(){
      return this.version;
   }

   public void setActions(final java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions){
      this.actions = actions;
   }

   public void setVersion(final Long version){
      this.version = version;
   }

}
