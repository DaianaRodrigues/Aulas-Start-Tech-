import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        //valores da piscina
        double largura;
        double comprimento;
        double profundidade;

        System.out.println("Digite aqui o tamanho da largura da piscina:");
        largura = ler.nextDouble();
        System.out.println("Digite aqui o comprimento da piscina:");
        comprimento = ler.nextDouble();
        System.out.println("Digite aqui a profundidade da piscina:");
        profundidade = ler.nextDouble();
        
        //conta para saber a quantidade de litros
        double litros = largura * comprimento * profundidade * 1000;
        
        //saida de dados
        System.out.println("As dimensões da piscina são " + largura + "m x " + comprimento + "m.");
        System.out.println("A profundidade é " + profundidade + "m.");
        System.out.printf("Essa piscina comporta %.1f litros de água.", litros);
    }
}
