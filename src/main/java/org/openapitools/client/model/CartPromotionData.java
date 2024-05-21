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
import java.util.List;
import org.openapitools.client.model.CartMoney;

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
 * CartPromotionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T15:21:28.271708366Z[Etc/UTC]")
public class CartPromotionData {
  public static final String SERIALIZED_NAME_PROMOTION_GRN = "promotionGrn";
  @SerializedName(SERIALIZED_NAME_PROMOTION_GRN)
  private String promotionGrn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_CART_ITEM_IDS = "cartItemIds";
  @SerializedName(SERIALIZED_NAME_CART_ITEM_IDS)
  private List<String> cartItemIds;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private CartMoney discount;

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

  public CartPromotionData() {
  }

  public CartPromotionData promotionGrn(String promotionGrn) {
    this.promotionGrn = promotionGrn;
    return this;
  }

   /**
   * Get promotionGrn
   * @return promotionGrn
  **/
  @javax.annotation.Nullable
  public String getPromotionGrn() {
    return promotionGrn;
  }

  public void setPromotionGrn(String promotionGrn) {
    this.promotionGrn = promotionGrn;
  }


  public CartPromotionData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CartPromotionData payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  public CartPromotionData cartItemIds(List<String> cartItemIds) {
    this.cartItemIds = cartItemIds;
    return this;
  }

  public CartPromotionData addCartItemIdsItem(String cartItemIdsItem) {
    if (this.cartItemIds == null) {
      this.cartItemIds = new ArrayList<>();
    }
    this.cartItemIds.add(cartItemIdsItem);
    return this;
  }

   /**
   * Get cartItemIds
   * @return cartItemIds
  **/
  @javax.annotation.Nullable
  public List<String> getCartItemIds() {
    return cartItemIds;
  }

  public void setCartItemIds(List<String> cartItemIds) {
    this.cartItemIds = cartItemIds;
  }


  public CartPromotionData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CartPromotionData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CartPromotionData couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Get couponCode
   * @return couponCode
  **/
  @javax.annotation.Nullable
  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public CartPromotionData discount(CartMoney discount) {
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


  public CartPromotionData vatAmount(CartMoney vatAmount) {
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


  public CartPromotionData vatPercentage(Float vatPercentage) {
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


  public CartPromotionData vatInaccurate(Boolean vatInaccurate) {
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


  public CartPromotionData vatCalculated(Boolean vatCalculated) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartPromotionData cartPromotionData = (CartPromotionData) o;
    return Objects.equals(this.promotionGrn, cartPromotionData.promotionGrn) &&
        Objects.equals(this.type, cartPromotionData.type) &&
        Objects.equals(this.payload, cartPromotionData.payload) &&
        Objects.equals(this.cartItemIds, cartPromotionData.cartItemIds) &&
        Objects.equals(this.name, cartPromotionData.name) &&
        Objects.equals(this.description, cartPromotionData.description) &&
        Objects.equals(this.couponCode, cartPromotionData.couponCode) &&
        Objects.equals(this.discount, cartPromotionData.discount) &&
        Objects.equals(this.vatAmount, cartPromotionData.vatAmount) &&
        Objects.equals(this.vatPercentage, cartPromotionData.vatPercentage) &&
        Objects.equals(this.vatInaccurate, cartPromotionData.vatInaccurate) &&
        Objects.equals(this.vatCalculated, cartPromotionData.vatCalculated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionGrn, type, payload, cartItemIds, name, description, couponCode, discount, vatAmount, vatPercentage, vatInaccurate, vatCalculated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartPromotionData {\n");
    sb.append("    promotionGrn: ").append(toIndentedString(promotionGrn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    cartItemIds: ").append(toIndentedString(cartItemIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    vatInaccurate: ").append(toIndentedString(vatInaccurate)).append("\n");
    sb.append("    vatCalculated: ").append(toIndentedString(vatCalculated)).append("\n");
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
    openapiFields.add("promotionGrn");
    openapiFields.add("type");
    openapiFields.add("payload");
    openapiFields.add("cartItemIds");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("couponCode");
    openapiFields.add("discount");
    openapiFields.add("vatAmount");
    openapiFields.add("vatPercentage");
    openapiFields.add("vatInaccurate");
    openapiFields.add("vatCalculated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartPromotionData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartPromotionData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartPromotionData is not found in the empty JSON string", CartPromotionData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CartPromotionData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartPromotionData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("promotionGrn") != null && !jsonObj.get("promotionGrn").isJsonNull()) && !jsonObj.get("promotionGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotionGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotionGrn").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cartItemIds") != null && !jsonObj.get("cartItemIds").isJsonNull() && !jsonObj.get("cartItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cartItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("cartItemIds").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("couponCode") != null && !jsonObj.get("couponCode").isJsonNull()) && !jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("discount"));
      }
      // validate the optional field `vatAmount`
      if (jsonObj.get("vatAmount") != null && !jsonObj.get("vatAmount").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("vatAmount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartPromotionData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartPromotionData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartPromotionData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartPromotionData.class));

       return (TypeAdapter<T>) new TypeAdapter<CartPromotionData>() {
           @Override
           public void write(JsonWriter out, CartPromotionData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartPromotionData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartPromotionData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartPromotionData
  * @throws IOException if the JSON string is invalid with respect to CartPromotionData
  */
  public static CartPromotionData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartPromotionData.class);
  }

 /**
  * Convert an instance of CartPromotionData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

