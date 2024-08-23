package com.brightbankdemo.weavrfundstransfer.service;


import com.brightbankdemo.weavrfundstransfer.model.*;
import com.brightbankdemo.weavrfundstransfer.model.BulkProcessExecute;
import com.brightbankdemo.weavrfundstransfer.model.BulkProcessesPaged;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface ManageService {

  /**
   * Get bulk process
   * Retrieves details on the bulk process identified by the bulk_id parameter.
    * @param bulk_id The bulk id of the bulk process. (required)
   */
  @RequestLine("GET /bulks/{bulk_id}")
  @Headers({
    "Accept: ",  })
  void bulkId(@Param("bulk_id") Object bulk_id);

  /**
   * Cancel bulk process
   * Cancels the execution of operations of a bulk process that is in state ‘PAUSED’ or ‘RUNNING’ as identified by the bulk_id parameter.  The status of the bulk process after execution of this operation is set  to ‘CANCELLED’. This is a final state and a cancelled bulk process cannot be resumed. 
    * @param bulk_id The bulk id of the bulk process. (required)
   */
  @RequestLine("POST /bulks/{bulk_id}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void bulkIdCancel(@Param("bulk_id") Object bulk_id);

  /**
   * Execute bulk process
   * Launches execution of operations of any bulk process identified by the bulk_id  parameter.  The status of the bulk process has to be in a ‘SUBMITTED’ state and after execution initiates, the bulk process state is set to ‘RUNNING’.  The final state of execution can be any of  COMPLETED: the execution of the bulk process is complete and all bulk operations of the bulk process were executed successfully  FAILED:  none of the operations of the bulk process have executed.  PARTIALLY_COMPLETED: the execution of the bulk process is complete and some of the bulk operations of the bulk process failed.  This operation is asynchronous and will return immediately. You can track the status of the execution of the bulk process through Get bulk process. You can also pause execution through _bulkIdPause_ 
    * @param bulk_id The bulk id of the bulk process. (required)
    * @param body  (optional)
   */
  @RequestLine("POST /bulks/{bulk_id}/execute")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void bulkIdExecute(@Param("bulk_id") Object bulk_id, BulkProcessExecute body);

  /**
   * Get all operations in a bulk
   * Retrieves the bulk process operations that match the query parameters.
    * @param bulk_id The bulk id of the bulk process. (required)
    * @param offset The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)
    * @param limit The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)
    * @param sequence  (optional)
    * @param status  (optional)
   */
  @RequestLine("GET /bulks/{bulk_id}/operations?offset={offset}&limit={limit}&sequence={sequence}&status={status}")
  @Headers({
    "Accept: ",  })
  void bulkIdOperations(@Param("bulk_id") Object bulk_id, @Param("offset") Integer offset, @Param("limit") Integer limit, @Param("sequence") Long sequence, @Param("status") Object status);


    /**
     * Get all operations in a bulk
     * Retrieves the bulk process operations that match the query parameters.
     * Note, this is equivalent to the other <code>bulkIdOperations</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link BulkIdOperationsQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param bulk_id The bulk id of the bulk process. (required)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>offset - The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)</li>
     *   <li>limit - The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)</li>
     *   <li>sequence -  (optional)</li>
     *   <li>status -  (optional)</li>
     *   </ul>
     */
    @RequestLine("GET /bulks/{bulk_id}/operations?offset={offset}&limit={limit}&sequence={sequence}&status={status}")
    @Headers({
    "Accept: ",    })
    void bulkIdOperations
    (@Param("bulk_id") Object bulk_id, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Pause bulk process
   * Pauses the execution of operations of the bulk process that is in state ‘RUNNING’ as identified by the bulk_id  parameter.  The status of the bulk process after execution of this operation is set to ‘PAUSED’  The execution can be resumed through _bulkIdResume_ 
    * @param bulk_id The bulk id of the bulk process. (required)
   */
  @RequestLine("POST /bulks/{bulk_id}/pause")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void bulkIdPause(@Param("bulk_id") Object bulk_id);

  /**
   * Resume bulk process
   * Resumes the execution of operations of the bulk process that is in state &#x27; PAUSED&#x27; as identified by the bulk_id parameter.  The status of the bulk process after execution of this operation is set back to ‘RUNNING’ 
    * @param bulk_id The bulk id of the bulk process. (required)
   */
  @RequestLine("POST /bulks/{bulk_id}/resume")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",  })
  void bulkIdResume(@Param("bulk_id") Object bulk_id);

  /**
   * Get all bulk processes
   * Filter bulk processes.
    * @param offset The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)
    * @param limit The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)
    * @param status  (optional)
   * @return BulkProcessesPaged
   */
  @RequestLine("GET /bulks?offset={offset}&limit={limit}&status={status}")
  @Headers({
    "Accept: application/json",  })
  BulkProcessesPaged bulks(@Param("offset") Integer offset, @Param("limit") Integer limit, @Param("status") Object status);


    /**
     * Get all bulk processes
     * Filter bulk processes.
     * Note, this is equivalent to the other <code>bulks</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link BulksQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>offset - The offset value for paging, indicating the initial item number to be returned from the data set satisfying the given criteria. Leave out to fetch the first page of results. (optional)</li>
     *   <li>limit - The limit of the results for paging, starting at the offset. Limit is always capped at 100. (optional)</li>
     *   <li>status -  (optional)</li>
     *   </ul>
     * @return BulkProcessesPaged
     */
    @RequestLine("GET /bulks?offset={offset}&limit={limit}&status={status}")
    @Headers({
    "Accept: application/json",    })
    BulkProcessesPaged bulks
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

}
