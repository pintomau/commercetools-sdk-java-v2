
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
public class ByProjectKeyTaxCategoriesTest {
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

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    private Object[] requestWithMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .get()
                        .withExpand("expand")
                        .createHttpRequest(), "get", "/test_projectKey/tax-categories?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .get()
                        .withSort("sort")
                        .createHttpRequest(), "get", "/test_projectKey/tax-categories?sort=sort", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .get()
                        .withLimit(7)
                        .createHttpRequest(), "get", "/test_projectKey/tax-categories?limit=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .get()
                        .withOffset(3)
                        .createHttpRequest(), "get", "/test_projectKey/tax-categories?offset=3", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .get()
                        .withWithTotal(true)
                        .createHttpRequest(), "get", "/test_projectKey/tax-categories?withTotal=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .get()
                        .withWhere("where")
                        .createHttpRequest(), "get", "/test_projectKey/tax-categories?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .taxCategories()
                                .get()
                                .withPredicateVar("varName", "var.varName")
                                .createHttpRequest(),
                        "get", "/test_projectKey/tax-categories?var.varName=var.varName", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().createHttpRequest(),
                        "get", "/test_projectKey/tax-categories", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .post(null)
                        .withExpand("expand")
                        .createHttpRequest(), "post", "/test_projectKey/tax-categories?expand=expand", },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().post(null).createHttpRequest(),
                        "post", "/test_projectKey/tax-categories", } };
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get().withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .taxCategories()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().get(), },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey").taxCategories().post(null).withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey").taxCategories().post(null), } };
    }
}