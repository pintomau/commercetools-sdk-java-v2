package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
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
public final class DiscountCodeSetNameActionImpl implements DiscountCodeSetNameAction {

   private String action;
   
   private com.commercetools.api.models.common.LocalizedString name;

   @JsonCreator
   DiscountCodeSetNameActionImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      this.action = "setName";
   }
   public DiscountCodeSetNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If the <code>name</code> parameter is not included, the field will be emptied.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }

}