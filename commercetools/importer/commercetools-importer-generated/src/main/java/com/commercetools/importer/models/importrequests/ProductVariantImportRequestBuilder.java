package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.productvariants.ProductVariantImport;
import com.commercetools.importer.models.importrequests.ProductVariantImportRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantImportRequestBuilder {

    
    private java.util.List<com.commercetools.importer.models.productvariants.ProductVariantImport> resources;

    public ProductVariantImportRequestBuilder resources( final java.util.List<com.commercetools.importer.models.productvariants.ProductVariantImport> resources) {
        this.resources = resources;
        return this;
    }

    
    public java.util.List<com.commercetools.importer.models.productvariants.ProductVariantImport> getResources(){
        return this.resources;
    }

    public ProductVariantImportRequest build() {
        return new ProductVariantImportRequestImpl(resources);
    }

    public static ProductVariantImportRequestBuilder of() {
        return new ProductVariantImportRequestBuilder();
    }

    public static ProductVariantImportRequestBuilder of(final ProductVariantImportRequest template) {
        ProductVariantImportRequestBuilder builder = new ProductVariantImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
