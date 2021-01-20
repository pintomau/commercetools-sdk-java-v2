
package com.commercetools.importapi.models.common;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.StoreKeyReference;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreKeyReferenceBuilder {

    private String key;

    public StoreKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StoreKeyReference build() {
        return new StoreKeyReferenceImpl(key);
    }

    public static StoreKeyReferenceBuilder of() {
        return new StoreKeyReferenceBuilder();
    }

    public static StoreKeyReferenceBuilder of(final StoreKeyReference template) {
        StoreKeyReferenceBuilder builder = new StoreKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
