
package com.commercetools.importapi.models.producttypes;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.producttypes.AttributeDateType;
import com.commercetools.importapi.models.producttypes.AttributeType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDateTypeBuilder {

    public AttributeDateType build() {
        return new AttributeDateTypeImpl();
    }

    public static AttributeDateTypeBuilder of() {
        return new AttributeDateTypeBuilder();
    }

    public static AttributeDateTypeBuilder of(final AttributeDateType template) {
        AttributeDateTypeBuilder builder = new AttributeDateTypeBuilder();
        return builder;
    }

}