
package com.commercetools.importapi.models.importrequests;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantPatchRequestBuilder {

    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches;

    public ProductVariantPatchRequestBuilder patches(
            final com.commercetools.importapi.models.productvariants.ProductVariantPatch... patches) {
        this.patches = new ArrayList<>(Arrays.asList(patches));
        return this;
    }

    public ProductVariantPatchRequestBuilder patches(
            final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches) {
        this.patches = patches;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> getPatches() {
        return this.patches;
    }

    public ProductVariantPatchRequest build() {
        return new ProductVariantPatchRequestImpl(patches);
    }

    public static ProductVariantPatchRequestBuilder of() {
        return new ProductVariantPatchRequestBuilder();
    }

    public static ProductVariantPatchRequestBuilder of(final ProductVariantPatchRequest template) {
        ProductVariantPatchRequestBuilder builder = new ProductVariantPatchRequestBuilder();
        builder.patches = template.getPatches();
        return builder;
    }

}