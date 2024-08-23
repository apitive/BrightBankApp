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
import com.brightbankdemo.weavrfundstransfer.model.OutgoingWireTransferSourceInstrument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * OutgoingWireTransfer
 */

public class OutgoingWireTransfer {
  @JsonProperty("scheduledTimestamp")
  private String scheduledTimestamp = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("transferAmount")
  private CurrencyAmount transferAmount = null;

  @JsonProperty("destination")
  private Object destination = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("sourceInstrument")
  private OutgoingWireTransferSourceInstrument sourceInstrument = null;

  @JsonProperty("rejectedInfo")
  private String rejectedInfo = null;

  @JsonProperty("profileId")
  private String profileId = null;

  @JsonProperty("creationTimestamp")
  private Long creationTimestamp = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("challengeExemptionReason")
  private String challengeExemptionReason = null;

  @JsonProperty("executionTimestamp")
  private String executionTimestamp = null;

  public OutgoingWireTransfer scheduledTimestamp(String scheduledTimestamp) {
    this.scheduledTimestamp = scheduledTimestamp;
    return this;
  }

   /**
   * Get scheduledTimestamp
   * @return scheduledTimestamp
  **/
  public String getScheduledTimestamp() {
    return scheduledTimestamp;
  }

  public void setScheduledTimestamp(String scheduledTimestamp) {
    this.scheduledTimestamp = scheduledTimestamp;
  }

  public OutgoingWireTransfer cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

   /**
   * Get cancellationReason
   * @return cancellationReason
  **/
  public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public OutgoingWireTransfer transferAmount(CurrencyAmount transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Get transferAmount
   * @return transferAmount
  **/
  public CurrencyAmount getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(CurrencyAmount transferAmount) {
    this.transferAmount = transferAmount;
  }

  public OutgoingWireTransfer destination(Object destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  public Object getDestination() {
    return destination;
  }

  public void setDestination(Object destination) {
    this.destination = destination;
  }

  public OutgoingWireTransfer description(String description) {
    this.description = description;
    return this;
  }

   /**
   *  Transaction description.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OutgoingWireTransfer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OutgoingWireTransfer sourceInstrument(OutgoingWireTransferSourceInstrument sourceInstrument) {
    this.sourceInstrument = sourceInstrument;
    return this;
  }

   /**
   * Get sourceInstrument
   * @return sourceInstrument
  **/
  public OutgoingWireTransferSourceInstrument getSourceInstrument() {
    return sourceInstrument;
  }

  public void setSourceInstrument(OutgoingWireTransferSourceInstrument sourceInstrument) {
    this.sourceInstrument = sourceInstrument;
  }

  public OutgoingWireTransfer rejectedInfo(String rejectedInfo) {
    this.rejectedInfo = rejectedInfo;
    return this;
  }

   /**
   * Get rejectedInfo
   * @return rejectedInfo
  **/
  public String getRejectedInfo() {
    return rejectedInfo;
  }

  public void setRejectedInfo(String rejectedInfo) {
    this.rejectedInfo = rejectedInfo;
  }

  public OutgoingWireTransfer profileId(String profileId) {
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

  public OutgoingWireTransfer creationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * The time when the transaction was created, expressed in Epoch timestamp using millisecond precision.
   * @return creationTimestamp
  **/
  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public OutgoingWireTransfer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of an Outgoing Wire Transfer transaction.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OutgoingWireTransfer tag(String tag) {
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

  public OutgoingWireTransfer state(String state) {
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

  public OutgoingWireTransfer challengeExemptionReason(String challengeExemptionReason) {
    this.challengeExemptionReason = challengeExemptionReason;
    return this;
  }

   /**
   * Get challengeExemptionReason
   * @return challengeExemptionReason
  **/
  public String getChallengeExemptionReason() {
    return challengeExemptionReason;
  }

  public void setChallengeExemptionReason(String challengeExemptionReason) {
    this.challengeExemptionReason = challengeExemptionReason;
  }

  public OutgoingWireTransfer executionTimestamp(String executionTimestamp) {
    this.executionTimestamp = executionTimestamp;
    return this;
  }

   /**
   * Get executionTimestamp
   * @return executionTimestamp
  **/
  public String getExecutionTimestamp() {
    return executionTimestamp;
  }

  public void setExecutionTimestamp(String executionTimestamp) {
    this.executionTimestamp = executionTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingWireTransfer OutgoingWireTransfer = (OutgoingWireTransfer) o;
    return Objects.equals(this.scheduledTimestamp, OutgoingWireTransfer.scheduledTimestamp) &&
        Objects.equals(this.cancellationReason, OutgoingWireTransfer.cancellationReason) &&
        Objects.equals(this.transferAmount, OutgoingWireTransfer.transferAmount) &&
        Objects.equals(this.destination, OutgoingWireTransfer.destination) &&
        Objects.equals(this.description, OutgoingWireTransfer.description) &&
        Objects.equals(this.type, OutgoingWireTransfer.type) &&
        Objects.equals(this.sourceInstrument, OutgoingWireTransfer.sourceInstrument) &&
        Objects.equals(this.rejectedInfo, OutgoingWireTransfer.rejectedInfo) &&
        Objects.equals(this.profileId, OutgoingWireTransfer.profileId) &&
        Objects.equals(this.creationTimestamp, OutgoingWireTransfer.creationTimestamp) &&
        Objects.equals(this.id, OutgoingWireTransfer.id) &&
        Objects.equals(this.tag, OutgoingWireTransfer.tag) &&
        Objects.equals(this.state, OutgoingWireTransfer.state) &&
        Objects.equals(this.challengeExemptionReason, OutgoingWireTransfer.challengeExemptionReason) &&
        Objects.equals(this.executionTimestamp, OutgoingWireTransfer.executionTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledTimestamp, cancellationReason, transferAmount, destination, description, type, sourceInstrument, rejectedInfo, profileId, creationTimestamp, id, tag, state, challengeExemptionReason, executionTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingWireTransfer {\n");
    
    sb.append("    scheduledTimestamp: ").append(toIndentedString(scheduledTimestamp)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceInstrument: ").append(toIndentedString(sourceInstrument)).append("\n");
    sb.append("    rejectedInfo: ").append(toIndentedString(rejectedInfo)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    challengeExemptionReason: ").append(toIndentedString(challengeExemptionReason)).append("\n");
    sb.append("    executionTimestamp: ").append(toIndentedString(executionTimestamp)).append("\n");
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
