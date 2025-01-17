
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMissingDataImagesStatusByTaskIdGet extends
        ApiMethod<ByProjectKeyMissingDataImagesStatusByTaskIdGet, com.commercetools.ml.models.missing_data.MissingImagesTaskStatus> {

    private String projectKey;
    private String taskId;

    public ByProjectKeyMissingDataImagesStatusByTaskIdGet(final ApiHttpClient apiHttpClient, String projectKey,
            String taskId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.taskId = taskId;
    }

    public ByProjectKeyMissingDataImagesStatusByTaskIdGet(ByProjectKeyMissingDataImagesStatusByTaskIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.taskId = t.taskId;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/images/status/%s", this.projectKey, this.taskId);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingImagesTaskStatus> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.ml.models.missing_data.MissingImagesTaskStatus.class)
                    .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingImagesTaskStatus>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(),
                    com.commercetools.ml.models.missing_data.MissingImagesTaskStatus.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMissingDataImagesStatusByTaskIdGet that = (ByProjectKeyMissingDataImagesStatusByTaskIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(taskId, that.taskId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(taskId).toHashCode();
    }

    @Override
    protected ByProjectKeyMissingDataImagesStatusByTaskIdGet copy() {
        return new ByProjectKeyMissingDataImagesStatusByTaskIdGet(this);
    }
}
