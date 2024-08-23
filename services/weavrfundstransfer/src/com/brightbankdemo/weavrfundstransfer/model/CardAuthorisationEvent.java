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
 * CardAuthorisationEvent
 */

public class CardAuthorisationEvent {
  @JsonProperty("owner")
  private IdentityId owner = null;

  @JsonProperty("authCode")
  private String authCode = null;

  @JsonProperty("merchantData")
  private MerchantData merchantData = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("totalTransactionCost")
  private CurrencyAmount totalTransactionCost = null;

  @JsonProperty("transactionTimestamp")
  private Long transactionTimestamp = null;

  @JsonProperty("forexPadding")
  private CurrencyAmount forexPadding = null;

  @JsonProperty("forexFee")
  private CurrencyAmount forexFee = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("authorisationType")
  private String authorisationType = null;

  @JsonProperty("cardId")
  private String cardId = null;

  @JsonProperty("transactionAmount")
  private CurrencyAmount transactionAmount = null;

  @JsonProperty("sourceAmount")
  private CurrencyAmount sourceAmount = null;

  @JsonProperty("cardholderPresent")
  private String cardholderPresent = null;

  @JsonProperty("cardPresent")
  private Boolean cardPresent = null;

  public CardAuthorisationEvent owner(IdentityId owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public IdentityId getOwner() {
    return owner;
  }

  public void setOwner(IdentityId owner) {
    this.owner = owner;
  }

  public CardAuthorisationEvent authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * The authorisation code associated with this authorisation.
   * @return authCode
  **/
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  public CardAuthorisationEvent merchantData(MerchantData merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Get merchantData
   * @return merchantData
  **/
  public MerchantData getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(MerchantData merchantData) {
    this.merchantData = merchantData;
  }

  public CardAuthorisationEvent transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The id of this transaction, for reference.
   * @return transactionId
  **/
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public CardAuthorisationEvent totalTransactionCost(CurrencyAmount totalTransactionCost) {
    this.totalTransactionCost = totalTransactionCost;
    return this;
  }

   /**
   * Get totalTransactionCost
   * @return totalTransactionCost
  **/
  public CurrencyAmount getTotalTransactionCost() {
    return totalTransactionCost;
  }

  public void setTotalTransactionCost(CurrencyAmount totalTransactionCost) {
    this.totalTransactionCost = totalTransactionCost;
  }

  public CardAuthorisationEvent transactionTimestamp(Long transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

   /**
   * The timestamp of the transaction, using epoch timestamp with millisecond precision.
   * @return transactionTimestamp
  **/
  public Long getTransactionTimestamp() {
    return transactionTimestamp;
  }

  public void setTransactionTimestamp(Long transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
  }

  public CardAuthorisationEvent forexPadding(CurrencyAmount forexPadding) {
    this.forexPadding = forexPadding;
    return this;
  }

   /**
   * Get forexPadding
   * @return forexPadding
  **/
  public CurrencyAmount getForexPadding() {
    return forexPadding;
  }

  public void setForexPadding(CurrencyAmount forexPadding) {
    this.forexPadding = forexPadding;
  }

  public CardAuthorisationEvent forexFee(CurrencyAmount forexFee) {
    this.forexFee = forexFee;
    return this;
  }

   /**
   * Get forexFee
   * @return forexFee
  **/
  public CurrencyAmount getForexFee() {
    return forexFee;
  }

  public void setForexFee(CurrencyAmount forexFee) {
    this.forexFee = forexFee;
  }

  public CardAuthorisationEvent mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * The card can be created in prepaid mode or debit mode.  - A prepaid mode card has its own balance and can have funds transferred to or from it. - A debit mode card does not have its own balance but will be able to spend funds belonging to its parent managed account, subject to a configurable spend limit. 
   * @return mode
  **/
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public CardAuthorisationEvent authorisationType(String authorisationType) {
    this.authorisationType = authorisationType;
    return this;
  }

   /**
   * Get authorisationType
   * @return authorisationType
  **/
  public String getAuthorisationType() {
    return authorisationType;
  }

  public void setAuthorisationType(String authorisationType) {
    this.authorisationType = authorisationType;
  }

  public CardAuthorisationEvent cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * The unique identifier of the card on which an authorisation is being performed
   * @return cardId
  **/
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public CardAuthorisationEvent transactionAmount(CurrencyAmount transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  public CurrencyAmount getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(CurrencyAmount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public CardAuthorisationEvent sourceAmount(CurrencyAmount sourceAmount) {
    this.sourceAmount = sourceAmount;
    return this;
  }

   /**
   * Get sourceAmount
   * @return sourceAmount
  **/
  public CurrencyAmount getSourceAmount() {
    return sourceAmount;
  }

  public void setSourceAmount(CurrencyAmount sourceAmount) {
    this.sourceAmount = sourceAmount;
  }

  public CardAuthorisationEvent cardholderPresent(String cardholderPresent) {
    this.cardholderPresent = cardholderPresent;
    return this;
  }

   /**
   * Get cardholderPresent
   * @return cardholderPresent
  **/
  public String getCardholderPresent() {
    return cardholderPresent;
  }

  public void setCardholderPresent(String cardholderPresent) {
    this.cardholderPresent = cardholderPresent;
  }

  public CardAuthorisationEvent cardPresent(Boolean cardPresent) {
    this.cardPresent = cardPresent;
    return this;
  }

   /**
   * Optional detail indicating if the card was present when the authorisation occurred.
   * @return cardPresent
  **/
  public Boolean isCardPresent() {
    return cardPresent;
  }

  public void setCardPresent(Boolean cardPresent) {
    this.cardPresent = cardPresent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAuthorisationEvent CardAuthorisationEvent = (CardAuthorisationEvent) o;
    return Objects.equals(this.owner, CardAuthorisationEvent.owner) &&
        Objects.equals(this.authCode, CardAuthorisationEvent.authCode) &&
        Objects.equals(this.merchantData, CardAuthorisationEvent.merchantData) &&
        Objects.equals(this.transactionId, CardAuthorisationEvent.transactionId) &&
        Objects.equals(this.totalTransactionCost, CardAuthorisationEvent.totalTransactionCost) &&
        Objects.equals(this.transactionTimestamp, CardAuthorisationEvent.transactionTimestamp) &&
        Objects.equals(this.forexPadding, CardAuthorisationEvent.forexPadding) &&
        Objects.equals(this.forexFee, CardAuthorisationEvent.forexFee) &&
        Objects.equals(this.mode, CardAuthorisationEvent.mode) &&
        Objects.equals(this.authorisationType, CardAuthorisationEvent.authorisationType) &&
        Objects.equals(this.cardId, CardAuthorisationEvent.cardId) &&
        Objects.equals(this.transactionAmount, CardAuthorisationEvent.transactionAmount) &&
        Objects.equals(this.sourceAmount, CardAuthorisationEvent.sourceAmount) &&
        Objects.equals(this.cardholderPresent, CardAuthorisationEvent.cardholderPresent) &&
        Objects.equals(this.cardPresent, CardAuthorisationEvent.cardPresent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, authCode, merchantData, transactionId, totalTransactionCost, transactionTimestamp, forexPadding, forexFee, mode, authorisationType, cardId, transactionAmount, sourceAmount, cardholderPresent, cardPresent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAuthorisationEvent {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    totalTransactionCost: ").append(toIndentedString(totalTransactionCost)).append("\n");
    sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
    sb.append("    forexPadding: ").append(toIndentedString(forexPadding)).append("\n");
    sb.append("    forexFee: ").append(toIndentedString(forexFee)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    sourceAmount: ").append(toIndentedString(sourceAmount)).append("\n");
    sb.append("    cardholderPresent: ").append(toIndentedString(cardholderPresent)).append("\n");
    sb.append("    cardPresent: ").append(toIndentedString(cardPresent)).append("\n");
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
