import java.time.LocalDate;

public class Funcionarios extends Pessoa{
    private double salario;
    private LocalDate dataAdmissao;
    private String cargo;

    public Funcionarios(String nome, String cpf, LocalDate dataDeNascimento, double salario, LocalDate dataAdmissao, String cargo) {
        super(nome, cpf, dataDeNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public Funcionarios() {
        super();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
