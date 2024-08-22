/*Copyright (c) 2022-2023 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.brightbankdemo.weavr.service;


import com.brightbankdemo.weavr.model.*;
import com.brightbankdemo.weavr.model.ManagedAccount;
import com.brightbankdemo.weavr.model.ManagedAccountCreateRequest;
import com.brightbankdemo.weavr.model.ManagedAccountsGetResponse;
import com.brightbankdemo.weavr.model.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface ManagedAccountsService {

  /**
   * Create a managed account
   * Creates a managed account for the consumer or corporate identity. The Managed Account Profile (configured in the Multi Portal) specified determines the behavior and restrictions that the managed account will have.\&quot; 
    * @param body Pet object that needs to be added to the store (optional)
   */
  @RequestLine("POST /managed_accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void managedAccountCreate(ManagedAccountCreateRequest body);

  /**
   * Get a managed account
   * Fetch the managed account identified by the &#x60;id&#x60; in path.
    * @param id The unique identifier of the Managed Account. (required)
   * @return ManagedAccount
   */
  @RequestLine("GET /managed_accounts/{id}")
  @Headers({
    "Accept: application/json",  })
  ManagedAccount managedAccountGet(@Param("id") String id);

  /**
   * Get a managed account statement
   * Returns a list of transactions against the managed account identified by the &#x60;id&#x60; path parameter, matching the criteria provided in the request.
    * @param id The unique identifier of the managed account. (required)
    * @param offset The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (required)
    * @param accept A request parameter specifying the type of response the client would like. Must be one of &#x60;application/json&#x60;, &#x60;application/pdf&#x60; or &#x60;text/csv&#x60;.  The default response type (&#x60;application/json&#x60;) will be returned if specified incorrectly or not specified.  (optional)
    * @param limit The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)
    * @param orderByTimestamp Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)
    * @param fromTimestamp Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. (optional)
    * @param toTimestamp Filter for transactions having transaction timestamp before &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. (optional)
    * @param showFundMovementsOnly Returns only the entries which contain fund movements. (optional)
   * @return Statement
   */
  @RequestLine("GET /managed_accounts/{id}/statement?offset={offset}&limit={limit}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}&showFundMovementsOnly={showFundMovementsOnly}")
  @Headers({
    "Accept: application/json",
    "accept: {accept}"  })
  Statement managedAccountStatement(@Param("id") String id, @Param("offset") Integer offset, @Param("accept") String accept, @Param("limit") Integer limit, @Param("orderByTimestamp") String orderByTimestamp, @Param("fromTimestamp") Long fromTimestamp, @Param("toTimestamp") Long toTimestamp, @Param("showFundMovementsOnly") Boolean showFundMovementsOnly);


    /**
     * Get a managed account statement
     * Returns a list of transactions against the managed account identified by the &#x60;id&#x60; path parameter, matching the criteria provided in the request.
     * Note, this is equivalent to the other <code>managedAccountStatement</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ManagedAccountStatementQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param id The unique identifier of the managed account. (required)
     * @param accept A request parameter specifying the type of response the client would like. Must be one of &#x60;application/json&#x60;, &#x60;application/pdf&#x60; or &#x60;text/csv&#x60;.  The default response type (&#x60;application/json&#x60;) will be returned if specified incorrectly or not specified.  (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>offset - The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (required)</li>
     *   <li>limit - The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)</li>
     *   <li>orderByTimestamp - Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)</li>
     *   <li>fromTimestamp - Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. (optional)</li>
     *   <li>toTimestamp - Filter for transactions having transaction timestamp before &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. (optional)</li>
     *   <li>showFundMovementsOnly - Returns only the entries which contain fund movements. (optional)</li>
     *   </ul>
     * @return Statement
     */
    @RequestLine("GET /managed_accounts/{id}/statement?offset={offset}&limit={limit}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}&showFundMovementsOnly={showFundMovementsOnly}")
    @Headers({
    "Accept: application/json",
        "accept: {accept}"    })
    Statement managedAccountStatement
    (@Param("id") String id, @Param("accept") String accept, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Update a managed account
   * Update the details for the managed account identified by the &#x60;id&#x60; in the path.
    * @param id The unique identifier of the managed account. (required)
   */
  @RequestLine("PATCH /managed_accounts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void managedAccountUpdate(@Param("id") String id);

  /**
   * Get all managed accounts
   * Retrieves all managed accounts belonging to the logged-in identity.
    * @param offset The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (required)
    * @param limit The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)
    * @param profileId Filter by the managed account/card profile. Leave out to fetch all managed accounts/card. (optional)
    * @param friendlyName Filter by the managed account/card friendly name. Leave out to fetch all managed accounts/card.  The exact name must be provided, as wildcards are not supported.  (optional)
    * @param state  (optional)
    * @param state_blockedReason  (optional)
    * @param state_destroyedReason  (optional)
    * @param currency Filter by the managed account/card currency.  Currencies are expressed as an ISO 4217 code. Leave out to fetch all managed accounts/card.  (optional)
    * @param createdFrom Filter for managed accounts/cards created after &#x60;createdFrom&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts/cards. (optional)
    * @param createdTo Filter for managed accounts/cards created before &#x60;createdTo&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts/cards. (optional)
    * @param tag Filter by the managed account/card tag. The exact tag must be provided, as wildcards are not supported. Leave out to fetch all managed accounts/card. (optional)
   * @return ManagedAccountsGetResponse
   */
  @RequestLine("GET /managed_accounts?offset={offset}&limit={limit}&profileId={profileId}&friendlyName={friendlyName}&state={state}&state.blockedReason={state_blockedReason}&state.destroyedReason={state_destroyedReason}&currency={currency}&createdFrom={createdFrom}&createdTo={createdTo}&tag={tag}")
  @Headers({
    "Accept: application/json",  })
  ManagedAccountsGetResponse managedAccountsGet(@Param("offset") Integer offset, @Param("limit") Integer limit, @Param("profileId") Object profileId, @Param("friendlyName") String friendlyName, @Param("state") List state, @Param("state_blockedReason") List state_blockedReason, @Param("state_destroyedReason") List state_destroyedReason, @Param("currency") Object currency, @Param("createdFrom") Long createdFrom, @Param("createdTo") Long createdTo, @Param("tag") String tag);


    /**
     * Get all managed accounts
     * Retrieves all managed accounts belonging to the logged-in identity.
     * Note, this is equivalent to the other <code>managedAccountsGet</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ManagedAccountsGetQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>offset - The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (required)</li>
     *   <li>limit - The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)</li>
     *   <li>profileId - Filter by the managed account/card profile. Leave out to fetch all managed accounts/card. (optional)</li>
     *   <li>friendlyName - Filter by the managed account/card friendly name. Leave out to fetch all managed accounts/card.  The exact name must be provided, as wildcards are not supported.  (optional)</li>
     *   <li>state -  (optional)</li>
     *   <li>state_blockedReason -  (optional)</li>
     *   <li>state_destroyedReason -  (optional)</li>
     *   <li>currency - Filter by the managed account/card currency.  Currencies are expressed as an ISO 4217 code. Leave out to fetch all managed accounts/card.  (optional)</li>
     *   <li>createdFrom - Filter for managed accounts/cards created after &#x60;createdFrom&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts/cards. (optional)</li>
     *   <li>createdTo - Filter for managed accounts/cards created before &#x60;createdTo&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts/cards. (optional)</li>
     *   <li>tag - Filter by the managed account/card tag. The exact tag must be provided, as wildcards are not supported. Leave out to fetch all managed accounts/card. (optional)</li>
     *   </ul>
     * @return ManagedAccountsGetResponse
     */
    @RequestLine("GET /managed_accounts?offset={offset}&limit={limit}&profileId={profileId}&friendlyName={friendlyName}&state={state}&state.blockedReason={state_blockedReason}&state.destroyedReason={state_destroyedReason}&currency={currency}&createdFrom={createdFrom}&createdTo={createdTo}&tag={tag}")
    @Headers({
    "Accept: application/json",    })
    ManagedAccountsGetResponse managedAccountsGet
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

}
