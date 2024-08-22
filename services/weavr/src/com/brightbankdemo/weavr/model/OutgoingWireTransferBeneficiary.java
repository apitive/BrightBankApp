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
 * Details of the beneficiary of the outgoing wire transfer.
 */

public class OutgoingWireTransferBeneficiary {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("bankAccountDetails")
  private Object bankAccountDetails = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("bankAddress")
  private String bankAddress = null;

  @JsonProperty("bankCountry")
  private String bankCountry = null;

  public OutgoingWireTransferBeneficiary address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The beneficiary&#x27;s address.
   * @return address
  **/
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public OutgoingWireTransferBeneficiary bankAccountDetails(Object bankAccountDetails) {
    this.bankAccountDetails = bankAccountDetails;
    return this;
  }

   /**
   * Details of the beneficiary bank account, depending on the type of transfer chosen.
   * @return bankAccountDetails
  **/
  public Object getBankAccountDetails() {
    return bankAccountDetails;
  }

  public void setBankAccountDetails(Object bankAccountDetails) {
    this.bankAccountDetails = bankAccountDetails;
  }

  public OutgoingWireTransferBeneficiary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The beneficiary&#x27;s full name. The allowed length and pattern is dependent on the bank account details type:  &#x60;SepaBankDetails&#x60;: &gt;&#x3D; &#x60;1&#x60; character and &lt;&#x3D; &#x60;150&#x60; characters  &#x60;FasterPaymentsBankDetails&#x60;: &gt;&#x3D; &#x60;1&#x60; character and &lt;&#x3D; &#x60;140&#x60; characters with a pattern of &#x60;^[a-zA-Z0-9/\\-?:().,’+\\s#&#x3D;!\&quot;%&amp;*&lt;&gt;;{@\\r\\n]*$&#x60; (please note that the &#x60;’&#x60; symbol is the unicode value U+2019 (right single quotation mark) and not the unicode value U+0027 (apostrophe)) 
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutgoingWireTransferBeneficiary bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * The beneficiary&#x27;s bank name.
   * @return bankName
  **/
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public OutgoingWireTransferBeneficiary bankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

   /**
   * The beneficiary&#x27;s bank address.
   * @return bankAddress
  **/
  public String getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
  }

  public OutgoingWireTransferBeneficiary bankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
    return this;
  }

   /**
   * The beneficiary&#x27;s bank country in ISO 3166 alpha-2 format.
   * @return bankCountry
  **/
  public String getBankCountry() {
    return bankCountry;
  }

  public void setBankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutgoingWireTransferBeneficiary OutgoingWireTransferBeneficiary = (OutgoingWireTransferBeneficiary) o;
    return Objects.equals(this.address, OutgoingWireTransferBeneficiary.address) &&
        Objects.equals(this.bankAccountDetails, OutgoingWireTransferBeneficiary.bankAccountDetails) &&
        Objects.equals(this.name, OutgoingWireTransferBeneficiary.name) &&
        Objects.equals(this.bankName, OutgoingWireTransferBeneficiary.bankName) &&
        Objects.equals(this.bankAddress, OutgoingWireTransferBeneficiary.bankAddress) &&
        Objects.equals(this.bankCountry, OutgoingWireTransferBeneficiary.bankCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, bankAccountDetails, name, bankName, bankAddress, bankCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutgoingWireTransferBeneficiary {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bankAccountDetails: ").append(toIndentedString(bankAccountDetails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    bankCountry: ").append(toIndentedString(bankCountry)).append("\n");
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
