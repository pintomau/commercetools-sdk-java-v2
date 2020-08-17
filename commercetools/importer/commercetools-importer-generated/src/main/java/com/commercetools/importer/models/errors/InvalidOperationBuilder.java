package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.InvalidOperation;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidOperationBuilder {

    
    private String message;

    public InvalidOperationBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public InvalidOperation build() {
        return new InvalidOperationImpl(message);
    }

    public static InvalidOperationBuilder of() {
        return new InvalidOperationBuilder();
    }

    public static InvalidOperationBuilder of(final InvalidOperation template) {
        InvalidOperationBuilder builder = new InvalidOperationBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
