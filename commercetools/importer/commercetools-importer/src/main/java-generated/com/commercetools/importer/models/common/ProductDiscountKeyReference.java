package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.common.ProductDiscountKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>References a product discount by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountKeyReferenceImpl.class)
public interface ProductDiscountKeyReference extends KeyReference {



    public static ProductDiscountKeyReferenceImpl of(){
        return new ProductDiscountKeyReferenceImpl();
    }
    

    public static ProductDiscountKeyReferenceImpl of(final ProductDiscountKeyReference template) {
        ProductDiscountKeyReferenceImpl instance = new ProductDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}