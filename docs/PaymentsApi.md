# PaymentsApi

All URIs are relative to *https://cart.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listPaymentMethods**](PaymentsApi.md#listPaymentMethods) | **POST** /cart.Cart/ListPaymentMethods | List Payment Methods |
| [**setSetPayments**](PaymentsApi.md#setSetPayments) | **POST** /cart.Cart/SetPayments | Set SetPayments |


<a id="listPaymentMethods"></a>
# **listPaymentMethods**
> CartListPaymentMethodsResponse listPaymentMethods(body)

List Payment Methods

List payment methods

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    CartListPaymentMethodsRequest body = new CartListPaymentMethodsRequest(); // CartListPaymentMethodsRequest | 
    try {
      CartListPaymentMethodsResponse result = apiInstance.listPaymentMethods(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#listPaymentMethods");
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
| **body** | [**CartListPaymentMethodsRequest**](CartListPaymentMethodsRequest.md)|  | |

### Return type

[**CartListPaymentMethodsResponse**](CartListPaymentMethodsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="setSetPayments"></a>
# **setSetPayments**
> CartSetPaymentsResponse setSetPayments(body)

Set SetPayments

Set SetPayments

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    CartSetPaymentsRequest body = new CartSetPaymentsRequest(); // CartSetPaymentsRequest | 
    try {
      CartSetPaymentsResponse result = apiInstance.setSetPayments(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#setSetPayments");
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
| **body** | [**CartSetPaymentsRequest**](CartSetPaymentsRequest.md)|  | |

### Return type

[**CartSetPaymentsResponse**](CartSetPaymentsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

