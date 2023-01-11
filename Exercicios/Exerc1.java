package Exercicios;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        //recebimentos de dados
        Scanner ler = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Digite aqui a sua primeira nota:");
        nota1 = ler.nextDouble();
        System.out.println("Digite aqui a sua segunda nota:");
        nota2 = ler.nextDouble();
        System.out.println("Digite aqui a sua terceira nota:");
        nota3 = ler.nextDouble();
        System.out.println("Digite aqui a sua quarta nota:");
        nota4 = ler.nextDouble();

        //Calculando a media de notas
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //saida de dados
        System.out.printf("As notas do aluno são: %.1f, %.1f, %.1f, %.1f", nota1, nota2, nota3, nota4);
        System.out.println("\n A média final é : " + media);

        if (media >= 6) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado!");
        }

    }
}
