/*
 * Iced Latte Order API
 * API allows users to access orders and related operations.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: zufar.sunagatov@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.OrderRequestDto;
import org.openapitools.client.model.OrderResponseDto;
import org.openapitools.client.model.OrderStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OrdersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OrdersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrdersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createNewOrder
     * @param orderRequestDto Payload containing a list of items to be added to the order. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order placed successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input, object invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNewOrderCall(OrderRequestDto orderRequestDto, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = orderRequestDto;

        // create path and map variables
        String localVarPath = "/api/v1/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewOrderValidateBeforeCall(OrderRequestDto orderRequestDto, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'orderRequestDto' is set
        if (orderRequestDto == null) {
            throw new ApiException("Missing the required parameter 'orderRequestDto' when calling createNewOrder(Async)");
        }
        

        okhttp3.Call localVarCall = createNewOrderCall(orderRequestDto, _callback);
        return localVarCall;

    }

    /**
     * Add order for the authorized user
     * 
     * @param orderRequestDto Payload containing a list of items to be added to the order. (required)
     * @return OrderResponseDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order placed successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input, object invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public OrderResponseDto createNewOrder(OrderRequestDto orderRequestDto) throws ApiException {
        ApiResponse<OrderResponseDto> localVarResp = createNewOrderWithHttpInfo(orderRequestDto);
        return localVarResp.getData();
    }

    /**
     * Add order for the authorized user
     * 
     * @param orderRequestDto Payload containing a list of items to be added to the order. (required)
     * @return ApiResponse&lt;OrderResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order placed successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input, object invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderResponseDto> createNewOrderWithHttpInfo(OrderRequestDto orderRequestDto) throws ApiException {
        okhttp3.Call localVarCall = createNewOrderValidateBeforeCall(orderRequestDto, null);
        Type localVarReturnType = new TypeToken<OrderResponseDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add order for the authorized user (asynchronously)
     * 
     * @param orderRequestDto Payload containing a list of items to be added to the order. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Order placed successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input, object invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNewOrderAsync(OrderRequestDto orderRequestDto, final ApiCallback<OrderResponseDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewOrderValidateBeforeCall(orderRequestDto, _callback);
        Type localVarReturnType = new TypeToken<OrderResponseDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOrders
     * @param status Array of status codes to be applied for orders filtering (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Orders list is empty. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOrdersCall(List<OrderStatus> status, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (status != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "status", status));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOrdersValidateBeforeCall(List<OrderStatus> status, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getOrdersCall(status, _callback);
        return localVarCall;

    }

    /**
     * Get all orders for the authorized user by status
     * 
     * @param status Array of status codes to be applied for orders filtering (optional)
     * @return List&lt;OrderResponseDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Orders list is empty. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public List<OrderResponseDto> getOrders(List<OrderStatus> status) throws ApiException {
        ApiResponse<List<OrderResponseDto>> localVarResp = getOrdersWithHttpInfo(status);
        return localVarResp.getData();
    }

    /**
     * Get all orders for the authorized user by status
     * 
     * @param status Array of status codes to be applied for orders filtering (optional)
     * @return ApiResponse&lt;List&lt;OrderResponseDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Orders list is empty. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<OrderResponseDto>> getOrdersWithHttpInfo(List<OrderStatus> status) throws ApiException {
        okhttp3.Call localVarCall = getOrdersValidateBeforeCall(status, null);
        Type localVarReturnType = new TypeToken<List<OrderResponseDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all orders for the authorized user by status (asynchronously)
     * 
     * @param status Array of status codes to be applied for orders filtering (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized access. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Orders list is empty. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOrdersAsync(List<OrderStatus> status, final ApiCallback<List<OrderResponseDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOrdersValidateBeforeCall(status, _callback);
        Type localVarReturnType = new TypeToken<List<OrderResponseDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
