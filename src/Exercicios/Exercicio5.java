package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double salario;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite aqui o seu salário: ");
        salario = ler.nextDouble();

        double inss1 = 0.075;
        double inss2 = 0.09;
        double inss3 = 0.12;
        double inss4 = 0.14;

        double base1 = 1212.00;
        double base2 = 2427.35;
        double base3 = 3641.03;
        double base4 = 7087.22;

        double desconto = base1 * inss1;
        double desconto2 = (salario - base1) * inss2 + desconto;
        double resulta = (base2 - base1) * inss2;
        double desconto3 = (salario - base2) * inss3 + desconto + resulta;
        double resulta1 = (base3 - base2) * inss3;
        double desconto4 = (salario - base4) * inss4 + desconto + desconto2 + resulta1;

        if(salario <= base1){
            System.out.printf("O salário bruto informado foi %.2f.", salario);
            System.out.printf("\nO valor de contribuição ao INSS é %.2f", desconto);
        } else if(salario <= base2) {
            System.out.printf("O salário bruto informado foi %.2f.", salario);
            System.out.printf("\nO valor de contribuição ao INSS é %.2f", desconto2);
        } else if(salario <= base3) {
            System.out.printf("O salário bruto informado foi %.2f.", salario);
            System.out.printf("\nO valor de contribuição ao INSS é %.2f", desconto3);
        } else if(salario <= base4) {
            System.out.printf("O salário bruto informado foi %.2f.", salario);
            System.out.printf("\nO valor de contribuição ao INSS é %.2f", desconto4);
        } else {
            System.out.println("Valor Excedido!");
        }
    }
}
