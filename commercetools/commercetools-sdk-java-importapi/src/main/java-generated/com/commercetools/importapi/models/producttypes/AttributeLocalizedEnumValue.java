package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeLocalizedEnumValueImpl.class)
public interface AttributeLocalizedEnumValue  {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setKey(final String key);
    
    public void setLabel(final LocalizedString label);

    public static AttributeLocalizedEnumValueImpl of(){
        return new AttributeLocalizedEnumValueImpl();
    }
    

    public static AttributeLocalizedEnumValueImpl of(final AttributeLocalizedEnumValue template) {
        AttributeLocalizedEnumValueImpl instance = new AttributeLocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    default <T> T withAttributeLocalizedEnumValue(Function<AttributeLocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }
}