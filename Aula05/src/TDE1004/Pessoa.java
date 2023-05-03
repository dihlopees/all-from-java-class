package TDE1004;

public class Pessoa {

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

    String nome;
    String cpf;

    public Pessoa(){}
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
}
