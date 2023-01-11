import java.util.Scanner;

public class Exercício4 {
    
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        //valores da cotação em 13/11/22
        double valor;
        double dolar = 5.16; 
        double euros = 5.17; 
        double libras = 5.86; 
        double pesos = 0.032; 
        double coroas = 0.21;

        System.out.println("Digite o valor que você quer converter:");
        valor = ler.nextDouble();

        //Conta para conversao de valores
        double resultadoDolar = valor / dolar; 
        double resultadoEuros = valor / euros; 
        double resultadoLibras = valor / libras; 
        double resultadoPesos = valor / pesos;
        double resultadoCoroas = valor / coroas;
        
        //Imprimi os valores
        System.out.println("O valor recebido é de " + valor + " reais.");
        System.out.println("Isso equivale a: ");
        System.out.printf("- %.2f Dolares.\n", resultadoDolar);
        System.out.printf("- %.2f euros. \n", resultadoEuros);
        System.out.printf("- %.2f Libras. \n", resultadoLibras);
        System.out.printf("- %.2f pesos argentinos. \n", resultadoPesos);
        System.out.printf("- %.2f coroas tchecas.", resultadoCoroas);
    }
}
