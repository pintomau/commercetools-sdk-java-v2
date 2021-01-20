
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifier;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public OrderResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public OrderResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public OrderResourceIdentifier build() {
        return new OrderResourceIdentifierImpl(id, key);
    }

    public static OrderResourceIdentifierBuilder of() {
        return new OrderResourceIdentifierBuilder();
    }

    public static OrderResourceIdentifierBuilder of(final OrderResourceIdentifier template) {
        OrderResourceIdentifierBuilder builder = new OrderResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}