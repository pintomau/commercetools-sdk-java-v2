package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductData;
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
public final class ProductCatalogDataImpl implements ProductCatalogData {

   private Boolean published;
   
   private com.commercetools.api.models.product.ProductData current;
   
   private com.commercetools.api.models.product.ProductData staged;
   
   private Boolean hasStagedChanges;

   @JsonCreator
   ProductCatalogDataImpl(@JsonProperty("published") final Boolean published, @JsonProperty("current") final com.commercetools.api.models.product.ProductData current, @JsonProperty("staged") final com.commercetools.api.models.product.ProductData staged, @JsonProperty("hasStagedChanges") final Boolean hasStagedChanges) {
      this.published = published;
      this.current = current;
      this.staged = staged;
      this.hasStagedChanges = hasStagedChanges;
   }
   public ProductCatalogDataImpl() {
      
   }
   
   
   public Boolean getPublished(){
      return this.published;
   }
   
   
   public com.commercetools.api.models.product.ProductData getCurrent(){
      return this.current;
   }
   
   
   public com.commercetools.api.models.product.ProductData getStaged(){
      return this.staged;
   }
   
   
   public Boolean getHasStagedChanges(){
      return this.hasStagedChanges;
   }

   public void setPublished(final Boolean published){
      this.published = published;
   }
   
   public void setCurrent(final com.commercetools.api.models.product.ProductData current){
      this.current = current;
   }
   
   public void setStaged(final com.commercetools.api.models.product.ProductData staged){
      this.staged = staged;
   }
   
   public void setHasStagedChanges(final Boolean hasStagedChanges){
      this.hasStagedChanges = hasStagedChanges;
   }

}