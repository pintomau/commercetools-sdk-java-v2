package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Retrieves the import operation with the given id.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyImportOperationsByIdGet extends ApiMethod<ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyImportOperationsByIdGet> {

    
    private String projectKey;
    private String importSinkKey;
    private String id;
    

    public ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyImportOperationsByIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.id = t.id;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/inventories/importSinkKey=%s/import-operations/%s", this.projectKey, this.importSinkKey, this.id);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.importapi.models.importoperations.ImportOperation.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}
    public String getId() {return this.id;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportSinkKey(final String importSinkKey) { this.importSinkKey = importSinkKey; }
    
    public void setId(final String id) { this.id = id; }

}