package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.MessageSubscription;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionSetMessagesActionImpl;

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
@JsonDeserialize(as = SubscriptionSetMessagesActionImpl.class)
public interface SubscriptionSetMessagesAction extends SubscriptionUpdateAction {

    
    @Valid
    @JsonProperty("messages")
    public List<MessageSubscription> getMessages();

    @JsonIgnore
    public void setMessages(final MessageSubscription ...messages);
    public void setMessages(final List<MessageSubscription> messages);

    public static SubscriptionSetMessagesActionImpl of(){
        return new SubscriptionSetMessagesActionImpl();
    }
    

    public static SubscriptionSetMessagesActionImpl of(final SubscriptionSetMessagesAction template) {
        SubscriptionSetMessagesActionImpl instance = new SubscriptionSetMessagesActionImpl();
        instance.setMessages(template.getMessages());
        return instance;
    }

    default <T> T withSubscriptionSetMessagesAction(Function<SubscriptionSetMessagesAction, T> helper) {
        return helper.apply(this);
    }
}