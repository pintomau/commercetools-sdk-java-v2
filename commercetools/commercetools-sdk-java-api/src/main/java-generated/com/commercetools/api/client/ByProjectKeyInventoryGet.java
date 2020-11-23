package com.commercetools.api.client;

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
*  <p>Query inventory</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInventoryGet extends ApiMethod<ByProjectKeyInventoryGet> {

    
    private String projectKey;
    

    public ByProjectKeyInventoryGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyInventoryGet(ByProjectKeyInventoryGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/inventory", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.inventory.InventoryPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.inventory.InventoryPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.inventory.InventoryPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.inventory.InventoryPagedQueryResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }
    
    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyInventoryGet withExpand(final String expand){
        return new ByProjectKeyInventoryGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyInventoryGet withSort(final String sort){
        return new ByProjectKeyInventoryGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyInventoryGet withLimit(final Integer limit){
        return new ByProjectKeyInventoryGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyInventoryGet withOffset(final Integer offset){
        return new ByProjectKeyInventoryGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyInventoryGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyInventoryGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyInventoryGet withWhere(final String where){
        return new ByProjectKeyInventoryGet(this).addQueryParam("where", where);
    }
}