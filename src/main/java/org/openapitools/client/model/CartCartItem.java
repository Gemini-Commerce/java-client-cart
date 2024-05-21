/*
 * Cart Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CartItemCustomPrice;
import org.openapitools.client.model.CartMoney;
import org.openapitools.client.model.CartProductConfigurationStep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Cart.JSON;

/**
 * CartCartItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T15:21:28.271708366Z[Etc/UTC]")
public class CartCartItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PRODUCT_GRN = "productGrn";
  @SerializedName(SERIALIZED_NAME_PRODUCT_GRN)
  private String productGrn;

  public static final String SERIALIZED_NAME_PRODUCT_CONFIGURATION = "productConfiguration";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CONFIGURATION)
  private List<CartProductConfigurationStep> productConfiguration;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CartMoney price;

  public static final String SERIALIZED_NAME_LIST_PRICE = "listPrice";
  @SerializedName(SERIALIZED_NAME_LIST_PRICE)
  private CartMoney listPrice;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private CartMoney discount;

  public static final String SERIALIZED_NAME_BASE_PRICE = "basePrice";
  @SerializedName(SERIALIZED_NAME_BASE_PRICE)
  private CartMoney basePrice;

  public static final String SERIALIZED_NAME_CUSTOM_PRICE = "customPrice";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PRICE)
  private CartItemCustomPrice customPrice;

  public static final String SERIALIZED_NAME_VAT_AMOUNT = "vatAmount";
  @SerializedName(SERIALIZED_NAME_VAT_AMOUNT)
  private CartMoney vatAmount;

  public static final String SERIALIZED_NAME_VAT_PERCENTAGE = "vatPercentage";
  @SerializedName(SERIALIZED_NAME_VAT_PERCENTAGE)
  private Float vatPercentage;

  public static final String SERIALIZED_NAME_VAT_INACCURATE = "vatInaccurate";
  @SerializedName(SERIALIZED_NAME_VAT_INACCURATE)
  private Boolean vatInaccurate;

  public static final String SERIALIZED_NAME_VAT_CALCULATED = "vatCalculated";
  @SerializedName(SERIALIZED_NAME_VAT_CALCULATED)
  private Boolean vatCalculated;

  public static final String SERIALIZED_NAME_LOCALIZED_NAME = "localizedName";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_NAME)
  private Map<String, String> localizedName = new HashMap<>();

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PRODUCT_SKU = "productSku";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SKU)
  private String productSku;

  public static final String SERIALIZED_NAME_IMAGE_GRN = "imageGrn";
  @SerializedName(SERIALIZED_NAME_IMAGE_GRN)
  private String imageGrn;

  public static final String SERIALIZED_NAME_VARIANT_OPTIONS = "variantOptions";
  @SerializedName(SERIALIZED_NAME_VARIANT_OPTIONS)
  private String variantOptions;

  public static final String SERIALIZED_NAME_IS_VIRTUAL = "isVirtual";
  @SerializedName(SERIALIZED_NAME_IS_VIRTUAL)
  private Boolean isVirtual;

  public static final String SERIALIZED_NAME_PROMOTION_GRNS = "promotionGrns";
  @SerializedName(SERIALIZED_NAME_PROMOTION_GRNS)
  private List<String> promotionGrns;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_PRODUCT_DATA = "productData";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DATA)
  private String productData;

  public CartCartItem() {
  }

  public CartCartItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CartCartItem productGrn(String productGrn) {
    this.productGrn = productGrn;
    return this;
  }

   /**
   * Get productGrn
   * @return productGrn
  **/
  @javax.annotation.Nullable
  public String getProductGrn() {
    return productGrn;
  }

  public void setProductGrn(String productGrn) {
    this.productGrn = productGrn;
  }


  public CartCartItem productConfiguration(List<CartProductConfigurationStep> productConfiguration) {
    this.productConfiguration = productConfiguration;
    return this;
  }

  public CartCartItem addProductConfigurationItem(CartProductConfigurationStep productConfigurationItem) {
    if (this.productConfiguration == null) {
      this.productConfiguration = new ArrayList<>();
    }
    this.productConfiguration.add(productConfigurationItem);
    return this;
  }

   /**
   * Get productConfiguration
   * @return productConfiguration
  **/
  @javax.annotation.Nullable
  public List<CartProductConfigurationStep> getProductConfiguration() {
    return productConfiguration;
  }

  public void setProductConfiguration(List<CartProductConfigurationStep> productConfiguration) {
    this.productConfiguration = productConfiguration;
  }


  public CartCartItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public CartCartItem price(CartMoney price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  public CartMoney getPrice() {
    return price;
  }

  public void setPrice(CartMoney price) {
    this.price = price;
  }


  public CartCartItem listPrice(CartMoney listPrice) {
    this.listPrice = listPrice;
    return this;
  }

   /**
   * Get listPrice
   * @return listPrice
  **/
  @javax.annotation.Nullable
  public CartMoney getListPrice() {
    return listPrice;
  }

  public void setListPrice(CartMoney listPrice) {
    this.listPrice = listPrice;
  }


  public CartCartItem discount(CartMoney discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  public CartMoney getDiscount() {
    return discount;
  }

  public void setDiscount(CartMoney discount) {
    this.discount = discount;
  }


  public CartCartItem basePrice(CartMoney basePrice) {
    this.basePrice = basePrice;
    return this;
  }

   /**
   * Get basePrice
   * @return basePrice
  **/
  @javax.annotation.Nullable
  public CartMoney getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(CartMoney basePrice) {
    this.basePrice = basePrice;
  }


  public CartCartItem customPrice(CartItemCustomPrice customPrice) {
    this.customPrice = customPrice;
    return this;
  }

   /**
   * Get customPrice
   * @return customPrice
  **/
  @javax.annotation.Nullable
  public CartItemCustomPrice getCustomPrice() {
    return customPrice;
  }

  public void setCustomPrice(CartItemCustomPrice customPrice) {
    this.customPrice = customPrice;
  }


  public CartCartItem vatAmount(CartMoney vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Get vatAmount
   * @return vatAmount
  **/
  @javax.annotation.Nullable
  public CartMoney getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(CartMoney vatAmount) {
    this.vatAmount = vatAmount;
  }


  public CartCartItem vatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
    return this;
  }

   /**
   * Get vatPercentage
   * @return vatPercentage
  **/
  @javax.annotation.Nullable
  public Float getVatPercentage() {
    return vatPercentage;
  }

  public void setVatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
  }


  public CartCartItem vatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
    return this;
  }

   /**
   * Get vatInaccurate
   * @return vatInaccurate
  **/
  @javax.annotation.Nullable
  public Boolean getVatInaccurate() {
    return vatInaccurate;
  }

  public void setVatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
  }


  public CartCartItem vatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
    return this;
  }

   /**
   * Get vatCalculated
   * @return vatCalculated
  **/
  @javax.annotation.Nullable
  public Boolean getVatCalculated() {
    return vatCalculated;
  }

  public void setVatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
  }


  public CartCartItem localizedName(Map<String, String> localizedName) {
    this.localizedName = localizedName;
    return this;
  }

  public CartCartItem putLocalizedNameItem(String key, String localizedNameItem) {
    if (this.localizedName == null) {
      this.localizedName = new HashMap<>();
    }
    this.localizedName.put(key, localizedNameItem);
    return this;
  }

   /**
   * Get localizedName
   * @return localizedName
  **/
  @javax.annotation.Nullable
  public Map<String, String> getLocalizedName() {
    return localizedName;
  }

  public void setLocalizedName(Map<String, String> localizedName) {
    this.localizedName = localizedName;
  }


  public CartCartItem productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public CartCartItem productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * Get productSku
   * @return productSku
  **/
  @javax.annotation.Nullable
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }


  public CartCartItem imageGrn(String imageGrn) {
    this.imageGrn = imageGrn;
    return this;
  }

   /**
   * Get imageGrn
   * @return imageGrn
  **/
  @javax.annotation.Nullable
  public String getImageGrn() {
    return imageGrn;
  }

  public void setImageGrn(String imageGrn) {
    this.imageGrn = imageGrn;
  }


  public CartCartItem variantOptions(String variantOptions) {
    this.variantOptions = variantOptions;
    return this;
  }

   /**
   * Get variantOptions
   * @return variantOptions
  **/
  @javax.annotation.Nullable
  public String getVariantOptions() {
    return variantOptions;
  }

  public void setVariantOptions(String variantOptions) {
    this.variantOptions = variantOptions;
  }


  public CartCartItem isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

   /**
   * Get isVirtual
   * @return isVirtual
  **/
  @javax.annotation.Nullable
  public Boolean getIsVirtual() {
    return isVirtual;
  }

  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }


  public CartCartItem promotionGrns(List<String> promotionGrns) {
    this.promotionGrns = promotionGrns;
    return this;
  }

  public CartCartItem addPromotionGrnsItem(String promotionGrnsItem) {
    if (this.promotionGrns == null) {
      this.promotionGrns = new ArrayList<>();
    }
    this.promotionGrns.add(promotionGrnsItem);
    return this;
  }

   /**
   * Get promotionGrns
   * @return promotionGrns
  **/
  @javax.annotation.Nullable
  public List<String> getPromotionGrns() {
    return promotionGrns;
  }

  public void setPromotionGrns(List<String> promotionGrns) {
    this.promotionGrns = promotionGrns;
  }


  public CartCartItem additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public CartCartItem productData(String productData) {
    this.productData = productData;
    return this;
  }

   /**
   * Get productData
   * @return productData
  **/
  @javax.annotation.Nullable
  public String getProductData() {
    return productData;
  }

  public void setProductData(String productData) {
    this.productData = productData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartCartItem cartCartItem = (CartCartItem) o;
    return Objects.equals(this.id, cartCartItem.id) &&
        Objects.equals(this.productGrn, cartCartItem.productGrn) &&
        Objects.equals(this.productConfiguration, cartCartItem.productConfiguration) &&
        Objects.equals(this.quantity, cartCartItem.quantity) &&
        Objects.equals(this.price, cartCartItem.price) &&
        Objects.equals(this.listPrice, cartCartItem.listPrice) &&
        Objects.equals(this.discount, cartCartItem.discount) &&
        Objects.equals(this.basePrice, cartCartItem.basePrice) &&
        Objects.equals(this.customPrice, cartCartItem.customPrice) &&
        Objects.equals(this.vatAmount, cartCartItem.vatAmount) &&
        Objects.equals(this.vatPercentage, cartCartItem.vatPercentage) &&
        Objects.equals(this.vatInaccurate, cartCartItem.vatInaccurate) &&
        Objects.equals(this.vatCalculated, cartCartItem.vatCalculated) &&
        Objects.equals(this.localizedName, cartCartItem.localizedName) &&
        Objects.equals(this.productCode, cartCartItem.productCode) &&
        Objects.equals(this.productSku, cartCartItem.productSku) &&
        Objects.equals(this.imageGrn, cartCartItem.imageGrn) &&
        Objects.equals(this.variantOptions, cartCartItem.variantOptions) &&
        Objects.equals(this.isVirtual, cartCartItem.isVirtual) &&
        Objects.equals(this.promotionGrns, cartCartItem.promotionGrns) &&
        Objects.equals(this.additionalInfo, cartCartItem.additionalInfo) &&
        Objects.equals(this.productData, cartCartItem.productData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productGrn, productConfiguration, quantity, price, listPrice, discount, basePrice, customPrice, vatAmount, vatPercentage, vatInaccurate, vatCalculated, localizedName, productCode, productSku, imageGrn, variantOptions, isVirtual, promotionGrns, additionalInfo, productData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartCartItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productGrn: ").append(toIndentedString(productGrn)).append("\n");
    sb.append("    productConfiguration: ").append(toIndentedString(productConfiguration)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    customPrice: ").append(toIndentedString(customPrice)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    vatInaccurate: ").append(toIndentedString(vatInaccurate)).append("\n");
    sb.append("    vatCalculated: ").append(toIndentedString(vatCalculated)).append("\n");
    sb.append("    localizedName: ").append(toIndentedString(localizedName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    imageGrn: ").append(toIndentedString(imageGrn)).append("\n");
    sb.append("    variantOptions: ").append(toIndentedString(variantOptions)).append("\n");
    sb.append("    isVirtual: ").append(toIndentedString(isVirtual)).append("\n");
    sb.append("    promotionGrns: ").append(toIndentedString(promotionGrns)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    productData: ").append(toIndentedString(productData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("productGrn");
    openapiFields.add("productConfiguration");
    openapiFields.add("quantity");
    openapiFields.add("price");
    openapiFields.add("listPrice");
    openapiFields.add("discount");
    openapiFields.add("basePrice");
    openapiFields.add("customPrice");
    openapiFields.add("vatAmount");
    openapiFields.add("vatPercentage");
    openapiFields.add("vatInaccurate");
    openapiFields.add("vatCalculated");
    openapiFields.add("localizedName");
    openapiFields.add("productCode");
    openapiFields.add("productSku");
    openapiFields.add("imageGrn");
    openapiFields.add("variantOptions");
    openapiFields.add("isVirtual");
    openapiFields.add("promotionGrns");
    openapiFields.add("additionalInfo");
    openapiFields.add("productData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartCartItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartCartItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartCartItem is not found in the empty JSON string", CartCartItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CartCartItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartCartItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("productGrn") != null && !jsonObj.get("productGrn").isJsonNull()) && !jsonObj.get("productGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productGrn").toString()));
      }
      if (jsonObj.get("productConfiguration") != null && !jsonObj.get("productConfiguration").isJsonNull()) {
        JsonArray jsonArrayproductConfiguration = jsonObj.getAsJsonArray("productConfiguration");
        if (jsonArrayproductConfiguration != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productConfiguration").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productConfiguration` to be an array in the JSON string but got `%s`", jsonObj.get("productConfiguration").toString()));
          }

          // validate the optional field `productConfiguration` (array)
          for (int i = 0; i < jsonArrayproductConfiguration.size(); i++) {
            CartProductConfigurationStep.validateJsonElement(jsonArrayproductConfiguration.get(i));
          };
        }
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("price"));
      }
      // validate the optional field `listPrice`
      if (jsonObj.get("listPrice") != null && !jsonObj.get("listPrice").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("listPrice"));
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("discount"));
      }
      // validate the optional field `basePrice`
      if (jsonObj.get("basePrice") != null && !jsonObj.get("basePrice").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("basePrice"));
      }
      // validate the optional field `customPrice`
      if (jsonObj.get("customPrice") != null && !jsonObj.get("customPrice").isJsonNull()) {
        CartItemCustomPrice.validateJsonElement(jsonObj.get("customPrice"));
      }
      // validate the optional field `vatAmount`
      if (jsonObj.get("vatAmount") != null && !jsonObj.get("vatAmount").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("vatAmount"));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("productSku") != null && !jsonObj.get("productSku").isJsonNull()) && !jsonObj.get("productSku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productSku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productSku").toString()));
      }
      if ((jsonObj.get("imageGrn") != null && !jsonObj.get("imageGrn").isJsonNull()) && !jsonObj.get("imageGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageGrn").toString()));
      }
      if ((jsonObj.get("variantOptions") != null && !jsonObj.get("variantOptions").isJsonNull()) && !jsonObj.get("variantOptions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variantOptions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variantOptions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("promotionGrns") != null && !jsonObj.get("promotionGrns").isJsonNull() && !jsonObj.get("promotionGrns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotionGrns` to be an array in the JSON string but got `%s`", jsonObj.get("promotionGrns").toString()));
      }
      if ((jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) && !jsonObj.get("additionalInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
      }
      if ((jsonObj.get("productData") != null && !jsonObj.get("productData").isJsonNull()) && !jsonObj.get("productData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartCartItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartCartItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartCartItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartCartItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CartCartItem>() {
           @Override
           public void write(JsonWriter out, CartCartItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartCartItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartCartItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartCartItem
  * @throws IOException if the JSON string is invalid with respect to CartCartItem
  */
  public static CartCartItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartCartItem.class);
  }

 /**
  * Convert an instance of CartCartItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

