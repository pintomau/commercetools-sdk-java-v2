package com.commercetools.importer.models.customers;

import com.commercetools.importer.models.common.Address;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.customfields.Custom;
import java.time.LocalDate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Import representation for a customer.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerImportImpl implements CustomerImport {

    private String key;
    
    private String customerNumber;
    
    private String email;
    
    private String password;
    
    private String firstName;
    
    private String lastName;
    
    private String middleName;
    
    private String title;
    
    private String salutation;
    
    private String externalId;
    
    private java.time.LocalDate dateOfBirth;
    
    private String companyName;
    
    private String vatId;
    
    private Boolean isEmailVerified;
    
    private com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup;
    
    private java.util.List<com.commercetools.importer.models.common.Address> addresses;
    
    private com.commercetools.importer.models.common.Address defaultBillingAddress;
    
    private com.commercetools.importer.models.common.Address billingAddresses;
    
    private com.commercetools.importer.models.common.Address defaultShippingAddress;
    
    private com.commercetools.importer.models.common.Address shippingAddresses;
    
    private String locale;
    
    private com.commercetools.importer.models.customfields.Custom custom;

    @JsonCreator
    CustomerImportImpl(@JsonProperty("key") final String key, @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("email") final String email, @JsonProperty("password") final String password, @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName, @JsonProperty("middleName") final String middleName, @JsonProperty("title") final String title, @JsonProperty("salutation") final String salutation, @JsonProperty("externalId") final String externalId, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId, @JsonProperty("isEmailVerified") final Boolean isEmailVerified, @JsonProperty("customerGroup") final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup, @JsonProperty("addresses") final java.util.List<com.commercetools.importer.models.common.Address> addresses, @JsonProperty("defaultBillingAddress") final com.commercetools.importer.models.common.Address defaultBillingAddress, @JsonProperty("billingAddresses") final com.commercetools.importer.models.common.Address billingAddresses, @JsonProperty("defaultShippingAddress") final com.commercetools.importer.models.common.Address defaultShippingAddress, @JsonProperty("shippingAddresses") final com.commercetools.importer.models.common.Address shippingAddresses, @JsonProperty("locale") final String locale, @JsonProperty("custom") final com.commercetools.importer.models.customfields.Custom custom) {
        this.key = key;
        this.customerNumber = customerNumber;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.salutation = salutation;
        this.externalId = externalId;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
        this.vatId = vatId;
        this.isEmailVerified = isEmailVerified;
        this.customerGroup = customerGroup;
        this.addresses = addresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.billingAddresses = billingAddresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.shippingAddresses = shippingAddresses;
        this.locale = locale;
        this.custom = custom;
    }
    public CustomerImportImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>Maps to <code>Customer.customerNumber</code>.</p>
    */
    public String getCustomerNumber(){
        return this.customerNumber;
    }
    
    /**
    *  <p>Maps to <code>Customer.email</code>.</p>
    */
    public String getEmail(){
        return this.email;
    }
    
    /**
    *  <p>Maps to <code>Customer.password</code>.</p>
    */
    public String getPassword(){
        return this.password;
    }
    
    /**
    *  <p>Maps to <code>Customer.firstName</code>.</p>
    */
    public String getFirstName(){
        return this.firstName;
    }
    
    /**
    *  <p>Maps to <code>Customer.lastName</code>.</p>
    */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
    *  <p>Maps to <code>Customer.middleName</code>.</p>
    */
    public String getMiddleName(){
        return this.middleName;
    }
    
    /**
    *  <p>Maps to <code>Customer.title</code>.</p>
    */
    public String getTitle(){
        return this.title;
    }
    
    /**
    *  <p>Maps to <code>Customer.salutation</code>.</p>
    */
    public String getSalutation(){
        return this.salutation;
    }
    
    /**
    *  <p>Maps to <code>Customer.externalId</code>.</p>
    */
    public String getExternalId(){
        return this.externalId;
    }
    
    /**
    *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
    */
    public java.time.LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    
    /**
    *  <p>Maps to <code>Customer.companyName</code>.</p>
    */
    public String getCompanyName(){
        return this.companyName;
    }
    
    /**
    *  <p>Maps to <code>Customer.vatId</code>.</p>
    */
    public String getVatId(){
        return this.vatId;
    }
    
    /**
    *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
    */
    public Boolean getIsEmailVerified(){
        return this.isEmailVerified;
    }
    
    /**
    *  <p>References a customer group by its key.</p>
    *  <p>The customer group referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public com.commercetools.importer.models.common.CustomerGroupKeyReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
    *  <p>Maps to <code>Customer.addresses</code>.</p>
    */
    public java.util.List<com.commercetools.importer.models.common.Address> getAddresses(){
        return this.addresses;
    }
    
    /**
    *  <p>Maps to <code>Customer.defaultBillingAddress</code>.</p>
    */
    public com.commercetools.importer.models.common.Address getDefaultBillingAddress(){
        return this.defaultBillingAddress;
    }
    
    /**
    *  <p>Maps to <code>Customer.billingAddresses</code>.</p>
    */
    public com.commercetools.importer.models.common.Address getBillingAddresses(){
        return this.billingAddresses;
    }
    
    /**
    *  <p>Maps to <code>Customer.defaultShippingAddress</code>.</p>
    */
    public com.commercetools.importer.models.common.Address getDefaultShippingAddress(){
        return this.defaultShippingAddress;
    }
    
    /**
    *  <p>Maps to <code>Customer.shippingAddresses</code>.</p>
    */
    public com.commercetools.importer.models.common.Address getShippingAddresses(){
        return this.shippingAddresses;
    }
    
    /**
    *  <p>Maps to <code>Customer.locale</code>.</p>
    */
    public String getLocale(){
        return this.locale;
    }
    
    /**
    *  <p>The custom fields for this Customer.</p>
    */
    public com.commercetools.importer.models.customfields.Custom getCustom(){
        return this.custom;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setCustomerNumber(final String customerNumber){
        this.customerNumber = customerNumber;
    }
    
    public void setEmail(final String email){
        this.email = email;
    }
    
    public void setPassword(final String password){
        this.password = password;
    }
    
    public void setFirstName(final String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(final String lastName){
        this.lastName = lastName;
    }
    
    public void setMiddleName(final String middleName){
        this.middleName = middleName;
    }
    
    public void setTitle(final String title){
        this.title = title;
    }
    
    public void setSalutation(final String salutation){
        this.salutation = salutation;
    }
    
    public void setExternalId(final String externalId){
        this.externalId = externalId;
    }
    
    public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setCompanyName(final String companyName){
        this.companyName = companyName;
    }
    
    public void setVatId(final String vatId){
        this.vatId = vatId;
    }
    
    public void setIsEmailVerified(final Boolean isEmailVerified){
        this.isEmailVerified = isEmailVerified;
    }
    
    public void setCustomerGroup(final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setAddresses(final java.util.List<com.commercetools.importer.models.common.Address> addresses){
        this.addresses = addresses;
    }
    
    public void setDefaultBillingAddress(final com.commercetools.importer.models.common.Address defaultBillingAddress){
        this.defaultBillingAddress = defaultBillingAddress;
    }
    
    public void setBillingAddresses(final com.commercetools.importer.models.common.Address billingAddresses){
        this.billingAddresses = billingAddresses;
    }
    
    public void setDefaultShippingAddress(final com.commercetools.importer.models.common.Address defaultShippingAddress){
        this.defaultShippingAddress = defaultShippingAddress;
    }
    
    public void setShippingAddresses(final com.commercetools.importer.models.common.Address shippingAddresses){
        this.shippingAddresses = shippingAddresses;
    }
    
    public void setLocale(final String locale){
        this.locale = locale;
    }
    
    public void setCustom(final com.commercetools.importer.models.customfields.Custom custom){
        this.custom = custom;
    }

}