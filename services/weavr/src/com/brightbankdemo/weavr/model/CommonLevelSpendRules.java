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
 * CommonLevelSpendRules
 */

public class CommonLevelSpendRules {
  @JsonProperty("allowAtm")
  private Boolean allowAtm = null;

  @JsonProperty("allowedMerchantCountries")
  private List<String> allowedMerchantCountries = null;

  @JsonProperty("allowECommerce")
  private Boolean allowECommerce = null;

  @JsonProperty("blockedMerchantCategories")
  private List<String> blockedMerchantCategories = null;

  @JsonProperty("allowedMerchantIds")
  private List<String> allowedMerchantIds = null;

  @JsonProperty("blockedMerchantCountries")
  private List<String> blockedMerchantCountries = null;

  @JsonProperty("allowCashback")
  private Boolean allowCashback = null;

  @JsonProperty("blockedMerchantIds")
  private List<String> blockedMerchantIds = null;

  @JsonProperty("allowCreditAuthorisations")
  private Boolean allowCreditAuthorisations = null;

  @JsonProperty("allowedMerchantCategories")
  private List<String> allowedMerchantCategories = null;

  @JsonProperty("allowContactless")
  private Boolean allowContactless = null;

  public CommonLevelSpendRules allowAtm(Boolean allowAtm) {
    this.allowAtm = allowAtm;
    return this;
  }

   /**
   * Indicates if an ATM Withdrawal transaction is allowed on the card.
   * @return allowAtm
  **/
  public Boolean isAllowAtm() {
    return allowAtm;
  }

  public void setAllowAtm(Boolean allowAtm) {
    this.allowAtm = allowAtm;
  }

  public CommonLevelSpendRules allowedMerchantCountries(List<String> allowedMerchantCountries) {
    this.allowedMerchantCountries = allowedMerchantCountries;
    return this;
  }

  public CommonLevelSpendRules addAllowedMerchantCountriesItem(String allowedMerchantCountriesItem) {
    if (this.allowedMerchantCountries == null) {
      this.allowedMerchantCountries = new ArrayList<>();
    }
    this.allowedMerchantCountries.add(allowedMerchantCountriesItem);
    return this;
  }

   /**
   * Whitelist Merchant Country: A list of allowed merchant countries, in ISO 3166-1 alpha-2 format. If the Merchant country does not match, then the transaction will be declined. If a Merchant Country is also provided in the blocked list, the blocked list will take precedence.
   * @return allowedMerchantCountries
  **/
  public List<String> getAllowedMerchantCountries() {
    return allowedMerchantCountries;
  }

  public void setAllowedMerchantCountries(List<String> allowedMerchantCountries) {
    this.allowedMerchantCountries = allowedMerchantCountries;
  }

  public CommonLevelSpendRules allowECommerce(Boolean allowECommerce) {
    this.allowECommerce = allowECommerce;
    return this;
  }

   /**
   * Indicates if an online transaction is allowed on the card.
   * @return allowECommerce
  **/
  public Boolean isAllowECommerce() {
    return allowECommerce;
  }

  public void setAllowECommerce(Boolean allowECommerce) {
    this.allowECommerce = allowECommerce;
  }

  public CommonLevelSpendRules blockedMerchantCategories(List<String> blockedMerchantCategories) {
    this.blockedMerchantCategories = blockedMerchantCategories;
    return this;
  }

  public CommonLevelSpendRules addBlockedMerchantCategoriesItem(String blockedMerchantCategoriesItem) {
    if (this.blockedMerchantCategories == null) {
      this.blockedMerchantCategories = new ArrayList<>();
    }
    this.blockedMerchantCategories.add(blockedMerchantCategoriesItem);
    return this;
  }

   /**
   * Blacklist MCC: A list of disallowed merchant category codes (MCCs). If the MCC matches, then the transaction will be declined. If an MCC is also in the allowed list, the blocked list will take precedence.
   * @return blockedMerchantCategories
  **/
  public List<String> getBlockedMerchantCategories() {
    return blockedMerchantCategories;
  }

  public void setBlockedMerchantCategories(List<String> blockedMerchantCategories) {
    this.blockedMerchantCategories = blockedMerchantCategories;
  }

  public CommonLevelSpendRules allowedMerchantIds(List<String> allowedMerchantIds) {
    this.allowedMerchantIds = allowedMerchantIds;
    return this;
  }

  public CommonLevelSpendRules addAllowedMerchantIdsItem(String allowedMerchantIdsItem) {
    if (this.allowedMerchantIds == null) {
      this.allowedMerchantIds = new ArrayList<>();
    }
    this.allowedMerchantIds.add(allowedMerchantIdsItem);
    return this;
  }

   /**
   * Whitelist Merchant Id: A list of allowed merchant IDs. If the Merchant Id does not match, then the transaction will be declined. If a Merchant Id is also provided in the blocked list, the blocked list will take precedence.
   * @return allowedMerchantIds
  **/
  public List<String> getAllowedMerchantIds() {
    return allowedMerchantIds;
  }

  public void setAllowedMerchantIds(List<String> allowedMerchantIds) {
    this.allowedMerchantIds = allowedMerchantIds;
  }

  public CommonLevelSpendRules blockedMerchantCountries(List<String> blockedMerchantCountries) {
    this.blockedMerchantCountries = blockedMerchantCountries;
    return this;
  }

  public CommonLevelSpendRules addBlockedMerchantCountriesItem(String blockedMerchantCountriesItem) {
    if (this.blockedMerchantCountries == null) {
      this.blockedMerchantCountries = new ArrayList<>();
    }
    this.blockedMerchantCountries.add(blockedMerchantCountriesItem);
    return this;
  }

   /**
   * Blacklist Merchant Country: A list of disallowed merchant countries, in ISO 3166-1 alpha-2 format. If the Merchant country matches, then the transaction will be declined. If a Merchant Country is also in the allowed list, the blocked list will take precedence.
   * @return blockedMerchantCountries
  **/
  public List<String> getBlockedMerchantCountries() {
    return blockedMerchantCountries;
  }

  public void setBlockedMerchantCountries(List<String> blockedMerchantCountries) {
    this.blockedMerchantCountries = blockedMerchantCountries;
  }

  public CommonLevelSpendRules allowCashback(Boolean allowCashback) {
    this.allowCashback = allowCashback;
    return this;
  }

   /**
   * Indicates if a cashback transaction at a physical terminal is allowed on the card.
   * @return allowCashback
  **/
  public Boolean isAllowCashback() {
    return allowCashback;
  }

  public void setAllowCashback(Boolean allowCashback) {
    this.allowCashback = allowCashback;
  }

  public CommonLevelSpendRules blockedMerchantIds(List<String> blockedMerchantIds) {
    this.blockedMerchantIds = blockedMerchantIds;
    return this;
  }

  public CommonLevelSpendRules addBlockedMerchantIdsItem(String blockedMerchantIdsItem) {
    if (this.blockedMerchantIds == null) {
      this.blockedMerchantIds = new ArrayList<>();
    }
    this.blockedMerchantIds.add(blockedMerchantIdsItem);
    return this;
  }

   /**
   * Blacklist Merchant Id: A list of disallowed merchant IDs. If the Merchant Id matches, then the transaction will be declined. If a Merchant Id is also in the allowed list, the blocked list will take precedence.
   * @return blockedMerchantIds
  **/
  public List<String> getBlockedMerchantIds() {
    return blockedMerchantIds;
  }

  public void setBlockedMerchantIds(List<String> blockedMerchantIds) {
    this.blockedMerchantIds = blockedMerchantIds;
  }

  public CommonLevelSpendRules allowCreditAuthorisations(Boolean allowCreditAuthorisations) {
    this.allowCreditAuthorisations = allowCreditAuthorisations;
    return this;
  }

   /**
   * Indicates if a the card can receive a credit transaction.
   * @return allowCreditAuthorisations
  **/
  public Boolean isAllowCreditAuthorisations() {
    return allowCreditAuthorisations;
  }

  public void setAllowCreditAuthorisations(Boolean allowCreditAuthorisations) {
    this.allowCreditAuthorisations = allowCreditAuthorisations;
  }

  public CommonLevelSpendRules allowedMerchantCategories(List<String> allowedMerchantCategories) {
    this.allowedMerchantCategories = allowedMerchantCategories;
    return this;
  }

  public CommonLevelSpendRules addAllowedMerchantCategoriesItem(String allowedMerchantCategoriesItem) {
    if (this.allowedMerchantCategories == null) {
      this.allowedMerchantCategories = new ArrayList<>();
    }
    this.allowedMerchantCategories.add(allowedMerchantCategoriesItem);
    return this;
  }

   /**
   * Whitelist MCC: A list of allowed merchant category codes (MCCs). If the MCC does not match, then the transaction will be declined. If an MCC is also in the blocked list, the blocked list will take precedence.
   * @return allowedMerchantCategories
  **/
  public List<String> getAllowedMerchantCategories() {
    return allowedMerchantCategories;
  }

  public void setAllowedMerchantCategories(List<String> allowedMerchantCategories) {
    this.allowedMerchantCategories = allowedMerchantCategories;
  }

  public CommonLevelSpendRules allowContactless(Boolean allowContactless) {
    this.allowContactless = allowContactless;
    return this;
  }

   /**
   * Indicates if a contactless transaction is allowed on the card.
   * @return allowContactless
  **/
  public Boolean isAllowContactless() {
    return allowContactless;
  }

  public void setAllowContactless(Boolean allowContactless) {
    this.allowContactless = allowContactless;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonLevelSpendRules CommonLevelSpendRules = (CommonLevelSpendRules) o;
    return Objects.equals(this.allowAtm, CommonLevelSpendRules.allowAtm) &&
        Objects.equals(this.allowedMerchantCountries, CommonLevelSpendRules.allowedMerchantCountries) &&
        Objects.equals(this.allowECommerce, CommonLevelSpendRules.allowECommerce) &&
        Objects.equals(this.blockedMerchantCategories, CommonLevelSpendRules.blockedMerchantCategories) &&
        Objects.equals(this.allowedMerchantIds, CommonLevelSpendRules.allowedMerchantIds) &&
        Objects.equals(this.blockedMerchantCountries, CommonLevelSpendRules.blockedMerchantCountries) &&
        Objects.equals(this.allowCashback, CommonLevelSpendRules.allowCashback) &&
        Objects.equals(this.blockedMerchantIds, CommonLevelSpendRules.blockedMerchantIds) &&
        Objects.equals(this.allowCreditAuthorisations, CommonLevelSpendRules.allowCreditAuthorisations) &&
        Objects.equals(this.allowedMerchantCategories, CommonLevelSpendRules.allowedMerchantCategories) &&
        Objects.equals(this.allowContactless, CommonLevelSpendRules.allowContactless);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAtm, allowedMerchantCountries, allowECommerce, blockedMerchantCategories, allowedMerchantIds, blockedMerchantCountries, allowCashback, blockedMerchantIds, allowCreditAuthorisations, allowedMerchantCategories, allowContactless);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonLevelSpendRules {\n");
    
    sb.append("    allowAtm: ").append(toIndentedString(allowAtm)).append("\n");
    sb.append("    allowedMerchantCountries: ").append(toIndentedString(allowedMerchantCountries)).append("\n");
    sb.append("    allowECommerce: ").append(toIndentedString(allowECommerce)).append("\n");
    sb.append("    blockedMerchantCategories: ").append(toIndentedString(blockedMerchantCategories)).append("\n");
    sb.append("    allowedMerchantIds: ").append(toIndentedString(allowedMerchantIds)).append("\n");
    sb.append("    blockedMerchantCountries: ").append(toIndentedString(blockedMerchantCountries)).append("\n");
    sb.append("    allowCashback: ").append(toIndentedString(allowCashback)).append("\n");
    sb.append("    blockedMerchantIds: ").append(toIndentedString(blockedMerchantIds)).append("\n");
    sb.append("    allowCreditAuthorisations: ").append(toIndentedString(allowCreditAuthorisations)).append("\n");
    sb.append("    allowedMerchantCategories: ").append(toIndentedString(allowedMerchantCategories)).append("\n");
    sb.append("    allowContactless: ").append(toIndentedString(allowContactless)).append("\n");
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
