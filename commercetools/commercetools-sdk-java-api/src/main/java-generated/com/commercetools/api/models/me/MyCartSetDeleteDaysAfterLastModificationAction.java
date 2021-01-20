
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCartSetDeleteDaysAfterLastModificationActionImpl;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface MyCartSetDeleteDaysAfterLastModificationAction extends MyCartUpdateAction {

    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    public static MyCartSetDeleteDaysAfterLastModificationAction of() {
        return new MyCartSetDeleteDaysAfterLastModificationActionImpl();
    }

    public static MyCartSetDeleteDaysAfterLastModificationAction of(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        MyCartSetDeleteDaysAfterLastModificationActionImpl instance = new MyCartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return MyCartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder builder(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        return MyCartSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    default <T> T withMyCartSetDeleteDaysAfterLastModificationAction(
            Function<MyCartSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }
}
