package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPriceDiscountsSetMessagePayloadImpl implements ProductPriceDiscountsSetMessagePayload {

   private java.lang.String type;
   
   private java.util.List<com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

   @JsonCreator
   ProductPriceDiscountsSetMessagePayloadImpl(@JsonProperty("updatedPrices") final java.util.List<com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
      this.updatedPrices = updatedPrices;
      this.type = "ProductPriceDiscountsSet";
   }
   public ProductPriceDiscountsSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
      return this.updatedPrices;
   }

   public void setUpdatedPrices(final java.util.List<com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices){
      this.updatedPrices = updatedPrices;
   }

}