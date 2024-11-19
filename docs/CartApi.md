# CartApi

All URIs are relative to *https://cart.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cartSetCustomPriceOnItems**](CartApi.md#cartSetCustomPriceOnItems) | **POST** /cart.Cart/SetCustomPriceOnItems |  |


<a id="cartSetCustomPriceOnItems"></a>
# **cartSetCustomPriceOnItems**
> Object cartSetCustomPriceOnItems(body)



### Example
```java
// Import classes:
import GeminiCommerce.Cart.ApiClient;
import GeminiCommerce.Cart.ApiException;
import GeminiCommerce.Cart.Configuration;
import GeminiCommerce.Cart.auth.*;
import GeminiCommerce.Cart.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    CartApi apiInstance = new CartApi(defaultClient);
    CartSetCustomPriceOnItemsRequest body = new CartSetCustomPriceOnItemsRequest(); // CartSetCustomPriceOnItemsRequest | 
    try {
      Object result = apiInstance.cartSetCustomPriceOnItems(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartApi#cartSetCustomPriceOnItems");
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
| **body** | [**CartSetCustomPriceOnItemsRequest**](CartSetCustomPriceOnItemsRequest.md)|  | |

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
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

