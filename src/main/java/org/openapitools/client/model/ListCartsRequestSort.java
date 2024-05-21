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
import org.openapitools.client.model.CartSortOrder;
import org.openapitools.client.model.SortSortField;

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
 * ListCartsRequestSort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-21T15:21:28.271708366Z[Etc/UTC]")
public class ListCartsRequestSort {
  public static final String SERIALIZED_NAME_EVALUATION_ORDER = "evaluationOrder";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ORDER)
  private Long evaluationOrder;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private SortSortField field = SortSortField.UNKNOWN;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private CartSortOrder order = CartSortOrder.DESC;

  public ListCartsRequestSort() {
  }

  public ListCartsRequestSort evaluationOrder(Long evaluationOrder) {
    this.evaluationOrder = evaluationOrder;
    return this;
  }

   /**
   * evaluation_order is the order in which the sort will be applied. The lower the number, the earlier the sort will be applied.
   * @return evaluationOrder
  **/
  @javax.annotation.Nullable
  public Long getEvaluationOrder() {
    return evaluationOrder;
  }

  public void setEvaluationOrder(Long evaluationOrder) {
    this.evaluationOrder = evaluationOrder;
  }


  public ListCartsRequestSort field(SortSortField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  public SortSortField getField() {
    return field;
  }

  public void setField(SortSortField field) {
    this.field = field;
  }


  public ListCartsRequestSort order(CartSortOrder order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public CartSortOrder getOrder() {
    return order;
  }

  public void setOrder(CartSortOrder order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCartsRequestSort listCartsRequestSort = (ListCartsRequestSort) o;
    return Objects.equals(this.evaluationOrder, listCartsRequestSort.evaluationOrder) &&
        Objects.equals(this.field, listCartsRequestSort.field) &&
        Objects.equals(this.order, listCartsRequestSort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationOrder, field, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCartsRequestSort {\n");
    sb.append("    evaluationOrder: ").append(toIndentedString(evaluationOrder)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("evaluationOrder");
    openapiFields.add("field");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListCartsRequestSort
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListCartsRequestSort.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCartsRequestSort is not found in the empty JSON string", ListCartsRequestSort.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListCartsRequestSort.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCartsRequestSort` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `field`
      if (jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) {
        SortSortField.validateJsonElement(jsonObj.get("field"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        CartSortOrder.validateJsonElement(jsonObj.get("order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCartsRequestSort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCartsRequestSort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCartsRequestSort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCartsRequestSort.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCartsRequestSort>() {
           @Override
           public void write(JsonWriter out, ListCartsRequestSort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCartsRequestSort read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListCartsRequestSort given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListCartsRequestSort
  * @throws IOException if the JSON string is invalid with respect to ListCartsRequestSort
  */
  public static ListCartsRequestSort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCartsRequestSort.class);
  }

 /**
  * Convert an instance of ListCartsRequestSort to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
