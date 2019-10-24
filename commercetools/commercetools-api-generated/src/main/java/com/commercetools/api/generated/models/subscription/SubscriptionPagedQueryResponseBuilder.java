package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Subscription;
import com.commercetools.api.generated.models.subscription.SubscriptionPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.subscription.Subscription> results;
   
   public SubscriptionPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public SubscriptionPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public SubscriptionPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public SubscriptionPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public SubscriptionPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.subscription.Subscription> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.subscription.Subscription> getResults(){
      return this.results;
   }

   public SubscriptionPagedQueryResponse build() {
       return new SubscriptionPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static SubscriptionPagedQueryResponseBuilder of() {
      return new SubscriptionPagedQueryResponseBuilder();
   }
   
   public static SubscriptionPagedQueryResponseBuilder of(final SubscriptionPagedQueryResponse template) {
      SubscriptionPagedQueryResponseBuilder builder = new SubscriptionPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}