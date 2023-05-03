package exercicio3;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < 4; i++){
            String nomeAux , cpfAux;
            System.out.println("Informe o nome: ");
            nomeAux = scanner.next();
            System.out.println("Informe o cpf: ");
            cpfAux = scanner.next();

           if(!nomeAux.isEmpty() && !cpfAux.isEmpty()) pessoa.adicionarPessoa(new Pessoa(nomeAux, cpfAux));
        }

        pessoa.listarPessoas();
    }
}
