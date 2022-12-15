/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * SourceOfFunds
 */

public class SourceOfFunds {
  public static final String SERIALIZED_NAME_ACQUIRING_BUSINESS_LINE_ID = "acquiringBusinessLineId";
  @SerializedName(SERIALIZED_NAME_ACQUIRING_BUSINESS_LINE_ID)
  private String acquiringBusinessLineId;

  public static final String SERIALIZED_NAME_ADYEN_PROCESSED_FUNDS = "adyenProcessedFunds";
  @SerializedName(SERIALIZED_NAME_ADYEN_PROCESSED_FUNDS)
  private Boolean adyenProcessedFunds;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The type of the source of funds. Possible value: **business**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BUSINESS("business");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public SourceOfFunds() { 
  }

  public SourceOfFunds acquiringBusinessLineId(String acquiringBusinessLineId) {
    
    this.acquiringBusinessLineId = acquiringBusinessLineId;
    return this;
  }

   /**
   * The unique identifier of the business line that will be the source of funds.This must be a business line for a **receivePayments** or **receiveFromPlatformPayments** capability. Required when &#x60;adyenProcessedFunds&#x60; is **true**.
   * @return acquiringBusinessLineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the business line that will be the source of funds.This must be a business line for a **receivePayments** or **receiveFromPlatformPayments** capability. Required when `adyenProcessedFunds` is **true**.")

  public String getAcquiringBusinessLineId() {
    return acquiringBusinessLineId;
  }


  public void setAcquiringBusinessLineId(String acquiringBusinessLineId) {
    this.acquiringBusinessLineId = acquiringBusinessLineId;
  }


  public SourceOfFunds adyenProcessedFunds(Boolean adyenProcessedFunds) {
    
    this.adyenProcessedFunds = adyenProcessedFunds;
    return this;
  }

   /**
   * Indicates whether the funds are coming from transactions processed by Adyen.   - If **true**, the &#x60;acquiringBusinessLineId&#x60; is required.   - If **false**, a &#x60;description&#x60; is required.
   * @return adyenProcessedFunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the funds are coming from transactions processed by Adyen.   - If **true**, the `acquiringBusinessLineId` is required.   - If **false**, a `description` is required.")

  public Boolean getAdyenProcessedFunds() {
    return adyenProcessedFunds;
  }


  public void setAdyenProcessedFunds(Boolean adyenProcessedFunds) {
    this.adyenProcessedFunds = adyenProcessedFunds;
  }


  public SourceOfFunds description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Text describing the source of funds. For example, for &#x60;type&#x60; **business**, provide a description of the business. Required when &#x60;adyenProcessedFunds&#x60; is **false**.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text describing the source of funds. For example, for `type` **business**, provide a description of the business. Required when `adyenProcessedFunds` is **false**.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SourceOfFunds type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the source of funds. Possible value: **business**.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the source of funds. Possible value: **business**.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceOfFunds sourceOfFunds = (SourceOfFunds) o;
    return Objects.equals(this.acquiringBusinessLineId, sourceOfFunds.acquiringBusinessLineId) &&
        Objects.equals(this.adyenProcessedFunds, sourceOfFunds.adyenProcessedFunds) &&
        Objects.equals(this.description, sourceOfFunds.description) &&
        Objects.equals(this.type, sourceOfFunds.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquiringBusinessLineId, adyenProcessedFunds, description, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceOfFunds {\n");
    sb.append("    acquiringBusinessLineId: ").append(toIndentedString(acquiringBusinessLineId)).append("\n");
    sb.append("    adyenProcessedFunds: ").append(toIndentedString(adyenProcessedFunds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("acquiringBusinessLineId");
    openapiFields.add("adyenProcessedFunds");
    openapiFields.add("description");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceOfFunds
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SourceOfFunds.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceOfFunds is not found in the empty JSON string", SourceOfFunds.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SourceOfFunds.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceOfFunds` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field acquiringBusinessLineId
      if (jsonObj.get("acquiringBusinessLineId") != null && !jsonObj.get("acquiringBusinessLineId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acquiringBusinessLineId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acquiringBusinessLineId").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceOfFunds.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceOfFunds' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceOfFunds> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceOfFunds.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceOfFunds>() {
           @Override
           public void write(JsonWriter out, SourceOfFunds value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceOfFunds read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SourceOfFunds given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceOfFunds
  * @throws IOException if the JSON string is invalid with respect to SourceOfFunds
  */
  public static SourceOfFunds fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceOfFunds.class);
  }

 /**
  * Convert an instance of SourceOfFunds to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

