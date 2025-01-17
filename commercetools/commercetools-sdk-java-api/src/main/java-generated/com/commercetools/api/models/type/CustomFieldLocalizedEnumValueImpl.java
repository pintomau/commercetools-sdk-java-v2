
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomFieldLocalizedEnumValueImpl implements CustomFieldLocalizedEnumValue {

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    @JsonCreator
    CustomFieldLocalizedEnumValueImpl(@JsonProperty("key") final String key,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label) {
        this.key = key;
        this.label = label;
    }

    public CustomFieldLocalizedEnumValueImpl() {
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldLocalizedEnumValueImpl that = (CustomFieldLocalizedEnumValueImpl) o;

        return new EqualsBuilder().append(key, that.key).append(label, that.label).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(label).toHashCode();
    }

}
