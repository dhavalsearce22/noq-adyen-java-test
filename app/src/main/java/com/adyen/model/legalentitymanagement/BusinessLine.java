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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * BusinessLine
 */

public class BusinessLine {
  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private String capability;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INDUSTRY_CODE = "industryCode";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CODE)
  private String industryCode;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "legalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private String legalEntityId;

  public static final String SERIALIZED_NAME_SALES_CHANNELS = "salesChannels";
  @SerializedName(SERIALIZED_NAME_SALES_CHANNELS)
  private List<String> salesChannels = null;

  public static final String SERIALIZED_NAME_SOURCE_OF_FUNDS = "sourceOfFunds";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_FUNDS)
  private SourceOfFunds sourceOfFunds;

  public static final String SERIALIZED_NAME_WEB_DATA = "webData";
  @SerializedName(SERIALIZED_NAME_WEB_DATA)
  private List<WebData> webData = null;

  public static final String SERIALIZED_NAME_WEB_DATA_EXEMPTION = "webDataExemption";
  @SerializedName(SERIALIZED_NAME_WEB_DATA_EXEMPTION)
  private WebDataExemption webDataExemption;

  public BusinessLine() { 
  }

  
  public BusinessLine(
     String id
  ) {
    this();
    this.id = id;
  }

  public BusinessLine capability(String capability) {
    
    this.capability = capability;
    return this;
  }

   /**
   * The capability for which you are creating the business line. For example, **receivePayments**.
   * @return capability
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The capability for which you are creating the business line. For example, **receivePayments**.")

  public String getCapability() {
    return capability;
  }


  public void setCapability(String capability) {
    this.capability = capability;
  }


   /**
   * The unique identifier of the business line.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of the business line.")

  public String getId() {
    return id;
  }




  public BusinessLine industryCode(String industryCode) {
    
    this.industryCode = industryCode;
    return this;
  }

   /**
   * A code that represents the industry of the legal entity. For example, **4431A** for computer software stores.
   * @return industryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A code that represents the industry of the legal entity. For example, **4431A** for computer software stores.")

  public String getIndustryCode() {
    return industryCode;
  }


  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }


  public BusinessLine legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
   * @return legalEntityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.")

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public BusinessLine salesChannels(List<String> salesChannels) {
    
    this.salesChannels = salesChannels;
    return this;
  }

  public BusinessLine addSalesChannelsItem(String salesChannelsItem) {
    if (this.salesChannels == null) {
      this.salesChannels = new ArrayList<>();
    }
    this.salesChannels.add(salesChannelsItem);
    return this;
  }

   /**
   * A list of channels where goods or services are sold. You cannot combine point of sale and ecommerce in one business line.  Possible values and combinations:  - For point of sale: **pos** and **posMoto**  - For ecommerce: **eCommerce** and **ecomMoto**  - For Pay by Link: **payByLink**  Required only in combination with the &#x60;capability&#x60; to **receivePayments** or **receiveFromPlatformPayments**.
   * @return salesChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of channels where goods or services are sold. You cannot combine point of sale and ecommerce in one business line.  Possible values and combinations:  - For point of sale: **pos** and **posMoto**  - For ecommerce: **eCommerce** and **ecomMoto**  - For Pay by Link: **payByLink**  Required only in combination with the `capability` to **receivePayments** or **receiveFromPlatformPayments**.")

  public List<String> getSalesChannels() {
    return salesChannels;
  }


  public void setSalesChannels(List<String> salesChannels) {
    this.salesChannels = salesChannels;
  }


  public BusinessLine sourceOfFunds(SourceOfFunds sourceOfFunds) {
    
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceOfFunds getSourceOfFunds() {
    return sourceOfFunds;
  }


  public void setSourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public BusinessLine webData(List<WebData> webData) {
    
    this.webData = webData;
    return this;
  }

  public BusinessLine addWebDataItem(WebData webDataItem) {
    if (this.webData == null) {
      this.webData = new ArrayList<>();
    }
    this.webData.add(webDataItem);
    return this;
  }

   /**
   * List of website URLs where your user&#39;s goods or services are sold. When this is required for a capability but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object.
   * @return webData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of website URLs where your user's goods or services are sold. When this is required for a capability but your user does not have an online presence, provide the reason in the `webDataExemption` object.")

  public List<WebData> getWebData() {
    return webData;
  }


  public void setWebData(List<WebData> webData) {
    this.webData = webData;
  }


  public BusinessLine webDataExemption(WebDataExemption webDataExemption) {
    
    this.webDataExemption = webDataExemption;
    return this;
  }

   /**
   * Get webDataExemption
   * @return webDataExemption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebDataExemption getWebDataExemption() {
    return webDataExemption;
  }


  public void setWebDataExemption(WebDataExemption webDataExemption) {
    this.webDataExemption = webDataExemption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLine businessLine = (BusinessLine) o;
    return Objects.equals(this.capability, businessLine.capability) &&
        Objects.equals(this.id, businessLine.id) &&
        Objects.equals(this.industryCode, businessLine.industryCode) &&
        Objects.equals(this.legalEntityId, businessLine.legalEntityId) &&
        Objects.equals(this.salesChannels, businessLine.salesChannels) &&
        Objects.equals(this.sourceOfFunds, businessLine.sourceOfFunds) &&
        Objects.equals(this.webData, businessLine.webData) &&
        Objects.equals(this.webDataExemption, businessLine.webDataExemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, id, industryCode, legalEntityId, salesChannels, sourceOfFunds, webData, webDataExemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLine {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    salesChannels: ").append(toIndentedString(salesChannels)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    webData: ").append(toIndentedString(webData)).append("\n");
    sb.append("    webDataExemption: ").append(toIndentedString(webDataExemption)).append("\n");
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
    openapiFields.add("capability");
    openapiFields.add("id");
    openapiFields.add("industryCode");
    openapiFields.add("legalEntityId");
    openapiFields.add("salesChannels");
    openapiFields.add("sourceOfFunds");
    openapiFields.add("webData");
    openapiFields.add("webDataExemption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("capability");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("industryCode");
    openapiRequiredFields.add("legalEntityId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessLine
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessLine.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessLine is not found in the empty JSON string", BusinessLine.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessLine.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessLine` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessLine.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field capability
      if (jsonObj.get("capability") != null && !jsonObj.get("capability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `capability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("capability").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field industryCode
      if (jsonObj.get("industryCode") != null && !jsonObj.get("industryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industryCode").toString()));
      }
      // validate the optional field legalEntityId
      if (jsonObj.get("legalEntityId") != null && !jsonObj.get("legalEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("salesChannels") != null && !jsonObj.get("salesChannels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesChannels` to be an array in the JSON string but got `%s`", jsonObj.get("salesChannels").toString()));
      }
      // validate the optional field `sourceOfFunds`
      if (jsonObj.getAsJsonObject("sourceOfFunds") != null) {
        SourceOfFunds.validateJsonObject(jsonObj.getAsJsonObject("sourceOfFunds"));
      }
      JsonArray jsonArraywebData = jsonObj.getAsJsonArray("webData");
      if (jsonArraywebData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("webData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `webData` to be an array in the JSON string but got `%s`", jsonObj.get("webData").toString()));
        }

        // validate the optional field `webData` (array)
        for (int i = 0; i < jsonArraywebData.size(); i++) {
          WebData.validateJsonObject(jsonArraywebData.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `webDataExemption`
      if (jsonObj.getAsJsonObject("webDataExemption") != null) {
        WebDataExemption.validateJsonObject(jsonObj.getAsJsonObject("webDataExemption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessLine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessLine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessLine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessLine.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessLine>() {
           @Override
           public void write(JsonWriter out, BusinessLine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessLine read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessLine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessLine
  * @throws IOException if the JSON string is invalid with respect to BusinessLine
  */
  public static BusinessLine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessLine.class);
  }

 /**
  * Convert an instance of BusinessLine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

