package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
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
public final class ReviewSetTextActionImpl implements ReviewSetTextAction {

   private String action;
   
   private String text;

   @JsonCreator
   ReviewSetTextActionImpl(@JsonProperty("text") final String text) {
      this.text = text;
      this.action = "setText";
   }
   public ReviewSetTextActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If <code>text</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   public String getText(){
      return this.text;
   }

   public void setText(final String text){
      this.text = text;
   }

}