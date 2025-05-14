package main;

import models.Conversion;
import services.ExchangeRateConsultation;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExchangeRateConsultation consultation = new ExchangeRateConsultation();

        System.out.print("Insira uma moeda para ser pesquisada: ");
        String baseCode = sc.nextLine();

        try {
            Conversion conversion = consultation.convertCurrency(baseCode);

            List<String> desiredCurrencies = List.of("ARS", "BOB", "BRL", "CLP", "COP", "USD");

            System.out.println("Valores convertidos");
            for (String currency : desiredCurrencies) {
                Double rate = conversion.conversionRates().get(currency);
                if (rate != null) {
                    System.out.println(currency + " -> " + rate);
                } else {
                    System.out.println(currency + " -> Não disponível");
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
