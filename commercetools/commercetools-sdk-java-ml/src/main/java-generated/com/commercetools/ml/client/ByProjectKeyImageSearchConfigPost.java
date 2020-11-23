package com.commercetools.ml.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

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
*  <p>Endpoint to update the image search config.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyImageSearchConfigPost extends ApiMethod<ByProjectKeyImageSearchConfigPost> {

    
    private String projectKey;
    
    private com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest imageSearchConfigRequest;

    public ByProjectKeyImageSearchConfigPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest imageSearchConfigRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.imageSearchConfigRequest = imageSearchConfigRequest;
    }

    public ByProjectKeyImageSearchConfigPost(ByProjectKeyImageSearchConfigPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.imageSearchConfigRequest = t.imageSearchConfigRequest;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/image-search/config", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(apiHttpClient().getSerializerService().toJsonByteArray(imageSearchConfigRequest));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.ml.models.image_search_config.ImageSearchConfigResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

}