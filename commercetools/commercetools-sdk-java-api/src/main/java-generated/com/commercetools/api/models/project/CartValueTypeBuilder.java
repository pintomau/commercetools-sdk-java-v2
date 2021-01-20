
package com.commercetools.api.models.project;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.project.CartValueType;
import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartValueTypeBuilder {

    public CartValueType build() {
        return new CartValueTypeImpl();
    }

    public static CartValueTypeBuilder of() {
        return new CartValueTypeBuilder();
    }

    public static CartValueTypeBuilder of(final CartValueType template) {
        CartValueTypeBuilder builder = new CartValueTypeBuilder();
        return builder;
    }

}
