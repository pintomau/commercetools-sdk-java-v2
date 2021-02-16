
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Import representation for a prduct.</p>
*  <p>The import representation for a product is the most minimal representation required
*  for creating a product in commercetools.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductImportImpl.class)
public interface ProductImport extends ImportResource {

    /**
    *  <p>Maps to <code>Product.name</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>The product's product type. Maps to <code>Product.productType</code>.</p>
    *  <p>The product type referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeKeyReference getProductType();

    /**
    *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a project,
    *  but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
    *  <p>Maps to <code>Product.description</code>.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>An array of references to a categories by their keys. Maps to <code>Product.categories</code>.</p>
    *  <p>The categories referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("categories")
    public List<CategoryKeyReference> getCategories();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
    *  <p>A localized string is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values the corresponding strings used for that language.</p>
    *  <pre><code class="language-json">{
    *    &quot;de&quot;: &quot;Hundefutter&quot;,
    *    &quot;en&quot;: &quot;dog food&quot;
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
    *  <p>References a tax category by its key.</p>
    *  <p>The tax category referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
    *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
    *  <pre><code class="language-json">{
    *    &quot;en&quot;: [
    *      { &quot;text&quot;: &quot;Multi tool&quot; },
    *      { &quot;text&quot;: &quot;Swiss Army Knife&quot;, &quot;suggestTokenizer&quot;: { &quot;type&quot;: &quot;whitespace&quot; } }
    *    ],
    *    &quot;de&quot;: [
    *      {
    *        &quot;text&quot;: &quot;Schweizer Messer&quot;,
    *        &quot;suggestTokenizer&quot;: {
    *          &quot;type&quot;: &quot;custom&quot;,
    *          &quot;inputs&quot;: [&quot;schweizer messer&quot;, &quot;offiziersmesser&quot;, &quot;sackmesser&quot;]
    *        }
    *      }
    *    ]
    *  }
    *  </code></pre>
    */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
    *  <p>References a state by its key.</p>
    *  <p>The tax category referenced must already exist
    *  in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
    *  <p>If there were updates, only the updates will be published to <code>staged</code> and <code>current</code> projection.</p>
    */

    @JsonProperty("publish")
    public Boolean getPublish();

    public void setName(final LocalizedString name);

    public void setProductType(final ProductTypeKeyReference productType);

    public void setSlug(final LocalizedString slug);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setCategories(final CategoryKeyReference... categories);

    public void setCategories(final List<CategoryKeyReference> categories);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    public void setState(final StateKeyReference state);

    public void setPublish(final Boolean publish);

    public static ProductImport of() {
        return new ProductImportImpl();
    }

    public static ProductImport of(final ProductImport template) {
        ProductImportImpl instance = new ProductImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setProductType(template.getProductType());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setCategories(template.getCategories());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setState(template.getState());
        instance.setPublish(template.getPublish());
        return instance;
    }

    public static ProductImportBuilder builder() {
        return ProductImportBuilder.of();
    }

    public static ProductImportBuilder builder(final ProductImport template) {
        return ProductImportBuilder.of(template);
    }

    default <T> T withProductImport(Function<ProductImport, T> helper) {
        return helper.apply(this);
    }
}
