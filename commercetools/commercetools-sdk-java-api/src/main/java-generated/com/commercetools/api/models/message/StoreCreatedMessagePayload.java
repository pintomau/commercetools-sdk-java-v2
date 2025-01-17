
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
@JsonDeserialize(as = StoreCreatedMessagePayloadImpl.class)
public interface StoreCreatedMessagePayload extends MessagePayload {

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

    public static StoreCreatedMessagePayload of() {
        return new StoreCreatedMessagePayloadImpl();
    }

    public static StoreCreatedMessagePayload of(final StoreCreatedMessagePayload template) {
        StoreCreatedMessagePayloadImpl instance = new StoreCreatedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StoreCreatedMessagePayloadBuilder builder() {
        return StoreCreatedMessagePayloadBuilder.of();
    }

    public static StoreCreatedMessagePayloadBuilder builder(final StoreCreatedMessagePayload template) {
        return StoreCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreCreatedMessagePayload(Function<StoreCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
