
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreCreatedMessageImpl.class)
public interface StoreCreatedMessage extends Message {

    String STORE_CREATED = "StoreCreated";

    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    @NotNull
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelReference> getDistributionChannels();

    @NotNull
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelReference> getSupplyChannels();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    @JsonIgnore
    public void setDistributionChannels(final ChannelReference... distributionChannels);

    public void setDistributionChannels(final List<ChannelReference> distributionChannels);

    @JsonIgnore
    public void setSupplyChannels(final ChannelReference... supplyChannels);

    public void setSupplyChannels(final List<ChannelReference> supplyChannels);

    public void setCustom(final CustomFields custom);

    public static StoreCreatedMessage of() {
        return new StoreCreatedMessageImpl();
    }

    public static StoreCreatedMessage of(final StoreCreatedMessage template) {
        StoreCreatedMessageImpl instance = new StoreCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StoreCreatedMessageBuilder builder() {
        return StoreCreatedMessageBuilder.of();
    }

    public static StoreCreatedMessageBuilder builder(final StoreCreatedMessage template) {
        return StoreCreatedMessageBuilder.of(template);
    }

    default <T> T withStoreCreatedMessage(Function<StoreCreatedMessage, T> helper) {
        return helper.apply(this);
    }
}
