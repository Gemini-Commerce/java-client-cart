# # CartCartData


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id**| **String** |   | [optional]
**grn**| **String** |   | [optional]
**channel**| **String** |   | [optional]
**market**| **String** |   | [optional]
**locale**| **String** |   | [optional]
**items**| [**List<CartCartItem>**](CartCartItem.md) |   | [optional] [default to new ArrayList<>()]
**payments**| [**List<CartPaymentData>**](CartPaymentData.md) |   | [optional] [default to new ArrayList<>()]
**shipments**| [**List<CartShipmentData>**](CartShipmentData.md) |   | [optional] [default to new ArrayList<>()]
**promotions**| [**List<CartPromotionData>**](CartPromotionData.md) |   | [optional] [default to new ArrayList<>()]
**currency**| [**CartCurrency**](CartCurrency.md) |  for more information please, see Model/CartCurrency.php  | [optional] [default to CartCurrency.XXX]
**subtotals**| [**List<CartCartSubtotal>**](CartCartSubtotal.md) |   | [optional] [default to new ArrayList<>()]
**total**| [**CartMoney**](CartMoney.md) |   | [optional]
**totalDue**| [**CartMoney**](CartMoney.md) |   | [optional]
**vatIncluded**| **Boolean** |   | [optional]
**billingAddress**| [**CartPostalAddress**](CartPostalAddress.md) |   | [optional]
**shippingAddress**| [**CartPostalAddress**](CartPostalAddress.md) |   | [optional]
**status**| [**CartCartStatus**](CartCartStatus.md) |  for more information please, see Model/CartCartStatus.php  | [optional] [default to CartCartStatus.UNKNOWN]
**customer**| [**CartCustomerData**](CartCustomerData.md) |   | [optional]
**notes**| **String** |   | [optional]
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**updatedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

