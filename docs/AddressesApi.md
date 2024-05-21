# AddressesApi

All URIs are relative to *https://cart.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**setBillingAddress**](AddressesApi.md#setBillingAddress) | **POST** /cart.Cart/SetBillingAddress | Set Billing Address |
| [**setShipmentAddress**](AddressesApi.md#setShipmentAddress) | **POST** /cart.Cart/SetShipmentAddress | Set Shipment Address |


<a id="setBillingAddress"></a>
# **setBillingAddress**
> Object setBillingAddress(body)

Set Billing Address

Set billing address

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.AddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AddressesApi apiInstance = new AddressesApi(defaultClient);
    CartSetBillingAddressRequest body = new CartSetBillingAddressRequest(); // CartSetBillingAddressRequest | 
    try {
      Object result = apiInstance.setBillingAddress(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#setBillingAddress");
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
| **body** | [**CartSetBillingAddressRequest**](CartSetBillingAddressRequest.md)|  | |

### Return type

**Object**

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

<a id="setShipmentAddress"></a>
# **setShipmentAddress**
> Object setShipmentAddress(body)

Set Shipment Address

Set shipment address

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.AddressesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    AddressesApi apiInstance = new AddressesApi(defaultClient);
    CartSetShipmentAddressRequest body = new CartSetShipmentAddressRequest(); // CartSetShipmentAddressRequest | 
    try {
      Object result = apiInstance.setShipmentAddress(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#setShipmentAddress");
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
| **body** | [**CartSetShipmentAddressRequest**](CartSetShipmentAddressRequest.md)|  | |

### Return type

**Object**

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

