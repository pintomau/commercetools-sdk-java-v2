package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.MessageSubscription;
import com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.generated.models.subscription.SubscriptionSetMessagesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = SubscriptionSetMessagesActionImpl.class)
public interface SubscriptionSetMessagesAction extends SubscriptionUpdateAction {

   
   @Valid
   @JsonProperty("messages")
   public List<MessageSubscription> getMessages();

   public void setMessages(final List<MessageSubscription> messages);
   
   public static SubscriptionSetMessagesActionImpl of(){
      return new SubscriptionSetMessagesActionImpl();
   }
   

   public static SubscriptionSetMessagesActionImpl of(final SubscriptionSetMessagesAction template) {
      SubscriptionSetMessagesActionImpl instance = new SubscriptionSetMessagesActionImpl();
      instance.setMessages(template.getMessages());
      return instance;
   }

}