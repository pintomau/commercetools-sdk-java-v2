package com.commercetools.importapi.models.importsinks;

import com.commercetools.importapi.models.common.ImportResourceType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>The representation sent to the server when creating or updating an import sink.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSinkDraftImpl implements ImportSinkDraft {

    private Long version;
    
    private String key;
    
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    @JsonCreator
    ImportSinkDraftImpl(@JsonProperty("version") final Long version, @JsonProperty("key") final String key, @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.version = version;
        this.key = key;
        this.resourceType = resourceType;
    }
    public ImportSinkDraftImpl() {
       
    }

    /**
    *  <p>The version of this resource.</p>
    */
    public Long getVersion(){
        return this.version;
    }
    
    /**
    *  <p>The unique key of the import sink.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>The type of import resource sent to this import sink.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType(){
        return this.resourceType;
    }

    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setResourceType(final com.commercetools.importapi.models.common.ImportResourceType resourceType){
        this.resourceType = resourceType;
    }

}
