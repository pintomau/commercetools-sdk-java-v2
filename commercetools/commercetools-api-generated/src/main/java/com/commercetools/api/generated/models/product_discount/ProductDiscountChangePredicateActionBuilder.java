package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountChangePredicateAction;
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
public final class ProductDiscountChangePredicateActionBuilder {
   
   
   private String predicate;
   
   public ProductDiscountChangePredicateActionBuilder predicate( final String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   
   public String getPredicate(){
      return this.predicate;
   }

   public ProductDiscountChangePredicateAction build() {
       return new ProductDiscountChangePredicateActionImpl(predicate);
   }
   
   public static ProductDiscountChangePredicateActionBuilder of() {
      return new ProductDiscountChangePredicateActionBuilder();
   }
   
   public static ProductDiscountChangePredicateActionBuilder of(final ProductDiscountChangePredicateAction template) {
      ProductDiscountChangePredicateActionBuilder builder = new ProductDiscountChangePredicateActionBuilder();
      builder.predicate = template.getPredicate();
      return builder;
   }
   
}