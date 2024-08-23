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
 * ThreeDSecureAuthConfig
 */

public class ThreeDSecureAuthConfig {
  @JsonProperty("linkedUserId")
  private String linkedUserId = null;

  /**
   * Fallback Authentication Method
   */
  public enum FallbackChannelEnum {
    OTP_SMS("OTP_SMS");

    private String value;

    FallbackChannelEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static FallbackChannelEnum fromValue(String input) {
      for (FallbackChannelEnum b : FallbackChannelEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("fallbackChannel")
  private FallbackChannelEnum fallbackChannel = null;

  /**
   * Primary Authentication Method
   */
  public enum PrimaryChannelEnum {
    OTP_SMS("OTP_SMS"),
    BIOMETRICS("BIOMETRICS"),
    TWILIO_AUTHY("TWILIO_AUTHY");

    private String value;

    PrimaryChannelEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static PrimaryChannelEnum fromValue(String input) {
      for (PrimaryChannelEnum b : PrimaryChannelEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("primaryChannel")
  private PrimaryChannelEnum primaryChannel = null;

  public ThreeDSecureAuthConfig linkedUserId(String linkedUserId) {
    this.linkedUserId = linkedUserId;
    return this;
  }

   /**
   * The Authorised user whose authentication / billing details will be reflected on the card for verification purposes such as 3ds.
   * @return linkedUserId
  **/
  public String getLinkedUserId() {
    return linkedUserId;
  }

  public void setLinkedUserId(String linkedUserId) {
    this.linkedUserId = linkedUserId;
  }

  public ThreeDSecureAuthConfig fallbackChannel(FallbackChannelEnum fallbackChannel) {
    this.fallbackChannel = fallbackChannel;
    return this;
  }

   /**
   * Fallback Authentication Method
   * @return fallbackChannel
  **/
  public FallbackChannelEnum getFallbackChannel() {
    return fallbackChannel;
  }

  public void setFallbackChannel(FallbackChannelEnum fallbackChannel) {
    this.fallbackChannel = fallbackChannel;
  }

  public ThreeDSecureAuthConfig primaryChannel(PrimaryChannelEnum primaryChannel) {
    this.primaryChannel = primaryChannel;
    return this;
  }

   /**
   * Primary Authentication Method
   * @return primaryChannel
  **/
  public PrimaryChannelEnum getPrimaryChannel() {
    return primaryChannel;
  }

  public void setPrimaryChannel(PrimaryChannelEnum primaryChannel) {
    this.primaryChannel = primaryChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureAuthConfig ThreeDSecureAuthConfig = (ThreeDSecureAuthConfig) o;
    return Objects.equals(this.linkedUserId, ThreeDSecureAuthConfig.linkedUserId) &&
        Objects.equals(this.fallbackChannel, ThreeDSecureAuthConfig.fallbackChannel) &&
        Objects.equals(this.primaryChannel, ThreeDSecureAuthConfig.primaryChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedUserId, fallbackChannel, primaryChannel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureAuthConfig {\n");
    
    sb.append("    linkedUserId: ").append(toIndentedString(linkedUserId)).append("\n");
    sb.append("    fallbackChannel: ").append(toIndentedString(fallbackChannel)).append("\n");
    sb.append("    primaryChannel: ").append(toIndentedString(primaryChannel)).append("\n");
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
