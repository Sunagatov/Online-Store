# PaymentApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentDetails**](PaymentApi.md#getPaymentDetails) | **GET** /api/v1/payment/{paymentId} | Enables to get payment details by payment id |
| [**paymentEventProcess**](PaymentApi.md#paymentEventProcess) | **POST** /api/v1/payment/event | Enables payment event processing |
| [**processCardDetailsToken**](PaymentApi.md#processCardDetailsToken) | **POST** /api/v1/payment/card | Temporary solution to test the payment API by simulating card detail token generation. |
| [**processPayment**](PaymentApi.md#processPayment) | **POST** /api/v1/payment | Enables payment processing using a card details token ID |


<a name="getPaymentDetails"></a>
# **getPaymentDetails**
> ProcessedPaymentDetailsDto getPaymentDetails(paymentId)

Enables to get payment details by payment id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    PaymentApi apiInstance = new PaymentApi(defaultClient);
    Long paymentId = 56L; // Long | 
    try {
      ProcessedPaymentDetailsDto result = apiInstance.getPaymentDetails(paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getPaymentDetails");
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
| **paymentId** | **Long**|  | |

### Return type

[**ProcessedPaymentDetailsDto**](ProcessedPaymentDetailsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment details retrieved successfully |  -  |
| **404** | Payment details not found. |  -  |

<a name="paymentEventProcess"></a>
# **paymentEventProcess**
> paymentEventProcess(stripeSignature, body)

Enables payment event processing

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    PaymentApi apiInstance = new PaymentApi(defaultClient);
    String stripeSignature = "stripeSignature_example"; // String | 
    String body = "body_example"; // String | 
    try {
      apiInstance.paymentEventProcess(stripeSignature, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#paymentEventProcess");
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
| **stripeSignature** | **String**|  | |
| **body** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment event processed successfully |  -  |
| **400** | Error in processing the payment event. |  -  |

<a name="processCardDetailsToken"></a>
# **processCardDetailsToken**
> String processCardDetailsToken(createCardDetailsTokenRequest)

Temporary solution to test the payment API by simulating card detail token generation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    PaymentApi apiInstance = new PaymentApi(defaultClient);
    CreateCardDetailsTokenRequest createCardDetailsTokenRequest = new CreateCardDetailsTokenRequest(); // CreateCardDetailsTokenRequest | 
    try {
      String result = apiInstance.processCardDetailsToken(createCardDetailsTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processCardDetailsToken");
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
| **createCardDetailsTokenRequest** | [**CreateCardDetailsTokenRequest**](CreateCardDetailsTokenRequest.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Card details token created successfully |  -  |
| **400** | Error in card token creation. |  -  |

<a name="processPayment"></a>
# **processPayment**
> ProcessedPaymentWithClientSecretDto processPayment(createPaymentRequest)

Enables payment processing using a card details token ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    PaymentApi apiInstance = new PaymentApi(defaultClient);
    CreatePaymentRequest createPaymentRequest = new CreatePaymentRequest(); // CreatePaymentRequest | 
    try {
      ProcessedPaymentWithClientSecretDto result = apiInstance.processPayment(createPaymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#processPayment");
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
| **createPaymentRequest** | [**CreatePaymentRequest**](CreatePaymentRequest.md)|  | |

### Return type

[**ProcessedPaymentWithClientSecretDto**](ProcessedPaymentWithClientSecretDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment processed successfully |  -  |
| **400** | Cannot retrieve stripe customer by stripeCustomerId &#x3D; {stripeCustomerId}. Cannot retrieve payment method associated with stripe customer, stripeCustomerId &#x3D; {stripeCustomerId}. The payment associated with customer is not found, stripeCustomerId &#x3D; {stripeCustomerId}. Shopping cart with shoppingCartId &#x3D; %s is already paid |  -  |
| **404** | The requested user or payment was not found. |  -  |

