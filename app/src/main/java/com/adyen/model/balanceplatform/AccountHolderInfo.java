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
import com.adyen.model.balanceplatform.AccountHolderCapability;
import com.adyen.model.balanceplatform.ContactDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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

import com.adyen.model.balanceplatform.JSON;

/**
 * AccountHolderInfo
 */

public class AccountHolderInfo {
  public static final String SERIALIZED_NAME_BALANCE_PLATFORM = "balancePlatform";
  @SerializedName(SERIALIZED_NAME_BALANCE_PLATFORM)
  private String balancePlatform;

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private Map<String, AccountHolderCapability> capabilities = null;

  public static final String SERIALIZED_NAME_CONTACT_DETAILS = "contactDetails";
  @SerializedName(SERIALIZED_NAME_CONTACT_DETAILS)
  private ContactDetails contactDetails;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "legalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private String legalEntityId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public AccountHolderInfo() { 
  }

  public AccountHolderInfo balancePlatform(String balancePlatform) {
    
    this.balancePlatform = balancePlatform;
    return this;
  }

   /**
   * The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms.
   * @return balancePlatform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms.")

  public String getBalancePlatform() {
    return balancePlatform;
  }


  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }


  public AccountHolderInfo capabilities(Map<String, AccountHolderCapability> capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  public AccountHolderInfo putCapabilitiesItem(String key, AccountHolderCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

   /**
   * Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability.
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability.")

  public Map<String, AccountHolderCapability> getCapabilities() {
    return capabilities;
  }


  public void setCapabilities(Map<String, AccountHolderCapability> capabilities) {
    this.capabilities = capabilities;
  }


  public AccountHolderInfo contactDetails(ContactDetails contactDetails) {
    
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactDetails getContactDetails() {
    return contactDetails;
  }


  public void setContactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }


  public AccountHolderInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the account holder, maximum 300 characters.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your description for the account holder, maximum 300 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AccountHolderInfo legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/legalEntities__resParam_id) associated with the account holder. Adyen performs a verification process against the legal entity of the account holder.  
   * @return legalEntityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/legalEntities__resParam_id) associated with the account holder. Adyen performs a verification process against the legal entity of the account holder.  ")

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public AccountHolderInfo reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the account holder, maximum 150 characters.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your reference for the account holder, maximum 150 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public AccountHolderInfo timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The [time zone](https://www.iana.org/time-zones) of the account holder. For example, **Europe/Amsterdam**. If not set, the time zone of the balance account will be used. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [time zone](https://www.iana.org/time-zones) of the account holder. For example, **Europe/Amsterdam**. If not set, the time zone of the balance account will be used. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderInfo accountHolderInfo = (AccountHolderInfo) o;
    return Objects.equals(this.balancePlatform, accountHolderInfo.balancePlatform) &&
        Objects.equals(this.capabilities, accountHolderInfo.capabilities) &&
        Objects.equals(this.contactDetails, accountHolderInfo.contactDetails) &&
        Objects.equals(this.description, accountHolderInfo.description) &&
        Objects.equals(this.legalEntityId, accountHolderInfo.legalEntityId) &&
        Objects.equals(this.reference, accountHolderInfo.reference) &&
        Objects.equals(this.timeZone, accountHolderInfo.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balancePlatform, capabilities, contactDetails, description, legalEntityId, reference, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderInfo {\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("balancePlatform");
    openapiFields.add("capabilities");
    openapiFields.add("contactDetails");
    openapiFields.add("description");
    openapiFields.add("legalEntityId");
    openapiFields.add("reference");
    openapiFields.add("timeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("legalEntityId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountHolderInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountHolderInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountHolderInfo is not found in the empty JSON string", AccountHolderInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountHolderInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountHolderInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountHolderInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field balancePlatform
      if (jsonObj.get("balancePlatform") != null && !jsonObj.get("balancePlatform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balancePlatform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balancePlatform").toString()));
      }
      // validate the optional field `contactDetails`
      if (jsonObj.getAsJsonObject("contactDetails") != null) {
        ContactDetails.validateJsonObject(jsonObj.getAsJsonObject("contactDetails"));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field legalEntityId
      if (jsonObj.get("legalEntityId") != null && !jsonObj.get("legalEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityId").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field timeZone
      if (jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountHolderInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountHolderInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountHolderInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountHolderInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountHolderInfo>() {
           @Override
           public void write(JsonWriter out, AccountHolderInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountHolderInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountHolderInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountHolderInfo
  * @throws IOException if the JSON string is invalid with respect to AccountHolderInfo
  */
  public static AccountHolderInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountHolderInfo.class);
  }

 /**
  * Convert an instance of AccountHolderInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

