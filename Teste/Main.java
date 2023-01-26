package Teste;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Funcionarios(); // variável de referência ou instancia; Inicializando um objeto, construtor
        pessoa.setNome("Luiz");
        pessoa.setDataDeNascimento(LocalDate.now());
        pessoa.seApresente();
        Aluno aluno = (Aluno) pessoa;
        if(pessoa instanceof Funcionarios){
            Funcionarios funcionarios = (Funcionarios) pessoa;
            System.out.println(funcionarios.getCargo());
        } else if (pessoa instanceof Professor) {
            Professor professor = (Professor) pessoa;
            System.out.println(professor.getDisciplina());
        }
    }
}
