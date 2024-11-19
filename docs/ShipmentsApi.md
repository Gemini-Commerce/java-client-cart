# ShipmentsApi

All URIs are relative to *https://cart.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listShipmentMethods**](ShipmentsApi.md#listShipmentMethods) | **POST** /cart.Cart/ListShipmentMethods | List Shipment Methods |
| [**setShipments**](ShipmentsApi.md#setShipments) | **POST** /cart.Cart/SetShipments | Set Shipments |


<a id="listShipmentMethods"></a>
# **listShipmentMethods**
> CartListShipmentMethodsResponse listShipmentMethods(body)

List Shipment Methods

List shipment methods

### Example
```java
// Import classes:
import GeminiCommerce.Cart.ApiClient;
import GeminiCommerce.Cart.ApiException;
import GeminiCommerce.Cart.Configuration;
import GeminiCommerce.Cart.auth.*;
import GeminiCommerce.Cart.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    CartListShipmentMethodsRequest body = new CartListShipmentMethodsRequest(); // CartListShipmentMethodsRequest | 
    try {
      CartListShipmentMethodsResponse result = apiInstance.listShipmentMethods(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#listShipmentMethods");
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
| **body** | [**CartListShipmentMethodsRequest**](CartListShipmentMethodsRequest.md)|  | |

### Return type

[**CartListShipmentMethodsResponse**](CartListShipmentMethodsResponse.md)

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

<a id="setShipments"></a>
# **setShipments**
> Object setShipments(body)

Set Shipments

Set shipments

### Example
```java
// Import classes:
import GeminiCommerce.Cart.ApiClient;
import GeminiCommerce.Cart.ApiException;
import GeminiCommerce.Cart.Configuration;
import GeminiCommerce.Cart.auth.*;
import GeminiCommerce.Cart.models.*;
import org.openapitools.client.api.ShipmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ShipmentsApi apiInstance = new ShipmentsApi(defaultClient);
    CartSetShipmentsRequest body = new CartSetShipmentsRequest(); // CartSetShipmentsRequest | 
    try {
      Object result = apiInstance.setShipments(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsApi#setShipments");
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
| **body** | [**CartSetShipmentsRequest**](CartSetShipmentsRequest.md)|  | |

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
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

