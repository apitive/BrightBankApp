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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * StatementEntry
 */

public class StatementEntry {
  @JsonProperty("availableBalanceAfter")
  private CurrencyAmount availableBalanceAfter = null;

  @JsonProperty("actualBalanceAfter")
  private CurrencyAmount actualBalanceAfter = null;

  @JsonProperty("additionalFields")
  private Map<String, String> additionalFields = null;

  @JsonProperty("processedTimestamp")
  private Long processedTimestamp = null;

  @JsonProperty("actualBalanceAdjustment")
  private CurrencyAmount actualBalanceAdjustment = null;

  @JsonProperty("entryState")
  private String entryState = null;

  @JsonProperty("transactionId")
  private TransactionId transactionId = null;

  @JsonProperty("transactionFee")
  private CurrencyAmount transactionFee = null;

  @JsonProperty("originalAmount")
  private CurrencyAmount originalAmount = null;

  @JsonProperty("forexRate")
  private ScaledAmount forexRate = null;

  @JsonProperty("cardholderFee")
  private CurrencyAmount cardholderFee = null;

  @JsonProperty("transactionAmount")
  private CurrencyAmount transactionAmount = null;

  @JsonProperty("balanceAfter")
  private CurrencyAmount balanceAfter = null;

  @JsonProperty("sourceAmount")
  private CurrencyAmount sourceAmount = null;

  @JsonProperty("availableBalanceAdjustment")
  private CurrencyAmount availableBalanceAdjustment = null;

  public StatementEntry availableBalanceAfter(CurrencyAmount availableBalanceAfter) {
    this.availableBalanceAfter = availableBalanceAfter;
    return this;
  }

   /**
   * Get availableBalanceAfter
   * @return availableBalanceAfter
  **/
  public CurrencyAmount getAvailableBalanceAfter() {
    return availableBalanceAfter;
  }

  public void setAvailableBalanceAfter(CurrencyAmount availableBalanceAfter) {
    this.availableBalanceAfter = availableBalanceAfter;
  }

  public StatementEntry actualBalanceAfter(CurrencyAmount actualBalanceAfter) {
    this.actualBalanceAfter = actualBalanceAfter;
    return this;
  }

   /**
   * Get actualBalanceAfter
   * @return actualBalanceAfter
  **/
  public CurrencyAmount getActualBalanceAfter() {
    return actualBalanceAfter;
  }

  public void setActualBalanceAfter(CurrencyAmount actualBalanceAfter) {
    this.actualBalanceAfter = actualBalanceAfter;
  }

  public StatementEntry additionalFields(Map<String, String> additionalFields) {
    this.additionalFields = additionalFields;
    return this;
  }

  public StatementEntry putAdditionalFieldsItem(String key, String additionalFieldsItem) {
    if (this.additionalFields == null) {
      this.additionalFields = new HashMap<>();
    }
    this.additionalFields.put(key, additionalFieldsItem);
    return this;
  }

   /**
   * A Map of additional fields. Possible values include fee information. The possible entries are &#x60;merchantName&#x60;, &#x60;merchantCategoryCode&#x60;, &#x60;merchantTerminalCountry&#x60;, &#x60;sourceInstrumentType&#x60;, &#x60;sourceInstrumentId&#x60;, &#x60;destinationInstrumentType&#x60;, &#x60;destinationInstrumentId&#x60;, &#x60;forexPaddingCurrency&#x60;, &#x60;forexPaddingAmount&#x60;, &#x60;note&#x60;, &#x60;sourceInstrumentFriendlyName&#x60;, &#x60;destinationInstrumentFriendlyName&#x60;, &#x60;sourceIdentityType&#x60;, &#x60;sourceIdentityId&#x60;, &#x60;sourceIdentityName&#x60;, &#x60;destinationIdentityType&#x60;, &#x60;destinationIdentityId&#x60;, &#x60;destinationIdentityName&#x60;, &#x60;exchangeRate&#x60;, &#x60;authorisationState&#x60;, &#x60;authorisationRelatedId&#x60;, &#x60;settlementRelatedId&#x60;, &#x60;chargeFeeType&#x60;, &#x60;relatedTransactionId&#x60;, &#x60;relatedTransactionIdType&#x60;, &#x60;beneficiaryName&#x60;, &#x60;beneficiaryAccount&#x60;, &#x60;beneficiaryBankCode&#x60;, &#x60;merchantId&#x60;, &#x60;merchantTransactionType&#x60;, &#x60;systemTransactionType&#x60;, &#x60;authorisationCode&#x60;, &#x60;relatedCardId&#x60;, &#x60;sender&#x60;, &#x60;forexFeeCurrency&#x60;, &#x60;forexFeeAmount&#x60;, &#x60;senderIban&#x60;, &#x60;senderReference&#x60;, &#x60;mandateId&#x60;, &#x60;merchantReference&#x60;, &#x60;description&#x60;, &#x60;declineReason&#x60; and &#x60;spendRuleFailedReason&#x60;.
   * @return additionalFields
  **/
  public Map<String, String> getAdditionalFields() {
    return additionalFields;
  }

  public void setAdditionalFields(Map<String, String> additionalFields) {
    this.additionalFields = additionalFields;
  }

  public StatementEntry processedTimestamp(Long processedTimestamp) {
    this.processedTimestamp = processedTimestamp;
    return this;
  }

   /**
   * The timestamp when the transaction was processed by the system, expressed in Epoch timestamp using millisecond precision.
   * @return processedTimestamp
  **/
  public Long getProcessedTimestamp() {
    return processedTimestamp;
  }

  public void setProcessedTimestamp(Long processedTimestamp) {
    this.processedTimestamp = processedTimestamp;
  }

  public StatementEntry actualBalanceAdjustment(CurrencyAmount actualBalanceAdjustment) {
    this.actualBalanceAdjustment = actualBalanceAdjustment;
    return this;
  }

   /**
   * Get actualBalanceAdjustment
   * @return actualBalanceAdjustment
  **/
  public CurrencyAmount getActualBalanceAdjustment() {
    return actualBalanceAdjustment;
  }

  public void setActualBalanceAdjustment(CurrencyAmount actualBalanceAdjustment) {
    this.actualBalanceAdjustment = actualBalanceAdjustment;
  }

  public StatementEntry entryState(String entryState) {
    this.entryState = entryState;
    return this;
  }

   /**
   * Get entryState
   * @return entryState
  **/
  public String getEntryState() {
    return entryState;
  }

  public void setEntryState(String entryState) {
    this.entryState = entryState;
  }

  public StatementEntry transactionId(TransactionId transactionId) {
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

  public StatementEntry transactionFee(CurrencyAmount transactionFee) {
    this.transactionFee = transactionFee;
    return this;
  }

   /**
   * Get transactionFee
   * @return transactionFee
  **/
  public CurrencyAmount getTransactionFee() {
    return transactionFee;
  }

  public void setTransactionFee(CurrencyAmount transactionFee) {
    this.transactionFee = transactionFee;
  }

  public StatementEntry originalAmount(CurrencyAmount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  public CurrencyAmount getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(CurrencyAmount originalAmount) {
    this.originalAmount = originalAmount;
  }

  public StatementEntry forexRate(ScaledAmount forexRate) {
    this.forexRate = forexRate;
    return this;
  }

   /**
   * Get forexRate
   * @return forexRate
  **/
  public ScaledAmount getForexRate() {
    return forexRate;
  }

  public void setForexRate(ScaledAmount forexRate) {
    this.forexRate = forexRate;
  }

  public StatementEntry cardholderFee(CurrencyAmount cardholderFee) {
    this.cardholderFee = cardholderFee;
    return this;
  }

   /**
   * Get cardholderFee
   * @return cardholderFee
  **/
  public CurrencyAmount getCardholderFee() {
    return cardholderFee;
  }

  public void setCardholderFee(CurrencyAmount cardholderFee) {
    this.cardholderFee = cardholderFee;
  }

  public StatementEntry transactionAmount(CurrencyAmount transactionAmount) {
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

  public StatementEntry balanceAfter(CurrencyAmount balanceAfter) {
    this.balanceAfter = balanceAfter;
    return this;
  }

   /**
   * Get balanceAfter
   * @return balanceAfter
  **/
  public CurrencyAmount getBalanceAfter() {
    return balanceAfter;
  }

  public void setBalanceAfter(CurrencyAmount balanceAfter) {
    this.balanceAfter = balanceAfter;
  }

  public StatementEntry sourceAmount(CurrencyAmount sourceAmount) {
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

  public StatementEntry availableBalanceAdjustment(CurrencyAmount availableBalanceAdjustment) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementEntry StatementEntry = (StatementEntry) o;
    return Objects.equals(this.availableBalanceAfter, StatementEntry.availableBalanceAfter) &&
        Objects.equals(this.actualBalanceAfter, StatementEntry.actualBalanceAfter) &&
        Objects.equals(this.additionalFields, StatementEntry.additionalFields) &&
        Objects.equals(this.processedTimestamp, StatementEntry.processedTimestamp) &&
        Objects.equals(this.actualBalanceAdjustment, StatementEntry.actualBalanceAdjustment) &&
        Objects.equals(this.entryState, StatementEntry.entryState) &&
        Objects.equals(this.transactionId, StatementEntry.transactionId) &&
        Objects.equals(this.transactionFee, StatementEntry.transactionFee) &&
        Objects.equals(this.originalAmount, StatementEntry.originalAmount) &&
        Objects.equals(this.forexRate, StatementEntry.forexRate) &&
        Objects.equals(this.cardholderFee, StatementEntry.cardholderFee) &&
        Objects.equals(this.transactionAmount, StatementEntry.transactionAmount) &&
        Objects.equals(this.balanceAfter, StatementEntry.balanceAfter) &&
        Objects.equals(this.sourceAmount, StatementEntry.sourceAmount) &&
        Objects.equals(this.availableBalanceAdjustment, StatementEntry.availableBalanceAdjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBalanceAfter, actualBalanceAfter, additionalFields, processedTimestamp, actualBalanceAdjustment, entryState, transactionId, transactionFee, originalAmount, forexRate, cardholderFee, transactionAmount, balanceAfter, sourceAmount, availableBalanceAdjustment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementEntry {\n");
    
    sb.append("    availableBalanceAfter: ").append(toIndentedString(availableBalanceAfter)).append("\n");
    sb.append("    actualBalanceAfter: ").append(toIndentedString(actualBalanceAfter)).append("\n");
    sb.append("    additionalFields: ").append(toIndentedString(additionalFields)).append("\n");
    sb.append("    processedTimestamp: ").append(toIndentedString(processedTimestamp)).append("\n");
    sb.append("    actualBalanceAdjustment: ").append(toIndentedString(actualBalanceAdjustment)).append("\n");
    sb.append("    entryState: ").append(toIndentedString(entryState)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionFee: ").append(toIndentedString(transactionFee)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    forexRate: ").append(toIndentedString(forexRate)).append("\n");
    sb.append("    cardholderFee: ").append(toIndentedString(cardholderFee)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    balanceAfter: ").append(toIndentedString(balanceAfter)).append("\n");
    sb.append("    sourceAmount: ").append(toIndentedString(sourceAmount)).append("\n");
    sb.append("    availableBalanceAdjustment: ").append(toIndentedString(availableBalanceAdjustment)).append("\n");
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
