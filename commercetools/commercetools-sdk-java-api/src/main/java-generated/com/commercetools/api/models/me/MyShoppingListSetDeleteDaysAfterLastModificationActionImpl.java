
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListSetDeleteDaysAfterLastModificationActionImpl
        implements MyShoppingListSetDeleteDaysAfterLastModificationAction {

    private String action;

    private Long deleteDaysAfterLastModification;

    @JsonCreator
    MyShoppingListSetDeleteDaysAfterLastModificationActionImpl(
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.action = "setDeleteDaysAfterLastModification";
    }

    public MyShoppingListSetDeleteDaysAfterLastModificationActionImpl() {
        this.action = "setDeleteDaysAfterLastModification";
    }

    public String getAction() {
        return this.action;
    }

    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyShoppingListSetDeleteDaysAfterLastModificationActionImpl that = (MyShoppingListSetDeleteDaysAfterLastModificationActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(deleteDaysAfterLastModification,
            that.deleteDaysAfterLastModification).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deleteDaysAfterLastModification).toHashCode();
    }

}