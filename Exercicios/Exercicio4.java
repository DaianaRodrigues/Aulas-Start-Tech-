package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int numero;

        Random random = new Random();
        int aleatorio = random.nextInt(6);

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 6: ");
        numero = ler.nextInt();

        if (numero <= 1 || numero >= 6){
            System.out.println("O número selecionado foi " + numero);
            System.out.println("Erro! Por favor, escolha um número entre 1 e 6.");

        } else if (numero == aleatorio){
            System.out.println("O número selecionado foi " + numero);
            System.out.println("O número sorteado foi " + aleatorio);
            System.out.println("Você acertou!");
        } else if (numero != aleatorio) {
            System.out.println("O número selecionado foi " + numero);
            System.out.println("O número sorteado foi " + aleatorio);
            System.out.println("Você errou!");
        }
    }
}
