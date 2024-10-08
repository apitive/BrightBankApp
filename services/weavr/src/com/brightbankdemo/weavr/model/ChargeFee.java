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
 * ChargeFee
 */

public class ChargeFee {
  @JsonProperty("profileId")
  private String profileId = null;

  @JsonProperty("creationTimestamp")
  private Long creationTimestamp = null;

  @JsonProperty("source")
  private InstrumentId source = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("feeType")
  private String feeType = null;

  @JsonProperty("availableBalanceAdjustment")
  private CurrencyAmount availableBalanceAdjustment = null;

  @JsonProperty("transactionId")
  private TransactionId transactionId = null;

  public ChargeFee profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * The profile Id which a specific identity, instrument or transaction type is linked to.
   * @return profileId
  **/
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public ChargeFee creationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Get creationTimestamp
   * @return creationTimestamp
  **/
  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public ChargeFee source(InstrumentId source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  public InstrumentId getSource() {
    return source;
  }

  public void setSource(InstrumentId source) {
    this.source = source;
  }

  public ChargeFee state(String state) {
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

  public ChargeFee feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * The fee type as defined in the Multi Portal, and as sent in the request.
   * @return feeType
  **/
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public ChargeFee availableBalanceAdjustment(CurrencyAmount availableBalanceAdjustment) {
    this.availableBalanceAdjustment = availableBalanceAdjustment;
    return this;
  }

   /**
   * Get availableBalanceAdjustment
   * @return availableBalanceAdjustment
  **/
  public CurrencyAmount getAvailableBalanceAdjustment() {
    return availableBalanceAdjustment;
  }

  public void setAvailableBalanceAdjustment(CurrencyAmount availableBalanceAdjustment) {
    this.availableBalanceAdjustment = availableBalanceAdjustment;
  }

  public ChargeFee transactionId(TransactionId transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  public TransactionId getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(TransactionId transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeFee ChargeFee = (ChargeFee) o;
    return Objects.equals(this.profileId, ChargeFee.profileId) &&
        Objects.equals(this.creationTimestamp, ChargeFee.creationTimestamp) &&
        Objects.equals(this.source, ChargeFee.source) &&
        Objects.equals(this.state, ChargeFee.state) &&
        Objects.equals(this.feeType, ChargeFee.feeType) &&
        Objects.equals(this.availableBalanceAdjustment, ChargeFee.availableBalanceAdjustment) &&
        Objects.equals(this.transactionId, ChargeFee.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, creationTimestamp, source, state, feeType, availableBalanceAdjustment, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFee {\n");
    
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    availableBalanceAdjustment: ").append(toIndentedString(availableBalanceAdjustment)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
