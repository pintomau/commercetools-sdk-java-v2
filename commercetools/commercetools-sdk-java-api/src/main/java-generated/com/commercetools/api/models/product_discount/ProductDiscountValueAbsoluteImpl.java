
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDiscountValueAbsoluteImpl implements ProductDiscountValueAbsolute {

    private String type;

    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    @JsonCreator
    ProductDiscountValueAbsoluteImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
        this.type = ABSOLUTE;
    }

    public ProductDiscountValueAbsoluteImpl() {
        this.type = ABSOLUTE;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney() {
        return this.money;
    }

    public void setMoney(final com.commercetools.api.models.common.TypedMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountValueAbsoluteImpl that = (ProductDiscountValueAbsoluteImpl) o;

        return new EqualsBuilder().append(type, that.type).append(money, that.money).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(money).toHashCode();
    }

}
