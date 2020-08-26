package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.customfields.CustomField;
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


/**
*  <p>A field with a localized string value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizedStringFieldImpl implements LocalizedStringField {

    private String type;
    
    private com.commercetools.importer.models.common.LocalizedString value;

    @JsonCreator
    LocalizedStringFieldImpl(@JsonProperty("value") final com.commercetools.importer.models.common.LocalizedString value) {
        this.value = value;
        this.type = "LocalizedString";
    }
    public LocalizedStringFieldImpl() {
       
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.importer.models.common.LocalizedString getValue(){
        return this.value;
    }

    public void setValue(final com.commercetools.importer.models.common.LocalizedString value){
        this.value = value;
    }

}