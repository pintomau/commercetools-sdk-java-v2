package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

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


/**
*  <p>Retrieves the active cart of the customer that has been modified most recently.
*  It does not consider carts with CartOrigin Merchant. If no active cart exists, a 404 Not Found error is returned.</p>
*  <p>The cart may not contain up-to-date prices, discounts etc. If you want to ensure they're up-to-date,
*  send an Update request with the Recalculate update action instead.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartsCustomerIdByCustomerIdGet extends ApiMethod<ByProjectKeyCartsCustomerIdByCustomerIdGet> {

    
    private String projectKey;
    private String customerId;
    

    public ByProjectKeyCartsCustomerIdByCustomerIdGet(final ApiHttpClient apiHttpClient, String projectKey, String customerId){
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerId = customerId;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts/customer-id=%s", this.projectKey, this.customerId);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.cart.Cart.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getCustomerId() {return this.customerId;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setCustomerId(final String customerId) {this.customerId = customerId;}

    public ByProjectKeyCartsCustomerIdByCustomerIdGet withExpand(final String expand){
        return this.addQueryParam("expand", expand);
    }
}