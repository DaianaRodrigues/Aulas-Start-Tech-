import java.time.LocalDate;

//Modificadores de acesso: PUBLIC,PROTECTED, <DEFAULT>, PRIVATE
public class Pessoa {

    //Atributos, this
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;

    //-todo construtor é um metodo que não tem retorno - tem o mesmo nome da classe
    public Pessoa(String nome, String cpf, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Pessoa() {

    }

    //metodo: função(tem retorno), procedimento(não tem retorno)
    //assinatura do metodo: tipo_retorno nome_metodo(_parametros)

    public void seApresente() {
        System.out.println("Meu nome eh " + this.nome);
        System.out.println("Tenho " + this.dataDeNascimento + " anos");
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public LocalDate getDataDeNascimento() {

        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {

        this.dataDeNascimento = dataDeNascimento;
    }

//Sobrescrita: Herança + mudança do metodo
//Sobrecarga: metodos com o mesmo nome e parâmetros diferentes
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
