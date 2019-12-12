package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductRevertedStagedChangesMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRevertedStagedChangesMessagePayloadBuilder {
   
   
   private java.util.List<String> removedImageUrls;
   
   public ProductRevertedStagedChangesMessagePayloadBuilder removedImageUrls( final java.util.List<String> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   
   public java.util.List<String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }

   public ProductRevertedStagedChangesMessagePayload build() {
       return new ProductRevertedStagedChangesMessagePayloadImpl(removedImageUrls);
   }
   
   public static ProductRevertedStagedChangesMessagePayloadBuilder of() {
      return new ProductRevertedStagedChangesMessagePayloadBuilder();
   }
   
   public static ProductRevertedStagedChangesMessagePayloadBuilder of(final ProductRevertedStagedChangesMessagePayload template) {
      ProductRevertedStagedChangesMessagePayloadBuilder builder = new ProductRevertedStagedChangesMessagePayloadBuilder();
      builder.removedImageUrls = template.getRemovedImageUrls();
      return builder;
   }
   
}