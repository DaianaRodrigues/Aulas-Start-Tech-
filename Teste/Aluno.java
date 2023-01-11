import java.time.LocalDate;

public class Aluno extends Pessoa{
    private int matricula;

   public Aluno(){
       super("","", null);
   }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
