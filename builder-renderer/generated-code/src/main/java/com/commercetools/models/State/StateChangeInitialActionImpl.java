package com.commercetools.models.State;

import com.commercetools.models.State.StateUpdateAction;
import java.lang.Boolean;
import java.lang.String;
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
public final class StateChangeInitialActionImpl implements StateChangeInitialAction {

   private java.lang.String action;
   
   private java.lang.Boolean initial;

   @JsonCreator
   StateChangeInitialActionImpl(@JsonProperty("initial") final java.lang.Boolean initial) {
      this.initial = initial;
      this.action = "changeInitial";
   }
   public StateChangeInitialActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getInitial(){
      return this.initial;
   }

   public void setInitial(final java.lang.Boolean initial){
      this.initial = initial;
   }

}