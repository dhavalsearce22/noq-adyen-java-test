/*
 * Adyen BinLookup API
 *
 * The version of the OpenAPI document: 52
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.adyen.model.binlookup.JSON;

/**
 * ThreeDSAvailabilityRequest
 */

public class ThreeDSAvailabilityRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<String> brands = null;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public ThreeDSAvailabilityRequest() { 
  }

  public ThreeDSAvailabilityRequest additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public ThreeDSAvailabilityRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular request.  The `additionalData` object consists of entries, each of which includes the key and value.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public ThreeDSAvailabilityRequest brands(List<String> brands) {
    
    this.brands = brands;
    return this;
  }

  public ThreeDSAvailabilityRequest addBrandsItem(String brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * List of brands.
   * @return brands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of brands.")

  public List<String> getBrands() {
    return brands;
  }


  public void setBrands(List<String> brands) {
    this.brands = brands;
  }


  public ThreeDSAvailabilityRequest cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Card number or BIN.
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card number or BIN.")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public ThreeDSAvailabilityRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier.
   * @return merchantAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The merchant account identifier.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public ThreeDSAvailabilityRequest recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * A recurring detail reference corresponding to a card.
   * @return recurringDetailReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A recurring detail reference corresponding to a card.")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public ThreeDSAvailabilityRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The shopper&#39;s reference to uniquely identify this shopper (e.g. user ID or account ID).
   * @return shopperReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shopper's reference to uniquely identify this shopper (e.g. user ID or account ID).")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSAvailabilityRequest threeDSAvailabilityRequest = (ThreeDSAvailabilityRequest) o;
    return Objects.equals(this.additionalData, threeDSAvailabilityRequest.additionalData) &&
        Objects.equals(this.brands, threeDSAvailabilityRequest.brands) &&
        Objects.equals(this.cardNumber, threeDSAvailabilityRequest.cardNumber) &&
        Objects.equals(this.merchantAccount, threeDSAvailabilityRequest.merchantAccount) &&
        Objects.equals(this.recurringDetailReference, threeDSAvailabilityRequest.recurringDetailReference) &&
        Objects.equals(this.shopperReference, threeDSAvailabilityRequest.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, brands, cardNumber, merchantAccount, recurringDetailReference, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSAvailabilityRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
    openapiFields.add("additionalData");
    openapiFields.add("brands");
    openapiFields.add("cardNumber");
    openapiFields.add("merchantAccount");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("shopperReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDSAvailabilityRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDSAvailabilityRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDSAvailabilityRequest is not found in the empty JSON string", ThreeDSAvailabilityRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDSAvailabilityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDSAvailabilityRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ThreeDSAvailabilityRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("brands") != null && !jsonObj.get("brands").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `brands` to be an array in the JSON string but got `%s`", jsonObj.get("brands").toString()));
      }
      // validate the optional field cardNumber
      if (jsonObj.get("cardNumber") != null && !jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDSAvailabilityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDSAvailabilityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDSAvailabilityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDSAvailabilityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDSAvailabilityRequest>() {
           @Override
           public void write(JsonWriter out, ThreeDSAvailabilityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDSAvailabilityRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDSAvailabilityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDSAvailabilityRequest
  * @throws IOException if the JSON string is invalid with respect to ThreeDSAvailabilityRequest
  */
  public static ThreeDSAvailabilityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDSAvailabilityRequest.class);
  }

 /**
  * Convert an instance of ThreeDSAvailabilityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
