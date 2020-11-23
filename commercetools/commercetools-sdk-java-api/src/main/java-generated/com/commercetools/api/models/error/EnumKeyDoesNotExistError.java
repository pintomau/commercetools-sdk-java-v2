package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.EnumKeyDoesNotExistErrorImpl;

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
@JsonDeserialize(as = EnumKeyDoesNotExistErrorImpl.class)
public interface EnumKeyDoesNotExistError extends ErrorObject {

    
    @NotNull
    @JsonProperty("conflictingEnumKey")
    public String getConflictingEnumKey();
    
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    public void setConflictingEnumKey(final String conflictingEnumKey);
    
    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static EnumKeyDoesNotExistErrorImpl of(){
        return new EnumKeyDoesNotExistErrorImpl();
    }
    

    public static EnumKeyDoesNotExistErrorImpl of(final EnumKeyDoesNotExistError template) {
        EnumKeyDoesNotExistErrorImpl instance = new EnumKeyDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    default <T> T withEnumKeyDoesNotExistError(Function<EnumKeyDoesNotExistError, T> helper) {
        return helper.apply(this);
    }
}