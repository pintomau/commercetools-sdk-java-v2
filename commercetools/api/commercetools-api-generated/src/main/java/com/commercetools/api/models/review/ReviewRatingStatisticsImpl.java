package com.commercetools.api.models.review;

import com.fasterxml.jackson.databind.JsonNode;
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
public final class ReviewRatingStatisticsImpl implements ReviewRatingStatistics {

   private Double averageRating;
   
   private Double highestRating;
   
   private Double lowestRating;
   
   private Integer count;
   
   private com.fasterxml.jackson.databind.JsonNode ratingsDistribution;

   @JsonCreator
   ReviewRatingStatisticsImpl(@JsonProperty("averageRating") final Double averageRating, @JsonProperty("highestRating") final Double highestRating, @JsonProperty("lowestRating") final Double lowestRating, @JsonProperty("count") final Integer count, @JsonProperty("ratingsDistribution") final com.fasterxml.jackson.databind.JsonNode ratingsDistribution) {
      this.averageRating = averageRating;
      this.highestRating = highestRating;
      this.lowestRating = lowestRating;
      this.count = count;
      this.ratingsDistribution = ratingsDistribution;
   }
   public ReviewRatingStatisticsImpl() {
      
   }
   
   /**
   *  <p>Average rating of one target
   *  This number is rounded with 5 decimals.</p>
   */
   public Double getAverageRating(){
      return this.averageRating;
   }
   
   /**
   *  <p>Highest rating of one target</p>
   */
   public Double getHighestRating(){
      return this.highestRating;
   }
   
   /**
   *  <p>Lowest rating of one target</p>
   */
   public Double getLowestRating(){
      return this.lowestRating;
   }
   
   /**
   *  <p>Number of ratings taken into account</p>
   */
   public Integer getCount(){
      return this.count;
   }
   
   /**
   *  <p>The full distribution of the ratings.
   *  The keys are the different ratings and the values are the count of reviews having this rating.
   *  Only the used ratings appear in this object.</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getRatingsDistribution(){
      return this.ratingsDistribution;
   }

   public void setAverageRating(final Double averageRating){
      this.averageRating = averageRating;
   }
   
   public void setHighestRating(final Double highestRating){
      this.highestRating = highestRating;
   }
   
   public void setLowestRating(final Double lowestRating){
      this.lowestRating = lowestRating;
   }
   
   public void setCount(final Integer count){
      this.count = count;
   }
   
   public void setRatingsDistribution(final com.fasterxml.jackson.databind.JsonNode ratingsDistribution){
      this.ratingsDistribution = ratingsDistribution;
   }

}