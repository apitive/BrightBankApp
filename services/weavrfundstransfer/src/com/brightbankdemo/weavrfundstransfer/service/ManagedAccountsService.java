package com.brightbankdemo.weavrfundstransfer.service;


import com.brightbankdemo.weavrfundstransfer.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface ManagedAccountsService {

  /**
   * Block a managed account
   * Temporarily blocks a managed account.
    * @param id The unique identifier of the managed account. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations. Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_accounts/{id}/block")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",
    "idempotency-ref: {idempotency_ref}"  })
  void managedAccountBlock(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Create a managed account
   * Creates a managed account for the consumer or corporate identity. The Managed Account Profile (configured in the Multi Portal) specified determines the behavior and restrictions that the managed account will have.\&quot; 
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations. Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",
    "idempotency-ref: {idempotency_ref}"  })
  void managedAccountCreate(@Param("idempotency_ref") String idempotency_ref);

  /**
   * Get a managed account
   * Fetch the managed account identified by the &#x60;id&#x60; in path.
    * @param id The unique identifier of the Managed Account. (required)
   */
  @RequestLine("GET /managed_accounts/{id}")
  @Headers({
    "Accept: ",  })
  void managedAccountGet(@Param("id") String id);

  /**
   * Get a managed account IBAN
   * Fetch the IBAN details associated with the Managed Account identified by the &#x60;id&#x60; in the path.
    * @param id  (required)
   */
  @RequestLine("GET /managed_accounts/{id}/iban")
  @Headers({
    "Accept: ",  })
  void managedAccountIBANGet(@Param("id") String id);

  /**
   * Remove a managed account
   * Destroys the managed account identified by the &#x60;id&#x60; path parameter. Unlike block, this action is not reversible.  A managed account must be emptied from any remaining funds before it can be destroyed. 
    * @param id The unique identifier of the managed account. (required)
   */
  @RequestLine("POST /managed_accounts/{id}/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void managedAccountRemove(@Param("id") String id);

  /**
   * Get a managed account statement
   * Returns a list of transactions against the managed account identified by the &#x60;id&#x60; path parameter, matching the criteria provided in the request.
    * @param id The unique identifier of the managed account. (required)
    * @param accept A request parameter specifying the type of response the client would like. Must be one of &#x60;application/json&#x60;, &#x60;application/pdf&#x60; or &#x60;text/csv&#x60;.  The default response type (&#x60;application/json&#x60;) will be returned if specified incorrectly or not specified.  (optional)
    * @param offset The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)
    * @param limit The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)
    * @param orderByTimestamp Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)
    * @param fromTimestamp Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. (optional)
    * @param toTimestamp Filter for transactions having transaction timestamp before &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. Must be higher than fromTimestamp if both parameters are provided. (optional)
    * @param showFundMovementsOnly Deprecated. Use singleEntryPerTransaction instead.  Returns only the entries which contain fund movements.  (optional)
    * @param singleEntryPerTransaction Returns transactions that span multiple movements as a single entry. Only includes transactions that have been completed. Defaults to true for PDF statements, false otherwise. Note: due to the fact that only completed transactions are included, some transactions that are in progress and have modified the balance of the instrument will not be shown, which could lead to seemingly inconsistent balance being displayed.  (optional)
   */
  @RequestLine("GET /managed_accounts/{id}/statement?offset={offset}&limit={limit}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}&showFundMovementsOnly={showFundMovementsOnly}&singleEntryPerTransaction={singleEntryPerTransaction}")
  @Headers({
    "Accept: ",
    "accept: {accept}"  })
  void managedAccountStatement(@Param("id") String id, @Param("accept") String accept, @Param("offset") Integer offset, @Param("limit") Integer limit, @Param("orderByTimestamp") String orderByTimestamp, @Param("fromTimestamp") Long fromTimestamp, @Param("toTimestamp") Long toTimestamp, @Param("showFundMovementsOnly") Boolean showFundMovementsOnly, @Param("singleEntryPerTransaction") Boolean singleEntryPerTransaction);


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
     *   <li>offset - The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)</li>
     *   <li>limit - The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)</li>
     *   <li>orderByTimestamp - Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)</li>
     *   <li>fromTimestamp - Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. (optional)</li>
     *   <li>toTimestamp - Filter for transactions having transaction timestamp before &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed accounts. Must be higher than fromTimestamp if both parameters are provided. (optional)</li>
     *   <li>showFundMovementsOnly - Deprecated. Use singleEntryPerTransaction instead.  Returns only the entries which contain fund movements.  (optional)</li>
     *   <li>singleEntryPerTransaction - Returns transactions that span multiple movements as a single entry. Only includes transactions that have been completed. Defaults to true for PDF statements, false otherwise. Note: due to the fact that only completed transactions are included, some transactions that are in progress and have modified the balance of the instrument will not be shown, which could lead to seemingly inconsistent balance being displayed.  (optional)</li>
     *   </ul>
     */
    @RequestLine("GET /managed_accounts/{id}/statement?offset={offset}&limit={limit}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}&showFundMovementsOnly={showFundMovementsOnly}&singleEntryPerTransaction={singleEntryPerTransaction}")
    @Headers({
    "Accept: ",
        "accept: {accept}"    })
    void managedAccountStatement
    (@Param("id") String id, @Param("accept") String accept, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Unblock a managed account
   * Unblocks the managed account identified by the &#x60;id&#x60; path parameter. The managed account must have &#x60;state.blockedReason&#x60; as &#x60;USER&#x60; so that it can be unblocked. If the managed account was blocked by &#x60;SYSTEM&#x60;, users cannot unblock it. 
    * @param id The unique identifier of the managed account. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations. Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_accounts/{id}/unblock")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",
    "idempotency-ref: {idempotency_ref}"  })
  void managedAccountUnblock(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

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
    * @param offset The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)
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
   */
  @RequestLine("GET /managed_accounts?offset={offset}&limit={limit}&profileId={profileId}&friendlyName={friendlyName}&state={state}&state.blockedReason={state_blockedReason}&state.destroyedReason={state_destroyedReason}&currency={currency}&createdFrom={createdFrom}&createdTo={createdTo}&tag={tag}")
  @Headers({
    "Accept: ",  })
  void managedAccountsGet(@Param("offset") Integer offset, @Param("limit") Integer limit, @Param("profileId") Object profileId, @Param("friendlyName") String friendlyName, @Param("state") List state, @Param("state_blockedReason") List state_blockedReason, @Param("state_destroyedReason") List state_destroyedReason, @Param("currency") Object currency, @Param("createdFrom") Long createdFrom, @Param("createdTo") Long createdTo, @Param("tag") String tag);


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
     *   <li>offset - The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)</li>
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
     */
    @RequestLine("GET /managed_accounts?offset={offset}&limit={limit}&profileId={profileId}&friendlyName={friendlyName}&state={state}&state.blockedReason={state_blockedReason}&state.destroyedReason={state_destroyedReason}&currency={currency}&createdFrom={createdFrom}&createdTo={createdTo}&tag={tag}")
    @Headers({
    "Accept: ",    })
    void managedAccountsGet
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Upgrade a managed account with IBAN
   * Assign an IBAN to a Managed Account.  IBANs enable managed accounts to receive and send funds via wire transfers.  Assigning an IBAN to a Managed Account may be done asynchronously, in which case the &#x60;ManagedAccountIBAN.state&#x60; will be set to &#x60;PENDING_ALLOCATION&#x60; until bank details are ready to use. 
    * @param id The unique identifier of the Managed Account. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations. Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_accounts/{id}/iban")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",
    "idempotency-ref: {idempotency_ref}"  })
  void managedAccountsIBANUpgrade(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

}
