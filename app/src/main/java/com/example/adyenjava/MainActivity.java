package com.example.adyenjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContextWrapper;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.adyen.Client;
import com.adyen.Config;
import com.adyen.enums.Environment;
import com.adyen.model.nexo.AmountsReq;
import com.adyen.model.nexo.MessageCategoryType;
import com.adyen.model.nexo.MessageClassType;
import com.adyen.model.nexo.MessageHeader;
import com.adyen.model.nexo.MessageType;
import com.adyen.model.nexo.PaymentTransaction;
import com.adyen.model.nexo.SaleData;
import com.adyen.model.nexo.SaleToPOIRequest;
import com.adyen.model.nexo.TransactionIdentification;
import com.adyen.model.payments.AuthenticationResultRequest;
import com.adyen.model.terminal.TerminalAPIRequest;
import com.adyen.model.terminal.TerminalAPIResponse;
import com.adyen.model.terminal.security.SecurityKey;
import com.adyen.service.TerminalLocalAPI;
import com.androidnetworking.AndroidNetworking;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class MainActivity extends AppCompatActivity {
    public EditText txt1;
    public EditText txt2;
    public EditText txt3;
    public EditText txt4;
    public EditText txt5;
    public EditText multiText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AndroidNetworking.initialize(getApplicationContext());
        Button b1 = (Button) findViewById(R.id.button);
        txt1 = (EditText) findViewById(R.id.editTextTextPersonName);
        txt2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        txt3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        txt4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        txt5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        multiText = (EditText) findViewById(R.id.editTextTextMultiLine);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

                StrictMode.setThreadPolicy(policy);

                Config config = new Config();
                config.setApiKey(txt5.getText().toString());
                ContextWrapper c = new ContextWrapper(getApplicationContext());
                try {
                    config.setTerminalCertificate(c.getAssets().open("adyen-terminalfleet-test.pem"));
                    Log.i("CALLED HERE", "SUCCESS");
                } catch (CertificateException e) {
                    Log.i("CALLED HERE", "ERROR");
                    e.printStackTrace();
                } catch (IOException e) {
                    Log.i("CALLED HERE", "ERROR");
                    e.printStackTrace();
                } catch (Exception e) {
                    Log.i("CALLED HERE", "ERROR");
                    e.printStackTrace();
                }
                config.setTerminalApiLocalEndpoint(txt1.getText().toString());
                config.setEnvironment(Environment.TEST);
                Client client = new Client(config);
                TerminalLocalAPI terminalLocalApi = new TerminalLocalAPI(client);
                try {
                    TerminalAPIRequest terminalAPIPaymentRequest = createTerminalAPIPaymentRequest();

                    SecurityKey securityKey = new SecurityKey();
                    securityKey.setKeyVersion(1);
                    securityKey.setAdyenCryptoVersion(1);
                    securityKey.setKeyIdentifier(txt3.getText().toString());
                    securityKey.setPassphrase(txt4.getText().toString());
                    TerminalAPIResponse terminalAPIResponse = terminalLocalApi.request(terminalAPIPaymentRequest, securityKey);
                    callAPI(terminalAPIResponse.toString());
                    multiText.setText(terminalAPIResponse.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e("e.toString()", e.getMessage());
                    multiText.setText(e.getMessage());
                    callAPI(e.toString());
                }
            }
        });
    }

    protected TerminalAPIRequest createTerminalAPIPaymentRequest() throws DatatypeConfigurationException {
        SaleToPOIRequest saleToPOIRequest = new SaleToPOIRequest();

        MessageHeader messageHeader = new MessageHeader();
        messageHeader.setProtocolVersion("3.0");
        messageHeader.setMessageClass(MessageClassType.SERVICE);
        messageHeader.setMessageCategory(MessageCategoryType.PAYMENT);
        messageHeader.setMessageType(MessageType.REQUEST);
        messageHeader.setSaleID(String.valueOf(Math.random()));
        messageHeader.setServiceID(String.valueOf(Math.random()));
        messageHeader.setPOIID(txt2.getText().toString());

        saleToPOIRequest.setMessageHeader(messageHeader);

        com.adyen.model.nexo.PaymentRequest paymentRequest = new com.adyen.model.nexo.PaymentRequest();

        SaleData saleData = new SaleData();
        TransactionIdentification transactionIdentification = new TransactionIdentification();
        transactionIdentification.setTransactionID("001");
        XMLGregorianCalendar timestamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        transactionIdentification.setTimeStamp(timestamp);
        saleData.setSaleTransactionID(transactionIdentification);

        PaymentTransaction paymentTransaction = new PaymentTransaction();
        AmountsReq amountsReq = new AmountsReq();
        amountsReq.setCurrency("GBP");
        amountsReq.setRequestedAmount(BigDecimal.ONE);
        paymentTransaction.setAmountsReq(amountsReq);

        paymentRequest.setSaleData(saleData);
        paymentRequest.setPaymentTransaction(paymentTransaction);

        saleToPOIRequest.setPaymentRequest(paymentRequest);

        TerminalAPIRequest terminalAPIRequest = new TerminalAPIRequest();
        terminalAPIRequest.setSaleToPOIRequest(saleToPOIRequest);

        return terminalAPIRequest;
    }

    protected AuthenticationResultRequest createAuthenticationResultRequest() {
        AuthenticationResultRequest authenticationResultRequest = new AuthenticationResultRequest();
        authenticationResultRequest.setMerchantAccount("AMerchant");
        authenticationResultRequest.setPspReference("APspReference");
        return authenticationResultRequest;
    }

    protected void callAPI(String data) {
        JSONAsyncTask task = new JSONAsyncTask();
        task.execute(data);
    }

    class JSONAsyncTask extends AsyncTask<String, Void, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected String doInBackground(String... urls) {
            try {

                HttpPost httppost = new HttpPost("http://portal.noq.events/api/v2/in-person/123/send-receipt");
                HttpClient httpclient = new DefaultHttpClient();
                httppost.setHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVlNTNiNjY1NWFkMzQ2ZDFmMTVlNDU5MSIsImVtYWlsIjoiYWRtaW4uc3RhZ2luZ0Bub3EuZXZlbnRzIiwicm9sZSI6IkFETUlOIiwiaWF0IjoxNjcxMDgzMTkzLCJleHAiOjE2NzExNjk1OTN9.hAfn8qq9J4Y9UUAytKXEpXiPMQhnp9R8cVJcJKLxIpc");

                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                nameValuePairs.add(new BasicNameValuePair("data",
                        urls[0]));
                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                HttpResponse response = httpclient.execute(httppost);

                // StatusLine stat = response.getStatusLine();
                int status = response.getStatusLine().getStatusCode();
                if (status == 200) {
                    HttpEntity entity = response.getEntity();
                    String data = EntityUtils.toString(entity);

                    JSONObject jsono = new JSONObject(data);
                    return "CALLED SUCCESS";
                }

                return String.valueOf(status);
            } catch (IOException e) {
                e.printStackTrace();
                return e.getMessage();
            } catch (JSONException e) {
                e.printStackTrace();
                return e.getMessage();
            } catch (Exception e) {
                e.printStackTrace();
                return e.getMessage();
            }
        }

        protected void onPostExecute(String result) {
            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        }
    }
}