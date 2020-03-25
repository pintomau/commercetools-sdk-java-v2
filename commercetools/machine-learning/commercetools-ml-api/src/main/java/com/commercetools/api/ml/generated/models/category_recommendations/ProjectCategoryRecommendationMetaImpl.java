package com.commercetools.api.ml.generated.models.category_recommendations;


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
public final class ProjectCategoryRecommendationMetaImpl implements ProjectCategoryRecommendationMeta {

   private String productName;
   
   private String productImageUrl;
   
   private List<String> generalCategoryNames;

   @JsonCreator
   ProjectCategoryRecommendationMetaImpl(@JsonProperty("productName") final String productName, @JsonProperty("productImageUrl") final String productImageUrl, @JsonProperty("generalCategoryNames") final List<String> generalCategoryNames) {
      this.productName = productName;
      this.productImageUrl = productImageUrl;
      this.generalCategoryNames = generalCategoryNames;
   }
   public ProjectCategoryRecommendationMetaImpl() {
      
   }
   
   /**
   *  <p>The product name that was used to generate recommendations.</p>
   */
   public String getProductName(){
      return this.productName;
   }
   
   /**
   *  <p>The product image that was used to generate recommendations.</p>
   */
   public String getProductImageUrl(){
      return this.productImageUrl;
   }
   
   /**
   *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
   */
   public List<String> getGeneralCategoryNames(){
      return this.generalCategoryNames;
   }

   public void setProductName(final String productName){
      this.productName = productName;
   }
   
   public void setProductImageUrl(final String productImageUrl){
      this.productImageUrl = productImageUrl;
   }
   
   public void setGeneralCategoryNames(final List<String> generalCategoryNames){
      this.generalCategoryNames = generalCategoryNames;
   }

}
