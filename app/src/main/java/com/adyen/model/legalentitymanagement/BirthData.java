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
 * BirthData
 */

public class BirthData {
  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public BirthData() { 
  }

  public BirthData dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The individual&#39;s date of birth, in YYYY-MM-DD format.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The individual's date of birth, in YYYY-MM-DD format.")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BirthData birthData = (BirthData) o;
    return Objects.equals(this.dateOfBirth, birthData.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BirthData {\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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
    openapiFields.add("dateOfBirth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BirthData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BirthData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BirthData is not found in the empty JSON string", BirthData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BirthData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BirthData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field dateOfBirth
      if (jsonObj.get("dateOfBirth") != null && !jsonObj.get("dateOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfBirth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BirthData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BirthData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BirthData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BirthData.class));

       return (TypeAdapter<T>) new TypeAdapter<BirthData>() {
           @Override
           public void write(JsonWriter out, BirthData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BirthData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BirthData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BirthData
  * @throws IOException if the JSON string is invalid with respect to BirthData
  */
  public static BirthData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BirthData.class);
  }

 /**
  * Convert an instance of BirthData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

