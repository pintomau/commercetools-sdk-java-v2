package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartRecalculateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRecalculateActionBuilder {
   
   @Nullable
   private Boolean updateProductData;
   
   public CartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
      this.updateProductData = updateProductData;
      return this;
   }
   
   @Nullable
   public Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public CartRecalculateAction build() {
       return new CartRecalculateActionImpl(updateProductData);
   }
   
   public static CartRecalculateActionBuilder of() {
      return new CartRecalculateActionBuilder();
   }
   
   public static CartRecalculateActionBuilder of(final CartRecalculateAction template) {
      CartRecalculateActionBuilder builder = new CartRecalculateActionBuilder();
      builder.updateProductData = template.getUpdateProductData();
      return builder;
   }
   
}