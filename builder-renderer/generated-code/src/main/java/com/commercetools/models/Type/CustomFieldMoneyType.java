package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldMoneyTypeImpl;

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
@JsonDeserialize(as = CustomFieldMoneyTypeImpl.class)
public interface CustomFieldMoneyType extends FieldType {


   
   public static CustomFieldMoneyTypeImpl of(){
      return new CustomFieldMoneyTypeImpl();
   }
   

   public static CustomFieldMoneyTypeImpl of(final CustomFieldMoneyType template) {
      CustomFieldMoneyTypeImpl instance = new CustomFieldMoneyTypeImpl();
      return instance;
   }

}