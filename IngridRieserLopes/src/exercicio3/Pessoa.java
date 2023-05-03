package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;

    private List<Pessoa> pessoaList = new ArrayList<>();

    public Pessoa(){}

    public Pessoa(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public void adicionarPessoa(Pessoa pessoa) {
        pessoaList.add(pessoa);
    }

    public void listarPessoas() {
        pessoaList.forEach(pessoa -> {
            System.out.printf("\n Nome = %s , CPF = %s ", pessoa.getNome(), pessoa.getCpf());
        });
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
