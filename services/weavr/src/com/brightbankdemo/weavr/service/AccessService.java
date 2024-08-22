/*Copyright (c) 2022-2023 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.brightbankdemo.weavr.service;


import com.brightbankdemo.weavr.model.*;
import com.brightbankdemo.weavr.model.LoginWithPasswordRequest;
import com.brightbankdemo.weavr.model.LoginWithPasswordResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface AccessService {

  /**
   * Login with password
   * Authenticate a user with the &#x60;email&#x60; and &#x60;password&#x60; that they provided when registering.  Given that the user credentials are correct, this returns a &#x60;token&#x60; that can then be used to authorise other secured operations. In case the password is expired, a temporary &#x60;token&#x60; is returned, which can be used solely for updating the password.  The token returned is valid for 5 minutes from last activity. 
    * @param body Pet object that needs to be added to the store (required)
   * @return LoginWithPasswordResponse
   */
  @RequestLine("POST /login_with_password")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",  })
  LoginWithPasswordResponse loginWithPassword(LoginWithPasswordRequest body);

}
