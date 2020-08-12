package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeSetValidFromAndUntilActionImpl.class)
public interface DiscountCodeSetValidFromAndUntilAction extends DiscountCodeUpdateAction {

   /**
   *  <p>If absent, the field with the value is removed in case a value was set before.</p>
   */
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   /**
   *  <p>If absent, the field with the value is removed in case a value was set before.</p>
   */
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();

   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public static DiscountCodeSetValidFromAndUntilActionImpl of(){
      return new DiscountCodeSetValidFromAndUntilActionImpl();
   }
   

   public static DiscountCodeSetValidFromAndUntilActionImpl of(final DiscountCodeSetValidFromAndUntilAction template) {
      DiscountCodeSetValidFromAndUntilActionImpl instance = new DiscountCodeSetValidFromAndUntilActionImpl();
      instance.setValidFrom(template.getValidFrom());
      instance.setValidUntil(template.getValidUntil());
      return instance;
   }

}