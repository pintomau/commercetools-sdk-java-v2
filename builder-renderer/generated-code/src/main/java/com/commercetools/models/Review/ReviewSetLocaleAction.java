package com.commercetools.models.Review;

import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetLocaleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReviewSetLocaleActionImpl.class)
public interface ReviewSetLocaleAction extends ReviewUpdateAction {

   
   
   @JsonProperty("locale")
   public String getLocale();

   public void setLocale(final String locale);
   
   public static ReviewSetLocaleActionImpl of(){
      return new ReviewSetLocaleActionImpl();
   }
   

   public static ReviewSetLocaleActionImpl of(final ReviewSetLocaleAction template) {
      ReviewSetLocaleActionImpl instance = new ReviewSetLocaleActionImpl();
      instance.setLocale(template.getLocale());
      return instance;
   }

}