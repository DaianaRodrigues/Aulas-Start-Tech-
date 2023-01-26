package Funçoes;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        if (lerLetraDeTemperatura().equals("C")){
            System.out.printf("A temperatura informada foi %s Celsius.", lerLetraDeTemperatura());
            System.out.printf("Ela equivale á %f Farenheit.", CelsiusParaFarenheit());
        } else if(lerLetraDeTemperatura().equals("F")){
            System.out.printf("A temperatura informada foi %s Farenheit.", lerTemperatura());
            System.out.printf("Ela equivale á %f Celsius.", FarenheitParaCelcius());
        } else {
            System.out.println("A letra " + lerLetraDeTemperatura() + " não corresponde a uma unidade de medida de temperatura.");
        }

    }

    static String lerLetraDeTemperatura(){
        Scanner ler = new Scanner(System.in);
        String letras = ler.nextLine();
        System.out.println("Digite se a temperatura esta em C ou F: ");
        return letras;
    }

    static double lerTemperatura(){
        Scanner ler = new Scanner(System.in);
        double temperatura = ler.nextDouble();
        System.out.println("Digite o valor da temperatura:");
        return temperatura;
    }

    static double CelsiusParaFarenheit(){
        Scanner ler = new Scanner(System.in);
        double temperatura = ler.nextDouble();
        double resulCelsius = (temperatura * 9 / 5) + 32;
        return resulCelsius;
    }

    static double FarenheitParaCelcius(){
        Scanner ler = new Scanner(System.in);
        double temperatura = ler.nextDouble();
        double resulFarenheit = (temperatura - 32) * 5 / 9;
        return resulFarenheit;
    }
}
