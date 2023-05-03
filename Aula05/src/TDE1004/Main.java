package TDE1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Fila fila = new Fila();

        System.out.println("Qual seu nome?");
        pessoa.nome = scanner.next();

        System.out.println("Qual seu cpf");
        pessoa.cpf = scanner.next();

        fila.listaDePessoas.add(pessoa);

        fila.listaDePessoas.add(new Pessoa("teste", "8888888"));

        fila.listaDePessoas.forEach(pessoa1 -> {
            System.out.printf("\n nome = %s , cpf = %s", pessoa1.getNome(), pessoa1.getCpf());
        });
        fila.listaDePessoas.remove(pessoa);
    }
}
