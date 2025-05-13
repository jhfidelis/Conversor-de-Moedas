package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        String API_KEY = "decd2db17ac6f2ba59e921b6";

        System.out.print("Digite o código de uma moeda para ser convertida: ");
        var baseCode = sc.nextLine();

        String address  = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/"+ baseCode;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
