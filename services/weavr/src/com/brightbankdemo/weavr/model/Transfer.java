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
 * Transfer
 */

public class Transfer {
  @JsonProperty("scheduledTimestamp")
  private String scheduledTimestamp = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("profileId")
  private String profileId = null;

  @JsonProperty("destination")
  private InstrumentId destination = null;

  @JsonProperty("creationTimestamp")
  private Long creationTimestamp = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("source")
  private InstrumentId source = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("destinationAmount")
  private CurrencyAmount destinationAmount = null;

  @JsonProperty("executionTimestamp")
  private String executionTimestamp = null;

  public Transfer scheduledTimestamp(String scheduledTimestamp) {
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

  public Transfer cancellationReason(String cancellationReason) {
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

  public Transfer profileId(String profileId) {
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

  public Transfer destination(InstrumentId destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  public InstrumentId getDestination() {
    return destination;
  }

  public void setDestination(InstrumentId destination) {
    this.destination = destination;
  }

  public Transfer creationTimestamp(Long creationTimestamp) {
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

  public Transfer description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description details that are included in the transaction as reference.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transfer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of a Transfer transaction.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Transfer tag(String tag) {
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

  public Transfer source(InstrumentId source) {
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

  public Transfer state(String state) {
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

  public Transfer destinationAmount(CurrencyAmount destinationAmount) {
    this.destinationAmount = destinationAmount;
    return this;
  }

   /**
   * Get destinationAmount
   * @return destinationAmount
  **/
  public CurrencyAmount getDestinationAmount() {
    return destinationAmount;
  }

  public void setDestinationAmount(CurrencyAmount destinationAmount) {
    this.destinationAmount = destinationAmount;
  }

  public Transfer executionTimestamp(String executionTimestamp) {
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
    Transfer Transfer = (Transfer) o;
    return Objects.equals(this.scheduledTimestamp, Transfer.scheduledTimestamp) &&
        Objects.equals(this.cancellationReason, Transfer.cancellationReason) &&
        Objects.equals(this.profileId, Transfer.profileId) &&
        Objects.equals(this.destination, Transfer.destination) &&
        Objects.equals(this.creationTimestamp, Transfer.creationTimestamp) &&
        Objects.equals(this.description, Transfer.description) &&
        Objects.equals(this.id, Transfer.id) &&
        Objects.equals(this.tag, Transfer.tag) &&
        Objects.equals(this.source, Transfer.source) &&
        Objects.equals(this.state, Transfer.state) &&
        Objects.equals(this.destinationAmount, Transfer.destinationAmount) &&
        Objects.equals(this.executionTimestamp, Transfer.executionTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledTimestamp, cancellationReason, profileId, destination, creationTimestamp, description, id, tag, source, state, destinationAmount, executionTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    
    sb.append("    scheduledTimestamp: ").append(toIndentedString(scheduledTimestamp)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    destinationAmount: ").append(toIndentedString(destinationAmount)).append("\n");
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
