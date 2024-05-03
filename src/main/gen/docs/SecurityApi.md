# SecurityApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticate**](SecurityApi.md#authenticate) | **POST** /api/v1/auth/authenticate | Authenticate a user |
| [**changePassword**](SecurityApi.md#changePassword) | **POST** /api/v1/auth/password/change | Change password with verification code |
| [**confirmEmail**](SecurityApi.md#confirmEmail) | **POST** /api/v1/auth/confirm | Confirm an email |
| [**forgotPassword**](SecurityApi.md#forgotPassword) | **POST** /api/v1/auth/password/forgot | Send email with verification code |
| [**getEmailVerificationCode**](SecurityApi.md#getEmailVerificationCode) | **POST** /api/v1/auth/email/code | Get email code |
| [**logout**](SecurityApi.md#logout) | **POST** /api/v1/auth/logout | Logout user |
| [**refreshToken**](SecurityApi.md#refreshToken) | **POST** /api/v1/auth/refresh | Refresh user token |
| [**register**](SecurityApi.md#register) | **POST** /api/v1/auth/register | Register a user |


<a name="authenticate"></a>
# **authenticate**
> UserAuthenticationResponse authenticate(userAuthenticationRequest)

Authenticate a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    UserAuthenticationRequest userAuthenticationRequest = new UserAuthenticationRequest(); // UserAuthenticationRequest | 
    try {
      UserAuthenticationResponse result = apiInstance.authenticate(userAuthenticationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#authenticate");
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
| **userAuthenticationRequest** | [**UserAuthenticationRequest**](UserAuthenticationRequest.md)|  | |

### Return type

[**UserAuthenticationResponse**](UserAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="changePassword"></a>
# **changePassword**
> changePassword(changePasswordRequest)

Change password with verification code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest(); // ChangePasswordRequest | 
    try {
      apiInstance.changePassword(changePasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#changePassword");
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
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  | |

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
| **200** | OK |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="confirmEmail"></a>
# **confirmEmail**
> UserRegistrationResponse confirmEmail(confirmEmailRequest)

Confirm an email

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    ConfirmEmailRequest confirmEmailRequest = new ConfirmEmailRequest(); // ConfirmEmailRequest | 
    try {
      UserRegistrationResponse result = apiInstance.confirmEmail(confirmEmailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#confirmEmail");
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

[**UserRegistrationResponse**](UserRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="forgotPassword"></a>
# **forgotPassword**
> forgotPassword(forgotPasswordRequest)

Send email with verification code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(); // ForgotPasswordRequest | 
    try {
      apiInstance.forgotPassword(forgotPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#forgotPassword");
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
| **forgotPasswordRequest** | [**ForgotPasswordRequest**](ForgotPasswordRequest.md)|  | |

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
| **200** | OK |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="getEmailVerificationCode"></a>
# **getEmailVerificationCode**
> String getEmailVerificationCode(userRegistrationRequest)

Get email code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest(); // UserRegistrationRequest | 
    try {
      String result = apiInstance.getEmailVerificationCode(userRegistrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getEmailVerificationCode");
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
| **userRegistrationRequest** | [**UserRegistrationRequest**](UserRegistrationRequest.md)|  | |

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
| **200** | OK |  -  |

<a name="logout"></a>
# **logout**
> logout()

Logout user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    try {
      apiInstance.logout();
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#logout");
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
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

<a name="refreshToken"></a>
# **refreshToken**
> UserAuthenticationResponse refreshToken()

Refresh user token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    try {
      UserAuthenticationResponse result = apiInstance.refreshToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#refreshToken");
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

[**UserAuthenticationResponse**](UserAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized access. Authentication required |  -  |
| **500** | Internal Server Error |  -  |

<a name="register"></a>
# **register**
> String register(userRegistrationRequest)

Register a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest(); // UserRegistrationRequest | 
    try {
      String result = apiInstance.register(userRegistrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#register");
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
| **userRegistrationRequest** | [**UserRegistrationRequest**](UserRegistrationRequest.md)|  | |

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
| **200** | OK |  -  |

