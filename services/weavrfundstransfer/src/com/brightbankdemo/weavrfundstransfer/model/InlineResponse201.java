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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * InlineResponse201
 */

public class InlineResponse201 {
  @JsonProperty("operationCount")
  private Integer operationCount = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("bulkId")
  private String bulkId = null;

  public InlineResponse201 operationCount(Integer operationCount) {
    this.operationCount = operationCount;
    return this;
  }

   /**
   * Get operationCount
   * @return operationCount
  **/
  public Integer getOperationCount() {
    return operationCount;
  }

  public void setOperationCount(Integer operationCount) {
    this.operationCount = operationCount;
  }

  public InlineResponse201 path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public InlineResponse201 bulkId(String bulkId) {
    this.bulkId = bulkId;
    return this;
  }

   /**
   * Get bulkId
   * @return bulkId
  **/
  public String getBulkId() {
    return bulkId;
  }

  public void setBulkId(String bulkId) {
    this.bulkId = bulkId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inline_response_201 = (InlineResponse201) o;
    return Objects.equals(this.operationCount, inline_response_201.operationCount) &&
        Objects.equals(this.path, inline_response_201.path) &&
        Objects.equals(this.bulkId, inline_response_201.bulkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationCount, path, bulkId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    operationCount: ").append(toIndentedString(operationCount)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    bulkId: ").append(toIndentedString(bulkId)).append("\n");
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
