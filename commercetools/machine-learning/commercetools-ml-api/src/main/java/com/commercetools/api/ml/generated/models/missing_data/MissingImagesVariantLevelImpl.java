package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingImagesCount;
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
public final class MissingImagesVariantLevelImpl implements MissingImagesVariantLevel {

   private Long missingImages;
   
   private Long total;

   @JsonCreator
   MissingImagesVariantLevelImpl(@JsonProperty("missingImages") final Long missingImages, @JsonProperty("total") final Long total) {
      this.missingImages = missingImages;
      this.total = total;
   }
   public MissingImagesVariantLevelImpl() {
      
   }
   
   /**
   *  <p>Number of product variants missing images.</p>
   */
   public Long getMissingImages(){
      return this.missingImages;
   }
   
   /**
   *  <p>Number of products scanned.</p>
   */
   public Long getTotal(){
      return this.total;
   }

   public void setMissingImages(final Long missingImages){
      this.missingImages = missingImages;
   }
   
   public void setTotal(final Long total){
      this.total = total;
   }

}
