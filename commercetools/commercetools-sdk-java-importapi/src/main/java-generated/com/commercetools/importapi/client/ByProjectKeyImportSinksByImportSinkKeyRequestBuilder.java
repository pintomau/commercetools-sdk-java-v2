
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSinksByImportSinkKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importSinkKey;

    public ByProjectKeyImportSinksByImportSinkKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importSinkKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyImportSinksByImportSinkKeyPut put(
            com.commercetools.importapi.models.importsinks.ImportSinkUpdateDraft importSinkUpdateDraft) {
        return new ByProjectKeyImportSinksByImportSinkKeyPut(apiHttpClient, projectKey, importSinkKey,
            importSinkUpdateDraft);
    }

    public ByProjectKeyImportSinksByImportSinkKeyGet get() {
        return new ByProjectKeyImportSinksByImportSinkKeyGet(apiHttpClient, projectKey, importSinkKey);
    }

    public ByProjectKeyImportSinksByImportSinkKeyDelete delete() {
        return new ByProjectKeyImportSinksByImportSinkKeyDelete(apiHttpClient, projectKey, importSinkKey);
    }

}
