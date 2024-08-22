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
 * Additional information related to the user&#x27;s password.
 */

public class PasswordInfo {
  @JsonProperty("expiryDate")
  private Long expiryDate = null;

  @JsonProperty("identityId")
  private IdentityId identityId = null;

  public PasswordInfo expiryDate(Long expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The millisecond timestamp indicating when the password will expire. If 0, then this password will not expire.
   * @return expiryDate
  **/
  public Long getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Long expiryDate) {
    this.expiryDate = expiryDate;
  }

  public PasswordInfo identityId(IdentityId identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  public IdentityId getIdentityId() {
    return identityId;
  }

  public void setIdentityId(IdentityId identityId) {
    this.identityId = identityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordInfo PasswordInfo = (PasswordInfo) o;
    return Objects.equals(this.expiryDate, PasswordInfo.expiryDate) &&
        Objects.equals(this.identityId, PasswordInfo.identityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryDate, identityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordInfo {\n");
    
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
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
