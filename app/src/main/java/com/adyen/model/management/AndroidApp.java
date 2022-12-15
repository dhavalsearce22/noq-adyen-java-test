/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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

import com.adyen.model.management.JSON;

/**
 * AndroidApp
 */

public class AndroidApp {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "packageName";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VERSION_CODE = "versionCode";
  @SerializedName(SERIALIZED_NAME_VERSION_CODE)
  private Integer versionCode;

  public static final String SERIALIZED_NAME_VERSION_NAME = "versionName";
  @SerializedName(SERIALIZED_NAME_VERSION_NAME)
  private String versionName;

  public AndroidApp() { 
  }

  public AndroidApp description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description that was provided when uploading the app. The description is not shown on the terminal.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description that was provided when uploading the app. The description is not shown on the terminal.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AndroidApp id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the app.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of the app.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AndroidApp label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The app name that is shown on the terminal.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app name that is shown on the terminal.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public AndroidApp packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * The package name of the app.
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The package name of the app.")

  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public AndroidApp status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the app. Possible values:  * &#x60;processing&#x60;: The app is being signed and converted to a format that the terminal can handle. * &#x60;error&#x60;: Something went wrong. Check that the app matches the [requirements](https://docs.adyen.com/point-of-sale/android-terminals/app-requirements). * &#x60;invalid&#x60;: There is something wrong with the APK file of the app. * &#x60;ready&#x60;: The app has been signed and converted. * &#x60;archived&#x60;: The app is no longer available.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The status of the app. Possible values:  * `processing`: The app is being signed and converted to a format that the terminal can handle. * `error`: Something went wrong. Check that the app matches the [requirements](https://docs.adyen.com/point-of-sale/android-terminals/app-requirements). * `invalid`: There is something wrong with the APK file of the app. * `ready`: The app has been signed and converted. * `archived`: The app is no longer available.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AndroidApp versionCode(Integer versionCode) {
    
    this.versionCode = versionCode;
    return this;
  }

   /**
   * The internal version number of the app.
   * @return versionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The internal version number of the app.")

  public Integer getVersionCode() {
    return versionCode;
  }


  public void setVersionCode(Integer versionCode) {
    this.versionCode = versionCode;
  }


  public AndroidApp versionName(String versionName) {
    
    this.versionName = versionName;
    return this;
  }

   /**
   * The app version number that is shown on the terminal.
   * @return versionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The app version number that is shown on the terminal.")

  public String getVersionName() {
    return versionName;
  }


  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AndroidApp androidApp = (AndroidApp) o;
    return Objects.equals(this.description, androidApp.description) &&
        Objects.equals(this.id, androidApp.id) &&
        Objects.equals(this.label, androidApp.label) &&
        Objects.equals(this.packageName, androidApp.packageName) &&
        Objects.equals(this.status, androidApp.status) &&
        Objects.equals(this.versionCode, androidApp.versionCode) &&
        Objects.equals(this.versionName, androidApp.versionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, label, packageName, status, versionCode, versionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AndroidApp {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("label");
    openapiFields.add("packageName");
    openapiFields.add("status");
    openapiFields.add("versionCode");
    openapiFields.add("versionName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AndroidApp
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AndroidApp.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AndroidApp is not found in the empty JSON string", AndroidApp.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AndroidApp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AndroidApp` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AndroidApp.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field label
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field packageName
      if (jsonObj.get("packageName") != null && !jsonObj.get("packageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageName").toString()));
      }
      // validate the optional field status
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field versionName
      if (jsonObj.get("versionName") != null && !jsonObj.get("versionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AndroidApp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AndroidApp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AndroidApp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AndroidApp.class));

       return (TypeAdapter<T>) new TypeAdapter<AndroidApp>() {
           @Override
           public void write(JsonWriter out, AndroidApp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AndroidApp read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AndroidApp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AndroidApp
  * @throws IOException if the JSON string is invalid with respect to AndroidApp
  */
  public static AndroidApp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AndroidApp.class);
  }

 /**
  * Convert an instance of AndroidApp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

