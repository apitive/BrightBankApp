/*
 * Weavr Multi Product API
 * Weavr Multi API provides a simple and flexible way to issue cards and accounts to your customers.  By integrating Weavr Multi API in your application you can embed banking capabilities within your app and provide a seamless experience for your customers.  # Authentication Each request to the Multi API must include an `api_key` that represents your account. You can obtain an API Key by registering for a Multi account [here](https://portal.weavr.io).  Almost all endpoints require a secondary authentication token `auth_token` that represents the user for whom the request is being executed. 
 *
 * OpenAPI spec version: 3.53.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.brightbankdemo.weavrfundstransfer.model;

import java.util.Objects;
import java.util.Arrays;
import com.brightbankdemo.weavrfundstransfer.model.SyntaxErrorInvalidFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
/**
 * Is returned as part of an HTTP error response whenever a syntax error is detected. A list of the fields together with their syntax error will be provided.
 */

public class SyntaxError {
  @JsonProperty("invalidFields")
  private List<SyntaxErrorInvalidFields> invalidFields = null;

  public SyntaxError invalidFields(List<SyntaxErrorInvalidFields> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public SyntaxError addInvalidFieldsItem(SyntaxErrorInvalidFields invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * Get invalidFields
   * @return invalidFields
  **/
  public List<SyntaxErrorInvalidFields> getInvalidFields() {
    return invalidFields;
  }

  public void setInvalidFields(List<SyntaxErrorInvalidFields> invalidFields) {
    this.invalidFields = invalidFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntaxError SyntaxError = (SyntaxError) o;
    return Objects.equals(this.invalidFields, SyntaxError.invalidFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntaxError {\n");
    
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
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
