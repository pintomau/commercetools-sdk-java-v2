
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
public class ByProjectKeyShippingMethodsMatchingCartGet extends
        ApiMethod<ByProjectKeyShippingMethodsMatchingCartGet, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyShippingMethodsMatchingCartGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyShippingMethodsMatchingCartGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyShippingMethodsMatchingCartGet> {

    private String projectKey;

    public ByProjectKeyShippingMethodsMatchingCartGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsMatchingCartGet(ByProjectKeyShippingMethodsMatchingCartGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods/matching-cart", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class)
                    .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(),
                    com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getCartId() {
        return this.getQueryParam("cartId");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set cartId with the specificied value
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withCartId(final String cartId) {
        return copy().withQueryParam("cartId", cartId);
    }

    /**
     * add additional cartId query parameter
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addCartId(final String cartId) {
        return copy().addQueryParam("cartId", cartId);
    }

    /**
     * set cartId with the specificied values
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withCartId(final List<String> cartId) {
        return copy().withoutQueryParam("cartId")
                .addQueryParams(
                    cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional cartId query parameters
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addCartId(final List<String> cartId) {
        return copy().addQueryParams(
            cartId.stream().map(s -> new ParamEntry<>("cartId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyShippingMethodsMatchingCartGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyShippingMethodsMatchingCartGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyShippingMethodsMatchingCartGet that = (ByProjectKeyShippingMethodsMatchingCartGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyShippingMethodsMatchingCartGet copy() {
        return new ByProjectKeyShippingMethodsMatchingCartGet(this);
    }
}
