package com.commercetools.api.models.common;

import com.commercetools.api.models.common.AssetSource;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.common.AssetDraftImpl;

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
@JsonDeserialize(as = AssetDraftImpl.class)
public interface AssetDraft  {

    
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    
    
    @JsonProperty("tags")
    public List<String> getTags();
    
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();
    
    
    @JsonProperty("key")
    public String getKey();

    @JsonIgnore
    public void setSources(final AssetSource ...sources);
    public void setSources(final List<AssetSource> sources);
    
    public void setName(final LocalizedString name);
    
    public void setDescription(final LocalizedString description);
    
    @JsonIgnore
    public void setTags(final String ...tags);
    public void setTags(final List<String> tags);
    
    public void setCustom(final CustomFieldsDraft custom);
    
    public void setKey(final String key);

    public static AssetDraftImpl of(){
        return new AssetDraftImpl();
    }
    

    public static AssetDraftImpl of(final AssetDraft template) {
        AssetDraftImpl instance = new AssetDraftImpl();
        instance.setSources(template.getSources());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setTags(template.getTags());
        instance.setCustom(template.getCustom());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withAssetDraft(Function<AssetDraft, T> helper) {
        return helper.apply(this);
    }
}