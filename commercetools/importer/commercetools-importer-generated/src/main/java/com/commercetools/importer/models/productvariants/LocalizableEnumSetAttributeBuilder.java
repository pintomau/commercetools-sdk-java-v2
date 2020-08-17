package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.LocalizableEnumSetAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizableEnumSetAttributeBuilder {

    @Nullable
    private String name;
    
    
    private java.util.List<String> value;

    public LocalizableEnumSetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    public LocalizableEnumSetAttributeBuilder value( final java.util.List<String> value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName(){
        return this.name;
    }
    
    
    public java.util.List<String> getValue(){
        return this.value;
    }

    public LocalizableEnumSetAttribute build() {
        return new LocalizableEnumSetAttributeImpl(name, value);
    }

    public static LocalizableEnumSetAttributeBuilder of() {
        return new LocalizableEnumSetAttributeBuilder();
    }

    public static LocalizableEnumSetAttributeBuilder of(final LocalizableEnumSetAttribute template) {
        LocalizableEnumSetAttributeBuilder builder = new LocalizableEnumSetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
