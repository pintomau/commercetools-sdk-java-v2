package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.ProductStateTransitionMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductStateTransitionMessageImpl.class)
public interface ProductStateTransitionMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();
    
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);
    
    public void setForce(final Boolean force);

    public static ProductStateTransitionMessageImpl of(){
        return new ProductStateTransitionMessageImpl();
    }
    

    public static ProductStateTransitionMessageImpl of(final ProductStateTransitionMessage template) {
        ProductStateTransitionMessageImpl instance = new ProductStateTransitionMessageImpl();
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
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    default <T extends Accessor<ProductStateTransitionMessage>> T withProductStateTransitionMessage(Function<ProductStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
}
