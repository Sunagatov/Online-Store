# OrdersApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewOrder**](OrdersApi.md#createNewOrder) | **POST** /api/v1/orders | Add order for the authorized user |
| [**getOrders**](OrdersApi.md#getOrders) | **GET** /api/v1/orders | Get all orders for the authorized user by status |


<a name="createNewOrder"></a>
# **createNewOrder**
> OrderResponseDto createNewOrder(orderRequestDto)

Add order for the authorized user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    OrderRequestDto orderRequestDto = new OrderRequestDto(); // OrderRequestDto | Payload containing a list of items to be added to the order.
    try {
      OrderResponseDto result = apiInstance.createNewOrder(orderRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createNewOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderRequestDto** | [**OrderRequestDto**](OrderRequestDto.md)| Payload containing a list of items to be added to the order. | |

### Return type

[**OrderResponseDto**](OrderResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order placed successfully. |  -  |
| **400** | Invalid input, object invalid. |  -  |
| **401** | Unauthorized access. |  -  |
| **500** | Internal server error. |  -  |

<a name="getOrders"></a>
# **getOrders**
> List&lt;OrderResponseDto&gt; getOrders(status)

Get all orders for the authorized user by status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    List<OrderStatus> status = Arrays.asList(); // List<OrderStatus> | Array of status codes to be applied for orders filtering
    try {
      List<OrderResponseDto> result = apiInstance.getOrders(status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**List&lt;OrderStatus&gt;**](OrderStatus.md)| Array of status codes to be applied for orders filtering | [optional] |

### Return type

[**List&lt;OrderResponseDto&gt;**](OrderResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Orders list is empty. |  -  |
| **500** | Internal server error. |  -  |

