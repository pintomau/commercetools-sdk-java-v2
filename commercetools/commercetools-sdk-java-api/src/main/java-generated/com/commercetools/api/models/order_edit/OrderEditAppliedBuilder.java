
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditResult;
import com.commercetools.api.models.order_edit.OrderExcerpt;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditAppliedBuilder {

    private java.time.ZonedDateTime appliedAt;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit;

    public OrderEditAppliedBuilder appliedAt(final java.time.ZonedDateTime appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    public OrderEditAppliedBuilder excerptBeforeEdit(
            final com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit) {
        this.excerptBeforeEdit = excerptBeforeEdit;
        return this;
    }

    public OrderEditAppliedBuilder excerptAfterEdit(
            final com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit) {
        this.excerptAfterEdit = excerptAfterEdit;
        return this;
    }

    public java.time.ZonedDateTime getAppliedAt() {
        return this.appliedAt;
    }

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptBeforeEdit() {
        return this.excerptBeforeEdit;
    }

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptAfterEdit() {
        return this.excerptAfterEdit;
    }

    public OrderEditApplied build() {
        return new OrderEditAppliedImpl(appliedAt, excerptBeforeEdit, excerptAfterEdit);
    }

    public static OrderEditAppliedBuilder of() {
        return new OrderEditAppliedBuilder();
    }

    public static OrderEditAppliedBuilder of(final OrderEditApplied template) {
        OrderEditAppliedBuilder builder = new OrderEditAppliedBuilder();
        builder.appliedAt = template.getAppliedAt();
        builder.excerptBeforeEdit = template.getExcerptBeforeEdit();
        builder.excerptAfterEdit = template.getExcerptAfterEdit();
        return builder;
    }

}