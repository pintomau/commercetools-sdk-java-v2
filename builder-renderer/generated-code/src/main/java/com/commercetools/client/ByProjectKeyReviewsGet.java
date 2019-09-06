package com.commercetools.client;

import client.ApiHttpRequest;
import client.ApiHttpMethod;
import client.ApiHttpHeaders;
import client.ApiHttpResponse;
import json.CommercetoolsJsonUtils;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import client.*;

public class ByProjectKeyReviewsGet {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> expand = new ArrayList<>();
   private List<String> where = new ArrayList<>();
   private List<String> sort = new ArrayList<>();
   private List<Integer> limit = new ArrayList<>();
   private List<Integer> offset = new ArrayList<>();
   private List<Boolean> withTotal = new ArrayList<>();
   private String projectKey;
   
   
   public ByProjectKeyReviewsGet(final ApiHttpClient apiHttpClient, String projectKey){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.where.stream().map(s -> "where=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.sort.stream().map(s -> "sort=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(this.limit.stream().map(s -> "limit=" + s).collect(Collectors.joining("&")));
      params.add(this.offset.stream().map(s -> "offset=" + s).collect(Collectors.joining("&")));
      params.add(this.withTotal.stream().map(s -> "withTotal=" + s).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/reviews", this.projectKey);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setPath(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.GET);
      httpRequest.setHeaders(headers);
      
      return httpRequest;
   }
   
   public com.commercetools.models.Review.ReviewPagedQueryResponse executeBlocking() {
      ApiHttpResponse response;
      try {
         response = apiHttpClient.executeBlocking(this.createHttpRequest());
         return CommercetoolsJsonUtils.fromJsonString(response.getBody(),  com.commercetools.models.Review.ReviewPagedQueryResponse.class);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }
   
   public String getProjectKey() {return this.projectKey;}
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public List<String> getWhere() {
      return this.where;
   }
   
   public List<String> getSort() {
      return this.sort;
   }
   
   public List<Integer> getLimit() {
      return this.limit;
   }
   
   public List<Integer> getOffset() {
      return this.offset;
   }
   
   public List<Boolean> getWithTotal() {
      return this.withTotal;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public ByProjectKeyReviewsGet addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyReviewsGet withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyReviewsGet addWhere(final String where){
      this.where.add(where);
      return this;
   }
   
   public ByProjectKeyReviewsGet withWhere(final List<String> where){
      this.where = where;
      return this;
   }
   
   public ByProjectKeyReviewsGet addSort(final String sort){
      this.sort.add(sort);
      return this;
   }
   
   public ByProjectKeyReviewsGet withSort(final List<String> sort){
      this.sort = sort;
      return this;
   }
   
   public ByProjectKeyReviewsGet addLimit(final Integer limit){
      this.limit.add(limit);
      return this;
   }
   
   public ByProjectKeyReviewsGet withLimit(final List<Integer> limit){
      this.limit = limit;
      return this;
   }
   
   public ByProjectKeyReviewsGet addOffset(final Integer offset){
      this.offset.add(offset);
      return this;
   }
   
   public ByProjectKeyReviewsGet withOffset(final List<Integer> offset){
      this.offset = offset;
      return this;
   }
   
   public ByProjectKeyReviewsGet addWithTotal(final Boolean withTotal){
      this.withTotal.add(withTotal);
      return this;
   }
   
   public ByProjectKeyReviewsGet withWithTotal(final List<Boolean> withTotal){
      this.withTotal = withTotal;
      return this;
   }
   
   public ByProjectKeyReviewsGet addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyReviewsGet withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyReviewsGet addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyReviewsGet setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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