package com.commercetools.models.Payment;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Payment.PaymentResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentResourceIdentifierImpl.class)
public interface PaymentResourceIdentifier extends ResourceIdentifier {


   
   public static PaymentResourceIdentifierImpl of(){
      return new PaymentResourceIdentifierImpl();
   }
   

   public static PaymentResourceIdentifierImpl of(final PaymentResourceIdentifier template) {
      PaymentResourceIdentifierImpl instance = new PaymentResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}