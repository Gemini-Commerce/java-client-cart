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
import org.openapitools.client.model.CartLocalizedText;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.Cart.JSON;

/**
 * CartPaymentData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T10:43:10.860688922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CartPaymentData {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private CartLocalizedText title;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private CartMoney fee;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private CartMoney amount;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private CartLocalizedText label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private CartLocalizedText description;

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

  public static final String SERIALIZED_NAME_IS_UPFRONT = "isUpfront";
  @SerializedName(SERIALIZED_NAME_IS_UPFRONT)
  private Boolean isUpfront;

  public CartPaymentData() {
  }

  public CartPaymentData code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public CartPaymentData title(CartLocalizedText title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public CartLocalizedText getTitle() {
    return title;
  }

  public void setTitle(CartLocalizedText title) {
    this.title = title;
  }


  public CartPaymentData payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nullable
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  public CartPaymentData fee(CartMoney fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
   */
  @javax.annotation.Nullable
  public CartMoney getFee() {
    return fee;
  }

  public void setFee(CartMoney fee) {
    this.fee = fee;
  }


  public CartPaymentData amount(CartMoney amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  public CartMoney getAmount() {
    return amount;
  }

  public void setAmount(CartMoney amount) {
    this.amount = amount;
  }


  public CartPaymentData label(CartLocalizedText label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public CartLocalizedText getLabel() {
    return label;
  }

  public void setLabel(CartLocalizedText label) {
    this.label = label;
  }


  public CartPaymentData description(CartLocalizedText description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public CartLocalizedText getDescription() {
    return description;
  }

  public void setDescription(CartLocalizedText description) {
    this.description = description;
  }


  public CartPaymentData vatAmount(CartMoney vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

  /**
   * Get vatAmount
   * @return vatAmount
   */
  @javax.annotation.Nullable
  public CartMoney getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(CartMoney vatAmount) {
    this.vatAmount = vatAmount;
  }


  public CartPaymentData vatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
    return this;
  }

  /**
   * Get vatPercentage
   * @return vatPercentage
   */
  @javax.annotation.Nullable
  public Float getVatPercentage() {
    return vatPercentage;
  }

  public void setVatPercentage(Float vatPercentage) {
    this.vatPercentage = vatPercentage;
  }


  public CartPaymentData vatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
    return this;
  }

  /**
   * Get vatInaccurate
   * @return vatInaccurate
   */
  @javax.annotation.Nullable
  public Boolean getVatInaccurate() {
    return vatInaccurate;
  }

  public void setVatInaccurate(Boolean vatInaccurate) {
    this.vatInaccurate = vatInaccurate;
  }


  public CartPaymentData vatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
    return this;
  }

  /**
   * Get vatCalculated
   * @return vatCalculated
   */
  @javax.annotation.Nullable
  public Boolean getVatCalculated() {
    return vatCalculated;
  }

  public void setVatCalculated(Boolean vatCalculated) {
    this.vatCalculated = vatCalculated;
  }


  public CartPaymentData isUpfront(Boolean isUpfront) {
    this.isUpfront = isUpfront;
    return this;
  }

  /**
   * Get isUpfront
   * @return isUpfront
   */
  @javax.annotation.Nullable
  public Boolean getIsUpfront() {
    return isUpfront;
  }

  public void setIsUpfront(Boolean isUpfront) {
    this.isUpfront = isUpfront;
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
   * @return the CartPaymentData instance itself
   */
  public CartPaymentData putAdditionalProperty(String key, Object value) {
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
    CartPaymentData cartPaymentData = (CartPaymentData) o;
    return Objects.equals(this.code, cartPaymentData.code) &&
        Objects.equals(this.title, cartPaymentData.title) &&
        Objects.equals(this.payload, cartPaymentData.payload) &&
        Objects.equals(this.fee, cartPaymentData.fee) &&
        Objects.equals(this.amount, cartPaymentData.amount) &&
        Objects.equals(this.label, cartPaymentData.label) &&
        Objects.equals(this.description, cartPaymentData.description) &&
        Objects.equals(this.vatAmount, cartPaymentData.vatAmount) &&
        Objects.equals(this.vatPercentage, cartPaymentData.vatPercentage) &&
        Objects.equals(this.vatInaccurate, cartPaymentData.vatInaccurate) &&
        Objects.equals(this.vatCalculated, cartPaymentData.vatCalculated) &&
        Objects.equals(this.isUpfront, cartPaymentData.isUpfront)&&
        Objects.equals(this.additionalProperties, cartPaymentData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, payload, fee, amount, label, description, vatAmount, vatPercentage, vatInaccurate, vatCalculated, isUpfront, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartPaymentData {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatPercentage: ").append(toIndentedString(vatPercentage)).append("\n");
    sb.append("    vatInaccurate: ").append(toIndentedString(vatInaccurate)).append("\n");
    sb.append("    vatCalculated: ").append(toIndentedString(vatCalculated)).append("\n");
    sb.append("    isUpfront: ").append(toIndentedString(isUpfront)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("title");
    openapiFields.add("payload");
    openapiFields.add("fee");
    openapiFields.add("amount");
    openapiFields.add("label");
    openapiFields.add("description");
    openapiFields.add("vatAmount");
    openapiFields.add("vatPercentage");
    openapiFields.add("vatInaccurate");
    openapiFields.add("vatCalculated");
    openapiFields.add("isUpfront");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CartPaymentData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CartPaymentData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartPaymentData is not found in the empty JSON string", CartPaymentData.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        CartLocalizedText.validateJsonElement(jsonObj.get("title"));
      }
      if ((jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      // validate the optional field `fee`
      if (jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("fee"));
      }
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        CartMoney.validateJsonElement(jsonObj.get("amount"));
      }
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        CartLocalizedText.validateJsonElement(jsonObj.get("label"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        CartLocalizedText.validateJsonElement(jsonObj.get("description"));
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
       if (!CartPaymentData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartPaymentData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartPaymentData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartPaymentData.class));

       return (TypeAdapter<T>) new TypeAdapter<CartPaymentData>() {
           @Override
           public void write(JsonWriter out, CartPaymentData value) throws IOException {
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
           public CartPaymentData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CartPaymentData instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CartPaymentData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CartPaymentData
   * @throws IOException if the JSON string is invalid with respect to CartPaymentData
   */
  public static CartPaymentData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartPaymentData.class);
  }

  /**
   * Convert an instance of CartPaymentData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

