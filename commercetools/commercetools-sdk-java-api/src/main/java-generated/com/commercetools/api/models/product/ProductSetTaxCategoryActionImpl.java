package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetTaxCategoryActionImpl implements ProductSetTaxCategoryAction {

    private String action;
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @JsonCreator
    ProductSetTaxCategoryActionImpl(@JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        this.action = "setTaxCategory";
    }
    public ProductSetTaxCategoryActionImpl() {
        this.action = "setTaxCategory";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If left blank or set to <code>null</code>, the tax category is unset/removed.</p>
    */
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }

    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
        this.taxCategory = taxCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSetTaxCategoryActionImpl that = (ProductSetTaxCategoryActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(taxCategory, that.taxCategory)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(taxCategory)
            .toHashCode();
    }

}
