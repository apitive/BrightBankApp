/*
 * Weavr Multi Product API
 * Weavr Multi API provides a simple and flexible way to issue cards and accounts to your customers.  By integrating Weavr Multi API in your application you can embed banking capabilities within your app and provide a seamless experience for your customers.  # Authentication Each request to the Multi API must include an `api_key` that represents your account. You can obtain an API Key by registering for a Multi account [here](https://portal.weavr.io).  Almost all endpoints require a secondary authentication token `auth_token` that represents the user for whom the request is being executed. 
 *
 * OpenAPI spec version: 3.38.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.brightbankdemo.weavr.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * The address, with none of the separate fields being set as required.
 */

public class AddressWithCountryRequired {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("postCode")
  private String postCode = null;

  @JsonProperty("state")
  private String state = null;

  public AddressWithCountryRequired country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country of the address expressed in ISO 3166 alpha-2 format.
   * @return country
  **/
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddressWithCountryRequired city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the address.
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressWithCountryRequired addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the address.
   * @return addressLine1
  **/
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AddressWithCountryRequired addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the address.
   * @return addressLine2
  **/
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AddressWithCountryRequired postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * The post cost associated with the address.
   * @return postCode
  **/
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public AddressWithCountryRequired state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the address.
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressWithCountryRequired AddressWithCountryRequired = (AddressWithCountryRequired) o;
    return Objects.equals(this.country, AddressWithCountryRequired.country) &&
        Objects.equals(this.city, AddressWithCountryRequired.city) &&
        Objects.equals(this.addressLine1, AddressWithCountryRequired.addressLine1) &&
        Objects.equals(this.addressLine2, AddressWithCountryRequired.addressLine2) &&
        Objects.equals(this.postCode, AddressWithCountryRequired.postCode) &&
        Objects.equals(this.state, AddressWithCountryRequired.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, city, addressLine1, addressLine2, postCode, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressWithCountryRequired {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
