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
*  <p>Search Product Projection</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductProjectionsSearchGet extends ApiMethod<ByProjectKeyProductProjectionsSearchGet> {

    
    private String projectKey;
    

    public ByProjectKeyProductProjectionsSearchGet(final ApiHttpClient apiHttpClient, String projectKey){
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/search", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }
    
    public List<String> getFuzzyLevel() {
        return this.getQueryParam("fuzzyLevel");
    }
    
    public List<String> getMarkMatchingVariants() {
        return this.getQueryParam("markMatchingVariants");
    }
    
    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }
    
    public List<String> getFilter() {
        return this.getQueryParam("filter");
    }
    
    public List<String> getFilterFacets() {
        return this.getQueryParam("filterFacets");
    }
    
    public List<String> getFilterQuery() {
        return this.getQueryParam("filterQuery");
    }
    
    public List<String> getFacet() {
        return this.getQueryParam("facet");
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
    
    public List<String> getPriceCurrency() {
        return this.getQueryParam("priceCurrency");
    }
    
    public List<String> getPriceCountry() {
        return this.getQueryParam("priceCountry");
    }
    
    public List<String> getPriceCustomerGroup() {
        return this.getQueryParam("priceCustomerGroup");
    }
    
    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }
    
    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }
    
    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public ByProjectKeyProductProjectionsSearchGet withFuzzy(final Boolean fuzzy){
        return this.addQueryParam("fuzzy", fuzzy);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final Double fuzzyLevel){
        return this.addQueryParam("fuzzyLevel", fuzzyLevel);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(final Boolean markMatchingVariants){
        return this.addQueryParam("markMatchingVariants", markMatchingVariants);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withStaged(final Boolean staged){
        return this.addQueryParam("staged", staged);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFilter(final String filter){
        return this.addQueryParam("filter", filter);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFilterFacets(final String filterFacets){
        return this.addQueryParam("filterFacets", filterFacets);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFilterQuery(final String filterQuery){
        return this.addQueryParam("filterQuery", filterQuery);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withFacet(final String facet){
        return this.addQueryParam("facet", facet);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withSort(final String sort){
        return this.addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withLimit(final Integer limit){
        return this.addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withOffset(final Integer offset){
        return this.addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withWithTotal(final Boolean withTotal){
        return this.addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final String priceCurrency){
        return this.addQueryParam("priceCurrency", priceCurrency);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceCountry(final String priceCountry){
        return this.addQueryParam("priceCountry", priceCountry);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(final String priceCustomerGroup){
        return this.addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withPriceChannel(final String priceChannel){
        return this.addQueryParam("priceChannel", priceChannel);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withLocaleProjection(final String localeProjection){
        return this.addQueryParam("localeProjection", localeProjection);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withStoreProjection(final String storeProjection){
        return this.addQueryParam("storeProjection", storeProjection);
    }
    
    public ByProjectKeyProductProjectionsSearchGet withExpand(final String expand){
        return this.addQueryParam("expand", expand);
    }
}