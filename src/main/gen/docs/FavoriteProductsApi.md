# FavoriteProductsApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addListOfFavoriteProducts**](FavoriteProductsApi.md#addListOfFavoriteProducts) | **POST** /api/v1/favorites | Add a list of favorite products |
| [**getListOfFavoriteProducts**](FavoriteProductsApi.md#getListOfFavoriteProducts) | **GET** /api/v1/favorites | Get all favorite products for the authorized user |
| [**removeProductFromFavorite**](FavoriteProductsApi.md#removeProductFromFavorite) | **DELETE** /api/v1/favorites/{productId} | Remove a favorite product by ID |


<a name="addListOfFavoriteProducts"></a>
# **addListOfFavoriteProducts**
> ListOfFavoriteProductsDto addListOfFavoriteProducts(listOfFavoriteProducts)

Add a list of favorite products

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FavoriteProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    FavoriteProductsApi apiInstance = new FavoriteProductsApi(defaultClient);
    ListOfFavoriteProducts listOfFavoriteProducts = new ListOfFavoriteProducts(); // ListOfFavoriteProducts | Payload containing a list of product IDs to be added to favorites.
    try {
      ListOfFavoriteProductsDto result = apiInstance.addListOfFavoriteProducts(listOfFavoriteProducts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoriteProductsApi#addListOfFavoriteProducts");
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
| **listOfFavoriteProducts** | [**ListOfFavoriteProducts**](ListOfFavoriteProducts.md)| Payload containing a list of product IDs to be added to favorites. | |

### Return type

[**ListOfFavoriteProductsDto**](ListOfFavoriteProductsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Favorite products added successfully. |  -  |
| **400** | Invalid input, object invalid. |  -  |
| **401** | Unauthorized access. |  -  |
| **500** | Internal server error. |  -  |

<a name="getListOfFavoriteProducts"></a>
# **getListOfFavoriteProducts**
> ListOfFavoriteProductsDto getListOfFavoriteProducts()

Get all favorite products for the authorized user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FavoriteProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    FavoriteProductsApi apiInstance = new FavoriteProductsApi(defaultClient);
    try {
      ListOfFavoriteProductsDto result = apiInstance.getListOfFavoriteProducts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoriteProductsApi#getListOfFavoriteProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListOfFavoriteProductsDto**](ListOfFavoriteProductsDto.md)

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
| **404** | Favorite products list is empty. |  -  |
| **500** | Internal server error. |  -  |

<a name="removeProductFromFavorite"></a>
# **removeProductFromFavorite**
> removeProductFromFavorite(productId)

Remove a favorite product by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FavoriteProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    FavoriteProductsApi apiInstance = new FavoriteProductsApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Unique identifier of the product.
    try {
      apiInstance.removeProductFromFavorite(productId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FavoriteProductsApi#removeProductFromFavorite");
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
| **productId** | **UUID**| Unique identifier of the product. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Favorite product removed successfully. |  -  |
| **400** | Invalid input, object invalid. |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Favorite product not found. |  -  |
| **500** | Internal server error. |  -  |

