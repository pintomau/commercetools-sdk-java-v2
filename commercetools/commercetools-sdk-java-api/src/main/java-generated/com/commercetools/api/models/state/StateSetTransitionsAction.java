package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateSetTransitionsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StateSetTransitionsActionImpl.class)
public interface StateSetTransitionsAction extends StateUpdateAction {

    
    @Valid
    @JsonProperty("transitions")
    public List<StateResourceIdentifier> getTransitions();

    @JsonIgnore
    public void setTransitions(final StateResourceIdentifier ...transitions);
    public void setTransitions(final List<StateResourceIdentifier> transitions);

    public static StateSetTransitionsActionImpl of(){
        return new StateSetTransitionsActionImpl();
    }
    

    public static StateSetTransitionsActionImpl of(final StateSetTransitionsAction template) {
        StateSetTransitionsActionImpl instance = new StateSetTransitionsActionImpl();
        instance.setTransitions(template.getTransitions());
        return instance;
    }

    default <T> T withStateSetTransitionsAction(Function<StateSetTransitionsAction, T> helper) {
        return helper.apply(this);
    }
}