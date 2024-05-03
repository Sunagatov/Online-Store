/*
 * Iced Latte Payment API
 * API for accessing payment and related operations in the Iced-Latte platform
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: zufar.sunagatov@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateCardDetailsTokenRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-03T11:21:37.753181100+02:00[Europe/Budapest]")
public class CreateCardDetailsTokenRequest {
  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_EXP_MONTH = "expMonth";
  @SerializedName(SERIALIZED_NAME_EXP_MONTH)
  private String expMonth;

  public static final String SERIALIZED_NAME_EXP_YEAR = "expYear";
  @SerializedName(SERIALIZED_NAME_EXP_YEAR)
  private String expYear;

  public static final String SERIALIZED_NAME_CVC = "cvc";
  @SerializedName(SERIALIZED_NAME_CVC)
  private String cvc;

  public CreateCardDetailsTokenRequest() {
  }

  public CreateCardDetailsTokenRequest cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public CreateCardDetailsTokenRequest expMonth(String expMonth) {
    
    this.expMonth = expMonth;
    return this;
  }

   /**
   * Get expMonth
   * @return expMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpMonth() {
    return expMonth;
  }


  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }


  public CreateCardDetailsTokenRequest expYear(String expYear) {
    
    this.expYear = expYear;
    return this;
  }

   /**
   * Get expYear
   * @return expYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpYear() {
    return expYear;
  }


  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }


  public CreateCardDetailsTokenRequest cvc(String cvc) {
    
    this.cvc = cvc;
    return this;
  }

   /**
   * Get cvc
   * @return cvc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCvc() {
    return cvc;
  }


  public void setCvc(String cvc) {
    this.cvc = cvc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardDetailsTokenRequest createCardDetailsTokenRequest = (CreateCardDetailsTokenRequest) o;
    return Objects.equals(this.cardNumber, createCardDetailsTokenRequest.cardNumber) &&
        Objects.equals(this.expMonth, createCardDetailsTokenRequest.expMonth) &&
        Objects.equals(this.expYear, createCardDetailsTokenRequest.expYear) &&
        Objects.equals(this.cvc, createCardDetailsTokenRequest.cvc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, expMonth, expYear, cvc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardDetailsTokenRequest {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
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
    openapiFields.add("cardNumber");
    openapiFields.add("expMonth");
    openapiFields.add("expYear");
    openapiFields.add("cvc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCardDetailsTokenRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCardDetailsTokenRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCardDetailsTokenRequest is not found in the empty JSON string", CreateCardDetailsTokenRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCardDetailsTokenRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCardDetailsTokenRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cardNumber") != null && !jsonObj.get("cardNumber").isJsonNull()) && !jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
      if ((jsonObj.get("expMonth") != null && !jsonObj.get("expMonth").isJsonNull()) && !jsonObj.get("expMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expMonth").toString()));
      }
      if ((jsonObj.get("expYear") != null && !jsonObj.get("expYear").isJsonNull()) && !jsonObj.get("expYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expYear").toString()));
      }
      if ((jsonObj.get("cvc") != null && !jsonObj.get("cvc").isJsonNull()) && !jsonObj.get("cvc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCardDetailsTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCardDetailsTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCardDetailsTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCardDetailsTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCardDetailsTokenRequest>() {
           @Override
           public void write(JsonWriter out, CreateCardDetailsTokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCardDetailsTokenRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCardDetailsTokenRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCardDetailsTokenRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCardDetailsTokenRequest
  */
  public static CreateCardDetailsTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCardDetailsTokenRequest.class);
  }

 /**
  * Convert an instance of CreateCardDetailsTokenRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

