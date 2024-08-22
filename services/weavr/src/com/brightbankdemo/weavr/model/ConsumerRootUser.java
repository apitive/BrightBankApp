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
 * ConsumerRootUser
 */

public class ConsumerRootUser {
  @JsonProperty("placeOfBirth")
  private String placeOfBirth = null;

  @JsonProperty("occupation")
  private String occupation = null;

  @JsonProperty("address")
  private AddressWithNoRequiredFields address = null;

  @JsonProperty("mobile")
  private Mobile mobile = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("mobileNumberVerified")
  private Boolean mobileNumberVerified = null;

  @JsonProperty("dateOfBirth")
  private Date dateOfBirth = null;

  @JsonProperty("emailVerified")
  private Boolean emailVerified = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private IdentityId id = null;

  @JsonProperty("email")
  private String email = null;

  public ConsumerRootUser placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

   /**
   * The place of birth of the consumer root user.
   * @return placeOfBirth
  **/
  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public ConsumerRootUser occupation(String occupation) {
    this.occupation = occupation;
    return this;
  }

   /**
   * Get occupation
   * @return occupation
  **/
  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public ConsumerRootUser address(AddressWithNoRequiredFields address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public AddressWithNoRequiredFields getAddress() {
    return address;
  }

  public void setAddress(AddressWithNoRequiredFields address) {
    this.address = address;
  }

  public ConsumerRootUser mobile(Mobile mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  public Mobile getMobile() {
    return mobile;
  }

  public void setMobile(Mobile mobile) {
    this.mobile = mobile;
  }

  public ConsumerRootUser active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * The state of the root user. If false, then the user will not be able to log in.
   * @return active
  **/
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ConsumerRootUser mobileNumberVerified(Boolean mobileNumberVerified) {
    this.mobileNumberVerified = mobileNumberVerified;
    return this;
  }

   /**
   * Indicates if the root user&#x27;s mobile number has been verified.
   * @return mobileNumberVerified
  **/
  public Boolean isMobileNumberVerified() {
    return mobileNumberVerified;
  }

  public void setMobileNumberVerified(Boolean mobileNumberVerified) {
    this.mobileNumberVerified = mobileNumberVerified;
  }

  public ConsumerRootUser dateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public ConsumerRootUser emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Indicates if the root user&#x27;s email has been verified.
   * @return emailVerified
  **/
  public Boolean isEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public ConsumerRootUser nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public ConsumerRootUser surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Last name of the root user.
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public ConsumerRootUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * First name of the root user.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConsumerRootUser id(IdentityId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public IdentityId getId() {
    return id;
  }

  public void setId(IdentityId id) {
    this.id = id;
  }

  public ConsumerRootUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerRootUser ConsumerRootUser = (ConsumerRootUser) o;
    return Objects.equals(this.placeOfBirth, ConsumerRootUser.placeOfBirth) &&
        Objects.equals(this.occupation, ConsumerRootUser.occupation) &&
        Objects.equals(this.address, ConsumerRootUser.address) &&
        Objects.equals(this.mobile, ConsumerRootUser.mobile) &&
        Objects.equals(this.active, ConsumerRootUser.active) &&
        Objects.equals(this.mobileNumberVerified, ConsumerRootUser.mobileNumberVerified) &&
        Objects.equals(this.dateOfBirth, ConsumerRootUser.dateOfBirth) &&
        Objects.equals(this.emailVerified, ConsumerRootUser.emailVerified) &&
        Objects.equals(this.nationality, ConsumerRootUser.nationality) &&
        Objects.equals(this.surname, ConsumerRootUser.surname) &&
        Objects.equals(this.name, ConsumerRootUser.name) &&
        Objects.equals(this.id, ConsumerRootUser.id) &&
        Objects.equals(this.email, ConsumerRootUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeOfBirth, occupation, address, mobile, active, mobileNumberVerified, dateOfBirth, emailVerified, nationality, surname, name, id, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerRootUser {\n");
    
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    mobileNumberVerified: ").append(toIndentedString(mobileNumberVerified)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
