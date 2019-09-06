package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.InsufficientScopeErrorImpl;

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
@JsonDeserialize(as = InsufficientScopeErrorImpl.class)
public interface InsufficientScopeError extends ErrorObject {


   
   public static InsufficientScopeErrorImpl of(){
      return new InsufficientScopeErrorImpl();
   }
   

   public static InsufficientScopeErrorImpl of(final InsufficientScopeError template) {
      InsufficientScopeErrorImpl instance = new InsufficientScopeErrorImpl();
      instance.setMessage(template.getMessage());
      return instance;
   }

}