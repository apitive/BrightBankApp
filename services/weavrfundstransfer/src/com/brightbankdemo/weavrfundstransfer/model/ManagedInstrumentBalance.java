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
 * Instruments with funds have 2 balances, the &#x60;availableBalance&#x60; indicating the funds that are available for transactions such as purchases, and the &#x60;actualBalance&#x60; indicating the funds that are actually on the instrument.
 */

public class ManagedInstrumentBalance {
  @JsonProperty("actualBalance")
  private Long actualBalance = null;

  @JsonProperty("availableBalance")
  private Long availableBalance = null;

  public ManagedInstrumentBalance actualBalance(Long actualBalance) {
    this.actualBalance = actualBalance;
    return this;
  }

   /**
   * The funds that are actually on the instrument. Funds that are blocked or pending, due to for example, a purchase authorisation or a pending deposit, are included in the actual balance.
   * @return actualBalance
  **/
  public Long getActualBalance() {
    return actualBalance;
  }

  public void setActualBalance(Long actualBalance) {
    this.actualBalance = actualBalance;
  }

  public ManagedInstrumentBalance availableBalance(Long availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * The funds available for transactions on the instrument. Funds that are blocked or pending are not included in the available balance.
   * @return availableBalance
  **/
  public Long getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(Long availableBalance) {
    this.availableBalance = availableBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedInstrumentBalance ManagedInstrumentBalance = (ManagedInstrumentBalance) o;
    return Objects.equals(this.actualBalance, ManagedInstrumentBalance.actualBalance) &&
        Objects.equals(this.availableBalance, ManagedInstrumentBalance.availableBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualBalance, availableBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedInstrumentBalance {\n");
    
    sb.append("    actualBalance: ").append(toIndentedString(actualBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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
