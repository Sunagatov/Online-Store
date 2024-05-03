# ProductApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProductById**](ProductApi.md#getProductById) | **GET** /api/v1/products/{productId} | Retrieve a Product by ID |
| [**getProducts**](ProductApi.md#getProducts) | **GET** /api/v1/products | List Products with pagination, sorting and filtering features. |
| [**getProductsByIds**](ProductApi.md#getProductsByIds) | **POST** /api/v1/products/ids | List Products by IDs |


<a name="getProductById"></a>
# **getProductById**
> ProductInfoDto getProductById(productId)

Retrieve a Product by ID

Fetch detailed information of a single product using its unique identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductApi apiInstance = new ProductApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | Unique identifier of the product.
    try {
      ProductInfoDto result = apiInstance.getProductById(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductById");
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

[**ProductInfoDto**](ProductInfoDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The product was found and its details are returned. |  -  |
| **404** | No product found for the given ID. |  -  |
| **500** | Internal Server Error. |  -  |

<a name="getProducts"></a>
# **getProducts**
> ProductListWithPaginationInfoDto getProducts(page, size, sortAttribute, sortDirection, minPrice, maxPrice, minimumAverageRating, brandNames, sellerNames)

List Products with pagination, sorting and filtering features.

Retrieve a paginated list of products, with optional sorting and filtering parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductApi apiInstance = new ProductApi(defaultClient);
    Integer page = 0; // Integer | The page number (starting from 0) for pagination. Possible allowed values: 1) page=0 or 2) page=1 or 3) any other non negative value.
    Integer size = 50; // Integer | The number of products per page. Possible allowed values: 1) size=3 or 2) size=15 or 3) any other non negative value.
    String sortAttribute = "name"; // String | The field name of the product by which the results should be sorted. Possible allowed values: 1) sort_attribute=name or 2) sort_attribute=price or 3) sort_attribute=quantity or 4) sort_attribute=averageRating or 5) sort_attribute=reviewsCount.
    String sortDirection = "asc"; // String | The direction of sorting. Possible allowed values: 1) sort_direction=asc or 2) sort_direction=disc.
    BigDecimal minPrice = new BigDecimal("min_price=5"); // BigDecimal | Filter products by the lower limit of the product's price. Possible allowed values: 1) min_price=5 or 2) min_price=17.25 or 3) any other non negative integer or decimal number value.
    BigDecimal maxPrice = new BigDecimal("max_price=5"); // BigDecimal | Filter products by the upper limit of the product's price. Possible allowed values: 1) max_price=5 or 2) max_price=17.25 or 3) any other non negative integer or decimal number value.
    Integer minimumAverageRating = minimum_average_rating=1; // Integer | Filter products by the minimum average rating. Possible allowed values: 1) minimum_average_rating=1 or 2) minimum_average_rating=2 or 3) minimum_average_rating=3 or 4) minimum_average_rating=4 
    List<String> brandNames = Arrays.asList(); // List<String> | Filter products by selected brand names (comma-separated list). Possible allowed values: 1) brand_names=Starbucks or 2) brand_names=Starbucks,Folgers or 3) any other comma-separated list
    List<String> sellerNames = Arrays.asList(); // List<String> | Filter products by selected seller names (comma-separated list). Possible allowed values: 1) seller_names=BeanBrewers,JavaBeanCoffee,MorningMug or 2) seller_names=BeanBrewers or 3) any other comma-separated list
    try {
      ProductListWithPaginationInfoDto result = apiInstance.getProducts(page, size, sortAttribute, sortDirection, minPrice, maxPrice, minimumAverageRating, brandNames, sellerNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProducts");
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
| **page** | **Integer**| The page number (starting from 0) for pagination. Possible allowed values: 1) page&#x3D;0 or 2) page&#x3D;1 or 3) any other non negative value. | [optional] [default to 0] |
| **size** | **Integer**| The number of products per page. Possible allowed values: 1) size&#x3D;3 or 2) size&#x3D;15 or 3) any other non negative value. | [optional] [default to 50] |
| **sortAttribute** | **String**| The field name of the product by which the results should be sorted. Possible allowed values: 1) sort_attribute&#x3D;name or 2) sort_attribute&#x3D;price or 3) sort_attribute&#x3D;quantity or 4) sort_attribute&#x3D;averageRating or 5) sort_attribute&#x3D;reviewsCount. | [optional] [default to name] |
| **sortDirection** | **String**| The direction of sorting. Possible allowed values: 1) sort_direction&#x3D;asc or 2) sort_direction&#x3D;disc. | [optional] [default to asc] |
| **minPrice** | **BigDecimal**| Filter products by the lower limit of the product&#39;s price. Possible allowed values: 1) min_price&#x3D;5 or 2) min_price&#x3D;17.25 or 3) any other non negative integer or decimal number value. | [optional] |
| **maxPrice** | **BigDecimal**| Filter products by the upper limit of the product&#39;s price. Possible allowed values: 1) max_price&#x3D;5 or 2) max_price&#x3D;17.25 or 3) any other non negative integer or decimal number value. | [optional] |
| **minimumAverageRating** | **Integer**| Filter products by the minimum average rating. Possible allowed values: 1) minimum_average_rating&#x3D;1 or 2) minimum_average_rating&#x3D;2 or 3) minimum_average_rating&#x3D;3 or 4) minimum_average_rating&#x3D;4  | [optional] |
| **brandNames** | [**List&lt;String&gt;**](String.md)| Filter products by selected brand names (comma-separated list). Possible allowed values: 1) brand_names&#x3D;Starbucks or 2) brand_names&#x3D;Starbucks,Folgers or 3) any other comma-separated list | [optional] |
| **sellerNames** | [**List&lt;String&gt;**](String.md)| Filter products by selected seller names (comma-separated list). Possible allowed values: 1) seller_names&#x3D;BeanBrewers,JavaBeanCoffee,MorningMug or 2) seller_names&#x3D;BeanBrewers or 3) any other comma-separated list | [optional] |

### Return type

[**ProductListWithPaginationInfoDto**](ProductListWithPaginationInfoDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of products retrieved successfully. |  -  |
| **400** | Invalid parameters provided for pagination or/and sorting or/and filtering. |  -  |
| **500** | Internal Server Error. |  -  |

<a name="getProductsByIds"></a>
# **getProductsByIds**
> List&lt;ProductInfoDto&gt; getProductsByIds(productIdsDto)

List Products by IDs

Retrieve a list of products using a list of unique identifiers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    ProductApi apiInstance = new ProductApi(defaultClient);
    ProductIdsDto productIdsDto = new ProductIdsDto(); // ProductIdsDto | 
    try {
      List<ProductInfoDto> result = apiInstance.getProductsByIds(productIdsDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductApi#getProductsByIds");
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
| **productIdsDto** | [**ProductIdsDto**](ProductIdsDto.md)|  | |

### Return type

[**List&lt;ProductInfoDto&gt;**](ProductInfoDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of products by IDs retrieved successfully. |  -  |
| **400** | Invalid parameters provided. |  -  |
| **500** | Internal Server Error. |  -  |

