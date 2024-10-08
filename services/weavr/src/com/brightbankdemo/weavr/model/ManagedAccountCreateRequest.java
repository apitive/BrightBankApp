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
 * ManagedAccountCreateRequest
 */

public class ManagedAccountCreateRequest {
  @JsonProperty("purpose")
  private String purpose = null;

  @JsonProperty("profileId")
  private String profileId = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("friendlyName")
  private String friendlyName = null;

  public ManagedAccountCreateRequest purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The friendly name to be given to the managed account.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public ManagedAccountCreateRequest profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * Get profileId
   * @return profileId
  **/
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public ManagedAccountCreateRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ManagedAccountCreateRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ManagedAccountCreateRequest friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * The friendly name to be given to the managed account.
   * @return friendlyName
  **/
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedAccountCreateRequest ManagedAccountCreateRequest = (ManagedAccountCreateRequest) o;
    return Objects.equals(this.purpose, ManagedAccountCreateRequest.purpose) &&
        Objects.equals(this.profileId, ManagedAccountCreateRequest.profileId) &&
        Objects.equals(this.currency, ManagedAccountCreateRequest.currency) &&
        Objects.equals(this.tag, ManagedAccountCreateRequest.tag) &&
        Objects.equals(this.friendlyName, ManagedAccountCreateRequest.friendlyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purpose, profileId, currency, tag, friendlyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedAccountCreateRequest {\n");
    
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
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
