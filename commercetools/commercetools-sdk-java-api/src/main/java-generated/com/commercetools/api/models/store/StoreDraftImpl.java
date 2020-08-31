package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreDraftImpl implements StoreDraft {

    private String key;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private java.util.List<String> languages;
    
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;
    
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    @JsonCreator
    StoreDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("languages") final java.util.List<String> languages, @JsonProperty("distributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels, @JsonProperty("supplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.key = key;
        this.name = name;
        this.languages = languages;
        this.distributionChannels = distributionChannels;
        this.supplyChannels = supplyChannels;
    }
    public StoreDraftImpl() {
       
    }

    /**
    *  <p>User-specific unique identifier for the store.
    *  The <code>key</code> is mandatory and immutable.
    *  It is used to reference the store.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>The name of the store</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public java.util.List<String> getLanguages(){
        return this.languages;
    }
    
    /**
    *  <p>Set of ResourceIdentifiers to a Channel with <code>ProductDistribution</code> role</p>
    */
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels(){
        return this.distributionChannels;
    }
    
    /**
    *  <p>Set of ResourceIdentifiers of Channels with <code>InventorySupply</code> role</p>
    */
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels(){
        return this.supplyChannels;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setLanguages(final java.util.List<String> languages){
        this.languages = languages;
    }
    
    public void setDistributionChannels(final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels){
        this.distributionChannels = distributionChannels;
    }
    
    public void setSupplyChannels(final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels){
        this.supplyChannels = supplyChannels;
    }

}