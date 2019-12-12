package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.generated.models.order_edit.OrderEditSetKeyActionImpl;

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
@JsonDeserialize(as = OrderEditSetKeyActionImpl.class)
public interface OrderEditSetKeyAction extends OrderEditUpdateAction {

   /**
   *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static OrderEditSetKeyActionImpl of(){
      return new OrderEditSetKeyActionImpl();
   }
   

   public static OrderEditSetKeyActionImpl of(final OrderEditSetKeyAction template) {
      OrderEditSetKeyActionImpl instance = new OrderEditSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}