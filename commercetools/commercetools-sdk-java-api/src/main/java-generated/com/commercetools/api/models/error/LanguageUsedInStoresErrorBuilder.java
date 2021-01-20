
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.LanguageUsedInStoresError;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LanguageUsedInStoresErrorBuilder {

    private String message;

    public LanguageUsedInStoresErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public LanguageUsedInStoresError build() {
        return new LanguageUsedInStoresErrorImpl(message);
    }

    public static LanguageUsedInStoresErrorBuilder of() {
        return new LanguageUsedInStoresErrorBuilder();
    }

    public static LanguageUsedInStoresErrorBuilder of(final LanguageUsedInStoresError template) {
        LanguageUsedInStoresErrorBuilder builder = new LanguageUsedInStoresErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}