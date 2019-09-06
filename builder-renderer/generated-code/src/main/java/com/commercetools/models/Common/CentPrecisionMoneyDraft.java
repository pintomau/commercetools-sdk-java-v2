package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoneyDraft;
import com.commercetools.models.Common.CentPrecisionMoneyDraftImpl;

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
@JsonDeserialize(as = CentPrecisionMoneyDraftImpl.class)
public interface CentPrecisionMoneyDraft extends TypedMoneyDraft {


   
   public static CentPrecisionMoneyDraftImpl of(){
      return new CentPrecisionMoneyDraftImpl();
   }
   

   public static CentPrecisionMoneyDraftImpl of(final CentPrecisionMoneyDraft template) {
      CentPrecisionMoneyDraftImpl instance = new CentPrecisionMoneyDraftImpl();
      instance.setCentAmount(template.getCentAmount());
      instance.setCurrencyCode(template.getCurrencyCode());
      return instance;
   }

}