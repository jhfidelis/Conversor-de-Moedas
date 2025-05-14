package services;

import com.google.gson.Gson;
import models.Conversion;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateConsultation {

    private static final String API_KEY = "decd2db17ac6f2ba59e921b6";

    public Conversion convertCurrency(String baseCode) {
        URI address =URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/"+ baseCode);

        HttpRequest request = HttpRequest.newBuilder().uri(address).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
