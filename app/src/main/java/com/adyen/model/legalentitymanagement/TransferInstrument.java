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
 * TransferInstrument
 */

public class TransferInstrument {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bankAccount";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private BankAccountInfo bankAccount;

  public static final String SERIALIZED_NAME_DOCUMENT_DETAILS = "documentDetails";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_DETAILS)
  private List<DocumentReference> documentDetails = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "legalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private String legalEntityId;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL = "recurringDetail";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL)
  private RecurringDetail recurringDetail;

  /**
   * The type of transfer instrument.  Possible values: **bankAccount**, **recurringDetail**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANKACCOUNT("bankAccount"),
    
    RECURRINGDETAIL("recurringDetail");

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

  public TransferInstrument() { 
  }

  
  public TransferInstrument(
     String id
  ) {
    this();
    this.id = id;
  }

  public TransferInstrument bankAccount(BankAccountInfo bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankAccountInfo getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(BankAccountInfo bankAccount) {
    this.bankAccount = bankAccount;
  }


  public TransferInstrument documentDetails(List<DocumentReference> documentDetails) {
    
    this.documentDetails = documentDetails;
    return this;
  }

  public TransferInstrument addDocumentDetailsItem(DocumentReference documentDetailsItem) {
    if (this.documentDetails == null) {
      this.documentDetails = new ArrayList<>();
    }
    this.documentDetails.add(documentDetailsItem);
    return this;
  }

   /**
   * List of documents uploaded for the transfer instrument.
   * @return documentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of documents uploaded for the transfer instrument.")

  public List<DocumentReference> getDocumentDetails() {
    return documentDetails;
  }


  public void setDocumentDetails(List<DocumentReference> documentDetails) {
    this.documentDetails = documentDetails;
  }


   /**
   * The unique identifier of the transfer instrument.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of the transfer instrument.")

  public String getId() {
    return id;
  }




  public TransferInstrument legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the transfer instrument.
   * @return legalEntityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the transfer instrument.")

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public TransferInstrument recurringDetail(RecurringDetail recurringDetail) {
    
    this.recurringDetail = recurringDetail;
    return this;
  }

   /**
   * Get recurringDetail
   * @return recurringDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecurringDetail getRecurringDetail() {
    return recurringDetail;
  }


  public void setRecurringDetail(RecurringDetail recurringDetail) {
    this.recurringDetail = recurringDetail;
  }


  public TransferInstrument type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of transfer instrument.  Possible values: **bankAccount**, **recurringDetail**.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of transfer instrument.  Possible values: **bankAccount**, **recurringDetail**.")

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
    TransferInstrument transferInstrument = (TransferInstrument) o;
    return Objects.equals(this.bankAccount, transferInstrument.bankAccount) &&
        Objects.equals(this.documentDetails, transferInstrument.documentDetails) &&
        Objects.equals(this.id, transferInstrument.id) &&
        Objects.equals(this.legalEntityId, transferInstrument.legalEntityId) &&
        Objects.equals(this.recurringDetail, transferInstrument.recurringDetail) &&
        Objects.equals(this.type, transferInstrument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, documentDetails, id, legalEntityId, recurringDetail, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferInstrument {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    recurringDetail: ").append(toIndentedString(recurringDetail)).append("\n");
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
    openapiFields.add("bankAccount");
    openapiFields.add("documentDetails");
    openapiFields.add("id");
    openapiFields.add("legalEntityId");
    openapiFields.add("recurringDetail");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("legalEntityId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferInstrument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferInstrument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferInstrument is not found in the empty JSON string", TransferInstrument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferInstrument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferInstrument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransferInstrument.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `bankAccount`
      if (jsonObj.getAsJsonObject("bankAccount") != null) {
        BankAccountInfo.validateJsonObject(jsonObj.getAsJsonObject("bankAccount"));
      }
      JsonArray jsonArraydocumentDetails = jsonObj.getAsJsonArray("documentDetails");
      if (jsonArraydocumentDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("documentDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `documentDetails` to be an array in the JSON string but got `%s`", jsonObj.get("documentDetails").toString()));
        }

        // validate the optional field `documentDetails` (array)
        for (int i = 0; i < jsonArraydocumentDetails.size(); i++) {
          DocumentReference.validateJsonObject(jsonArraydocumentDetails.get(i).getAsJsonObject());
        };
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field legalEntityId
      if (jsonObj.get("legalEntityId") != null && !jsonObj.get("legalEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityId").toString()));
      }
      // validate the optional field `recurringDetail`
      if (jsonObj.getAsJsonObject("recurringDetail") != null) {
        RecurringDetail.validateJsonObject(jsonObj.getAsJsonObject("recurringDetail"));
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
       if (!TransferInstrument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferInstrument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferInstrument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferInstrument.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferInstrument>() {
           @Override
           public void write(JsonWriter out, TransferInstrument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferInstrument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferInstrument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferInstrument
  * @throws IOException if the JSON string is invalid with respect to TransferInstrument
  */
  public static TransferInstrument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferInstrument.class);
  }

 /**
  * Convert an instance of TransferInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

