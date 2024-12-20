# openapi-java-client

Cart Service
- API version: 1.0.0
  - Build date: 2024-11-19T10:43:10.860688922Z[Etc/UTC]
  - Generator version: 7.9.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import GeminiCommerce.Cart.ApiClient;
import GeminiCommerce.Cart.ApiException;
import GeminiCommerce.Cart.Configuration;
import GeminiCommerce.Cart.auth.*;
import org.openapitools.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://cart.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressesApi* | [**setBillingAddress**](docs/AddressesApi.md#setBillingAddress) | **POST** /cart.Cart/SetBillingAddress | Set Billing Address
*AddressesApi* | [**setShipmentAddress**](docs/AddressesApi.md#setShipmentAddress) | **POST** /cart.Cart/SetShipmentAddress | Set Shipment Address
*BasicOperationsApi* | [**addProducts**](docs/BasicOperationsApi.md#addProducts) | **POST** /cart.Cart/AddProducts | Add Products
*BasicOperationsApi* | [**createCart**](docs/BasicOperationsApi.md#createCart) | **POST** /cart.Cart/CreateCart | Create Cart
*BasicOperationsApi* | [**getActiveCartByCustomer**](docs/BasicOperationsApi.md#getActiveCartByCustomer) | **POST** /cart.Cart/GetActiveCartByCustomer | Get Active Cart By Customer
*BasicOperationsApi* | [**getCart**](docs/BasicOperationsApi.md#getCart) | **POST** /cart.Cart/GetCart | Get Cart
*BasicOperationsApi* | [**listCarts**](docs/BasicOperationsApi.md#listCarts) | **POST** /cart.Cart/ListCarts | List Carts
*BasicOperationsApi* | [**mergeCarts**](docs/BasicOperationsApi.md#mergeCarts) | **POST** /cart.Cart/MergeCarts | Merge Carts
*BasicOperationsApi* | [**removeProducts**](docs/BasicOperationsApi.md#removeProducts) | **POST** /cart.Cart/RemoveProducts | Remove Products
*BasicOperationsApi* | [**setAdditionalInfo**](docs/BasicOperationsApi.md#setAdditionalInfo) | **POST** /cart.Cart/SetAdditionalInfo | Set Additional Info
*BasicOperationsApi* | [**setNotes**](docs/BasicOperationsApi.md#setNotes) | **POST** /cart.Cart/SetNotes | Set Notes
*BasicOperationsApi* | [**triggerRealignment**](docs/BasicOperationsApi.md#triggerRealignment) | **POST** /cart.Cart/TriggerRealignment | Trigger Realignment
*BasicOperationsApi* | [**updateCart**](docs/BasicOperationsApi.md#updateCart) | **POST** /cart.Cart/UpdateCart | Update Cart
*BasicOperationsApi* | [**updateProducts**](docs/BasicOperationsApi.md#updateProducts) | **POST** /cart.Cart/UpdateProducts | Update Products
*CartApi* | [**cartSetCustomPriceOnItems**](docs/CartApi.md#cartSetCustomPriceOnItems) | **POST** /cart.Cart/SetCustomPriceOnItems | 
*PaymentsApi* | [**listPaymentMethods**](docs/PaymentsApi.md#listPaymentMethods) | **POST** /cart.Cart/ListPaymentMethods | List Payment Methods
*PaymentsApi* | [**setSetPayments**](docs/PaymentsApi.md#setSetPayments) | **POST** /cart.Cart/SetPayments | Set SetPayments
*PromotionsApi* | [**applyCoupons**](docs/PromotionsApi.md#applyCoupons) | **POST** /cart.Cart/ApplyCoupons | Apply Coupons
*PromotionsApi* | [**removeCoupons**](docs/PromotionsApi.md#removeCoupons) | **POST** /cart.Cart/RemoveCoupons | Remove Coupons
*ShipmentsApi* | [**listShipmentMethods**](docs/ShipmentsApi.md#listShipmentMethods) | **POST** /cart.Cart/ListShipmentMethods | List Shipment Methods
*ShipmentsApi* | [**setShipments**](docs/ShipmentsApi.md#setShipments) | **POST** /cart.Cart/SetShipments | Set Shipments


## Documentation for Models

 - [CartAddProductsRequest](docs/CartAddProductsRequest.md)
 - [CartAddProductsRequestItem](docs/CartAddProductsRequestItem.md)
 - [CartAddProductsResponse](docs/CartAddProductsResponse.md)
 - [CartAddProductsResponseItem](docs/CartAddProductsResponseItem.md)
 - [CartApplyCouponsRequest](docs/CartApplyCouponsRequest.md)
 - [CartCartData](docs/CartCartData.md)
 - [CartCartItem](docs/CartCartItem.md)
 - [CartCartStatus](docs/CartCartStatus.md)
 - [CartCartSubtotal](docs/CartCartSubtotal.md)
 - [CartCreateCartRequest](docs/CartCreateCartRequest.md)
 - [CartCreateCartResponse](docs/CartCreateCartResponse.md)
 - [CartCurrency](docs/CartCurrency.md)
 - [CartCustomerData](docs/CartCustomerData.md)
 - [CartGetActiveCartByCustomerRequest](docs/CartGetActiveCartByCustomerRequest.md)
 - [CartGetActiveCartByCustomerResponse](docs/CartGetActiveCartByCustomerResponse.md)
 - [CartGetCartRequest](docs/CartGetCartRequest.md)
 - [CartGetCartResponse](docs/CartGetCartResponse.md)
 - [CartItemCustomPrice](docs/CartItemCustomPrice.md)
 - [CartListCartsRequest](docs/CartListCartsRequest.md)
 - [CartListCartsResponse](docs/CartListCartsResponse.md)
 - [CartListPaymentMethodsRequest](docs/CartListPaymentMethodsRequest.md)
 - [CartListPaymentMethodsResponse](docs/CartListPaymentMethodsResponse.md)
 - [CartListShipmentMethodsRequest](docs/CartListShipmentMethodsRequest.md)
 - [CartListShipmentMethodsResponse](docs/CartListShipmentMethodsResponse.md)
 - [CartLocalizedText](docs/CartLocalizedText.md)
 - [CartMergeCartsRequest](docs/CartMergeCartsRequest.md)
 - [CartMergeCartsResponse](docs/CartMergeCartsResponse.md)
 - [CartMoney](docs/CartMoney.md)
 - [CartPaymentData](docs/CartPaymentData.md)
 - [CartPostalAddress](docs/CartPostalAddress.md)
 - [CartProductConfigurationSelection](docs/CartProductConfigurationSelection.md)
 - [CartProductConfigurationSelectionOption](docs/CartProductConfigurationSelectionOption.md)
 - [CartProductConfigurationStep](docs/CartProductConfigurationStep.md)
 - [CartProductConfigurationStepOption](docs/CartProductConfigurationStepOption.md)
 - [CartPromotionData](docs/CartPromotionData.md)
 - [CartRemoveCouponsRequest](docs/CartRemoveCouponsRequest.md)
 - [CartRemoveProductsRequest](docs/CartRemoveProductsRequest.md)
 - [CartSetAdditionalInfoRequest](docs/CartSetAdditionalInfoRequest.md)
 - [CartSetBillingAddressRequest](docs/CartSetBillingAddressRequest.md)
 - [CartSetCustomPriceOnItemsRequest](docs/CartSetCustomPriceOnItemsRequest.md)
 - [CartSetCustomPriceOnItemsRequestCartItem](docs/CartSetCustomPriceOnItemsRequestCartItem.md)
 - [CartSetNotesRequest](docs/CartSetNotesRequest.md)
 - [CartSetPaymentsRequest](docs/CartSetPaymentsRequest.md)
 - [CartSetPaymentsResponse](docs/CartSetPaymentsResponse.md)
 - [CartSetShipmentAddressRequest](docs/CartSetShipmentAddressRequest.md)
 - [CartSetShipmentsRequest](docs/CartSetShipmentsRequest.md)
 - [CartShipmentData](docs/CartShipmentData.md)
 - [CartSortOrder](docs/CartSortOrder.md)
 - [CartSubtotalCode](docs/CartSubtotalCode.md)
 - [CartTriggerRealignmentRequest](docs/CartTriggerRealignmentRequest.md)
 - [CartTriggerRealignmentResponse](docs/CartTriggerRealignmentResponse.md)
 - [CartUpdateCartRequest](docs/CartUpdateCartRequest.md)
 - [CartUpdateProductsRequest](docs/CartUpdateProductsRequest.md)
 - [CartUpdateProductsRequestItem](docs/CartUpdateProductsRequestItem.md)
 - [ListCartsRequestFilter](docs/ListCartsRequestFilter.md)
 - [ListCartsRequestFilterCartStatus](docs/ListCartsRequestFilterCartStatus.md)
 - [ListCartsRequestFilterDate](docs/ListCartsRequestFilterDate.md)
 - [ListCartsRequestSort](docs/ListCartsRequestSort.md)
 - [OptionImage](docs/OptionImage.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [ProtobufNullValue](docs/ProtobufNullValue.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [SortSortField](docs/SortSortField.md)
 - [UpdateCartRequestPayload](docs/UpdateCartRequestPayload.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Authorization"></a>
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com

