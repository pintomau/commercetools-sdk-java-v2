package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.MoneySetFieldImpl;

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
*  <p>A field with a money set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MoneySetFieldImpl.class)
public interface MoneySetField extends CustomField {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<Money> getValue();

    public void setValue(final List<Money> value);

    public static MoneySetFieldImpl of(){
        return new MoneySetFieldImpl();
    }
    

    public static MoneySetFieldImpl of(final MoneySetField template) {
        MoneySetFieldImpl instance = new MoneySetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
