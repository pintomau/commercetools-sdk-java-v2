package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.LocalizedStringSetFieldImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A field with a localized string set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizedStringSetFieldImpl.class)
public interface LocalizedStringSetField extends CustomField {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<LocalizedString> getValue();

    public void setValue(final List<LocalizedString> value);

    public static LocalizedStringSetFieldImpl of(){
        return new LocalizedStringSetFieldImpl();
    }
    

    public static LocalizedStringSetFieldImpl of(final LocalizedStringSetField template) {
        LocalizedStringSetFieldImpl instance = new LocalizedStringSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
