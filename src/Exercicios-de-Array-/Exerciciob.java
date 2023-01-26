import java.lang.reflect.Array;
import java.util.*;

public class Exerciciob{
    public static void main(String[] args) {
        int qtdGrupos = args.length / 3;
        Random random = new Random();
        String[][] grupos = new String[qtdGrupos][3];

        for(int i = 0; i < qtdGrupos; i++) {
            int alunosGrupo = 0;
            while(alunosGrupo < 3) {
                int sorteio = random.nextInt(0, args.length);

                if(!args[sorteio].equals("")) {
                    grupos[i][alunosGrupo] = args[sorteio];
                    alunosGrupo++;
                    args[sorteio] = "";
                }
            }
        }

        for(String[] grupo : grupos) {
            System.out.println("Grupo:");
            for(String aluno : grupo) {
                System.out.println(aluno);
            }
        }



    }
}