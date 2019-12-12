package com.commercetools.api.generated.models.product;


import com.commercetools.api.generated.models.product.FacetResultsImpl;

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
@JsonDeserialize(as = FacetResultsImpl.class)
public interface FacetResults  {

   
   @NotNull
   @JsonAnyGetter
   public Map<String, JsonNode> values();

   @JsonAnySetter
   public void setValue(String key, JsonNode value);
   
   public static FacetResultsImpl of(){
      return new FacetResultsImpl();
   }
   

   public static FacetResultsImpl of(final FacetResults template) {
      FacetResultsImpl instance = new FacetResultsImpl();
      return instance;
   }

}