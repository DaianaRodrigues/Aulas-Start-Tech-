package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int idade;
        int parcelas;
        double salario;
        double emprestimo;
        double porcentagem;
        double valorParcela;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();

        System.out.println("Informe o valor do seu sálario: ");
        salario = ler.nextDouble();

        System.out.println("Qual o valor do emprestimo que você deseja?");
        emprestimo = ler.nextDouble();
        porcentagem = salario * 0.30;

        System.out.println("Em quantas parcelas você gostaria de pagar?");
        parcelas = ler.nextInt();
        valorParcela = emprestimo / salario;

        if ((idade >= 18 && idade <= 65) && (parcelas >= 3 && parcelas <= 24) && (valorParcela >= porcentagem)) {
            System.out.printf("A pessoa que está solicitando o emprestimo tem %d anos de idade e", idade);
            System.out.printf(" tem o salário de %.2f reais", salario);
            System.out.printf("\n O valor solicitado é de %.2f reais para ser pago em %d parcelas", emprestimo, parcelas);
            System.out.println("\n O emprestimo foi aprovado!");

        } else {
            System.out.printf("A pessoa que está solicitando o emprestimo tem %d anos de idade e", idade);
            System.out.printf(" tem o salário de %.2f reais", salario);
            System.out.printf("\n O valor solicitado é de %.2f reais para ser pago em %d parcelas", emprestimo, parcelas);
            System.out.println(" \n O emprestimo foi reprovado!");
        }
        }
}