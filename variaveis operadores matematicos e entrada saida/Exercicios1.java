import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int ano;
        int anoAtual = 2022;
        int resultado;

        System.out.println("Digite o seu ano de nascimento aqui:");
        ano = ler.nextInt();
        resultado = anoAtual - ano;
        System.out.println("O ano de nascimento informado é " + ano + ".\nA pessoa tem ou (vai completar) " + resultado + " anos em 2022.");
    }
}
