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
import java.util.Arrays;
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
 * CartItemCustomPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T15:21:28.271708366Z[Etc/UTC]")
public class CartItemCustomPrice {
  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CartMoney price;

  public static final String SERIALIZED_NAME_PREVIOUS_PRICE = "previousPrice";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PRICE)
  private CartMoney previousPrice;

  public CartItemCustomPrice() {
  }

  public CartItemCustomPrice price(CartMoney price) {
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


  public CartItemCustomPrice previousPrice(CartMoney previousPrice) {
    this.previousPrice = previousPrice;
    return this;
  }

   /**
   * Get previousPrice
   * @return previousPrice
  **/
  @javax.annotation.Nullable
  public CartMoney getPreviousPrice() {
    return previousPrice;
  }

  public void setPreviousPrice(CartMoney previousPrice) {
    this.previousPrice = previousPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemCustomPrice cartItemCustomPrice = (CartItemCustomPrice) o;
    return Objects.equals(this.price, cartItemCustomPrice.price) &&
        Objects.equals(this.previousPrice, cartItemCustomPrice.previousPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, previousPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemCustomPrice {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    previousPrice: ").append(toIndentedString(previousPrice)).append("\n");
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
    openapiFields.add("price");
    openapiFields.add("previousPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartItemCustomPrice
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartItemCustomPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartItemCustomPrice is not found in the empty JSON string", CartItemCustomPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CartItemCustomPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartItemCustomPrice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("price"));
      }
      // validate the optional field `previousPrice`
      if (jsonObj.get("previousPrice") != null && !jsonObj.get("previousPrice").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("previousPrice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartItemCustomPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartItemCustomPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartItemCustomPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartItemCustomPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<CartItemCustomPrice>() {
           @Override
           public void write(JsonWriter out, CartItemCustomPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartItemCustomPrice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartItemCustomPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartItemCustomPrice
  * @throws IOException if the JSON string is invalid with respect to CartItemCustomPrice
  */
  public static CartItemCustomPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartItemCustomPrice.class);
  }

 /**
  * Convert an instance of CartItemCustomPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
