package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditPagedQueryResponseImpl;

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
@JsonDeserialize(as = OrderEditPagedQueryResponseImpl.class)
public interface OrderEditPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("limit")
   public Long getLimit();
   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<OrderEdit> getResults();

   public void setLimit(final Long limit);
   
   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<OrderEdit> results);
   
   public static OrderEditPagedQueryResponseImpl of(){
      return new OrderEditPagedQueryResponseImpl();
   }
   

   public static OrderEditPagedQueryResponseImpl of(final OrderEditPagedQueryResponse template) {
      OrderEditPagedQueryResponseImpl instance = new OrderEditPagedQueryResponseImpl();
      instance.setLimit(template.getLimit());
      instance.setCount(template.getCount());
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setResults(template.getResults());
      return instance;
   }

}