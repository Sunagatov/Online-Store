# UserApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeUserPassword**](UserApi.md#changeUserPassword) | **PATCH** /api/v1/users | Change a user&#39;s password |
| [**confirmResetUserPassword**](UserApi.md#confirmResetUserPassword) | **POST** /api/v1/users/password/reset/confirm | Reset user password confirm |
| [**deleteUserAvatar**](UserApi.md#deleteUserAvatar) | **DELETE** /api/v1/users/avatar | Delete user avatar |
| [**deleteUserById**](UserApi.md#deleteUserById) | **DELETE** /api/v1/users | Delete an user by its ID |
| [**editUserById**](UserApi.md#editUserById) | **PUT** /api/v1/users | Edit an user&#39;s details by its ID |
| [**getUserAvatarLink**](UserApi.md#getUserAvatarLink) | **GET** /api/v1/users/avatar | Get user avatar link |
| [**getUserById**](UserApi.md#getUserById) | **GET** /api/v1/users | Get an user by its ID |
| [**resetUserPassword**](UserApi.md#resetUserPassword) | **POST** /api/v1/users/password/reset | Reset user password |
| [**uploadUserAvatar**](UserApi.md#uploadUserAvatar) | **POST** /api/v1/users/avatar | Upload user avatar |


<a name="changeUserPassword"></a>
# **changeUserPassword**
> changeUserPassword(changeUserPasswordRequest)

Change a user&#39;s password

Change the password for a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    ChangeUserPasswordRequest changeUserPasswordRequest = new ChangeUserPasswordRequest(); // ChangeUserPasswordRequest | 
    try {
      apiInstance.changeUserPassword(changeUserPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#changeUserPassword");
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
| **changeUserPasswordRequest** | [**ChangeUserPasswordRequest**](ChangeUserPasswordRequest.md)|  | |

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
| **200** | Password changed successfully |  -  |
| **400** | Validation error |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **404** | User not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="confirmResetUserPassword"></a>
# **confirmResetUserPassword**
> confirmResetUserPassword(confirmEmailRequest)

Reset user password confirm

Reset user password confirm

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    ConfirmEmailRequest confirmEmailRequest = new ConfirmEmailRequest(); // ConfirmEmailRequest | 
    try {
      apiInstance.confirmResetUserPassword(confirmEmailRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#confirmResetUserPassword");
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
| **confirmEmailRequest** | [**ConfirmEmailRequest**](ConfirmEmailRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reset user password confirm successfully |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="deleteUserAvatar"></a>
# **deleteUserAvatar**
> deleteUserAvatar()

Delete user avatar

Delete the user&#39;s avatar image

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      apiInstance.deleteUserAvatar();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserAvatar");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User avatar deleted successfully |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="deleteUserById"></a>
# **deleteUserById**
> deleteUserById()

Delete an user by its ID

Delete a user profile for the given user ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      apiInstance.deleteUserById();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserById");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An information about successful deletion of the user by given the userId |  -  |
| **404** | User not found |  -  |
| **400** | Invalid userId provided |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="editUserById"></a>
# **editUserById**
> UserDto editUserById(updateUserAccountRequest)

Edit an user&#39;s details by its ID

Edit a user&#39;s details for the given user ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    UpdateUserAccountRequest updateUserAccountRequest = new UpdateUserAccountRequest(); // UpdateUserAccountRequest | Payload containing updated user's details
    try {
      UserDto result = apiInstance.editUserById(updateUserAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#editUserById");
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
| **updateUserAccountRequest** | [**UpdateUserAccountRequest**](UpdateUserAccountRequest.md)| Payload containing updated user&#39;s details | |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An updated user object containing detailed user information |  -  |
| **400** | Invalid userId provided |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **404** | User not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="getUserAvatarLink"></a>
# **getUserAvatarLink**
> String getUserAvatarLink()

Get user avatar link

Get the link to the user&#39;s avatar image

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      String result = apiInstance.getUserAvatarLink();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserAvatarLink");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User avatar link retrieved successfully |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="getUserById"></a>
# **getUserById**
> UserDto getUserById()

Get an user by its ID

Fetches an user&#39;s details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      UserDto result = apiInstance.getUserById();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserById");
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

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A user object containing detailed user information |  -  |
| **400** | Invalid userId provided |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **404** | User not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="resetUserPassword"></a>
# **resetUserPassword**
> resetUserPassword()

Reset user password

Reset user password

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      apiInstance.resetUserPassword();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#resetUserPassword");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reset user password request confirm successfully |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="uploadUserAvatar"></a>
# **uploadUserAvatar**
> uploadUserAvatar(_file)

Upload user avatar

Upload a user&#39;s avatar image

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UserApi apiInstance = new UserApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.uploadUserAvatar(_file);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#uploadUserAvatar");
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
| **_file** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User avatar uploaded successfully |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

