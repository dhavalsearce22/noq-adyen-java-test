/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
import java.util.List;

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

import com.adyen.model.balanceplatform.JSON;

/**
 * BrandVariantsRestriction
 */

public class BrandVariantsRestriction {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<String> value = null;

  public BrandVariantsRestriction() { 
  }

  public BrandVariantsRestriction operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Defines how the condition must be evaluated.
   * @return operation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines how the condition must be evaluated.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public BrandVariantsRestriction value(List<String> value) {
    
    this.value = value;
    return this;
  }

  public BrandVariantsRestriction addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * List of card brand variants.  Possible values:   - **mc**, **mccredit**, **mccommercialcredit_b2b**, **mcdebit**, **mcbusinessdebit**, **mcbusinessworlddebit**, **mcprepaid**, **mcmaestro**   - **visa**, **visacredit**, **visadebit**, **visaprepaid**.  You can specify a rule for a generic variant. For example, to create a rule for all Mastercard payment instruments, use **mc**. The rule is applied to all payment instruments under **mc**, such as **mcbusinessdebit** and **mcdebit**.  
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of card brand variants.  Possible values:   - **mc**, **mccredit**, **mccommercialcredit_b2b**, **mcdebit**, **mcbusinessdebit**, **mcbusinessworlddebit**, **mcprepaid**, **mcmaestro**   - **visa**, **visacredit**, **visadebit**, **visaprepaid**.  You can specify a rule for a generic variant. For example, to create a rule for all Mastercard payment instruments, use **mc**. The rule is applied to all payment instruments under **mc**, such as **mcbusinessdebit** and **mcdebit**.  ")

  public List<String> getValue() {
    return value;
  }


  public void setValue(List<String> value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandVariantsRestriction brandVariantsRestriction = (BrandVariantsRestriction) o;
    return Objects.equals(this.operation, brandVariantsRestriction.operation) &&
        Objects.equals(this.value, brandVariantsRestriction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandVariantsRestriction {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BrandVariantsRestriction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BrandVariantsRestriction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrandVariantsRestriction is not found in the empty JSON string", BrandVariantsRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BrandVariantsRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrandVariantsRestriction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BrandVariantsRestriction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field operation
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandVariantsRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandVariantsRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandVariantsRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandVariantsRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandVariantsRestriction>() {
           @Override
           public void write(JsonWriter out, BrandVariantsRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandVariantsRestriction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandVariantsRestriction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandVariantsRestriction
  * @throws IOException if the JSON string is invalid with respect to BrandVariantsRestriction
  */
  public static BrandVariantsRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandVariantsRestriction.class);
  }

 /**
  * Convert an instance of BrandVariantsRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

