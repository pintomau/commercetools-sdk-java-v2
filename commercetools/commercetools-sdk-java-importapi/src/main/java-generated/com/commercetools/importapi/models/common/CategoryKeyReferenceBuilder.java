package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryKeyReferenceBuilder {

    
    private String key;

    public CategoryKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }

    public CategoryKeyReference build() {
        return new CategoryKeyReferenceImpl(key);
    }

    public static CategoryKeyReferenceBuilder of() {
        return new CategoryKeyReferenceBuilder();
    }

    public static CategoryKeyReferenceBuilder of(final CategoryKeyReference template) {
        CategoryKeyReferenceBuilder builder = new CategoryKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}