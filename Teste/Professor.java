import java.time.LocalDate;

public class Professor extends Pessoa{
    private double salario;
    private String disciplina;

    public Professor(String nome, String cpf, LocalDate dataDeNascimento, double salario, String disciplina) {
        super(nome, cpf, dataDeNascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void seApresente(){
        super.seApresente();
        System.out.println("Ensino " + this.getDisciplina());
    }
}
