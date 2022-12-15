/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payout.Address;
import com.adyen.model.payout.Amount;
import com.adyen.model.payout.Card;
import com.adyen.model.payout.FundSource;
import com.adyen.model.payout.Name;
import com.adyen.model.payout.Recurring;
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

import com.adyen.model.payout.JSON;

/**
 * PayoutRequest
 */

public class PayoutRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private Card card;

  public static final String SERIALIZED_NAME_FRAUD_OFFSET = "fraudOffset";
  @SerializedName(SERIALIZED_NAME_FRAUD_OFFSET)
  private Integer fraudOffset;

  public static final String SERIALIZED_NAME_FUND_SOURCE = "fundSource";
  @SerializedName(SERIALIZED_NAME_FUND_SOURCE)
  private FundSource fundSource;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Recurring recurring;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SELECTED_RECURRING_DETAIL_REFERENCE = "selectedRecurringDetailReference";
  @SerializedName(SERIALIZED_NAME_SELECTED_RECURRING_DETAIL_REFERENCE)
  private String selectedRecurringDetailReference;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   */
  @JsonAdapter(ShopperInteractionEnum.Adapter.class)
  public enum ShopperInteractionEnum {
    ECOMMERCE("Ecommerce"),
    
    CONTAUTH("ContAuth"),
    
    MOTO("Moto"),
    
    POS("POS");

    private String value;

    ShopperInteractionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShopperInteractionEnum fromValue(String value) {
      for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShopperInteractionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShopperInteractionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShopperInteractionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShopperInteractionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHOPPER_INTERACTION = "shopperInteraction";
  @SerializedName(SERIALIZED_NAME_SHOPPER_INTERACTION)
  private ShopperInteractionEnum shopperInteraction;

  public static final String SERIALIZED_NAME_SHOPPER_NAME = "shopperName";
  @SerializedName(SERIALIZED_NAME_SHOPPER_NAME)
  private Name shopperName;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "telephoneNumber";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  private String telephoneNumber;

  public PayoutRequest() { 
  }

  public PayoutRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public PayoutRequest billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  public PayoutRequest card(Card card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Card getCard() {
    return card;
  }


  public void setCard(Card card) {
    this.card = card;
  }


  public PayoutRequest fraudOffset(Integer fraudOffset) {
    
    this.fraudOffset = fraudOffset;
    return this;
  }

   /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")

  public Integer getFraudOffset() {
    return fraudOffset;
  }


  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }


  public PayoutRequest fundSource(FundSource fundSource) {
    
    this.fundSource = fundSource;
    return this;
  }

   /**
   * Get fundSource
   * @return fundSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FundSource getFundSource() {
    return fundSource;
  }


  public void setFundSource(FundSource fundSource) {
    this.fundSource = fundSource;
  }


  public PayoutRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public PayoutRequest recurring(Recurring recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Recurring getRecurring() {
    return recurring;
  }


  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }


  public PayoutRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   * @return reference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PayoutRequest selectedRecurringDetailReference(String selectedRecurringDetailReference) {
    
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    return this;
  }

   /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this payment. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   * @return selectedRecurringDetailReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `recurringDetailReference` you want to use for this payment. The value `LATEST` can be used to select the most recently stored recurring detail.")

  public String getSelectedRecurringDetailReference() {
    return selectedRecurringDetailReference;
  }


  public void setSelectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
  }


  public PayoutRequest shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper&#39;s email address. We recommend that you provide this data, as it is used in velocity fraud checks. &gt; For 3D Secure 2 transactions, schemes require &#x60;shopperEmail&#x60; for all browser-based and mobile implementations.
   * @return shopperEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shopper's email address. We recommend that you provide this data, as it is used in velocity fraud checks. > For 3D Secure 2 transactions, schemes require `shopperEmail` for all browser-based and mobile implementations.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public PayoutRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   * @return shopperInteraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.")

  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }


  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public PayoutRequest shopperName(Name shopperName) {
    
    this.shopperName = shopperName;
    return this;
  }

   /**
   * Get shopperName
   * @return shopperName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getShopperName() {
    return shopperName;
  }


  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }


  public PayoutRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address.
   * @return shopperReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address.")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  public PayoutRequest telephoneNumber(String telephoneNumber) {
    
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The shopper&#39;s telephone number.
   * @return telephoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shopper's telephone number.")

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutRequest payoutRequest = (PayoutRequest) o;
    return Objects.equals(this.amount, payoutRequest.amount) &&
        Objects.equals(this.billingAddress, payoutRequest.billingAddress) &&
        Objects.equals(this.card, payoutRequest.card) &&
        Objects.equals(this.fraudOffset, payoutRequest.fraudOffset) &&
        Objects.equals(this.fundSource, payoutRequest.fundSource) &&
        Objects.equals(this.merchantAccount, payoutRequest.merchantAccount) &&
        Objects.equals(this.recurring, payoutRequest.recurring) &&
        Objects.equals(this.reference, payoutRequest.reference) &&
        Objects.equals(this.selectedRecurringDetailReference, payoutRequest.selectedRecurringDetailReference) &&
        Objects.equals(this.shopperEmail, payoutRequest.shopperEmail) &&
        Objects.equals(this.shopperInteraction, payoutRequest.shopperInteraction) &&
        Objects.equals(this.shopperName, payoutRequest.shopperName) &&
        Objects.equals(this.shopperReference, payoutRequest.shopperReference) &&
        Objects.equals(this.telephoneNumber, payoutRequest.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, billingAddress, card, fraudOffset, fundSource, merchantAccount, recurring, reference, selectedRecurringDetailReference, shopperEmail, shopperInteraction, shopperName, shopperReference, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    fundSource: ").append(toIndentedString(fundSource)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("billingAddress");
    openapiFields.add("card");
    openapiFields.add("fraudOffset");
    openapiFields.add("fundSource");
    openapiFields.add("merchantAccount");
    openapiFields.add("recurring");
    openapiFields.add("reference");
    openapiFields.add("selectedRecurringDetailReference");
    openapiFields.add("shopperEmail");
    openapiFields.add("shopperInteraction");
    openapiFields.add("shopperName");
    openapiFields.add("shopperReference");
    openapiFields.add("telephoneNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("reference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayoutRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PayoutRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayoutRequest is not found in the empty JSON string", PayoutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PayoutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PayoutRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayoutRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.getAsJsonObject("billingAddress") != null) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      // validate the optional field `card`
      if (jsonObj.getAsJsonObject("card") != null) {
        Card.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // validate the optional field `fundSource`
      if (jsonObj.getAsJsonObject("fundSource") != null) {
        FundSource.validateJsonObject(jsonObj.getAsJsonObject("fundSource"));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field `recurring`
      if (jsonObj.getAsJsonObject("recurring") != null) {
        Recurring.validateJsonObject(jsonObj.getAsJsonObject("recurring"));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field selectedRecurringDetailReference
      if (jsonObj.get("selectedRecurringDetailReference") != null && !jsonObj.get("selectedRecurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedRecurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedRecurringDetailReference").toString()));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
      }
      // ensure the field shopperInteraction can be parsed to an enum value
      if (jsonObj.get("shopperInteraction") != null) {
        if(!jsonObj.get("shopperInteraction").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `shopperInteraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperInteraction").toString()));
        }
        ShopperInteractionEnum.fromValue(jsonObj.get("shopperInteraction").getAsString());
      }
      // validate the optional field `shopperName`
      if (jsonObj.getAsJsonObject("shopperName") != null) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("shopperName"));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
      // validate the optional field telephoneNumber
      if (jsonObj.get("telephoneNumber") != null && !jsonObj.get("telephoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayoutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayoutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayoutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayoutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PayoutRequest>() {
           @Override
           public void write(JsonWriter out, PayoutRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayoutRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayoutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayoutRequest
  * @throws IOException if the JSON string is invalid with respect to PayoutRequest
  */
  public static PayoutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayoutRequest.class);
  }

 /**
  * Convert an instance of PayoutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

