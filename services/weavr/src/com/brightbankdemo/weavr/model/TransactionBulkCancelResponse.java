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
import java.util.ArrayList;
import java.util.List;
/**
 * TransactionBulkCancelResponse
 */

public class TransactionBulkCancelResponse {
  @JsonProperty("cancellations")
  private List<TransactionCancelResponse> cancellations = new ArrayList<>();

  public TransactionBulkCancelResponse cancellations(List<TransactionCancelResponse> cancellations) {
    this.cancellations = cancellations;
    return this;
  }

  public TransactionBulkCancelResponse addCancellationsItem(TransactionCancelResponse cancellationsItem) {
    this.cancellations.add(cancellationsItem);
    return this;
  }

   /**
   * Contains the cancellation details for each of the transactions.
   * @return cancellations
  **/
  public List<TransactionCancelResponse> getCancellations() {
    return cancellations;
  }

  public void setCancellations(List<TransactionCancelResponse> cancellations) {
    this.cancellations = cancellations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionBulkCancelResponse TransactionBulkCancelResponse = (TransactionBulkCancelResponse) o;
    return Objects.equals(this.cancellations, TransactionBulkCancelResponse.cancellations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionBulkCancelResponse {\n");
    
    sb.append("    cancellations: ").append(toIndentedString(cancellations)).append("\n");
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
