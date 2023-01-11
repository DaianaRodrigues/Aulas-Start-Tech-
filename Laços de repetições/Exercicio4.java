import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int escolha;
        int sorteio;
        int numero = 0;


        System.out.println("Me informe um número de 1 á 6:");
        escolha = ler.nextInt();

        System.out.println("O numero informado foi " + escolha);

        if(escolha < 1 || escolha > 6) {
            System.out.println("Erro! Por favor, escolha um número entre 1 e 6.");
        } else {
            do {
                numero++;
                sorteio = random.nextInt(1, 7);
                System.out.printf("\nO número sorteado foi o %d.", sorteio);
            } while(sorteio != escolha);
            System.out.printf("\nForam necessários %d sorteios para que o número %d fosse sorteado.", numero, escolha);

        }
    }
}
