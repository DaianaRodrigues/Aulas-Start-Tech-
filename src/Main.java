import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();

        palavras.add("Batata");
        palavras.add("Cebola");
        palavras.add("Amendoin");

        for(String palavra: palavras){
            System.out.println(palavra);
        }

        HashMap<String, String> pessoa = new HashMap<>();
        pessoa.put("nome", "José");
        pessoa.put("idade", "Dez");

        System.out.println(pessoa.get("nome"));

        TreeSet<String> palavrasSemRepetir = new TreeSet<>();

        palavrasSemRepetir.add("Batata");
        palavrasSemRepetir.add("cebola");
        palavrasSemRepetir.add("Batata");

//        for(String palavra: )
//        System.out.println();
    }
}
