import java.util.Scanner;

public class Exercicios5 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        double celsius;
        double farenheit = 32;

        System.out.println("Digite aqui a temperatura em Graus Celsius:");
        celsius = ler.nextDouble();
        double resultado = (celsius * 9/5) + farenheit;
        
        System.out.println("A temperatura informada foi: " + celsius + "°C");
        System.out.printf("O valor convertido em Farenheit é: %.1f°F", resultado);
    }    
}
