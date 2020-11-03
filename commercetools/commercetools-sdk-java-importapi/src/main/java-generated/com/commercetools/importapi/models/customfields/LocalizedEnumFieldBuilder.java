package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.LocalizedEnumField;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizedEnumFieldBuilder {

    
    private String value;

    public LocalizedEnumFieldBuilder value( final String value) {
        this.value = value;
        return this;
    }

    
    public String getValue(){
        return this.value;
    }

    public LocalizedEnumField build() {
        return new LocalizedEnumFieldImpl(value);
    }

    public static LocalizedEnumFieldBuilder of() {
        return new LocalizedEnumFieldBuilder();
    }

    public static LocalizedEnumFieldBuilder of(final LocalizedEnumField template) {
        LocalizedEnumFieldBuilder builder = new LocalizedEnumFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
