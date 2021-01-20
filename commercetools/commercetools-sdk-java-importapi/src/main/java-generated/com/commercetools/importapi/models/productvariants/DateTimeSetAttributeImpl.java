
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>This type represents an attribute which value is a set of dates with time.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DateTimeSetAttributeImpl implements DateTimeSetAttribute {

    private String name;

    private String type;

    private java.util.List<java.time.ZonedDateTime> value;

    @JsonCreator
    DateTimeSetAttributeImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.util.List<java.time.ZonedDateTime> value) {
        this.name = name;
        this.value = value;
        this.type = "datetime-set";
    }

    public DateTimeSetAttributeImpl() {
        this.type = "datetime-set";
    }

    /**
    *  <p>The name of this attribute must match a name of the product types attribute definitions.
    *  The name is required if this type is used in a product variant and must not be set when
    *  used in a product variant patch.</p>
    */
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<java.time.ZonedDateTime> getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.time.ZonedDateTime... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
    }

    public void setValue(final java.util.List<java.time.ZonedDateTime> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DateTimeSetAttributeImpl that = (DateTimeSetAttributeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(type, that.type).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(type).append(value).toHashCode();
    }

}