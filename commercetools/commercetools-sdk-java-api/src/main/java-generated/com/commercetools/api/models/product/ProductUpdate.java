package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductUpdateImpl.class)
public interface ProductUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<ProductUpdateAction> actions);

    public static ProductUpdateImpl of(){
        return new ProductUpdateImpl();
    }
    

    public static ProductUpdateImpl of(final ProductUpdate template) {
        ProductUpdateImpl instance = new ProductUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T extends Accessor<ProductUpdate>> T withProductUpdate(Function<ProductUpdate, T> helper) {
        return helper.apply(this);
    }
}
