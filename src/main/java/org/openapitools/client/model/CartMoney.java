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
 * CartMoney
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T15:21:28.271708366Z[Etc/UTC]")
public class CartMoney {
  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private String units;

  public static final String SERIALIZED_NAME_MICROS = "micros";
  @SerializedName(SERIALIZED_NAME_MICROS)
  private Integer micros;

  public CartMoney() {
  }

  public CartMoney units(String units) {
    this.units = units;
    return this;
  }

   /**
   * The whole units of the amount. For example if &#x60;currencyCode&#x60; is &#x60;\&quot;USD\&quot;&#x60;, then 1 unit is one US dollar.
   * @return units
  **/
  @javax.annotation.Nullable
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  public CartMoney micros(Integer micros) {
    this.micros = micros;
    return this;
  }

   /**
   * Number of micro (10^-6) units of the amount. The value must be between -999,999 and +999,999 inclusive. If &#x60;units&#x60; is positive, &#x60;micros&#x60; must be positive or zero. If &#x60;units&#x60; is zero, &#x60;micros&#x60; can be positive, zero, or negative. If &#x60;units&#x60; is negative, &#x60;micros&#x60; must be negative or zero. For example $-1.75 is represented as &#x60;units&#x60;&#x3D;-1 and &#x60;micros&#x60;&#x3D;-750,000.
   * @return micros
  **/
  @javax.annotation.Nullable
  public Integer getMicros() {
    return micros;
  }

  public void setMicros(Integer micros) {
    this.micros = micros;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartMoney cartMoney = (CartMoney) o;
    return Objects.equals(this.units, cartMoney.units) &&
        Objects.equals(this.micros, cartMoney.micros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, micros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartMoney {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    micros: ").append(toIndentedString(micros)).append("\n");
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
    openapiFields.add("units");
    openapiFields.add("micros");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CartMoney
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartMoney.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartMoney is not found in the empty JSON string", CartMoney.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CartMoney.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartMoney` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("units") != null && !jsonObj.get("units").isJsonNull()) && !jsonObj.get("units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("units").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartMoney.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartMoney' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartMoney> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartMoney.class));

       return (TypeAdapter<T>) new TypeAdapter<CartMoney>() {
           @Override
           public void write(JsonWriter out, CartMoney value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartMoney read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartMoney given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartMoney
  * @throws IOException if the JSON string is invalid with respect to CartMoney
  */
  public static CartMoney fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartMoney.class);
  }

 /**
  * Convert an instance of CartMoney to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
