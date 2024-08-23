package com.brightbankdemo.weavrfundstransfer.service;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface AccessService {

  /**
   * Login via biometrics
   * Trigger a push notification and subsequent biometric authentication of a user, by providing the email that was  used in the enrolment process of biometrics.  This endpoint can be used in conjunction with your application to authenticate a user and receive a stepped-up  token in a single action, for use in-session for any endpoints or UI components that require step-up  authentication.  Given that the user credentials are correct, a push notification is sent to the user requesting them to complete biometric authentication. On successful completion of authentication, a token will be shared that can be used  for endpoints or UI components that require a stepped-up token. 
   */
  @RequestLine("POST /login_via_biometrics")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void loginViaBiometrics();

  /**
   * Login with password
   * Authenticate a user with the &#x60;email&#x60; and &#x60;password&#x60; that they provided when registering.  Given that the user credentials are correct, this returns a &#x60;token&#x60; that can then be used to authorise other secured operations. In case the password is expired, a temporary &#x60;token&#x60; is returned, which can be used solely for updating the password.  The token returned is valid for 5 minutes from last activity. 
   */
  @RequestLine("POST /login_with_password")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void loginWithPassword();

  /**
   * Logout
   * Logs out the user and terminates the session identified by the &#x60;auth_token&#x60; in the Authorization Header.
   */
  @RequestLine("POST /logout")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void logout();

  /**
   * Acquire a new access token
   * This API endpoint accepts a POST request with an auth_token parameter and returns an access_token that grants authorized access to additional resources within the API, with a different expiration time and unique signature. 
   */
  @RequestLine("POST /access_token")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void requestAccessToken();

  /**
   * Get user identities
   * Retrieves a list of identities available to the holder of the token.
   */
  @RequestLine("GET /identities")
  @Headers({
    "Accept: ",  })
  void userIdentities();

}
