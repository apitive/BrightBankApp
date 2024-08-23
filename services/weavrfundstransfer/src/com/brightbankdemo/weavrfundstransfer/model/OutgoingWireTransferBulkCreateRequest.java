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
import java.util.ArrayList;
import java.util.List;
/**
 * OutgoingWireTransferBulkCreateRequest
 */

public class OutgoingWireTransferBulkCreateRequest {
  @JsonProperty("outgoingWireTransfers")
  private List<OutgoingWireTransferCreateRequest> outgoingWireTransfers = new ArrayList<>();

  public OutgoingWireTransferBulkCreateRequest outgoingWireTransfers(List<OutgoingWireTransferCreateRequest> outgoingWireTransfers) {
    this.outgoingWireTransfers = outgoingWireTransfers;
    return this;
  }

  public OutgoingWireTransferBulkCreateRequest addOutgoingWireTransfersItem(OutgoingWireTransferCreateRequest outgoingWireTransfersItem) {
    this.outgoingWireTransfers.add(outgoingWireTransfersItem);
    return this;
  }

   /**
   * The object representing the outgoing wire transfers&#x27; details.
   * @return outgoingWireTransfers
  **/
  public List<OutgoingWireTransferCreateRequest> getOutgoingWireTransfers() {
    return outgoingWireTransfers;
  }

  public void setOutgoingWireTransfers(List<OutgoingWireTransferCreateRequest> outgoingWireTransfers) {
    this.outgoingWireTransfers = outgoingWireTransfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingWireTransferBulkCreateRequest OutgoingWireTransferBulkCreateRequest = (OutgoingWireTransferBulkCreateRequest) o;
    return Objects.equals(this.outgoingWireTransfers, OutgoingWireTransferBulkCreateRequest.outgoingWireTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outgoingWireTransfers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingWireTransferBulkCreateRequest {\n");
    
    sb.append("    outgoingWireTransfers: ").append(toIndentedString(outgoingWireTransfers)).append("\n");
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
