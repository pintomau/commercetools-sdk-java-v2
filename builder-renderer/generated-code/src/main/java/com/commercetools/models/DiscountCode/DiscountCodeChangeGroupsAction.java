package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeChangeGroupsActionImpl;

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
@JsonDeserialize(as = DiscountCodeChangeGroupsActionImpl.class)
public interface DiscountCodeChangeGroupsAction extends DiscountCodeUpdateAction {

   
   @NotNull
   @JsonProperty("groups")
   public List<String> getGroups();

   public void setGroups(final List<String> groups);
   
   public static DiscountCodeChangeGroupsActionImpl of(){
      return new DiscountCodeChangeGroupsActionImpl();
   }
   

   public static DiscountCodeChangeGroupsActionImpl of(final DiscountCodeChangeGroupsAction template) {
      DiscountCodeChangeGroupsActionImpl instance = new DiscountCodeChangeGroupsActionImpl();
      instance.setGroups(template.getGroups());
      return instance;
   }

}