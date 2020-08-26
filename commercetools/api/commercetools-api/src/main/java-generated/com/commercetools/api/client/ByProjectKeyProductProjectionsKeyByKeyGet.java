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
*  <p>Gets the current or staged representation of a product found by Key.
*  When used with an API client that has the view_published_products:{projectKey} scope,
*  this endpoint only returns published (current) product projections.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsKeyByKeyGet {

    
    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient; 
    private List<Boolean> staged = new ArrayList<>();
    private List<String> priceCurrency = new ArrayList<>();
    private List<String> priceCountry = new ArrayList<>();
    private List<String> priceCustomerGroup = new ArrayList<>();
    private List<String> priceChannel = new ArrayList<>();
    private List<String> localeProjection = new ArrayList<>();
    private List<String> storeProjection = new ArrayList<>();
    private List<String> expand = new ArrayList<>();
    private String projectKey;
    private String key;
    

    public ByProjectKeyProductProjectionsKeyByKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String key){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();
        params.add(this.staged.stream().map(s -> "staged=" + s).collect(Collectors.joining("&")));
        params.add(this.priceCurrency.stream().map(s -> "priceCurrency=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.priceCountry.stream().map(s -> "priceCountry=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.priceCustomerGroup.stream().map(s -> "priceCustomerGroup=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.priceChannel.stream().map(s -> "priceChannel=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.localeProjection.stream().map(s -> "localeProjection=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.storeProjection.stream().map(s -> "storeProjection=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/product-projections/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(headers);
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjection> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjection>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product.ProductProjection.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<Boolean> getStaged() {
        return this.staged;
    }
    
    public List<String> getPriceCurrency() {
        return this.priceCurrency;
    }
    
    public List<String> getPriceCountry() {
        return this.priceCountry;
    }
    
    public List<String> getPriceCustomerGroup() {
        return this.priceCustomerGroup;
    }
    
    public List<String> getPriceChannel() {
        return this.priceChannel;
    }
    
    public List<String> getLocaleProjection() {
        return this.localeProjection;
    }
    
    public List<String> getStoreProjection() {
        return this.storeProjection;
    }
    
    public List<String> getExpand() {
        return this.expand;
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
    
    public void setKey(final String key) {this.key = key;}

    public ByProjectKeyProductProjectionsKeyByKeyGet addStaged(final Boolean staged){
        this.staged.add(staged);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withStaged(final List<Boolean> staged){
        this.staged = staged;
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceCurrency(final String priceCurrency){
        this.priceCurrency.add(priceCurrency);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceCurrency(final List<String> priceCurrency){
        this.priceCurrency = priceCurrency;
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceCountry(final String priceCountry){
        this.priceCountry.add(priceCountry);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceCountry(final List<String> priceCountry){
        this.priceCountry = priceCountry;
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceCustomerGroup(final String priceCustomerGroup){
        this.priceCustomerGroup.add(priceCustomerGroup);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceCustomerGroup(final List<String> priceCustomerGroup){
        this.priceCustomerGroup = priceCustomerGroup;
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addPriceChannel(final String priceChannel){
        this.priceChannel.add(priceChannel);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withPriceChannel(final List<String> priceChannel){
        this.priceChannel = priceChannel;
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addLocaleProjection(final String localeProjection){
        this.localeProjection.add(localeProjection);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withLocaleProjection(final List<String> localeProjection){
        this.localeProjection = localeProjection;
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addStoreProjection(final String storeProjection){
        this.storeProjection.add(storeProjection);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withStoreProjection(final List<String> storeProjection){
        this.storeProjection = storeProjection;
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addExpand(final String expand){
        this.expand.add(expand);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withExpand(final List<String> expand){
        this.expand = expand;
        return this;
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }
    
    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }
    
    public ByProjectKeyProductProjectionsKeyByKeyGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
        this.additionalQueryParams = additionalQueryParams;
        return this;
    }
    
    public Map<String, String> getAdditionalQueryParams() {
        return this.additionalQueryParams;
    }
    
    private String urlEncode(final String s){
        try{
             return URLEncoder.encode(s, "UTF-8");
         }catch (UnsupportedEncodingException e) {
             //this will never happen
             return null;
         }
    }

}