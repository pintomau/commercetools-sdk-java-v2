
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxRateImpl implements TaxRate {

    private String id;

    private String name;

    private Double amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

    @JsonCreator
    TaxRateImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name,
            @JsonProperty("amount") final Double amount, @JsonProperty("includedInPrice") final Boolean includedInPrice,
            @JsonProperty("country") final String country, @JsonProperty("state") final String state,
            @JsonProperty("subRates") final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.includedInPrice = includedInPrice;
        this.country = country;
        this.state = state;
        this.subRates = subRates;
    }

    public TaxRateImpl() {
    }

    /**
    *  <p>Present if the TaxRate is part of a <a href="ctp:api:type:TaxCategory">TaxCategory</a>.
    *  Absent for external TaxRates in <a href="ctp:api:type:LineItem">LineItem</a>, <a href="ctp:api:type:CustomLineItem">CustomLineItem</a>, and <a href="ctp:api:type:ShippingInfo">ShippingInfo</a>.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Name of the TaxRate.</p>
    */
    public String getName() {
        return this.name;
    }

    /**
    *  <p>Tax rate. If subrates are used, the amount must be the sum of all subrates.</p>
    */
    public Double getAmount() {
        return this.amount;
    }

    /**
    *  <p>If <code>true</code>, tax is included in <a href="ctp:api:type:Price">Prices</a> and the <code>taxedPrice</code> is present on <a href="ctp:api:type:LineItem">LineItems</a>. In this case, the platform calculates the <code>totalNet</code> price based on the TaxRate.</p>
    */
    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    /**
    *  <p>Country in which the tax rate is applied in <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> format.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>State within the country, such as Texas in the United States.</p>
    */
    public String getState() {
        return this.state;
    }

    /**
    *  <p>Used to calculate the <a href="/../api/projects/carts#taxedprice">taxPortions</a> field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
    */
    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates() {
        return this.subRates;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    public void setIncludedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public void setSubRates(final com.commercetools.api.models.tax_category.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
    }

    public void setSubRates(final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.subRates = subRates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxRateImpl that = (TaxRateImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(amount, that.amount)
                .append(includedInPrice, that.includedInPrice)
                .append(country, that.country)
                .append(state, that.state)
                .append(subRates, that.subRates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(amount)
                .append(includedInPrice)
                .append(country)
                .append(state)
                .append(subRates)
                .toHashCode();
    }

}
