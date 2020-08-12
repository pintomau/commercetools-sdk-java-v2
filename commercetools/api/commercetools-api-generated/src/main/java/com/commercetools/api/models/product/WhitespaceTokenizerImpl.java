package com.commercetools.api.models.product;

import com.commercetools.api.models.product.SuggestTokenizer;
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
public final class WhitespaceTokenizerImpl implements WhitespaceTokenizer {

   private String type;

   @JsonCreator
   WhitespaceTokenizerImpl() {
      this.type = "whitespace";
   }
   
   
   
   public String getType(){
      return this.type;
   }


}