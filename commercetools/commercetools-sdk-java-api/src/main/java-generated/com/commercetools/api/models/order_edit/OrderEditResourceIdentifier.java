package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditResourceIdentifierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditResourceIdentifierImpl.class)
public interface OrderEditResourceIdentifier extends ResourceIdentifier {



    public static OrderEditResourceIdentifierImpl of(){
        return new OrderEditResourceIdentifierImpl();
    }
    

    public static OrderEditResourceIdentifierImpl of(final OrderEditResourceIdentifier template) {
        OrderEditResourceIdentifierImpl instance = new OrderEditResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withOrderEditResourceIdentifier(Function<OrderEditResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}