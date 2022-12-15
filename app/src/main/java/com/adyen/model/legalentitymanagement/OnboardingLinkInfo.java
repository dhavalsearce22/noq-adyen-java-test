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
 * OnboardingLinkInfo
 */

public class OnboardingLinkInfo {
  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_THEME_ID = "themeId";
  @SerializedName(SERIALIZED_NAME_THEME_ID)
  private String themeId;

  public OnboardingLinkInfo() { 
  }

  public OnboardingLinkInfo locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * The language that will be used for the page, specified by a combination of two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language and [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. Possible values: **cs-CZ**, **de-DE**, **en-US**, **es-ES**, **it-IT**, **nl-NL**, **no-NO**, **pl-PL**, **pt-PT**, **sv-SE**.   If not specified in the request or if the language is not supported, the page uses the browser language. If the browser language is not supported, the page uses **en-US** by default.
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language that will be used for the page, specified by a combination of two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language and [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. Possible values: **cs-CZ**, **de-DE**, **en-US**, **es-ES**, **it-IT**, **nl-NL**, **no-NO**, **pl-PL**, **pt-PT**, **sv-SE**.   If not specified in the request or if the language is not supported, the page uses the browser language. If the browser language is not supported, the page uses **en-US** by default.")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public OnboardingLinkInfo redirectUrl(String redirectUrl) {
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The URL where the user is redirected after they complete hosted onboarding.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where the user is redirected after they complete hosted onboarding.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public OnboardingLinkInfo themeId(String themeId) {
    
    this.themeId = themeId;
    return this;
  }

   /**
   * The unique identifier of the hosted onboarding theme.
   * @return themeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the hosted onboarding theme.")

  public String getThemeId() {
    return themeId;
  }


  public void setThemeId(String themeId) {
    this.themeId = themeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingLinkInfo onboardingLinkInfo = (OnboardingLinkInfo) o;
    return Objects.equals(this.locale, onboardingLinkInfo.locale) &&
        Objects.equals(this.redirectUrl, onboardingLinkInfo.redirectUrl) &&
        Objects.equals(this.themeId, onboardingLinkInfo.themeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, redirectUrl, themeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingLinkInfo {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    themeId: ").append(toIndentedString(themeId)).append("\n");
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
    openapiFields.add("locale");
    openapiFields.add("redirectUrl");
    openapiFields.add("themeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnboardingLinkInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OnboardingLinkInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingLinkInfo is not found in the empty JSON string", OnboardingLinkInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OnboardingLinkInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingLinkInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field locale
      if (jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      // validate the optional field redirectUrl
      if (jsonObj.get("redirectUrl") != null && !jsonObj.get("redirectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUrl").toString()));
      }
      // validate the optional field themeId
      if (jsonObj.get("themeId") != null && !jsonObj.get("themeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `themeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("themeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingLinkInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingLinkInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingLinkInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingLinkInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingLinkInfo>() {
           @Override
           public void write(JsonWriter out, OnboardingLinkInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingLinkInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OnboardingLinkInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnboardingLinkInfo
  * @throws IOException if the JSON string is invalid with respect to OnboardingLinkInfo
  */
  public static OnboardingLinkInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingLinkInfo.class);
  }

 /**
  * Convert an instance of OnboardingLinkInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

