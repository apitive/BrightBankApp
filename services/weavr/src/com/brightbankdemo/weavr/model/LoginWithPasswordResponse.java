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
 * LoginWithPasswordResponse
 */

public class LoginWithPasswordResponse {
  @JsonProperty("credentials")
  private CredentialId credentials = null;

  @JsonProperty("identity")
  private IdentityId identity = null;

  @JsonProperty("tokenType")
  private String tokenType = null;

  @JsonProperty("token")
  private String token = null;

  public LoginWithPasswordResponse credentials(CredentialId credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  public CredentialId getCredentials() {
    return credentials;
  }

  public void setCredentials(CredentialId credentials) {
    this.credentials = credentials;
  }

  public LoginWithPasswordResponse identity(IdentityId identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  public IdentityId getIdentity() {
    return identity;
  }

  public void setIdentity(IdentityId identity) {
    this.identity = identity;
  }

  public LoginWithPasswordResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public LoginWithPasswordResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWithPasswordResponse LoginWithPasswordResponse = (LoginWithPasswordResponse) o;
    return Objects.equals(this.credentials, LoginWithPasswordResponse.credentials) &&
        Objects.equals(this.identity, LoginWithPasswordResponse.identity) &&
        Objects.equals(this.tokenType, LoginWithPasswordResponse.tokenType) &&
        Objects.equals(this.token, LoginWithPasswordResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, identity, tokenType, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithPasswordResponse {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
