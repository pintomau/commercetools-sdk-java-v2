package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ConcurrentModificationErrorImpl implements ConcurrentModificationError {

    private String code;
    
    private String message;
    
    private Long currentVersion;

    @JsonCreator
    ConcurrentModificationErrorImpl(@JsonProperty("message") final String message, @JsonProperty("currentVersion") final Long currentVersion) {
        this.message = message;
        this.currentVersion = currentVersion;
        this.code = "ConcurrentModification";
    }
    public ConcurrentModificationErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public Long getCurrentVersion(){
        return this.currentVersion;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setCurrentVersion(final Long currentVersion){
        this.currentVersion = currentVersion;
    }

}