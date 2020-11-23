package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupChangeNameAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction;
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
public final class CustomerGroupUpdateActionImpl implements CustomerGroupUpdateAction {

    private String action;

    @JsonCreator
    CustomerGroupUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public CustomerGroupUpdateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }


}