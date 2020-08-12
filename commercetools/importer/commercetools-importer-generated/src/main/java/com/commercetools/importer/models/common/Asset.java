package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.AssetSource;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.common.AssetImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AssetImpl.class)
public interface Asset  {

   /**
   *  <p>User-defined identifier for the asset.
   *  Asset keys are unique inside their container (a product variant or a category).</p>
   */
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
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

   public void setKey(final String key);
   
   public void setSources(final List<AssetSource> sources);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setTags(final List<String> tags);
   
   public static AssetImpl of(){
      return new AssetImpl();
   }
   

   public static AssetImpl of(final Asset template) {
      AssetImpl instance = new AssetImpl();
      instance.setKey(template.getKey());
      instance.setSources(template.getSources());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setTags(template.getTags());
      return instance;
   }

}