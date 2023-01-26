import java.util.Scanner;

public class Exercicioc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fileiras;
        int cadeiras;
        int porcentagem;
        int resultado;

        System.out.println("Digite aqui a quatidade de fileiras do cinema:");
        fileiras = ler.nextInt();
        System.out.println("Digite aqui a quantidade de cadeiras das fileiras:");
        cadeiras = ler.nextInt();
        resultado = fileiras * cadeiras;
        porcentagem = (resultado * 10) / 100;
        System.out.println("A sala de cinema tem " + fileiras + " fileiras e " + cadeiras + " cadeiras em cada fileira.");
        System.out.println("A capacidade dessa sala é de " + resultado + " pessoas, sendo que " + porcentagem + " lugares são reservados para PCDs.");
    }
}
