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
*  <p>Query orders</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeOrdersGet extends ApiMethod<ByProjectKeyMeOrdersGet> {

    
    private String projectKey;
    

    public ByProjectKeyMeOrdersGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeOrdersGet(ByProjectKeyMeOrdersGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/orders", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.order.OrderPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.order.OrderPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.OrderPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.order.OrderPagedQueryResponse.class);
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

    public ByProjectKeyMeOrdersGet withExpand(final String expand){
        return new ByProjectKeyMeOrdersGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyMeOrdersGet withSort(final String sort){
        return new ByProjectKeyMeOrdersGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyMeOrdersGet withLimit(final Integer limit){
        return new ByProjectKeyMeOrdersGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyMeOrdersGet withOffset(final Integer offset){
        return new ByProjectKeyMeOrdersGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyMeOrdersGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyMeOrdersGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyMeOrdersGet withWhere(final String where){
        return new ByProjectKeyMeOrdersGet(this).addQueryParam("where", where);
    }
}