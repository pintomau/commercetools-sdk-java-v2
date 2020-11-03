package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.customers.CustomerImport;
import com.commercetools.importapi.models.importrequests.ImportRequest;
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
*  <p>An import request for multiple customer import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerImportRequestImpl implements CustomerImportRequest {

    private com.commercetools.importapi.models.common.ImportResourceType type;
    
    private java.util.List<com.commercetools.importapi.models.customers.CustomerImport> resources;

    @JsonCreator
    CustomerImportRequestImpl(@JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.customers.CustomerImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnumViaJsonName("customer").get();
    }
    public CustomerImportRequestImpl() {
       
    }

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }
    
    /**
    *  <p>The customer import resources of this request.</p>
    */
    public java.util.List<com.commercetools.importapi.models.customers.CustomerImport> getResources(){
        return this.resources;
    }

    public void setResources(final com.commercetools.importapi.models.customers.CustomerImport ...resources){
       this.resources = new ArrayList<>(Arrays.asList(resources));
    }
    
    public void setResources(final java.util.List<com.commercetools.importapi.models.customers.CustomerImport> resources){
       this.resources = resources;
    }

}
