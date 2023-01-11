package Polimorfismo.Exercicios;

public class PessoaFisica {
    DadosClientes dadosClientes = new DadosClientes();
    String nome;
    String cpf;
    String telefone;
    String email;

    public String pessoaFisica(){
        System.out.print("Digite o nome do cliente: ");
        nome = dadosClientes.resposta;
        System.out.print("Digite o CPF do cliente:");
        System.out.print("Digite o telefone do cliente:");
        System.out.print("");
    }
}
