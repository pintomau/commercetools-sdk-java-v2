
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetTextLineItemCustomTypeActionImpl
        implements MyShoppingListSetTextLineItemCustomTypeAction {

    private String action;

    private String textLineItemId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    MyShoppingListSetTextLineItemCustomTypeActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.textLineItemId = textLineItemId;
        this.type = type;
        this.fields = fields;
        this.action = "setTextLineItemCustomType";
    }

    public MyShoppingListSetTextLineItemCustomTypeActionImpl() {
        this.action = "setTextLineItemCustomType";
    }

    public String getAction() {
        return this.action;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListSetTextLineItemCustomTypeActionImpl that = (MyShoppingListSetTextLineItemCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(textLineItemId, that.textLineItemId).append(type,
            that.type).append(fields, that.fields).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(textLineItemId).append(type).append(
            fields).toHashCode();
    }

}