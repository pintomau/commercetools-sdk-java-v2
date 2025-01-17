
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreDraftImpl.class)
public interface StoreDraft {

    /**
    *  <p>User-specific unique identifier for the store.
    *  The <code>key</code> is mandatory and immutable.
    *  It is used to reference the store.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The name of the store</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
    *  <p>Set of ResourceIdentifiers to a Channel with <code>ProductDistribution</code> role</p>
    */
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();

    /**
    *  <p>Set of ResourceIdentifiers of Channels with <code>InventorySupply</code> role</p>
    */
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    @JsonIgnore
    public void setDistributionChannels(final ChannelResourceIdentifier... distributionChannels);

    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);

    @JsonIgnore
    public void setSupplyChannels(final ChannelResourceIdentifier... supplyChannels);

    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    public void setCustom(final CustomFieldsDraft custom);

    public static StoreDraft of() {
        return new StoreDraftImpl();
    }

    public static StoreDraft of(final StoreDraft template) {
        StoreDraftImpl instance = new StoreDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StoreDraftBuilder builder() {
        return StoreDraftBuilder.of();
    }

    public static StoreDraftBuilder builder(final StoreDraft template) {
        return StoreDraftBuilder.of(template);
    }

    default <T> T withStoreDraft(Function<StoreDraft, T> helper) {
        return helper.apply(this);
    }
}
