package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.ResourceTypeId;
import com.commercetools.api.models.type.TypeDraftImpl;

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
@JsonDeserialize(as = TypeDraftImpl.class)
public interface TypeDraft  {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    /**
    *  <p>The IDs of the resources that can be customized with this type.</p>
    */
    @NotNull
    @JsonProperty("resourceTypeIds")
    public List<ResourceTypeId> getResourceTypeIds();
    
    @Valid
    @JsonProperty("fieldDefinitions")
    public List<FieldDefinition> getFieldDefinitions();

    public void setKey(final String key);
    
    public void setName(final LocalizedString name);
    
    public void setDescription(final LocalizedString description);
    
    public void setResourceTypeIds(final List<ResourceTypeId> resourceTypeIds);
    
    public void setFieldDefinitions(final List<FieldDefinition> fieldDefinitions);

    public static TypeDraftImpl of(){
        return new TypeDraftImpl();
    }
    

    public static TypeDraftImpl of(final TypeDraft template) {
        TypeDraftImpl instance = new TypeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setResourceTypeIds(template.getResourceTypeIds());
        instance.setFieldDefinitions(template.getFieldDefinitions());
        return instance;
    }

    default <T extends Accessor<TypeDraft>> T withTypeDraft(Function<TypeDraft, T> helper) {
        return helper.apply(this);
    }
}
