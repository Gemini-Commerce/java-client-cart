# PromotionsApi

All URIs are relative to *https://cart.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyCoupons**](PromotionsApi.md#applyCoupons) | **POST** /cart.Cart/ApplyCoupons | Apply Coupons |
| [**removeCoupons**](PromotionsApi.md#removeCoupons) | **POST** /cart.Cart/RemoveCoupons | Remove Coupons |


<a id="applyCoupons"></a>
# **applyCoupons**
> Object applyCoupons(body)

Apply Coupons

Apply coupons to the cart

### Example
```java
// Import classes:
import GeminiCommerce.Cart.ApiClient;
import GeminiCommerce.Cart.ApiException;
import GeminiCommerce.Cart.Configuration;
import GeminiCommerce.Cart.auth.*;
import GeminiCommerce.Cart.models.*;
import org.openapitools.client.api.PromotionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    CartApplyCouponsRequest body = new CartApplyCouponsRequest(); // CartApplyCouponsRequest | 
    try {
      Object result = apiInstance.applyCoupons(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#applyCoupons");
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
| **body** | [**CartApplyCouponsRequest**](CartApplyCouponsRequest.md)|  | |

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

<a id="removeCoupons"></a>
# **removeCoupons**
> Object removeCoupons(body)

Remove Coupons

Remove coupons from the cart

### Example
```java
// Import classes:
import GeminiCommerce.Cart.ApiClient;
import GeminiCommerce.Cart.ApiException;
import GeminiCommerce.Cart.Configuration;
import GeminiCommerce.Cart.auth.*;
import GeminiCommerce.Cart.models.*;
import org.openapitools.client.api.PromotionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    CartRemoveCouponsRequest body = new CartRemoveCouponsRequest(); // CartRemoveCouponsRequest | 
    try {
      Object result = apiInstance.removeCoupons(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#removeCoupons");
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
| **body** | [**CartRemoveCouponsRequest**](CartRemoveCouponsRequest.md)|  | |

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

