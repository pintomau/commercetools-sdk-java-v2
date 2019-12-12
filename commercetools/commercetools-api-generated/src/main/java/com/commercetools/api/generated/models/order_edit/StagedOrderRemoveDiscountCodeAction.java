package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderRemoveDiscountCodeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = StagedOrderRemoveDiscountCodeActionImpl.class)
public interface StagedOrderRemoveDiscountCodeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static StagedOrderRemoveDiscountCodeActionImpl of(){
      return new StagedOrderRemoveDiscountCodeActionImpl();
   }
   

   public static StagedOrderRemoveDiscountCodeActionImpl of(final StagedOrderRemoveDiscountCodeAction template) {
      StagedOrderRemoveDiscountCodeActionImpl instance = new StagedOrderRemoveDiscountCodeActionImpl();
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}