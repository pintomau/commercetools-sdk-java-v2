package com.commercetools.models.Extension;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ExtensionResourceTypeId {

  
  @JsonProperty("cart")
  CART("cart"),
  
  
  @JsonProperty("order")
  ORDER("order"),
  
  
  @JsonProperty("payment")
  PAYMENT("payment"),
  
  
  @JsonProperty("customer")
  CUSTOMER("customer");

  private final String jsonName;

  private ExtensionResourceTypeId(final String jsonName) {
    this.jsonName = jsonName;
  }

  public String getJsonName() {
     return jsonName;
  }

  public static Optional<ExtensionResourceTypeId> findEnumViaJsonName(String jsonName) {
    return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
  }
}