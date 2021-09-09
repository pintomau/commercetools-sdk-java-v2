
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyTaxCategoriesKeyByKeyPost
        extends ApiMethod<ByProjectKeyTaxCategoriesKeyByKeyPost, com.commercetools.api.models.tax_category.TaxCategory>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyTaxCategoriesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyTaxCategoriesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyTaxCategoriesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTaxCategoriesKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate;

    public ByProjectKeyTaxCategoriesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.taxCategoryUpdate = taxCategoryUpdate;
    }

    public ByProjectKeyTaxCategoriesKeyByKeyPost(ByProjectKeyTaxCategoriesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.taxCategoryUpdate = t.taxCategoryUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/tax-categories/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(taxCategoryUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.tax_category.TaxCategory.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.tax_category.TaxCategory.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyTaxCategoriesKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyTaxCategoriesKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyTaxCategoriesKeyByKeyPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyTaxCategoriesKeyByKeyPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyTaxCategoriesKeyByKeyPost that = (ByProjectKeyTaxCategoriesKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(taxCategoryUpdate, that.taxCategoryUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(taxCategoryUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyTaxCategoriesKeyByKeyPost copy() {
        return new ByProjectKeyTaxCategoriesKeyByKeyPost(this);
    }
}
