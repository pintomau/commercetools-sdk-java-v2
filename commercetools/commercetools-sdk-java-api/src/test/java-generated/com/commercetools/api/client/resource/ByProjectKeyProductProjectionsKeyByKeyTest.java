
package com.commercetools.api.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import com.commercetools.api.client.ApiRoot;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@RunWith(JUnitParamsRunner.class)
public class ByProjectKeyProductProjectionsKeyByKeyTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().name().toLowerCase());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] {
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withStaged(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/key=test_key?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/key=test_key?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/key=test_key?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/product-projections/key=test_key?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/key=test_key?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/key=test_key?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/key=test_key?storeProjection=storeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .productProjections()
                                .withKey("test_key")
                                .get()
                                .withExpand("expand")
                                .createHttpRequest(),
                        "get", "/test_projectKey/product-projections/key=test_key?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .createHttpRequest(), "get", "/test_projectKey/product-projections/key=test_key", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withStoreProjection("storeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .productProjections()
                        .withKey("test_key")
                        .get()
                        .withExpand("expand"), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").productProjections().withKey("test_key").get(), } };
    }
}
