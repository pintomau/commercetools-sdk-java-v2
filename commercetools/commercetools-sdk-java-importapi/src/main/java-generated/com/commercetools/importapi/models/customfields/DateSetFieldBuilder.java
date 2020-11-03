package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.LocalDate;
import com.commercetools.importapi.models.customfields.DateSetField;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DateSetFieldBuilder {

    
    private java.util.List<java.time.LocalDate> value;

    public DateSetFieldBuilder value( final java.time.LocalDate ...value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }
    
    public DateSetFieldBuilder value( final java.util.List<java.time.LocalDate> value) {
        this.value = value;
        return this;
    }

    
    public java.util.List<java.time.LocalDate> getValue(){
        return this.value;
    }

    public DateSetField build() {
        return new DateSetFieldImpl(value);
    }

    public static DateSetFieldBuilder of() {
        return new DateSetFieldBuilder();
    }

    public static DateSetFieldBuilder of(final DateSetField template) {
        DateSetFieldBuilder builder = new DateSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
