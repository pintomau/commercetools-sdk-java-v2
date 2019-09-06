package com.commercetools.models.ProductType;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
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
public final class ProductTypeResourceIdentifierImpl implements ProductTypeResourceIdentifier {

   private com.commercetools.models.Common.ReferenceTypeId typeId;
   
   private java.lang.String id;
   
   private java.lang.String key;

   @JsonCreator
   ProductTypeResourceIdentifierImpl(@JsonProperty("id") final java.lang.String id, @JsonProperty("key") final java.lang.String key) {
      this.id = id;
      this.key = key;
      this.typeId = ReferenceTypeId.findEnumViaJsonName("product-type").get();
   }
   public ProductTypeResourceIdentifierImpl() {
      
   }
   
   
   public com.commercetools.models.Common.ReferenceTypeId getTypeId(){
      return this.typeId;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}