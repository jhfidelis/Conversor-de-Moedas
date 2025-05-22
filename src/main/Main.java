package main;

import models.Conversion;
import services.CurrencyConverter;
import services.ExchangeRateConsultation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        menu = """
                =============== CONVERSOR DE MOEDAS ===============
                
                1 - Peso argentino (ARS)   =>  Dólar americano (USD)
                2 - Dólar americano (USD)  =>  Peso argentino (ARS)
                3 - Real brasileiro (BRL)  =>  Dólar americano (USD)
                4 - Dólar americano (USD)  =>  Real brasileiro (BRL)
                5 - Real brasileiro (BRL)  =>  Euro (EUR)
                6 -            Euro (EUR)  =>  Real brasileiro (BRL)
                7 - Dólar americano (USD)  =>  Euro (EUR)
                8 -            Euro (EUR)  =>  Dólar americano (USD)
                0 - Sair
                """;

        int opc = 1;
        while (opc != 0) {
            System.out.println(menu);

            System.out.print("Escolha a sua opção: ");
            opc = sc.nextInt();

            if (opc == 0) {
                break;
            }

            ExchangeRateConsultation consultation = new ExchangeRateConsultation();

            String baseCode, targetCurrency;

            try {
                switch (opc) {
                    case 1 -> {baseCode = "ARS"; targetCurrency = "USD";}
                    case 2 -> {baseCode = "USD"; targetCurrency = "ARS";}
                    case 3 -> {baseCode = "BRL"; targetCurrency = "USD";}
                    case 4 -> {baseCode = "USD"; targetCurrency = "BRL";}
                    case 5 -> {baseCode = "BRL"; targetCurrency = "EUR";}
                    case 6 -> {baseCode = "EUR"; targetCurrency = "BRL";}
                    case 7 -> {baseCode = "USD"; targetCurrency = "EUR";}
                    case 8 -> {baseCode = "EUR"; targetCurrency = "USD";}
                    default -> {
                        System.out.println("Opção inválida!");
                        continue;
                    }
                }

                System.out.print("Insira o valor a ser convertido: ");
                double amount = sc.nextDouble();

                Conversion conversion = consultation.convertCurrency(baseCode);

                double rate = conversion.conversionRates().get(targetCurrency);
                double result = CurrencyConverter.convert(amount, rate);

                System.out.printf("\n$ %.2f %s é igual a $ %.2f %s\n", amount, baseCode, result, targetCurrency);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
