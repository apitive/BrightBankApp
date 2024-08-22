/*Copyright (c) 2022-2023 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.brightbankdemo.weavr.service;


import com.brightbankdemo.weavr.model.*;
import com.brightbankdemo.weavr.model.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface ManagedCardsService {

  /**
   * Get a managed card statement
   * Returns a list of transactions against the managed card identified by the &#x60;id&#x60; path parameter, matching the criteria provided in the request.
    * @param id The unique identifier of a managed card. (required)
    * @param offset The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (required)
    * @param accept A request parameter specifying the type of response the client would like. Must be one of &#x60;application/json&#x60;, &#x60;application/pdf&#x60; or &#x60;text/csv&#x60;.  The default response type (&#x60;application/json&#x60;) will be returned if specified incorrectly or not specified.  (optional)
    * @param limit The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)
    * @param orderByTimestamp Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)
    * @param fromTimestamp Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)
    * @param toTimestamp Filter for transactions having transaction timestamp before the &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)
   * @return Statement
   */
  @RequestLine("GET /managed_cards/{id}/statements?offset={offset}&limit={limit}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}")
  @Headers({
    "Accept: application/json",
    "accept: {accept}"  })
  Statement managedCardStatements(@Param("id") String id, @Param("offset") Integer offset, @Param("accept") String accept, @Param("limit") Integer limit, @Param("orderByTimestamp") String orderByTimestamp, @Param("fromTimestamp") Long fromTimestamp, @Param("toTimestamp") Long toTimestamp);


    /**
     * Get a managed card statement
     * Returns a list of transactions against the managed card identified by the &#x60;id&#x60; path parameter, matching the criteria provided in the request.
     * Note, this is equivalent to the other <code>managedCardStatements</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ManagedCardStatementsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param id The unique identifier of a managed card. (required)
     * @param accept A request parameter specifying the type of response the client would like. Must be one of &#x60;application/json&#x60;, &#x60;application/pdf&#x60; or &#x60;text/csv&#x60;.  The default response type (&#x60;application/json&#x60;) will be returned if specified incorrectly or not specified.  (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>offset - The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (required)</li>
     *   <li>limit - The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)</li>
     *   <li>orderByTimestamp - Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)</li>
     *   <li>fromTimestamp - Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)</li>
     *   <li>toTimestamp - Filter for transactions having transaction timestamp before the &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)</li>
     *   </ul>
     * @return Statement
     */
    @RequestLine("GET /managed_cards/{id}/statements?offset={offset}&limit={limit}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}")
    @Headers({
    "Accept: application/json",
        "accept: {accept}"    })
    Statement managedCardStatements
    (@Param("id") String id, @Param("accept") String accept, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

}
