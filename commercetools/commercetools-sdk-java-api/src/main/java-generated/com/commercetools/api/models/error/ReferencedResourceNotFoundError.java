
package com.commercetools.api.models.error;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ReferencedResourceNotFoundErrorImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReferencedResourceNotFoundErrorImpl.class)
public interface ReferencedResourceNotFoundError extends ErrorObject {

    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    @JsonProperty("id")
    public String getId();

    @JsonProperty("key")
    public String getKey();

    public void setTypeId(final ReferenceTypeId typeId);

    public void setId(final String id);

    public void setKey(final String key);

    public static ReferencedResourceNotFoundError of() {
        return new ReferencedResourceNotFoundErrorImpl();
    }

    public static ReferencedResourceNotFoundError of(final ReferencedResourceNotFoundError template) {
        ReferencedResourceNotFoundErrorImpl instance = new ReferencedResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setTypeId(template.getTypeId());
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReferencedResourceNotFoundErrorBuilder builder() {
        return ReferencedResourceNotFoundErrorBuilder.of();
    }

    public static ReferencedResourceNotFoundErrorBuilder builder(final ReferencedResourceNotFoundError template) {
        return ReferencedResourceNotFoundErrorBuilder.of(template);
    }

    default <T> T withReferencedResourceNotFoundError(Function<ReferencedResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }
}