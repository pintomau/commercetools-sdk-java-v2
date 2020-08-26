package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeFieldDefinitionLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeChangeFieldDefinitionLabelActionBuilder {

    
    private String fieldName;
    
    
    private com.commercetools.api.models.common.LocalizedString label;

    public TypeChangeFieldDefinitionLabelActionBuilder fieldName( final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    
    public TypeChangeFieldDefinitionLabelActionBuilder label( final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    
    public String getFieldName(){
        return this.fieldName;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getLabel(){
        return this.label;
    }

    public TypeChangeFieldDefinitionLabelAction build() {
        return new TypeChangeFieldDefinitionLabelActionImpl(fieldName, label);
    }

    public static TypeChangeFieldDefinitionLabelActionBuilder of() {
        return new TypeChangeFieldDefinitionLabelActionBuilder();
    }

    public static TypeChangeFieldDefinitionLabelActionBuilder of(final TypeChangeFieldDefinitionLabelAction template) {
        TypeChangeFieldDefinitionLabelActionBuilder builder = new TypeChangeFieldDefinitionLabelActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.label = template.getLabel();
        return builder;
    }

}