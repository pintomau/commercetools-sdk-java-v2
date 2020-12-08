package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListChangeLineItemsOrderActionImpl implements MyShoppingListChangeLineItemsOrderAction {

    private String action;
    
    private java.util.List<String> lineItemOrder;

    @JsonCreator
    MyShoppingListChangeLineItemsOrderActionImpl(@JsonProperty("lineItemOrder") final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        this.action = "changeLineItemsOrder";
    }
    public MyShoppingListChangeLineItemsOrderActionImpl() {
        this.action = "changeLineItemsOrder";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<String> getLineItemOrder(){
        return this.lineItemOrder;
    }

    public void setLineItemOrder(final String ...lineItemOrder){
       this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
    }
    
    public void setLineItemOrder(final java.util.List<String> lineItemOrder){
       this.lineItemOrder = lineItemOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyShoppingListChangeLineItemsOrderActionImpl that = (MyShoppingListChangeLineItemsOrderActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(lineItemOrder, that.lineItemOrder)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(lineItemOrder)
            .toHashCode();
    }

}
