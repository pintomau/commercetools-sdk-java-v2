package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.Long;
import com.commercetools.models.Review.ReviewUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.Review.ReviewUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ReviewUpdateBuilder actions( final java.util.List<com.commercetools.models.Review.ReviewUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ReviewUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Review.ReviewUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ReviewUpdate build() {
       return new ReviewUpdateImpl(actions, version);
   }
   
   public static ReviewUpdateBuilder of() {
      return new ReviewUpdateBuilder();
   }
   
   public static ReviewUpdateBuilder of(final ReviewUpdate template) {
      ReviewUpdateBuilder builder = new ReviewUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}