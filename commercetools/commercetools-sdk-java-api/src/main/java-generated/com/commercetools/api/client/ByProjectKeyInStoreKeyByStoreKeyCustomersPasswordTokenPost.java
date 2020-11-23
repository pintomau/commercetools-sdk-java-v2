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
*  <p>The token value is used to reset the password of the customer with the given email. The token is
*  valid only for 10 minutes.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost extends ApiMethod<ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost> {

    
    private String projectKey;
    private String storeKey;
    
    private com.commercetools.api.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, com.commercetools.api.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerCreatePasswordResetToken = customerCreatePasswordResetToken;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost(ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.customerCreatePasswordResetToken = t.customerCreatePasswordResetToken;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/customers/password-token", this.projectKey, this.storeKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerCreatePasswordResetToken);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.customer.CustomerToken.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getStoreKey() {return this.storeKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setStoreKey(final String storeKey) { this.storeKey = storeKey; }

}