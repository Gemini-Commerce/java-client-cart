# BasicOperationsApi

All URIs are relative to *https://cart.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProducts**](BasicOperationsApi.md#addProducts) | **POST** /cart.Cart/AddProducts | Add Products |
| [**createCart**](BasicOperationsApi.md#createCart) | **POST** /cart.Cart/CreateCart | Create Cart |
| [**getActiveCartByCustomer**](BasicOperationsApi.md#getActiveCartByCustomer) | **POST** /cart.Cart/GetActiveCartByCustomer | Get Active Cart By Customer |
| [**getCart**](BasicOperationsApi.md#getCart) | **POST** /cart.Cart/GetCart | Get Cart |
| [**listCarts**](BasicOperationsApi.md#listCarts) | **POST** /cart.Cart/ListCarts | List Carts |
| [**mergeCarts**](BasicOperationsApi.md#mergeCarts) | **POST** /cart.Cart/MergeCarts | Merge Carts |
| [**removeProducts**](BasicOperationsApi.md#removeProducts) | **POST** /cart.Cart/RemoveProducts | Remove Products |
| [**setAdditionalInfo**](BasicOperationsApi.md#setAdditionalInfo) | **POST** /cart.Cart/SetAdditionalInfo | Set Additional Info |
| [**setNotes**](BasicOperationsApi.md#setNotes) | **POST** /cart.Cart/SetNotes | Set Notes |
| [**triggerRealignment**](BasicOperationsApi.md#triggerRealignment) | **POST** /cart.Cart/TriggerRealignment | Trigger Realignment |
| [**updateCart**](BasicOperationsApi.md#updateCart) | **POST** /cart.Cart/UpdateCart | Update Cart |
| [**updateProducts**](BasicOperationsApi.md#updateProducts) | **POST** /cart.Cart/UpdateProducts | Update Products |


<a id="addProducts"></a>
# **addProducts**
> CartAddProductsResponse addProducts(body)

Add Products

This endpoint allows you to add products to a shopping cart. The AddProducts method enables you to specify the tenantId and cartId to identify the target shopping cart, and provide a list of items to be added.

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartAddProductsRequest body = new CartAddProductsRequest(); // CartAddProductsRequest | 
    try {
      CartAddProductsResponse result = apiInstance.addProducts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#addProducts");
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
| **body** | [**CartAddProductsRequest**](CartAddProductsRequest.md)|  | |

### Return type

[**CartAddProductsResponse**](CartAddProductsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createCart"></a>
# **createCart**
> CartCreateCartResponse createCart(body)

Create Cart

The CreateCart endpoint allows users to create a new cart for their shopping session. By making a request to this endpoint, users can initiate a new cart and obtain a unique identifier for future cart operations. This endpoint enables seamless cart management and provides a foundation for adding products and performing checkout operations.

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartCreateCartRequest body = new CartCreateCartRequest(); // CartCreateCartRequest | 
    try {
      CartCreateCartResponse result = apiInstance.createCart(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#createCart");
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
| **body** | [**CartCreateCartRequest**](CartCreateCartRequest.md)|  | |

### Return type

[**CartCreateCartResponse**](CartCreateCartResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getActiveCartByCustomer"></a>
# **getActiveCartByCustomer**
> CartGetActiveCartByCustomerResponse getActiveCartByCustomer(body)

Get Active Cart By Customer

Get the active cart by customer

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartGetActiveCartByCustomerRequest body = new CartGetActiveCartByCustomerRequest(); // CartGetActiveCartByCustomerRequest | 
    try {
      CartGetActiveCartByCustomerResponse result = apiInstance.getActiveCartByCustomer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#getActiveCartByCustomer");
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
| **body** | [**CartGetActiveCartByCustomerRequest**](CartGetActiveCartByCustomerRequest.md)|  | |

### Return type

[**CartGetActiveCartByCustomerResponse**](CartGetActiveCartByCustomerResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getCart"></a>
# **getCart**
> CartGetCartResponse getCart(body)

Get Cart

Get the cart

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartGetCartRequest body = new CartGetCartRequest(); // CartGetCartRequest | Get cart request
    try {
      CartGetCartResponse result = apiInstance.getCart(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#getCart");
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
| **body** | [**CartGetCartRequest**](CartGetCartRequest.md)| Get cart request | |

### Return type

[**CartGetCartResponse**](CartGetCartResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listCarts"></a>
# **listCarts**
> CartListCartsResponse listCarts(body)

List Carts

List all carts

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartListCartsRequest body = new CartListCartsRequest(); // CartListCartsRequest | 
    try {
      CartListCartsResponse result = apiInstance.listCarts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#listCarts");
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
| **body** | [**CartListCartsRequest**](CartListCartsRequest.md)|  | |

### Return type

[**CartListCartsResponse**](CartListCartsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="mergeCarts"></a>
# **mergeCarts**
> CartMergeCartsResponse mergeCarts(body)

Merge Carts

Merge carts

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartMergeCartsRequest body = new CartMergeCartsRequest(); // CartMergeCartsRequest | 
    try {
      CartMergeCartsResponse result = apiInstance.mergeCarts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#mergeCarts");
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
| **body** | [**CartMergeCartsRequest**](CartMergeCartsRequest.md)|  | |

### Return type

[**CartMergeCartsResponse**](CartMergeCartsResponse.md)

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

<a id="removeProducts"></a>
# **removeProducts**
> Object removeProducts(body)

Remove Products

Remove products from the cart

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartRemoveProductsRequest body = new CartRemoveProductsRequest(); // CartRemoveProductsRequest | 
    try {
      Object result = apiInstance.removeProducts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#removeProducts");
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
| **body** | [**CartRemoveProductsRequest**](CartRemoveProductsRequest.md)|  | |

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
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="setAdditionalInfo"></a>
# **setAdditionalInfo**
> Object setAdditionalInfo(body)

Set Additional Info

Set additional info

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartSetAdditionalInfoRequest body = new CartSetAdditionalInfoRequest(); // CartSetAdditionalInfoRequest | 
    try {
      Object result = apiInstance.setAdditionalInfo(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#setAdditionalInfo");
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
| **body** | [**CartSetAdditionalInfoRequest**](CartSetAdditionalInfoRequest.md)|  | |

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

<a id="setNotes"></a>
# **setNotes**
> Object setNotes(body)

Set Notes

Set notes

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartSetNotesRequest body = new CartSetNotesRequest(); // CartSetNotesRequest | 
    try {
      Object result = apiInstance.setNotes(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#setNotes");
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
| **body** | [**CartSetNotesRequest**](CartSetNotesRequest.md)|  | |

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

<a id="triggerRealignment"></a>
# **triggerRealignment**
> CartTriggerRealignmentResponse triggerRealignment(body)

Trigger Realignment

Trigger realignment

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartTriggerRealignmentRequest body = new CartTriggerRealignmentRequest(); // CartTriggerRealignmentRequest | 
    try {
      CartTriggerRealignmentResponse result = apiInstance.triggerRealignment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#triggerRealignment");
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
| **body** | [**CartTriggerRealignmentRequest**](CartTriggerRealignmentRequest.md)|  | |

### Return type

[**CartTriggerRealignmentResponse**](CartTriggerRealignmentResponse.md)

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

<a id="updateCart"></a>
# **updateCart**
> Object updateCart(body)

Update Cart

Update the cart

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartUpdateCartRequest body = new CartUpdateCartRequest(); // CartUpdateCartRequest | 
    try {
      Object result = apiInstance.updateCart(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#updateCart");
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
| **body** | [**CartUpdateCartRequest**](CartUpdateCartRequest.md)|  | |

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
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateProducts"></a>
# **updateProducts**
> Object updateProducts(body)

Update Products

Update products in the cart

### Example
```java
// Import classes:
import GeminiCommerce_Cart.ApiClient;
import GeminiCommerce_Cart.ApiException;
import GeminiCommerce_Cart.Configuration;
import GeminiCommerce_Cart.auth.*;
import GeminiCommerce_Cart.models.*;
import org.openapitools.client.api.BasicOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cart.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    BasicOperationsApi apiInstance = new BasicOperationsApi(defaultClient);
    CartUpdateProductsRequest body = new CartUpdateProductsRequest(); // CartUpdateProductsRequest | 
    try {
      Object result = apiInstance.updateProducts(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicOperationsApi#updateProducts");
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
| **body** | [**CartUpdateProductsRequest**](CartUpdateProductsRequest.md)|  | |

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
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

