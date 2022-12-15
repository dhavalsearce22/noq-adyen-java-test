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
 * CostEstimateAssumptions
 */

public class CostEstimateAssumptions {
  public static final String SERIALIZED_NAME_ASSUME3_D_SECURE_AUTHENTICATED = "assume3DSecureAuthenticated";
  @SerializedName(SERIALIZED_NAME_ASSUME3_D_SECURE_AUTHENTICATED)
  private Boolean assume3DSecureAuthenticated;

  public static final String SERIALIZED_NAME_ASSUME_LEVEL3_DATA = "assumeLevel3Data";
  @SerializedName(SERIALIZED_NAME_ASSUME_LEVEL3_DATA)
  private Boolean assumeLevel3Data;

  public static final String SERIALIZED_NAME_INSTALLMENTS = "installments";
  @SerializedName(SERIALIZED_NAME_INSTALLMENTS)
  private Integer installments;

  public CostEstimateAssumptions() { 
  }

  public CostEstimateAssumptions assume3DSecureAuthenticated(Boolean assume3DSecureAuthenticated) {
    
    this.assume3DSecureAuthenticated = assume3DSecureAuthenticated;
    return this;
  }

   /**
   * If true, the cardholder is expected to successfully authorise via 3D Secure.
   * @return assume3DSecureAuthenticated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the cardholder is expected to successfully authorise via 3D Secure.")

  public Boolean getAssume3DSecureAuthenticated() {
    return assume3DSecureAuthenticated;
  }


  public void setAssume3DSecureAuthenticated(Boolean assume3DSecureAuthenticated) {
    this.assume3DSecureAuthenticated = assume3DSecureAuthenticated;
  }


  public CostEstimateAssumptions assumeLevel3Data(Boolean assumeLevel3Data) {
    
    this.assumeLevel3Data = assumeLevel3Data;
    return this;
  }

   /**
   * If true, the transaction is expected to have valid Level 3 data.
   * @return assumeLevel3Data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the transaction is expected to have valid Level 3 data.")

  public Boolean getAssumeLevel3Data() {
    return assumeLevel3Data;
  }


  public void setAssumeLevel3Data(Boolean assumeLevel3Data) {
    this.assumeLevel3Data = assumeLevel3Data;
  }


  public CostEstimateAssumptions installments(Integer installments) {
    
    this.installments = installments;
    return this;
  }

   /**
   * If not zero, the number of installments.
   * @return installments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not zero, the number of installments.")

  public Integer getInstallments() {
    return installments;
  }


  public void setInstallments(Integer installments) {
    this.installments = installments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostEstimateAssumptions costEstimateAssumptions = (CostEstimateAssumptions) o;
    return Objects.equals(this.assume3DSecureAuthenticated, costEstimateAssumptions.assume3DSecureAuthenticated) &&
        Objects.equals(this.assumeLevel3Data, costEstimateAssumptions.assumeLevel3Data) &&
        Objects.equals(this.installments, costEstimateAssumptions.installments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assume3DSecureAuthenticated, assumeLevel3Data, installments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimateAssumptions {\n");
    sb.append("    assume3DSecureAuthenticated: ").append(toIndentedString(assume3DSecureAuthenticated)).append("\n");
    sb.append("    assumeLevel3Data: ").append(toIndentedString(assumeLevel3Data)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
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
    openapiFields.add("assume3DSecureAuthenticated");
    openapiFields.add("assumeLevel3Data");
    openapiFields.add("installments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CostEstimateAssumptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CostEstimateAssumptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CostEstimateAssumptions is not found in the empty JSON string", CostEstimateAssumptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CostEstimateAssumptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CostEstimateAssumptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CostEstimateAssumptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CostEstimateAssumptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CostEstimateAssumptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CostEstimateAssumptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CostEstimateAssumptions>() {
           @Override
           public void write(JsonWriter out, CostEstimateAssumptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CostEstimateAssumptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CostEstimateAssumptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CostEstimateAssumptions
  * @throws IOException if the JSON string is invalid with respect to CostEstimateAssumptions
  */
  public static CostEstimateAssumptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CostEstimateAssumptions.class);
  }

 /**
  * Convert an instance of CostEstimateAssumptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
