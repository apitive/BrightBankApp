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
 * Beneficiary
 */

public class Beneficiary extends BasicBeneficiary {
  @JsonProperty("relatedOperationBatches")
  private List<BeneficiaryOperationBatchId> relatedOperationBatches = new ArrayList<>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("validationFailure")
  private String validationFailure = null;

  public Beneficiary relatedOperationBatches(List<BeneficiaryOperationBatchId> relatedOperationBatches) {
    this.relatedOperationBatches = relatedOperationBatches;
    return this;
  }

  public Beneficiary addRelatedOperationBatchesItem(BeneficiaryOperationBatchId relatedOperationBatchesItem) {
    this.relatedOperationBatches.add(relatedOperationBatchesItem);
    return this;
  }

   /**
   * The object representing the list of batch IDs and the operations that occurred for each batch.
   * @return relatedOperationBatches
  **/
  public List<BeneficiaryOperationBatchId> getRelatedOperationBatches() {
    return relatedOperationBatches;
  }

  public void setRelatedOperationBatches(List<BeneficiaryOperationBatchId> relatedOperationBatches) {
    this.relatedOperationBatches = relatedOperationBatches;
  }

  public Beneficiary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a Beneficiary.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Beneficiary state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Beneficiary validationFailure(String validationFailure) {
    this.validationFailure = validationFailure;
    return this;
  }

   /**
   * Get validationFailure
   * @return validationFailure
  **/
  public String getValidationFailure() {
    return validationFailure;
  }

  public void setValidationFailure(String validationFailure) {
    this.validationFailure = validationFailure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beneficiary Beneficiary = (Beneficiary) o;
    return Objects.equals(this.relatedOperationBatches, Beneficiary.relatedOperationBatches) &&
        Objects.equals(this.id, Beneficiary.id) &&
        Objects.equals(this.state, Beneficiary.state) &&
        Objects.equals(this.validationFailure, Beneficiary.validationFailure) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedOperationBatches, id, state, validationFailure, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beneficiary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relatedOperationBatches: ").append(toIndentedString(relatedOperationBatches)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    validationFailure: ").append(toIndentedString(validationFailure)).append("\n");
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
