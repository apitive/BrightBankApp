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
 * BulkProcessOperation
 */

public class BulkProcessOperation {
  @JsonProperty("result")
  private String result = null;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("payload")
  private String payload = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("operationId")
  private String operationId = null;

  @JsonProperty("status")
  private String status = null;

  public BulkProcessOperation result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public BulkProcessOperation sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public BulkProcessOperation path(String path) {
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

  public BulkProcessOperation method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public BulkProcessOperation payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public BulkProcessOperation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public BulkProcessOperation operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Id of a specific bulk operation
   * @return operationId
  **/
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public BulkProcessOperation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkProcessOperation BulkProcessOperation = (BulkProcessOperation) o;
    return Objects.equals(this.result, BulkProcessOperation.result) &&
        Objects.equals(this.sequence, BulkProcessOperation.sequence) &&
        Objects.equals(this.path, BulkProcessOperation.path) &&
        Objects.equals(this.method, BulkProcessOperation.method) &&
        Objects.equals(this.payload, BulkProcessOperation.payload) &&
        Objects.equals(this.errorMessage, BulkProcessOperation.errorMessage) &&
        Objects.equals(this.operationId, BulkProcessOperation.operationId) &&
        Objects.equals(this.status, BulkProcessOperation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, sequence, path, method, payload, errorMessage, operationId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProcessOperation {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
