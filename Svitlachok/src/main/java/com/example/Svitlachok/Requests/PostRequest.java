package com.example.Svitlachok.Requests;
import com.example.Svitlachok.chromeDriver.ColorCounter;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

public class PostRequest {
    public static void postRequest() {

        String url = "http://localhost:8080/api/note";


        String jsonData = "";


        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost postRequest = new HttpPost(url);
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setEntity(new StringEntity(jsonData));


            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
                System.out.println("Response Status: " + response.getCode());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
