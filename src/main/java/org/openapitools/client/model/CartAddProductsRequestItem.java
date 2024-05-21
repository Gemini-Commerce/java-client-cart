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
import org.openapitools.client.model.CartProductConfigurationSelection;

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
 * CartAddProductsRequestItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T15:21:28.271708366Z[Etc/UTC]")
public class CartAddProductsRequestItem {
  public static final String SERIALIZED_NAME_PRODUCT_GRN = "productGrn";
  @SerializedName(SERIALIZED_NAME_PRODUCT_GRN)
  private String productGrn;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public static final String SERIALIZED_NAME_CONFIGURATION_SELECTIONS = "configurationSelections";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_SELECTIONS)
  private List<CartProductConfigurationSelection> configurationSelections;

  public CartAddProductsRequestItem() {
  }

  public CartAddProductsRequestItem productGrn(String productGrn) {
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


  public CartAddProductsRequestItem quantity(Long quantity) {
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


  public CartAddProductsRequestItem configurationSelections(List<CartProductConfigurationSelection> configurationSelections) {
    this.configurationSelections = configurationSelections;
    return this;
  }

  public CartAddProductsRequestItem addConfigurationSelectionsItem(CartProductConfigurationSelection configurationSelectionsItem) {
    if (this.configurationSelections == null) {
      this.configurationSelections = new ArrayList<>();
    }
    this.configurationSelections.add(configurationSelectionsItem);
    return this;
  }

   /**
   * Get configurationSelections
   * @return configurationSelections
  **/
  @javax.annotation.Nullable
  public List<CartProductConfigurationSelection> getConfigurationSelections() {
    return configurationSelections;
  }

  public void setConfigurationSelections(List<CartProductConfigurationSelection> configurationSelections) {
    this.configurationSelections = configurationSelections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartAddProductsRequestItem cartAddProductsRequestItem = (CartAddProductsRequestItem) o;
    return Objects.equals(this.productGrn, cartAddProductsRequestItem.productGrn) &&
        Objects.equals(this.quantity, cartAddProductsRequestItem.quantity) &&
        Objects.equals(this.configurationSelections, cartAddProductsRequestItem.configurationSelections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productGrn, quantity, configurationSelections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartAddProductsRequestItem {\n");
    sb.append("    productGrn: ").append(toIndentedString(productGrn)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    configurationSelections: ").append(toIndentedString(configurationSelections)).append("\n");
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
    openapiFields.add("productGrn");
    openapiFields.add("quantity");
    openapiFields.add("configurationSelections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartAddProductsRequestItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartAddProductsRequestItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartAddProductsRequestItem is not found in the empty JSON string", CartAddProductsRequestItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CartAddProductsRequestItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartAddProductsRequestItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("productGrn") != null && !jsonObj.get("productGrn").isJsonNull()) && !jsonObj.get("productGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productGrn").toString()));
      }
      if (jsonObj.get("configurationSelections") != null && !jsonObj.get("configurationSelections").isJsonNull()) {
        JsonArray jsonArrayconfigurationSelections = jsonObj.getAsJsonArray("configurationSelections");
        if (jsonArrayconfigurationSelections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configurationSelections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configurationSelections` to be an array in the JSON string but got `%s`", jsonObj.get("configurationSelections").toString()));
          }

          // validate the optional field `configurationSelections` (array)
          for (int i = 0; i < jsonArrayconfigurationSelections.size(); i++) {
            CartProductConfigurationSelection.validateJsonElement(jsonArrayconfigurationSelections.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartAddProductsRequestItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartAddProductsRequestItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartAddProductsRequestItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartAddProductsRequestItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CartAddProductsRequestItem>() {
           @Override
           public void write(JsonWriter out, CartAddProductsRequestItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartAddProductsRequestItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartAddProductsRequestItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartAddProductsRequestItem
  * @throws IOException if the JSON string is invalid with respect to CartAddProductsRequestItem
  */
  public static CartAddProductsRequestItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartAddProductsRequestItem.class);
  }

 /**
  * Convert an instance of CartAddProductsRequestItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

