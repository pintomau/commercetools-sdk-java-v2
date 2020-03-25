package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.missing_data.MissingAttributes;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesMeta;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesPagedQueryResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingAttributesPagedQueryResultBuilder {
   
   
   private Long count;
   
   
   private Long total;
   
   
   private Long offset;
   
   
   private List<MissingAttributes> results;
   
   
   private MissingAttributesMeta meta;
   
   public MissingAttributesPagedQueryResultBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public MissingAttributesPagedQueryResultBuilder total( final Long total) {
      this.total = total;
      return this;
   }
   
   public MissingAttributesPagedQueryResultBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public MissingAttributesPagedQueryResultBuilder results( final List<MissingAttributes> results) {
      this.results = results;
      return this;
   }
   
   public MissingAttributesPagedQueryResultBuilder meta( final MissingAttributesMeta meta) {
      this.meta = meta;
      return this;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public List<MissingAttributes> getResults(){
      return this.results;
   }
   
   
   public MissingAttributesMeta getMeta(){
      return this.meta;
   }

   public MissingAttributesPagedQueryResult build() {
       return new MissingAttributesPagedQueryResultImpl(count, total, offset, results, meta);
   }
   
   public static MissingAttributesPagedQueryResultBuilder of() {
      return new MissingAttributesPagedQueryResultBuilder();
   }
   
   public static MissingAttributesPagedQueryResultBuilder of(final MissingAttributesPagedQueryResult template) {
      MissingAttributesPagedQueryResultBuilder builder = new MissingAttributesPagedQueryResultBuilder();
      builder.count = template.getCount();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.results = template.getResults();
      builder.meta = template.getMeta();
      return builder;
   }
   
}
