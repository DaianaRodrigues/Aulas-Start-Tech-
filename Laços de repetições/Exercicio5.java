import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //recebimento de dados do usuário
        Scanner ler = new Scanner(System.in);
        String palavra;
        char letra;
        int ocorrencia = 0;

        System.out.println("Digite aqui uma palavra: ");
        palavra = ler.nextLine();
        System.out.println("Digite aqui a letra que você quer contar na palavra: ");
        letra = ler.next().charAt(0);

        if (Character.isDigit(letra)) {
            System.out.println("ERRO! Digite uma letra valida!");
        } else {
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    ocorrencia++;
                }
            }
        }
        if(ocorrencia == 0) {
            System.out.printf("Não existem ocorrências da letra %s, na palavra %s.", letra, palavra);
        } else {
            System.out.printf(
                    "Existe %d ocorrências da letra %s, na palavra %s.",
                    ocorrencia, letra, palavra
            );
        }
    }
}
