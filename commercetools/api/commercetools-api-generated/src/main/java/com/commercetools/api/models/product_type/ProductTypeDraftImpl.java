package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeDefinitionDraft;
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
public final class ProductTypeDraftImpl implements ProductTypeDraft {

   private String key;
   
   private String name;
   
   private String description;
   
   private java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes;

   @JsonCreator
   ProductTypeDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes) {
      this.key = key;
      this.name = name;
      this.description = description;
      this.attributes = attributes;
   }
   public ProductTypeDraftImpl() {
      
   }
   
   /**
   *  <p>User-specific unique identifier for the product type (min.
   *  2 and max.
   *  256 characters).</p>
   */
   public String getKey(){
      return this.key;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> getAttributes(){
      return this.attributes;
   }

   public void setKey(final String key){
      this.key = key;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setDescription(final String description){
      this.description = description;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes){
      this.attributes = attributes;
   }

}