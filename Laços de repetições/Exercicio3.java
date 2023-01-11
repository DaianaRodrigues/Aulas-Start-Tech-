import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Recebimentos de dados
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int escolha;
        int numero = 0;

        System.out.println("Digite aqui um número: ");
        escolha = ler.nextInt();

        //Inicio do laço
        for (int i = 0; i < escolha; i++){
            int aleatorio = random.nextInt(1,7);
            numero += aleatorio;
            System.out.printf("O número %d foi sorteado! \n", aleatorio);
        }
        System.out.println("\nA soma dos números é " + numero);
    }
}
