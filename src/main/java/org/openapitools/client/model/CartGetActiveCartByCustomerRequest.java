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
import org.openapitools.client.model.CartCurrency;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Cart.JSON;

/**
 * CartGetActiveCartByCustomerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T10:43:10.860688922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CartGetActiveCartByCustomerRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CUSTOMER_GRN = "customerGrn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_GRN)
  private String customerGrn;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_MARKET = "market";
  @SerializedName(SERIALIZED_NAME_MARKET)
  private String market;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CartCurrency currency = CartCurrency.XXX;

  public CartGetActiveCartByCustomerRequest() {
  }

  public CartGetActiveCartByCustomerRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public CartGetActiveCartByCustomerRequest customerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
    return this;
  }

  /**
   * Get customerGrn
   * @return customerGrn
   */
  @javax.annotation.Nullable
  public String getCustomerGrn() {
    return customerGrn;
  }

  public void setCustomerGrn(String customerGrn) {
    this.customerGrn = customerGrn;
  }


  public CartGetActiveCartByCustomerRequest channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
   */
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  public CartGetActiveCartByCustomerRequest market(String market) {
    this.market = market;
    return this;
  }

  /**
   * Get market
   * @return market
   */
  @javax.annotation.Nullable
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }


  public CartGetActiveCartByCustomerRequest currency(CartCurrency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public CartCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(CartCurrency currency) {
    this.currency = currency;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CartGetActiveCartByCustomerRequest instance itself
   */
  public CartGetActiveCartByCustomerRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartGetActiveCartByCustomerRequest cartGetActiveCartByCustomerRequest = (CartGetActiveCartByCustomerRequest) o;
    return Objects.equals(this.tenantId, cartGetActiveCartByCustomerRequest.tenantId) &&
        Objects.equals(this.customerGrn, cartGetActiveCartByCustomerRequest.customerGrn) &&
        Objects.equals(this.channel, cartGetActiveCartByCustomerRequest.channel) &&
        Objects.equals(this.market, cartGetActiveCartByCustomerRequest.market) &&
        Objects.equals(this.currency, cartGetActiveCartByCustomerRequest.currency)&&
        Objects.equals(this.additionalProperties, cartGetActiveCartByCustomerRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, customerGrn, channel, market, currency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartGetActiveCartByCustomerRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerGrn: ").append(toIndentedString(customerGrn)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("customerGrn");
    openapiFields.add("channel");
    openapiFields.add("market");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CartGetActiveCartByCustomerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartGetActiveCartByCustomerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartGetActiveCartByCustomerRequest is not found in the empty JSON string", CartGetActiveCartByCustomerRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("customerGrn") != null && !jsonObj.get("customerGrn").isJsonNull()) && !jsonObj.get("customerGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerGrn").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("market") != null && !jsonObj.get("market").isJsonNull()) && !jsonObj.get("market").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `market` to be a primitive type in the JSON string but got `%s`", jsonObj.get("market").toString()));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        CartCurrency.validateJsonElement(jsonObj.get("currency"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartGetActiveCartByCustomerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartGetActiveCartByCustomerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartGetActiveCartByCustomerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartGetActiveCartByCustomerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CartGetActiveCartByCustomerRequest>() {
           @Override
           public void write(JsonWriter out, CartGetActiveCartByCustomerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CartGetActiveCartByCustomerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CartGetActiveCartByCustomerRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CartGetActiveCartByCustomerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CartGetActiveCartByCustomerRequest
   * @throws IOException if the JSON string is invalid with respect to CartGetActiveCartByCustomerRequest
   */
  public static CartGetActiveCartByCustomerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartGetActiveCartByCustomerRequest.class);
  }

  /**
   * Convert an instance of CartGetActiveCartByCustomerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

