
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductAddAssetAction;
import com.commercetools.api.models.product.ProductAddExternalImageAction;
import com.commercetools.api.models.product.ProductAddPriceAction;
import com.commercetools.api.models.product.ProductAddToCategoryAction;
import com.commercetools.api.models.product.ProductAddVariantAction;
import com.commercetools.api.models.product.ProductChangeAssetNameAction;
import com.commercetools.api.models.product.ProductChangeAssetOrderAction;
import com.commercetools.api.models.product.ProductChangeMasterVariantAction;
import com.commercetools.api.models.product.ProductChangeNameAction;
import com.commercetools.api.models.product.ProductChangePriceAction;
import com.commercetools.api.models.product.ProductChangeSlugAction;
import com.commercetools.api.models.product.ProductLegacySetSkuAction;
import com.commercetools.api.models.product.ProductMoveImageToPositionAction;
import com.commercetools.api.models.product.ProductPublishAction;
import com.commercetools.api.models.product.ProductRemoveAssetAction;
import com.commercetools.api.models.product.ProductRemoveFromCategoryAction;
import com.commercetools.api.models.product.ProductRemoveImageAction;
import com.commercetools.api.models.product.ProductRemovePriceAction;
import com.commercetools.api.models.product.ProductRemoveVariantAction;
import com.commercetools.api.models.product.ProductRevertStagedChangesAction;
import com.commercetools.api.models.product.ProductRevertStagedVariantChangesAction;
import com.commercetools.api.models.product.ProductSetAssetCustomFieldAction;
import com.commercetools.api.models.product.ProductSetAssetCustomTypeAction;
import com.commercetools.api.models.product.ProductSetAssetDescriptionAction;
import com.commercetools.api.models.product.ProductSetAssetKeyAction;
import com.commercetools.api.models.product.ProductSetAssetSourcesAction;
import com.commercetools.api.models.product.ProductSetAssetTagsAction;
import com.commercetools.api.models.product.ProductSetAttributeAction;
import com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction;
import com.commercetools.api.models.product.ProductSetCategoryOrderHintAction;
import com.commercetools.api.models.product.ProductSetDescriptionAction;
import com.commercetools.api.models.product.ProductSetDiscountedPriceAction;
import com.commercetools.api.models.product.ProductSetImageLabelAction;
import com.commercetools.api.models.product.ProductSetKeyAction;
import com.commercetools.api.models.product.ProductSetMetaDescriptionAction;
import com.commercetools.api.models.product.ProductSetMetaKeywordsAction;
import com.commercetools.api.models.product.ProductSetMetaTitleAction;
import com.commercetools.api.models.product.ProductSetPricesAction;
import com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction;
import com.commercetools.api.models.product.ProductSetProductPriceCustomTypeAction;
import com.commercetools.api.models.product.ProductSetProductVariantKeyAction;
import com.commercetools.api.models.product.ProductSetSearchKeywordsAction;
import com.commercetools.api.models.product.ProductSetSkuAction;
import com.commercetools.api.models.product.ProductSetTaxCategoryAction;
import com.commercetools.api.models.product.ProductTransitionStateAction;
import com.commercetools.api.models.product.ProductUnpublishAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductUpdateActionImpl implements ProductUpdateAction {

    private String action;

    @JsonCreator
    ProductUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    public ProductUpdateActionImpl() {
    }

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductUpdateActionImpl that = (ProductUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

}