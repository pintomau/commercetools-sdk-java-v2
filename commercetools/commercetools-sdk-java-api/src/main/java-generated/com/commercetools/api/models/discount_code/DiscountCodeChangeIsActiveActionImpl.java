package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeChangeIsActiveActionImpl implements DiscountCodeChangeIsActiveAction {

    private String action;
    
    private Boolean isActive;

    @JsonCreator
    DiscountCodeChangeIsActiveActionImpl(@JsonProperty("isActive") final Boolean isActive) {
        this.isActive = isActive;
        this.action = "changeIsActive";
    }
    public DiscountCodeChangeIsActiveActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Boolean getIsActive(){
        return this.isActive;
    }

    public void setIsActive(final Boolean isActive){
        this.isActive = isActive;
    }

}