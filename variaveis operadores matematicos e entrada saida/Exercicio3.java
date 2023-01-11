import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double kilometros;
        double milhas = 1.609;
        double resultado;

        System.out.println("Digite aqui a quantidade de Kilometros que você quer transformar em milhas:");
        kilometros = ler.nextDouble();
        resultado = kilometros / milhas;

        System.out.println("O valor recebido em kilômetros foi " + kilometros + ".\nO resultado em milhas é " + resultado);
    }
}
