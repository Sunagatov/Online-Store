# ProductReviewApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewProductReview**](ProductReviewApi.md#addNewProductReview) | **POST** /api/v1/products/{productId}/reviews | Add a new product&#39;s review for a specific product by an authorized user. If product&#39;s review exists, then 400 error will be returned |
| [**addProductReviewLike**](ProductReviewApi.md#addProductReviewLike) | **POST** /api/v1/products/{productId}/reviews/{productReviewId}/likes | Like or dislike a product&#39;s review, available for authorized users only |
| [**deleteProductReview**](ProductReviewApi.md#deleteProductReview) | **DELETE** /api/v1/products/{productId}/reviews/{productReviewId} | Delete an existing product&#39;s review created by an authorized user |
| [**getProductReview**](ProductReviewApi.md#getProductReview) | **GET** /api/v1/products/{productId}/review | Return a product&#39;s review created by an authorized user |
| [**getProductReviewsAndRatings**](ProductReviewApi.md#getProductReviewsAndRatings) | **GET** /api/v1/products/{productId}/reviews |  |
| [**getRatingAndReviewStat**](ProductReviewApi.md#getRatingAndReviewStat) | **GET** /api/v1/products/{productId}/reviews/statistics | Returns statistics of product&#39;s review and rating : average rating, count of reviews, ratings map. The endpoint is available for unauthorized users |


<a name="addNewProductReview"></a>
# **addNewProductReview**
> ProductReviewDto addNewProductReview(productId, productReviewRequest)

Add a new product&#39;s review for a specific product by an authorized user. If product&#39;s review exists, then 400 error will be returned

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductReviewApi apiInstance = new ProductReviewApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Unique identifier of the product's review.
    ProductReviewRequest productReviewRequest = new ProductReviewRequest(); // ProductReviewRequest | 
    try {
      ProductReviewDto result = apiInstance.addNewProductReview(productId, productReviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductReviewApi#addNewProductReview");
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
| **productId** | **UUID**| Unique identifier of the product&#39;s review. | |
| **productReviewRequest** | [**ProductReviewRequest**](ProductReviewRequest.md)|  | |

### Return type

[**ProductReviewDto**](ProductReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request, e.g. product&#39;s review exists |  -  |
| **401** | Unauthorized access occurred. |  -  |
| **404** | Product&#39;s review was not found. |  -  |
| **500** | Internal server error occurred. |  -  |

<a name="addProductReviewLike"></a>
# **addProductReviewLike**
> ProductReviewDto addProductReviewLike(productId, productReviewId, productReviewLikeDto)

Like or dislike a product&#39;s review, available for authorized users only

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductReviewApi apiInstance = new ProductReviewApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Unique identifier of the product's review.
    UUID productReviewId = UUID.randomUUID(); // UUID | Unique identifier of the product's review.
    ProductReviewLikeDto productReviewLikeDto = new ProductReviewLikeDto(); // ProductReviewLikeDto | 
    try {
      ProductReviewDto result = apiInstance.addProductReviewLike(productId, productReviewId, productReviewLikeDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductReviewApi#addProductReviewLike");
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
| **productId** | **UUID**| Unique identifier of the product&#39;s review. | |
| **productReviewId** | **UUID**| Unique identifier of the product&#39;s review. | |
| **productReviewLikeDto** | [**ProductReviewLikeDto**](ProductReviewLikeDto.md)|  | [optional] |

### Return type

[**ProductReviewDto**](ProductReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product&#39;s review was successfully liked/disliked |  -  |
| **401** | Unauthorized access occurred. |  -  |
| **500** | Internal server error occurred. |  -  |

<a name="deleteProductReview"></a>
# **deleteProductReview**
> deleteProductReview(productId, productReviewId)

Delete an existing product&#39;s review created by an authorized user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductReviewApi apiInstance = new ProductReviewApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Unique identifier of the product
    UUID productReviewId = UUID.randomUUID(); // UUID | Unique identifier of the product's review
    try {
      apiInstance.deleteProductReview(productId, productReviewId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductReviewApi#deleteProductReview");
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
| **productId** | **UUID**| Unique identifier of the product | |
| **productReviewId** | **UUID**| Unique identifier of the product&#39;s review | |

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
| **200** | OK |  -  |
| **401** | Unauthorized access occurred. |  -  |
| **404** | Product&#39;s review was not found. |  -  |
| **500** | Internal server error occurred. |  -  |

<a name="getProductReview"></a>
# **getProductReview**
> ProductReviewDto getProductReview(productId)

Return a product&#39;s review created by an authorized user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductReviewApi apiInstance = new ProductReviewApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Unique identifier of the product's review.
    try {
      ProductReviewDto result = apiInstance.getProductReview(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductReviewApi#getProductReview");
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
| **productId** | **UUID**| Unique identifier of the product&#39;s review. | |

### Return type

[**ProductReviewDto**](ProductReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product&#39;s Review and Rating are returned. All fields are null, if user left no review for the product |  -  |
| **401** | Unauthorized access occurred. |  -  |
| **500** | Internal server error occurred. |  -  |

<a name="getProductReviewsAndRatings"></a>
# **getProductReviewsAndRatings**
> ProductReviewsAndRatingsWithPagination getProductReviewsAndRatings(productId, page, size, sortAttribute, sortDirection, productRatings)



List product&#39;s Reviews with pagination, sorting and filtering features. Endpoint is available for unauthorized users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductReviewApi apiInstance = new ProductReviewApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Unique identifier of the product.
    Integer page = 0; // Integer | The page number (starting from 0) for pagination. Possible allowed values: 1) page=0 or 2) page=1 or 3) any other non negative value.
    Integer size = 50; // Integer | The number of products per page. Possible allowed values: 1) size=3 or 2) size=15 or 3) any other non negative value.
    String sortAttribute = "name"; // String | The field name of the product's review by which the results should be sorted. Possible allowed values: 1) sort_attribute=createdAt or 2) sort_attribute=productRating.
    String sortDirection = "asc"; // String | The direction of sorting. Possible allowed values: 1) sort_direction=asc or 2) sort_direction=disc.
    List<Integer> productRatings = Arrays.asList(); // List<Integer> | Filter product's reviews by selected product's ratings (comma-separated list). Possible allowed values: 1) product_ratings=1 or 2) product_ratings=1,2,3,4 or 3) product_ratings=1,3,5 or 4) any other comma-separated list within 1,2,3,4,5.
    try {
      ProductReviewsAndRatingsWithPagination result = apiInstance.getProductReviewsAndRatings(productId, page, size, sortAttribute, sortDirection, productRatings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductReviewApi#getProductReviewsAndRatings");
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
| **page** | **Integer**| The page number (starting from 0) for pagination. Possible allowed values: 1) page&#x3D;0 or 2) page&#x3D;1 or 3) any other non negative value. | [optional] [default to 0] |
| **size** | **Integer**| The number of products per page. Possible allowed values: 1) size&#x3D;3 or 2) size&#x3D;15 or 3) any other non negative value. | [optional] [default to 50] |
| **sortAttribute** | **String**| The field name of the product&#39;s review by which the results should be sorted. Possible allowed values: 1) sort_attribute&#x3D;createdAt or 2) sort_attribute&#x3D;productRating. | [optional] [default to name] |
| **sortDirection** | **String**| The direction of sorting. Possible allowed values: 1) sort_direction&#x3D;asc or 2) sort_direction&#x3D;disc. | [optional] [default to asc] |
| **productRatings** | [**List&lt;Integer&gt;**](Integer.md)| Filter product&#39;s reviews by selected product&#39;s ratings (comma-separated list). Possible allowed values: 1) product_ratings&#x3D;1 or 2) product_ratings&#x3D;1,2,3,4 or 3) product_ratings&#x3D;1,3,5 or 4) any other comma-separated list within 1,2,3,4,5. | [optional] |

### Return type

[**ProductReviewsAndRatingsWithPagination**](ProductReviewsAndRatingsWithPagination.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The product was found and its reviews were returned. |  -  |
| **400** | Bad request, e.g. the query parameters are invalid. |  -  |
| **404** | Product&#39;s review was not found. |  -  |
| **500** | Internal server error occurred. |  -  |

<a name="getRatingAndReviewStat"></a>
# **getRatingAndReviewStat**
> ProductReviewRatingStats getRatingAndReviewStat(productId)

Returns statistics of product&#39;s review and rating : average rating, count of reviews, ratings map. The endpoint is available for unauthorized users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductReviewApi apiInstance = new ProductReviewApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Id of the product to get rating for
    try {
      ProductReviewRatingStats result = apiInstance.getRatingAndReviewStat(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductReviewApi#getRatingAndReviewStat");
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
| **productId** | **UUID**| Id of the product to get rating for | |

### Return type

[**ProductReviewRatingStats**](ProductReviewRatingStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Statistics of product&#39;s review and rating was retrieved successfully. |  -  |
| **404** | Product&#39;s review was not found |  -  |
| **500** | Internal server error occurred. |  -  |

