package com.commercetools.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;

public class ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost {
   
   
   private ApiHttpHeaders headers = new ApiHttpHeaders();
   private Map<String, String> additionalQueryParams = new HashMap<>();
   private final ApiHttpClient apiHttpClient; 
   private List<String> expand = new ArrayList<>();
   private String projectKey;
   private String storeKey;
   private String ID;
   
   private com.commercetools.models.common.Update update;
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String ID, com.commercetools.models.common.Update update){
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
      this.ID = ID;
      this.update = update;
   }
   
   public ApiHttpRequest createHttpRequest() {
      ApiHttpRequest httpRequest = new ApiHttpRequest();
      List<String> params = new ArrayList<>();
      params.add(this.expand.stream().map(s -> "expand=" + urlEncode(s)).collect(Collectors.joining("&")));
      params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
      params.removeIf(String::isEmpty);
      String httpRequestPath = String.format("/%s/in-store/key=%s/me/carts/%s", this.projectKey, this.storeKey, this.ID);
      if(!params.isEmpty()){
         httpRequestPath += "?" + String.join("&", params);
      }
      httpRequest.setRelativeUrl(httpRequestPath); 
      httpRequest.setMethod(ApiHttpMethod.POST);
      httpRequest.setHeaders(headers);
      try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(update));}catch(Exception e){e.printStackTrace();}
      return httpRequest;
   }
   
   public ApiHttpResponse<com.commercetools.models.cart.Cart> executeBlocking(){
      try {
          return execute().get();
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
   }
   
   public CompletableFuture<ApiHttpResponse<com.commercetools.models.cart.Cart>> execute(){
      return apiHttpClient.execute(this.createHttpRequest())
              .thenApply(response -> {
                  if(response.getStatusCode() == 409){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 400){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 401){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 403){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 404){
      throw new RuntimeException("Response status code : " + 404);
   }
   
   if(response.getStatusCode() == 500){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
   
   if(response.getStatusCode() == 503){
      try{
          com.commercetools.models.error.ErrorResponse errorResponse = VrapJsonUtils.fromJsonString(new String(response.getBody()), com.commercetools.models.error.ErrorResponse.class);
          throw new RuntimeException(errorResponse.getMessage());
      }catch(Exception e){
          e.printStackTrace();
          throw new RuntimeException(e.getMessage());
      }
   }
                  return Utils.convertResponse(response,com.commercetools.models.cart.Cart.class);
              });
   }
   
   public String getProjectKey() {return this.projectKey;}
   public String getStoreKey() {return this.storeKey;}
   public String getID() {return this.ID;}
   
   public List<String> getExpand() {
      return this.expand;
   }
   
   public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}
   
   public void setStoreKey(final String storeKey) {this.storeKey = storeKey;}
   
   public void setID(final String ID) {this.ID = ID;}
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost addExpand(final String expand){
      this.expand.add(expand);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost withExpand(final List<String> expand){
      this.expand = expand;
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost addHeader(final String key, final String value) {
      this.headers.addHeader(key, value);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost withHeaders(final ApiHttpHeaders headers) {
      this.headers = headers;
      return this;
   }
   
   public String getHeaderValue(final String key) {
      return this.headers.getHeaderValue(key);
   }
   
   public ApiHttpHeaders getHeaders() {
      return this.headers;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
      this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
      return this;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
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