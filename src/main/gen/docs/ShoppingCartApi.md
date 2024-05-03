# ShoppingCartApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewItemToShoppingCart**](ShoppingCartApi.md#addNewItemToShoppingCart) | **POST** /api/v1/cart/items | Add items to the shopping cart |
| [**deleteItemsFromShoppingCart**](ShoppingCartApi.md#deleteItemsFromShoppingCart) | **DELETE** /api/v1/cart/items | Remove items from the shopping cart |
| [**getShoppingCart**](ShoppingCartApi.md#getShoppingCart) | **GET** /api/v1/cart | Get the shopping cart of authorized user |
| [**updateProductQuantityInShoppingCartItem**](ShoppingCartApi.md#updateProductQuantityInShoppingCartItem) | **PATCH** /api/v1/cart/items | Update shopping cart item quantity |


<a name="addNewItemToShoppingCart"></a>
# **addNewItemToShoppingCart**
> ShoppingCartDto addNewItemToShoppingCart(addNewItemsToShoppingCartRequest)

Add items to the shopping cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShoppingCartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ShoppingCartApi apiInstance = new ShoppingCartApi(defaultClient);
    AddNewItemsToShoppingCartRequest addNewItemsToShoppingCartRequest = new AddNewItemsToShoppingCartRequest(); // AddNewItemsToShoppingCartRequest | Payload containing a list of items to be added to the shopping cart.
    try {
      ShoppingCartDto result = apiInstance.addNewItemToShoppingCart(addNewItemsToShoppingCartRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShoppingCartApi#addNewItemToShoppingCart");
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
| **addNewItemsToShoppingCartRequest** | [**AddNewItemsToShoppingCartRequest**](AddNewItemsToShoppingCartRequest.md)| Payload containing a list of items to be added to the shopping cart. | |

### Return type

[**ShoppingCartDto**](ShoppingCartDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Items added successfully. |  -  |
| **400** | Invalid input, object invalid. |  -  |
| **401** | Unauthorized access. |  -  |
| **500** | Internal server error. |  -  |

<a name="deleteItemsFromShoppingCart"></a>
# **deleteItemsFromShoppingCart**
> ShoppingCartDto deleteItemsFromShoppingCart(deleteItemsFromShoppingCartRequest)

Remove items from the shopping cart

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShoppingCartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ShoppingCartApi apiInstance = new ShoppingCartApi(defaultClient);
    DeleteItemsFromShoppingCartRequest deleteItemsFromShoppingCartRequest = new DeleteItemsFromShoppingCartRequest(); // DeleteItemsFromShoppingCartRequest | Payload containing an array of shopping cart item IDs to be removed.
    try {
      ShoppingCartDto result = apiInstance.deleteItemsFromShoppingCart(deleteItemsFromShoppingCartRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShoppingCartApi#deleteItemsFromShoppingCart");
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
| **deleteItemsFromShoppingCartRequest** | [**DeleteItemsFromShoppingCartRequest**](DeleteItemsFromShoppingCartRequest.md)| Payload containing an array of shopping cart item IDs to be removed. | |

### Return type

[**ShoppingCartDto**](ShoppingCartDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Items removed successfully. |  -  |
| **400** | Invalid input, object invalid. |  -  |
| **401** | Unauthorized access. |  -  |
| **500** | Internal server error. |  -  |

<a name="getShoppingCart"></a>
# **getShoppingCart**
> ShoppingCartDto getShoppingCart()

Get the shopping cart of authorized user

Get the shopping cart of authorized user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShoppingCartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ShoppingCartApi apiInstance = new ShoppingCartApi(defaultClient);
    try {
      ShoppingCartDto result = apiInstance.getShoppingCart();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShoppingCartApi#getShoppingCart");
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

[**ShoppingCartDto**](ShoppingCartDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid input, object invalid. |  -  |
| **401** | Unauthorized access. |  -  |
| **500** | Internal server error. |  -  |

<a name="updateProductQuantityInShoppingCartItem"></a>
# **updateProductQuantityInShoppingCartItem**
> ShoppingCartDto updateProductQuantityInShoppingCartItem(updateProductQuantityInShoppingCartItemRequest)

Update shopping cart item quantity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShoppingCartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ShoppingCartApi apiInstance = new ShoppingCartApi(defaultClient);
    UpdateProductQuantityInShoppingCartItemRequest updateProductQuantityInShoppingCartItemRequest = new UpdateProductQuantityInShoppingCartItemRequest(); // UpdateProductQuantityInShoppingCartItemRequest | Payload containing the shopping cart item ID and the quantity change.
    try {
      ShoppingCartDto result = apiInstance.updateProductQuantityInShoppingCartItem(updateProductQuantityInShoppingCartItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShoppingCartApi#updateProductQuantityInShoppingCartItem");
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
| **updateProductQuantityInShoppingCartItemRequest** | [**UpdateProductQuantityInShoppingCartItemRequest**](UpdateProductQuantityInShoppingCartItemRequest.md)| Payload containing the shopping cart item ID and the quantity change. | |

### Return type

[**ShoppingCartDto**](ShoppingCartDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Shopping cart item quantity was updated successfully. |  -  |
| **400** | Invalid input, object invalid. |  -  |
| **401** | Unauthorized access. |  -  |
| **500** | Internal server error. |  -  |

