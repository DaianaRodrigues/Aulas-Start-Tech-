package Polimorfismo.Exercicios;

import java.util.Scanner;

public class DadosClientes {
    Scanner ler = new Scanner(System.in);
    String resposta;

    public int dadosClientes(){
        System.out.println("1- Pessoa Física\n2- Pessoa Jurídica");
        resposta = ler.nextLine();
        int numeroConvertido = Integer.parseInt(resposta);
        return numeroConvertido;
    }
}
