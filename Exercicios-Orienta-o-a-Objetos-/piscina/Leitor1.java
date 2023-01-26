package piscina;

import java.util.Scanner;

public class Leitor1 {
    Scanner ler = new Scanner(System.in);
    String lerString(String mensagem) {
        System.out.println(mensagem);
        return ler.nextLine();
    }
    double lerDouble(String mensagem){
        String string = lerString(mensagem);
        return Double.parseDouble(string);
    }
}
