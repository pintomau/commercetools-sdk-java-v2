package com.commercetools.api.models.common;


import com.commercetools.api.models.common.LocalizedStringImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizedStringImpl.class)
public interface LocalizedString  {

    
    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    @JsonAnySetter
    public void setValue(String key, String value);

    public static LocalizedStringImpl of(){
        return new LocalizedStringImpl();
    }
    

    public static LocalizedStringImpl of(final LocalizedString template) {
        LocalizedStringImpl instance = new LocalizedStringImpl();
        return instance;
    }

    default <T extends Accessor<LocalizedString>> T withLocalizedString(Function<LocalizedString, T> helper) {
        return helper.apply(this);
    }
}
